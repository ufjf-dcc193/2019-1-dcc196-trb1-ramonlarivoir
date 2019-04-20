package br.ufjf.dcc193.trab01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MembroController
 */
@Controller
public class MembroController {

    @RequestMapping("membro-novo.html")
    public String novo() {
        return "membro-novo";
    }

    @RequestMapping("membro-listar.html")
    public String listar() {
        return "membro-listar";
    }
}