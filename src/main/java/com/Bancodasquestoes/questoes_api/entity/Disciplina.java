package com.Bancodasquestoes.questoes_api.entity;

import com.Bancodasquestoes.questoes_api.dto.DisciplinaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name="disciplina")
@Entity(name="disciplinas")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Disciplina {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String nome;

public Disciplina(DisciplinaDTO dados) {
	this.nome = dados.nome();
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


}
