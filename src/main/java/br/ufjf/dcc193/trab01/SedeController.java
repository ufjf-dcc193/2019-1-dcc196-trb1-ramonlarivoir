package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * SedeController
 */
@Controller
public class SedeController {
    @Autowired
    SedeRepository srep;
    @Autowired
    MembroRepository mrep;
    @Autowired
    AtividadeRepository arep;

    @RequestMapping("sede-novo.html")
    public String novo() {
        return "sede-novo";
    }

    @RequestMapping("sede-listar.html")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-listar");

        List<Sede> sedes = srep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("sede-salvar.html")
    public RedirectView salvar(Sede sede) {
        srep.save(sede);

        return new RedirectView("sede-listar.html");
    }

    @RequestMapping("sede-editar.html")
    public ModelAndView editar(Sede s) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-editar");
        Sede sede = srep.getOne(s.getId());
        mv.addObject("sede", sede);

        return mv;
    }

    @RequestMapping("sede-excluir.html")
    RedirectView remove(Sede s){
        Sede sede = srep.getOne(s.getId());
        List<Atividade> atividades = arep.findAll();
        for (Atividade atividade : atividades) {
            if(atividade.getOngAtividade().getId() == sede.getId()) {
                arep.deleteById(atividade.getId());
            }
        }
        List<Membro> membros = mrep.findAll();
        for (Membro membro : membros) {
            if (membro.getOngMembro().getId() == sede.getId()) {
                mrep.deleteById(membro.getId());
            }
        }
        srep.deleteById(s.getId());
        return new RedirectView("sede-listar.html");
    }

    @RequestMapping("sede-detalhes.html")
    public ModelAndView detalhes(Sede s) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-detalhes");
        Sede sede = srep.getOne(s.getId());
        List<Atividade> atividades = arep.findAll();
        for (Atividade atividade : atividades) {
            if (atividade.getOngAtividade().getId() == sede.getId()) {
                sede.getAtividades().add(atividade);
            }
        }
        List<Membro> membros = mrep.findAll();
        for (Membro membro : membros) {
            if (membro.getOngMembro().getId() == sede.getId()) {
                sede.getMembros().add(membro);
            }
        }
        mv.addObject("sede", sede);

        return mv;
    }
}