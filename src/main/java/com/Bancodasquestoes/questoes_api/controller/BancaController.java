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

import com.Bancodasquestoes.questoes_api.dto.BancaDTO;
import com.Bancodasquestoes.questoes_api.service.BancaService;

@RestController
@RequestMapping("/bancas")
public class BancaController {

    @Autowired
    private BancaService bancaService;

    @GetMapping
    public ArrayList<BancaDTO> listar() {
        return bancaService.listar();
    }

    @PostMapping
    public void criar(@RequestBody BancaDTO dto) {
        bancaService.criar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        bancaService.deletar(id);
    }
}