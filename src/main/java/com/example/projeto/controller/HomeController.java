package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/{nomeDep}")
    public String departamento(@PathVariable String nomeDep, ModelMap model) {
        model.addAttribute("nome", nomeDep);
        switch(nomeDep){
            case "livro":
                mainHome(nomeDep);
                break;
            case "login":
                login(nomeDep);
                break;
            case "dashboard":
                dashboard(nomeDep);
                break;


        }
//        if(nomeDep == "livro"){
//            deps(nomeDep);
        return nomeDep;
        }



    @GetMapping
    public String mainHome(String t){
        if(t == "livro"){
            return "livro";
        }else{
            return "home";
        }
    }

    public String login(String t){
        if(t == "login"){
            return "login";
        }else{
            return "home";
        }
    }

    public String dashboard(String t){
        if(t == "login"){
            return "dashboard";
        }else{
            return "home";
        }
    }
}

