package com.Bancodasquestoes.questoes_api.dto;

import com.Bancodasquestoes.questoes_api.entity.Disciplina;

public record DisciplinaDTO(
		Long id,
		String nome) {
	
	public DisciplinaDTO(Disciplina disciplina) {
		this(disciplina.getId(),
			 disciplina.getNome());
	}
}