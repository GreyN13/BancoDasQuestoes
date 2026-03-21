package com.Bancodasquestoes.questoes_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Bancodasquestoes.questoes_api.dto.QuestaoDTO;
import com.Bancodasquestoes.questoes_api.enums.Dificuldade;
import com.Bancodasquestoes.questoes_api.service.QuestaoService;

@RestController
@RequestMapping("/questoes")
public class QuestaoController {

    @Autowired
    private QuestaoService questaoService;

    @GetMapping("/sortear")
    public QuestaoDTO sortear(@RequestParam Long disciplinaId, Long subdisciplinaId, Dificuldade dificuldade) {
        return questaoService.sortear(disciplinaId, subdisciplinaId, dificuldade);
    }
    
    @GetMapping("/{id}")
    public QuestaoDTO buscar(@PathVariable Long id) {
        return questaoService.buscar(id);
    }

    @PostMapping
    public void criar(@RequestBody QuestaoDTO dto) {
        questaoService.criar(dto);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody QuestaoDTO dto) {
        questaoService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        questaoService.deletar(id);
    }
}