package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/{rota}")
    public String rotas(@PathVariable String rota) {
        switch(rota){
            case "login":
                return login();
            case "cadastro":
                return cadastro();
            case "principalProfessor":
                return principalProfessor();
            case "principalAluno":
                return principalAluno();
            default:
                return error();
        }
    }
    public String login(){
        return "login";
    }
    public String cadastro() {
        return "cadastro";
    }
    public  String principalProfessor(){
        return "principalProfessor";
    }
    public String principalAluno(){
        return "principalAluno";
    }
    public String error() {
        return "erro";
    }
}