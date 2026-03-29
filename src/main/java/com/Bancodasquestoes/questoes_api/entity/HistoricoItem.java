package com.Bancodasquestoes.questoes_api.entity;

import java.time.LocalDateTime;

import com.Bancodasquestoes.questoes_api.dto.HistoricoDTO;
import com.Bancodasquestoes.questoes_api.enums.AlternativaLetra;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "historico_item")
@Entity(name = "historico_itens")
public class HistoricoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User usuario;

    @ManyToOne
    private Questao questao;

    @Enumerated(EnumType.STRING)
    private AlternativaLetra alternativaEscolhida;

    private Boolean acertou;

    private LocalDateTime dataResposta;

    public HistoricoItem() {}

    public HistoricoItem(HistoricoDTO dto, User usuario, Questao questao) {
        this.usuario = usuario;
        this.questao = questao;
        this.alternativaEscolhida = dto.alternativaEscolhida();
        this.acertou = dto.alternativaEscolhida() == questao.getAlternativaCorreta();
        this.dataResposta = LocalDateTime.now();
    }

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public AlternativaLetra getAlternativaEscolhida() {
		return alternativaEscolhida;
	}

	public void setAlternativaEscolhida(AlternativaLetra alternativaEscolhida) {
		this.alternativaEscolhida = alternativaEscolhida;
	}

	public Boolean getAcertou() {
		return acertou;
	}

	public void setAcertou(Boolean acertou) {
		this.acertou = acertou;
	}

	public LocalDateTime getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(LocalDateTime dataResposta) {
		this.dataResposta = dataResposta;
	}

	public Long getId() {
		return id;
	}

    
}