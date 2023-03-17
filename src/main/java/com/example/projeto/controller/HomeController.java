package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
//    @GetMapping("/")
//    public String home(ModelMap model) {
//        model.addAttribute("nomeDoAtributo", "Teste");
//        return "home";
//    }

    @GetMapping("/departamento/{nomeDep}")
    public String departamento(@PathVariable String nomeDep, ModelMap model) {
        model.addAttribute("nome", nomeDep);
        if(nomeDep == "livro"){
            deps(nomeDep);
        }
        return nomeDep;
    }

    @GetMapping
    public String deps(String t){
        if(t == "livro"){
            return "livro";
        } else if(t == "perfume"){
            return "perfume";
        }
        return "home";
    }



}

