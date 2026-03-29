package com.Bancodasquestoes.questoes_api.dto;

import java.time.LocalDateTime;

import com.Bancodasquestoes.questoes_api.entity.HistoricoItem;
import com.Bancodasquestoes.questoes_api.enums.AlternativaLetra;

public record HistoricoDTO(
	    Long id,
	    Long questaoId,
	    Long usuarioId,
	    AlternativaLetra alternativaEscolhida,
	    Boolean acertou,
	    LocalDateTime dataResposta
	) {
	 public HistoricoDTO(HistoricoItem item) {
	        this(
	            item.getId(),
	            item.getUsuario().getId(),
	            item.getQuestao().getId(),
	            item.getAlternativaEscolhida(),
	            item.getAcertou(),
	            item.getDataResposta()
	        );
	    }
	}