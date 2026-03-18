package com.Bancodasquestoes.questoes_api.dto;

import com.Bancodasquestoes.questoes_api.enums.AlternativaLetra;

public record HistoricoDTO( 
Long questaoId,
AlternativaLetra alternativaEscolhida,
boolean acertou)
{}
