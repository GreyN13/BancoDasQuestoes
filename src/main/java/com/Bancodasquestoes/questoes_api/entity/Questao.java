package com.Bancodasquestoes.questoes_api.entity;

import java.util.ArrayList;

import com.Bancodasquestoes.questoes_api.enums.AlternativaLetra;
import com.Bancodasquestoes.questoes_api.enums.Dificuldade;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "questao")
@Entity(name = "questoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String texto;

	private String bibliografia;

	@Enumerated(EnumType.STRING)
	private Dificuldade dificuldade;

	@Enumerated(EnumType.STRING)
	private AlternativaLetra alternativaCorreta;

	@ManyToOne
	private Disciplina disciplina;

	@ManyToMany
	private ArrayList<SubDisciplina> subdisciplinas;

	@ManyToOne
	private Banca banca;

	private Boolean alternativaSaoImagem;

	private String AlternativaA;
	private String AlternativaB;
	private String AlternativaC;
	private String AlternativaD;
	private String AlternativaE;

	@ElementCollection
	private ArrayList<String> imagens;
}
