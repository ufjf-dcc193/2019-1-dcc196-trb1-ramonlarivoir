package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * MembroController
 */
@Controller
public class MembroController {
    @Autowired
    SedeRepository srep;
    @Autowired
    MembroRepository mrep;

    @RequestMapping("membro-novo.html")
    public ModelAndView novo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-novo");
        List<Sede> sedes = srep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("membro-listar.html")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-listar");

        List<Membro> membros = mrep.findAllByOrderByOngMembroAsc();
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("membro-salvar.html")
    public RedirectView salvar(Membro m) {
        mrep.save(m);
        
        return new RedirectView("membro-listar.html");
    }
}