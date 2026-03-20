package com.Bancodasquestoes.questoes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Bancodasquestoes.questoes_api.dto.QuestaoDTO;
import com.Bancodasquestoes.questoes_api.entity.Questao;
import com.Bancodasquestoes.questoes_api.enums.Dificuldade;

public interface QuestaoRepository extends JpaRepository<Questao,Long> {
	
	@Query("SELECT q FROM questoes q JOIN q.subdisciplinas s " +
		       "WHERE s.disciplina.id = :disciplinaId " +
		       "AND (:subdisciplinaId IS NULL OR s.id = :subdisciplinaId) " +
		       "AND (:dificuldade IS NULL OR q.dificuldade = :dificuldade) " +
		       "ORDER BY RANDOM() LIMIT 1")
		QuestaoDTO sortearPorDisciplina(
		    @Param("disciplinaId") Long disciplinaId,
		    @Param("subdisciplinaId") Long subdisciplinaId,
		    @Param("dificuldade") Dificuldade dificuldade
		);
 }

