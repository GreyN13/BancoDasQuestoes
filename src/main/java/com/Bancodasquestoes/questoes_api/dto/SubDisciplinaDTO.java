package com.Bancodasquestoes.questoes_api.dto;

import com.Bancodasquestoes.questoes_api.entity.SubDisciplina;

public record SubDisciplinaDTO(
		Long id,
		String nome,
		Long DisciplinaId) {
	public SubDisciplinaDTO(SubDisciplina subdis) {
		this(subdis.getId(),
			 subdis.getNome(),
			 subdis.getDisciplina().getId());
	}
}
