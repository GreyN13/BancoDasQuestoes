package com.Bancodasquestoes.questoes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bancodasquestoes.questoes_api.entity.HistoricoItem;

public interface HistoricoItemRepository extends JpaRepository<HistoricoItem,Long> {

}
