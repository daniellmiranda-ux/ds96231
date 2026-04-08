package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.AlunoModel;

@Repository
public interface AlunoRepository  extends JpaRepository<AlunoModel,Long>{

}
