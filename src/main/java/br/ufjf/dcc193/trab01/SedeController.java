package br.ufjf.dcc193.trab01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SedeController
 */
@Controller
public class SedeController {

    @RequestMapping("sede-novo.html")
    public String novo() {
        return "sede-novo";
    }
}