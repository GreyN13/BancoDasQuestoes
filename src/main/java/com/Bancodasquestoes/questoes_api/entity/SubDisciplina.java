package com.Bancodasquestoes.questoes_api.entity;

import com.Bancodasquestoes.questoes_api.dto.SubDisciplinaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name="subdisciplina")
@Entity(name="subdisciplinas")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class SubDisciplina {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nome;

@ManyToOne
private Disciplina disciplina;

public SubDisciplina(SubDisciplinaDTO dados, Disciplina disciplina) {
	this.nome = dados.nome();
	this.disciplina = disciplina;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Disciplina getDisciplina() {
	return disciplina;
}

public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
}

public Long getId() {
	return id;
}


}
