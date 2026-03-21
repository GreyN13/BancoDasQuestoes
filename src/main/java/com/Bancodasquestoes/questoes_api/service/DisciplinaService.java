package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.DisciplinaDTO;
import com.Bancodasquestoes.questoes_api.entity.Disciplina;
import com.Bancodasquestoes.questoes_api.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	 @Autowired
	    private DisciplinaRepository disciplinaRepo;
		
	public ArrayList<DisciplinaDTO> listar() {
        return new ArrayList<>(disciplinaRepo.findAll()
                .stream()
                .map(DisciplinaDTO::new)
                .toList());
	}

	public void criar(DisciplinaDTO dto) {
		disciplinaRepo.save(new Disciplina(dto));
		
	}

	public void deletar(Long id) {
		disciplinaRepo.deleteById(id);
		
	}

}
