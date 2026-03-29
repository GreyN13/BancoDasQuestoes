package com.Bancodasquestoes.questoes_api.entity;

import com.Bancodasquestoes.questoes_api.dto.UserDTO;
import com.Bancodasquestoes.questoes_api.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuario")
@Entity(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String googleId;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {}

    public User(UserDTO dto) {
        this.nome = dto.nome();
        this.googleId = dto.googleId();
        this.role = Role.USUARIO; 
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

   
}