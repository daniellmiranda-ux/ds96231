package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "0 nome e obrigatorio.")
    @Size(min = 2,message = "O nome deve ter no minimo dois caracteres.")
    @Size(max = 100,message = "O nome deve ter no maximo cem caracteres.")

    private String nome;

    @NotBlank(message = "0 e-mail e obrigatorio.")
    @Email(message = "Deve ser um email valido.")
    private String email;

    @NotBlank(message = "A senha e obrigatorio.")
    @Size(min = 3,max = 8,message = "A senha deve ter de 3 a 8 digitos.")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "0 nome e obrigatorio.") @Size(min = 2, message = "O nome deve ter no minimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no maximo cem caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "0 nome e obrigatorio.") @Size(min = 2, message = "O nome deve ter no minimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no maximo cem caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "0 e-mail e obrigatorio.") @Email(message = "Deve ser um email valido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "0 e-mail e obrigatorio.") @Email(message = "Deve ser um email valido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha e obrigatorio.") @Size(min = 3, max = 8, message = "A senha deve ter de 3 a 8 digitos.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha e obrigatorio.") @Size(min = 3, max = 8, message = "A senha deve ter de 3 a 8 digitos.") String senha) {
        this.senha = senha;
    }
}
