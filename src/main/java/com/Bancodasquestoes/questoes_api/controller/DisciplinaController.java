package com.Bancodasquestoes.questoes_api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bancodasquestoes.questoes_api.dto.DisciplinaDTO;
import com.Bancodasquestoes.questoes_api.service.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public ArrayList<DisciplinaDTO> listar() {
        return disciplinaService.listar();
    }

    @PostMapping
    public void criar(@RequestBody DisciplinaDTO dto) {
        disciplinaService.criar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        disciplinaService.deletar(id);
    }
}