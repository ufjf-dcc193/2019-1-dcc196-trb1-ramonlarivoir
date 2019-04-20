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
    ModelAndView remove(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-listar");
        srep.deleteById(s.getId());
        mv.addObject("sede", s);
        return mv;
    }
}