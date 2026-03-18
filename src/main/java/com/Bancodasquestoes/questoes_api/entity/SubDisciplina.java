package com.Bancodasquestoes.questoes_api.entity;

import com.Bancodasquestoes.questoes_api.dto.DisciplinaDTO;
import com.Bancodasquestoes.questoes_api.dto.SubDisciplinaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="subdisciplina")
@Entity(name="subdisciplinas")
@Getter
@Setter
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

public SubDisciplina(SubDisciplinaDTO dados) {
	this.nome = dados.nome();
}
}
