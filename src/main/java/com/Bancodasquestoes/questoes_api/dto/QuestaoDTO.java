package com.Bancodasquestoes.questoes_api.dto;

import java.util.ArrayList;

import com.Bancodasquestoes.questoes_api.enums.AlternativaLetra;
import com.Bancodasquestoes.questoes_api.enums.Dificuldade;

public record QuestaoDTO(
	    Long id,
	    String texto,
	    String bibliografia,
	    Dificuldade dificuldade,
	    AlternativaLetra alternativaCorreta,
	    Long disciplinaId,
	    ArrayList<Long> subdisciplinasIds,
	    Long bancaId,
	    Boolean alternativasSaoImagem,
	    String alternativaA,
	    String alternativaB,
	    String alternativaC,
	    String alternativaD,
	    String alternativaE,
	    ArrayList<String> imagens
	) {}