package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.HistoricoDTO;
import com.Bancodasquestoes.questoes_api.entity.HistoricoItem;
import com.Bancodasquestoes.questoes_api.entity.Questao;
import com.Bancodasquestoes.questoes_api.entity.User;
import com.Bancodasquestoes.questoes_api.repository.HistoricoItemRepository;
import com.Bancodasquestoes.questoes_api.repository.QuestaoRepository;
import com.Bancodasquestoes.questoes_api.repository.UserRepository;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoItemRepository historicoRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private QuestaoRepository questaoRepo;

    public void salvar(HistoricoDTO dto) {
        User usuario = userRepo.findById(dto.usuarioId()).orElseThrow();
        Questao questao = questaoRepo.findById(dto.questaoId()).orElseThrow();
        historicoRepo.save(new HistoricoItem(dto, usuario, questao));
    }

    public ArrayList<HistoricoDTO> listarPorUsuario(Long usuarioId) {
        return new ArrayList<>(historicoRepo.findByUsuarioId(usuarioId)
                .stream()
                .map(HistoricoDTO::new)
                .toList());
    }

    public ArrayList<HistoricoDTO> resumoPorSubdisciplina(Long usuarioId) {
        return new ArrayList<>(historicoRepo.findByUsuarioId(usuarioId)
                .stream()
                .map(HistoricoDTO::new)
                .toList());
    }
}