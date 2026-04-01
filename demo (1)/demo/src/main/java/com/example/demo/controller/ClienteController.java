package com.example.demo.controller;

import com.example.demo.models.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteModel> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente) {
        clienteRepository.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
    }


