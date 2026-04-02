package com.example.spring_basico.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
//Controle a classe para criar endpoinsts.
@RestController
public class Welcome {

    @GetMapping("/teste")
    public String mensgagem() {
        return  "Bem-vindo";
    }

    @GetMapping("/dev")
    public String nomeDev(){
        return "Feito por: Daniel";
    }
}
