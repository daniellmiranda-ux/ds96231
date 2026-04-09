package com.example.projeto.repository;

import com.example.projeto.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    // Consultar no banco de dados se o e-mail ja existe,
    // antes de salvar um cliente
    Optional<ClienteModel> findByEmail(String email);
}
