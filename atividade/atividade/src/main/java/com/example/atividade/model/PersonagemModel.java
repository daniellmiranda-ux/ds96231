package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagem")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private Long id;
    private String familia;
    private String habilidade;
    private String fraqueza;

    public PersonagemModel() {
    }

    public PersonagemModel(String nome, Long id, String familia, String habilidade, String fraqueza) {
        this.nome = nome;
        this.id = id;
        this.familia = familia;
        this.habilidade = habilidade;
        this.fraqueza = fraqueza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
}
