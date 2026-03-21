package com.Bancodasquestoes.questoes_api.dto;

import com.Bancodasquestoes.questoes_api.entity.Banca;

public record BancaDTO(
		Long id,
		String nome) {
	
	public BancaDTO(Banca banca) {
		this(banca.getId(),
			 banca.getNome());
	}
}
