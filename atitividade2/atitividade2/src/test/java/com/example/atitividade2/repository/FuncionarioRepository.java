package com.example.atitividade2.repository;

import com.example.atitividade2.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioRepository, Long> {
    Optional<FuncionarioModel> findByMatricula(String matricula);
    Optional<FuncionarioModel> findByEmail(String email);
}
