package com.Bancodasquestoes.questoes_api.dto;

import com.Bancodasquestoes.questoes_api.entity.User;
import com.Bancodasquestoes.questoes_api.enums.Role;

public record UserDTO(
	    Long id,
	    String nome,
	    String googleId,
	    Role role
	) {
	    public UserDTO(User user) {
	        this(
	            user.getId(),
	            user.getNome(),
	            user.getGoogleId(),
	            user.getRole()
	        );
	    }

		
	}
