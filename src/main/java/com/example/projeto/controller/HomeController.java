package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String teste(){
        return "erro";
    }
    @GetMapping("/{rota}")
    public String rotas(@PathVariable String rota) {
        switch(rota){
            case "login":
                return login(rota);
            case "cadastro":
                return cadastro(rota);
            case "principalProfessor":
                return principalProfessor(rota);
            case "principalAluno":
                return principalAluno(rota);
            default:
                return error(rota);
        }
    }
    public String login(String t){
        return "login";
    }
    public String cadastro(String t) {
        return "cadastro";
    }
    public  String principalProfessor(String t){
        return "principalProfessor";
    }
    public String principalAluno(String t){
        return "principalAluno";
    }
    public String error(String t) {
        return "erro";
    }
}