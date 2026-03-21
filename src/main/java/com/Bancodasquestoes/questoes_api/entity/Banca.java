package com.Bancodasquestoes.questoes_api.entity;

import com.Bancodasquestoes.questoes_api.dto.BancaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="banca")
@Entity(name="bancas")
public class Banca {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nome;


public Banca(BancaDTO dados) {
	this.nome = dados.nome();
}


public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }
public Long getId() { return id; }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Banca)) return false;
    Banca banca = (Banca) o;
    return id.equals(banca.id);
}

@Override
public int hashCode() { return id.hashCode(); }

}


