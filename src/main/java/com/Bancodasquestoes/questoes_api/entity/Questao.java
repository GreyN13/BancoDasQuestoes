package com.Bancodasquestoes.questoes_api.entity;

import java.util.ArrayList;

import com.Bancodasquestoes.questoes_api.dto.QuestaoDTO;
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
import lombok.NoArgsConstructor;

@Table(name = "questao")
@Entity(name = "questoes")
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

	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private String alternativaD;
	private String alternativaE;
	
	@ElementCollection
	private ArrayList<String> imagens;
	
	public Questao(QuestaoDTO dados, Disciplina disciplina, Banca banca, ArrayList<SubDisciplina> subdisciplinas) {
		this.alternativaA = dados.alternativaA();
		this.alternativaB = dados.alternativaB();
		this.alternativaC = dados.alternativaC();
		this.alternativaD = dados.alternativaD();
		this.alternativaE = dados.alternativaE();
		this.alternativaCorreta = dados.alternativaCorreta();
		this.alternativaSaoImagem = dados.alternativaSaoImagem();
		this.imagens = dados.imagens();
		this.banca = banca;
		this.bibliografia = dados.bibliografia();
		this.dificuldade = dados.dificuldade();
		this.disciplina = disciplina;
		this.subdisciplinas = subdisciplinas;
		this.texto = dados.texto();
	}
	
	public void atualizaInformacoes(QuestaoDTO dto, Disciplina disciplina, Banca banca, ArrayList<SubDisciplina> subdisciplinas) {
	    if (dto.texto() != null) this.texto = dto.texto();
	    if (dto.bibliografia() != null) this.bibliografia = dto.bibliografia();
	    if (dto.dificuldade() != null) this.dificuldade = dto.dificuldade();
	    if (dto.alternativaCorreta() != null) this.alternativaCorreta = dto.alternativaCorreta();
	    if (disciplina != null) this.disciplina = disciplina;
	    if (banca != null) this.banca = banca;
	    if (subdisciplinas != null) this.subdisciplinas = subdisciplinas;
	    if (dto.alternativaA() != null) this.alternativaA = dto.alternativaA();
	    if (dto.alternativaB() != null) this.alternativaB = dto.alternativaB();
	    if (dto.alternativaC() != null) this.alternativaC = dto.alternativaC();
	    if (dto.alternativaD() != null) this.alternativaD = dto.alternativaD();
	    if (dto.alternativaE() != null) this.alternativaE = dto.alternativaE();
	    if (dto.imagens() != null) this.imagens = dto.imagens();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	public AlternativaLetra getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(AlternativaLetra alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<SubDisciplina> getSubdisciplinas() {
		return subdisciplinas;
	}

	public void setSubdisciplinas(ArrayList<SubDisciplina> subdisciplinas) {
		this.subdisciplinas = subdisciplinas;
	}

	public Banca getBanca() {
		return banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}

	public Boolean getAlternativaSaoImagem() {
		return alternativaSaoImagem;
	}

	public void setAlternativaSaoImagem(Boolean alternativaSaoImagem) {
		this.alternativaSaoImagem = alternativaSaoImagem;
	}

	public String getAlternativaA() {
		return alternativaA;
	}

	public void setAlternativaA(String alternativaA) {
		this.alternativaA = alternativaA;
	}

	public String getAlternativaB() {
		return alternativaB;
	}

	public void setAlternativaB(String alternativaB) {
		this.alternativaB = alternativaB;
	}

	public String getAlternativaC() {
		return alternativaC;
	}

	public void setAlternativaC(String alternativaC) {
		this.alternativaC = alternativaC;
	}

	public String getAlternativaD() {
		return alternativaD;
	}

	public void setAlternativaD(String alternativaD) {
		this.alternativaD = alternativaD;
	}

	public String getAlternativaE() {
		return alternativaE;
	}

	public void setAlternativaE(String alternativaE) {
		this.alternativaE = alternativaE;
	}

	public ArrayList<String> getImagens() {
		return imagens;
	}

	public void setImagens(ArrayList<String> imagens) {
		this.imagens = imagens;
	}

	public Long getId() {
		return id;
	}
	
	
}
