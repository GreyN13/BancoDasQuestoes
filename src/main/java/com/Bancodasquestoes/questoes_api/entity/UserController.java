package com.Bancodasquestoes.questoes_api.entity;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bancodasquestoes.questoes_api.dto.UserDTO;
import com.Bancodasquestoes.questoes_api.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserDTO> listar() {
        return userService.listar();
    }

    @GetMapping("/{id}")
    public UserDTO buscar(@PathVariable Long id) {
        return userService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        userService.deletar(id);
    }
}