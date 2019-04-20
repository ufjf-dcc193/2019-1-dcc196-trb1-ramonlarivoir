package br.ufjf.dcc193.trab01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}