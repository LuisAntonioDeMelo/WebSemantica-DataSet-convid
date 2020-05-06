package br.com.web.semantica.dataset.modelo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "covidData")
public class Covid19Data implements Serializable {

	private static final long serialVersionUID = -1276541453474929829L;

	@Id
	@NotNull
	private ObjectId _id;

	@NotNull
	private String  paisReportado;
	private Integer totalCasosConfirmados;
	private Integer novosCasosConfirmados;
	private Integer baixas;
	private Integer novasBaixas;
	private String  tipoDeTransmissao;
	private Integer diasDesdeOUltimoCaso;

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getPaisReportado() {
		return paisReportado;
	}

	public void setPaisReportado(String paisReportado) {
		this.paisReportado = paisReportado;
	}

	public Integer getBaixas() {
		return baixas;
	}

	public void setBaixas(Integer baixas) {
		this.baixas = baixas;
	}
	public String getTipoDeTransmissao() {
		return tipoDeTransmissao;
	}

	public void setTipoDeTransmissao(String tipoDeTransmissao) {
		this.tipoDeTransmissao = tipoDeTransmissao;
	}

	public Integer getDiasDesdeOUltimoCaso() {
		return diasDesdeOUltimoCaso;
	}

	public void setDiasDesdeOUltimoCaso(Integer diasDesdeOUltimoCaso) {
		this.diasDesdeOUltimoCaso = diasDesdeOUltimoCaso;
	}

	public Integer getTotalCasosConfirmados() {
		return totalCasosConfirmados;
	}

	public void setTotalCasosConfirmados(Integer totalCasosConfirmados) {
		this.totalCasosConfirmados = totalCasosConfirmados;
	}

	public Integer getNovosCasosConfirmados() {
		return novosCasosConfirmados;
	}

	public void setNovosCasosConfirmados(Integer novosCasosConfirmados) {
		this.novosCasosConfirmados = novosCasosConfirmados;
	}

	public Integer getNovasBaixas() {
		return novasBaixas;
	}

	public void setNovasBaixas(Integer novasBaixas) {
		this.novasBaixas = novasBaixas;
	}
	
	

}
