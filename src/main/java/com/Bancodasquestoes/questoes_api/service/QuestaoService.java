package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.QuestaoDTO;
import com.Bancodasquestoes.questoes_api.entity.Banca;
import com.Bancodasquestoes.questoes_api.entity.Disciplina;
import com.Bancodasquestoes.questoes_api.entity.Questao;
import com.Bancodasquestoes.questoes_api.entity.SubDisciplina;
import com.Bancodasquestoes.questoes_api.enums.Dificuldade;
import com.Bancodasquestoes.questoes_api.repository.BancaRepository;
import com.Bancodasquestoes.questoes_api.repository.DisciplinaRepository;
import com.Bancodasquestoes.questoes_api.repository.QuestaoRepository;
import com.Bancodasquestoes.questoes_api.repository.SubdisciplinaRepository;

@Service
public class QuestaoService {
	
	@Autowired
	private QuestaoRepository questaorepo;
	@Autowired
	private DisciplinaRepository disciplinaRepo;
	@Autowired
	private BancaRepository bancaRepo;
	@Autowired
	private SubdisciplinaRepository subdisciplinaRepo;

	public QuestaoDTO sortear(Long disciplinaId, Long subdisciplinaId, Dificuldade dificuldade) {
	    return questaorepo.sortearPorDisciplina(disciplinaId, subdisciplinaId, dificuldade);
	}

	public void criar(QuestaoDTO dto) {
	    Disciplina disciplina = disciplinaRepo.findById(dto.disciplinaId()).orElseThrow();
	    Banca banca = bancaRepo.findById(dto.bancaId()).orElseThrow();
	    ArrayList<SubDisciplina> subdisciplinas = new ArrayList<>(subdisciplinaRepo.findAllById(dto.subdisciplinasIds()));

	    Questao questao = new Questao(dto, disciplina, banca, subdisciplinas);
	    questaorepo.save(questao);
	}
	
	public QuestaoDTO buscar(Long id) {
	    Questao questao = questaorepo.findById(id).orElseThrow();
	    return new QuestaoDTO(questao);
	}

	public void atualizar(Long id, QuestaoDTO dto) {
	    Questao questao = questaorepo.findById(id).orElseThrow();

	    Disciplina disciplina = disciplinaRepo.findById(dto.disciplinaId()).orElseThrow();
	    Banca banca = bancaRepo.findById(dto.bancaId()).orElseThrow();
	    ArrayList<SubDisciplina> subdisciplinas = new ArrayList<>(subdisciplinaRepo.findAllById(dto.subdisciplinasIds()));

	    questao.atualizaInformacoes(dto, disciplina, banca, subdisciplinas);
	    questaorepo.save(questao);
	}

	public void deletar(Long id) {
	    questaorepo.deleteById(id);
	}
	
}
