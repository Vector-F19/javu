package com.mapas.apiRest.models;

import javax.persistence.*;

@Entity
@Table(name = "TB_MAPAS")

public class Mapa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String numeroMapa;
    private String fluxo;
    private String produto;
    private String bancoEntrada;
    private String bancoSaida;
    private String modal;

    public String getModal() { return modal; }

    public void setModal(String modal) { this.modal = modal; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroMapa() {
        return numeroMapa;
    }

    public void setNumeroMapa(String numeroMapa) {
        this.numeroMapa = numeroMapa;
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

    public String getBancoEntrada() {
        return bancoEntrada;
    }

    public void setBancoEntrada(String bancoEntrada) {
        this.bancoEntrada = bancoEntrada;
    }

    public String getBancoSaida() {
        return bancoSaida;
    }

    public void setBancoSaida(String bancoSaida) {
        this.bancoSaida = bancoSaida;
    }


}
