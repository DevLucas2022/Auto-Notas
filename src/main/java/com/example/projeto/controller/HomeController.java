package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("index","index");
        return "index";
    }

    @GetMapping("/loginAluno")
    public String login(ModelMap model) {
        model.addAttribute("loginAluno","loginAluno");
        return "loginAluno";
    }

    @GetMapping("/loginProfessor")
    public String cadastro(ModelMap model) {
        model.addAttribute("loginProfessor","loginProfessor");
        return "loginProfessor";
    }

    @GetMapping("/principalProfessor")
    public String principalProfessor(ModelMap model) {
        model.addAttribute("principalProfessor","principalProfessor");
        return "principalProfessor";
    }
    @GetMapping("/principalAluno")
        public String principalAluno(ModelMap model) {
            model.addAttribute("principalAluno","principalAluno");
            return "principalAluno";
    }
    @GetMapping("/principalProfessor/editarNotas")
        public String quemsomos(ModelMap model) {
            model.addAttribute("editarNotas","editarNotas");
            return "editarNotas";
    }

    @GetMapping("/principalProfessor/criarSala")
    public String criarSala(ModelMap model) {
        model.addAttribute("criarSala","criarSala");
        return "criarSala";
    }
}
