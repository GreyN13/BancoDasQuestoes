package com.Bancodasquestoes.questoes_api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bancodasquestoes.questoes_api.dto.HistoricoDTO;
import com.Bancodasquestoes.questoes_api.service.HistoricoService;

@RestController
@RequestMapping("/historico")
public class HistoricoController {

    @Autowired
    private HistoricoService historicoService;

    @PostMapping
    public void salvar(@RequestBody HistoricoDTO dto) {
        historicoService.salvar(dto);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ArrayList<HistoricoDTO> listarPorUsuario(@PathVariable Long usuarioId) {
        return historicoService.listarPorUsuario(usuarioId);
    }

    @GetMapping("/resumo/{usuarioId}")
    public ArrayList<HistoricoDTO> resumoPorSubdisciplina(@PathVariable Long usuarioId) {
        return historicoService.resumoPorSubdisciplina(usuarioId);
    }
}