package com.Bancodasquestoes.questoes_api.dto;

import java.util.ArrayList;

import com.Bancodasquestoes.questoes_api.entity.Questao;
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
    Boolean alternativaSaoImagem,
    String alternativaA,
    String alternativaB,
    String alternativaC,
    String alternativaD,
    String alternativaE,
    ArrayList<String> imagens
    
) { public QuestaoDTO(Questao questao) {
        this(
            questao.getId(),
            questao.getTexto(),
            questao.getBibliografia(),
            questao.getDificuldade(),
            questao.getAlternativaCorreta(),
            questao.getDisciplina().getId(),
            new ArrayList<>(questao.getSubdisciplinas().stream().map(s -> s.getId()).toList()),
            questao.getBanca().getId(),
            questao.getAlternativaSaoImagem(),
            questao.getAlternativaA(),
            questao.getAlternativaB(),
            questao.getAlternativaC(),
            questao.getAlternativaD(),
            questao.getAlternativaE(),
            new ArrayList<>(questao.getImagens())
        );
    }
}