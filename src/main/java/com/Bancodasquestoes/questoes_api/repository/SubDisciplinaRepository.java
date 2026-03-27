package com.Bancodasquestoes.questoes_api.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bancodasquestoes.questoes_api.entity.SubDisciplina;

public interface SubdisciplinaRepository extends JpaRepository<SubDisciplina,Long>{
	
ArrayList<SubDisciplina> findByDisciplinaId(Long disciplinaId);
}
