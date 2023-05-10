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
        model.addAttribute("home","home");
        return "home";
    }

    @GetMapping("/login")
    public String login(ModelMap model) {
        model.addAttribute("login","login");
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastro(ModelMap model) {
        model.addAttribute("cadastro","cadastro");
        return "cadastro";
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
@GetMapping("/quemSomos")
    public String quemsomos(ModelMap model) {
        model.addAttribute("quemSomos","quemSomos");
        return "quemSomos";
}
}
