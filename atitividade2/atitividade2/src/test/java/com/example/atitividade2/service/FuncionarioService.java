package com.example.atitividade2.service;

import com.example.atitividade2.model.FuncionarioModel;
import com.example.atitividade2.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public FuncionarioModel salvar(FuncionarioModel funcionario){
        if (FuncionarioRepository.existsByEmail(funcionario.getEmail()))

        }

    }
}
