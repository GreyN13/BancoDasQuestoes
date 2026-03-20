package com.Bancodasquestoes.questoes_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bancodasquestoes.questoes_api.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
