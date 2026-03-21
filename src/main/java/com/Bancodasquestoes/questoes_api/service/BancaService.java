package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.BancaDTO;
import com.Bancodasquestoes.questoes_api.entity.Banca;
import com.Bancodasquestoes.questoes_api.repository.BancaRepository;

@Service
public class BancaService {

    @Autowired
    private BancaRepository bancaRepo;

    public ArrayList<BancaDTO> listar() {
        return new ArrayList<>(bancaRepo.findAll()
                .stream()
                .map(BancaDTO::new)
                .toList());
    }

    public void criar(BancaDTO dto) {
        bancaRepo.save(new Banca(dto));
    }

    public void deletar(Long id) {
        bancaRepo.deleteById(id);
    }
}