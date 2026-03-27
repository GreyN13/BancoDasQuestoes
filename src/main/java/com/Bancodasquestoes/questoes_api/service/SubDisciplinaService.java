package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.SubDisciplinaDTO;
import com.Bancodasquestoes.questoes_api.entity.Disciplina;
import com.Bancodasquestoes.questoes_api.entity.SubDisciplina;
import com.Bancodasquestoes.questoes_api.repository.DisciplinaRepository;
import com.Bancodasquestoes.questoes_api.repository.SubdisciplinaRepository;

@Service
public class SubDisciplinaService {

    @Autowired
    private SubdisciplinaRepository subdisciplinaRepo;
    @Autowired
    private DisciplinaRepository disciplinaRepo;

    public ArrayList<SubDisciplinaDTO> listar() {
        return new ArrayList<>(subdisciplinaRepo.findAll()
                .stream()
                .map(SubDisciplinaDTO::new)
                .toList());
    }

    public ArrayList<SubDisciplinaDTO> listarPorDisciplina(Long disciplinaId) {
        return new ArrayList<>(subdisciplinaRepo.findByDisciplinaId(disciplinaId)
                .stream()
                .map(SubDisciplinaDTO::new)
                .toList());
    }

    public void criar(SubDisciplinaDTO dto) {
        Disciplina disciplina = disciplinaRepo.findById(dto.DisciplinaId()).orElseThrow();
        subdisciplinaRepo.save(new SubDisciplina(dto,disciplina));
    }

    public void deletar(Long id) {
        subdisciplinaRepo.deleteById(id);
    }
}
