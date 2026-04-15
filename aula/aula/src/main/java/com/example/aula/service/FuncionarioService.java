package com.example.aula.service;

import com.example.aula.model.FuncionarioModel;
import com.example.aula.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;


    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel) {
        if (repository.finByEmail(funcionarioModel.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionario ja cadastrado.");
        }
        return repository.save(funcionarioModel);



    }
    public void excluir(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionario nao encontrado.");
        }
        repository.deleteById(id);
    }


}
