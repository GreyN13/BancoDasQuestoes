package com.Bancodasquestoes.questoes_api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancodasquestoes.questoes_api.dto.UserDTO;
import com.Bancodasquestoes.questoes_api.entity.User;
import com.Bancodasquestoes.questoes_api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public ArrayList<UserDTO> listar() {
        return new ArrayList<>(userRepo.findAll()
                .stream()
                .map(UserDTO::new)
                .toList());
    }

    public UserDTO buscar(Long id) {
        User user = userRepo.findById(id).orElseThrow();
        return new UserDTO(user);
    }

    public void deletar(Long id) {
        userRepo.deleteById(id);
    }
}