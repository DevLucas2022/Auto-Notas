package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;



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
        model.addAttribute("dbFields", new HomeController());
        model.addAttribute("principalAluno","principalAluno");
        return "principalAluno";
}
public String obterInstituicao(String id){
        try{
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
        return endereco.getInstituicao();
}catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
}
    public String obterDisciplina(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getDisciplina();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterRa(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getRa();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterNome(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getNome();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterP1(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getP1();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterP2(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getP2();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterATV(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getAtv();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }
    public String obterMedia(String id){
        try{
            Endereco endereco = ServicoDeCep.buscaEnderecoPelo(id);
            return endereco.getMedia();
        }catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter o valor";
        }
    }

};
