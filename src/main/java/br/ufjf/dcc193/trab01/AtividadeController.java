package br.ufjf.dcc193.trab01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AtividadeController
 */
@Controller
public class AtividadeController {

    @RequestMapping("atividade-novo.html")
    public String novo() {
        return "atividade-novo";
    }

    @RequestMapping("atividade-listar.html")
    public String listar() {
        return "atividade-listar";
    }
}