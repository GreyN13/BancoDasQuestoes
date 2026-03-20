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

import com.Bancodasquestoes.questoes_api.dto.SubDisciplinaDTO;
import com.Bancodasquestoes.questoes_api.service.SubDisciplinaService;

@RestController
@RequestMapping("/subdisciplinas")
public class SubDisciplinaController {

    @Autowired
    private SubDisciplinaService subdisciplinaService;

    @GetMapping
    public ArrayList<SubDisciplinaDTO> listar() {
        return subdisciplinaService.listar();
    }

    @GetMapping("/disciplina/{id}")
    public ArrayList<SubDisciplinaDTO> listarPorDisciplina(@PathVariable Long id) {
        return subdisciplinaService.listarPorDisciplina(id);
    }

    @PostMapping
    public void criar(@RequestBody SubDisciplinaDTO dto) {
        subdisciplinaService.criar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        subdisciplinaService.deletar(id);
    }
}