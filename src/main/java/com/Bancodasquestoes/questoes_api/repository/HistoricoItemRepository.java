package com.Bancodasquestoes.questoes_api.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bancodasquestoes.questoes_api.entity.HistoricoItem;

public interface HistoricoItemRepository extends JpaRepository<HistoricoItem, Long> {
    ArrayList<HistoricoItem> findByUsuarioId(Long usuarioId);
}
