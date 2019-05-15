package com.mapas.apiRest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MAPAS")

public class Mapa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	public String numero_mapa;
	private String fluxo;
	private String produto;
	private String banco_entrada;
	private String banco_saida;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero_mapa() {
		return numero_mapa;
	}

	public void setNumero_mapa(String numero_mapa) {
		this.numero_mapa = numero_mapa;
	}

	public String getFluxo() {
		return fluxo;
	}

	public void setFluxo(String fluxo) {
		this.fluxo = fluxo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getBanco_entrada() {
		return banco_entrada;
	}

	public void setBanco_entrada(String banco_entrada) {
		this.banco_entrada = banco_entrada;
	}

	public String getBanco_saida() {
		return banco_saida;
	}

	public void setBanco_saida(String banco_saida) {
		this.banco_saida = banco_saida;
	}

}
