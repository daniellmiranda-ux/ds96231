package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.AlunoModel;
import com.example.api.repository.AlunoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;


    @GetMapping()
    public List<AlunoModel> listarTodos(){
        return repository.findAll();
    }
    

    @PostMapping
    public ResponseEntity<AlunoModel> salvar(@RequestBody AlunoModel aluno) {
        repository.save(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }
}
