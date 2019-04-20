package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * AtividadeController
 */
@Controller
public class AtividadeController {
    @Autowired
    SedeRepository srep;
    @Autowired
    MembroRepository mrep;
    @Autowired
    AtividadeRepository arep;

    @RequestMapping("atividade-novo.html")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-novo");
        List<Sede> sedes = srep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("atividade-listar.html")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-listar");

        List<Atividade> atividades = arep.findAllByOrderByOngAtividadeAsc();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("atividade-salvar.html")
    public RedirectView salvar(Atividade a) {
        arep.save(a);
        Sede s = a.getOngAtividade();
        s
            .setTotalHorasAssistencial((s.getTotalHorasAssistencial()+a.getHorasAssistencial()))
            .setTotalHorasExecutiva((s.getTotalHorasExecutiva()+a.getHorasExecutiva()))
            .setTotalHorasFinanceira((s.getTotalHorasFinanceira()+a.getHorasFinanceira()))
            .setTotalHorasJuridica((s.getTotalHorasJuridica()+a.getHorasJuridica()));
        srep.save(s);
        return new RedirectView("atividade-listar.html");
    }

    @RequestMapping("atividade-alterar.html")
    public RedirectView alterar(Atividade a) {
        Atividade at = arep.getOne(a.getId());
        Sede s = srep.getOne(a.getOngAtividade().getId());
        int difHora = a.getHorasAssistencial() - at.getHorasAssistencial();
        s.setTotalHorasAssistencial(s.getTotalHorasAssistencial() + difHora);
        difHora = a.getHorasExecutiva() - at.getHorasExecutiva();
        s.setTotalHorasExecutiva(s.getTotalHorasExecutiva() + difHora);
        difHora = a.getHorasFinanceira() - at.getHorasFinanceira();
        s.setTotalHorasFinanceira(s.getTotalHorasFinanceira() + difHora);
        difHora = a.getHorasJuridica() - at.getHorasJuridica();
        s.setTotalHorasJuridica(s.getTotalHorasJuridica() + difHora);
        arep.save(a);
        srep.save(s);
        return new RedirectView("atividade-listar.html");
    }

    @RequestMapping("atividade-editar.html")
    public ModelAndView editar(Atividade a) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-editar");
        Atividade atividade = arep.getOne(a.getId());
        mv.addObject("atividade", atividade);
        List<Sede> sedes = srep.findAll();
        mv.addObject("sedes", sedes);
        
        return mv;
    }

    @RequestMapping("atividade-excluir.html")
    RedirectView remove(Atividade a){
        Sede s = a.getOngAtividade();
        s
            .setTotalHorasAssistencial((s.getTotalHorasAssistencial()-a.getHorasAssistencial()))
            .setTotalHorasExecutiva((s.getTotalHorasExecutiva()-a.getHorasExecutiva()))
            .setTotalHorasFinanceira((s.getTotalHorasFinanceira()-a.getHorasFinanceira()))
            .setTotalHorasJuridica((s.getTotalHorasJuridica()-a.getHorasJuridica()));
        srep.save(s);
        arep.deleteById(a.getId());
        return new RedirectView("atividade-listar.html");
    }
}