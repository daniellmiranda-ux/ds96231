package com.example.projeto.service;

import com.example.projeto.dto.UsuarioRequestDTO;
import com.example.projeto.dto.UsuarioRespondeDTO;
import com.example.projeto.model.UsuarioModel;
import com.example.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    public List<UsuarioModel> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u-> new UsuarioRespondeDTO(u.getNome(), u.getEmail()))
                .toList();
    }
    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioDTO){
        if (repository.findyEmail(UsuarioRequestDTO.getEmai()).isPresent(){
            throw new RuntimeException("Usuario ja cadastrado");
        }
        return repository.save(usuario);
    }
}
