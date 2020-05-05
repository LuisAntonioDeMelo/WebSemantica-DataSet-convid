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
	private String PaisReportado;
	private Integer totalCasos;
	private Integer totalNovosCasos;
	private Integer confirmados;
	private Integer baixas;
	private Integer casosReportados;
	private String tipoDeTransmissao;
	private Integer diasDesdeOUltimoCaso;

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getPaisReportado() {
		return PaisReportado;
	}

	public void setPaisReportado(String paisReportado) {
		PaisReportado = paisReportado;
	}

	public Integer getTotalCasos() {
		return totalCasos;
	}

	public void setTotalCasos(Integer totalCasos) {
		this.totalCasos = totalCasos;
	}

	public Integer getTotalNovosCasos() {
		return totalNovosCasos;
	}

	public void setTotalNovosCasos(Integer totalNovosCasos) {
		this.totalNovosCasos = totalNovosCasos;
	}

	public Integer getConfirmados() {
		return confirmados;
	}

	public void setConfirmados(Integer confirmados) {
		this.confirmados = confirmados;
	}

	public Integer getBaixas() {
		return baixas;
	}

	public void setBaixas(Integer baixas) {
		this.baixas = baixas;
	}

	public Integer getCasosReportados() {
		return casosReportados;
	}

	public void setCasosReportados(Integer casosReportados) {
		this.casosReportados = casosReportados;
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

}
