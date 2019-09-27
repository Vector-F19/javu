package com.accesstage.fise.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "BIL_FORM" , schema = "SITEACCESSTAGE")
public class CadastroModelF implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FORM")
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TPO_RESPONSAVEL")
    private String tipoResponsavelF;

    @Column(name = "TPO_PAGADOR")
    private String tipoPagador;

    @Column(name = "NM_RAZAO_HUB")
    private String nomeRazaoHub;

    @Column(name = "NM_RAZAO_SPK")
    private String nomeRazaoSpk;

    @Column(name = "DSC_FLOW")
    private String descricaoFlow;

    @Column(name = "CREATED")
    private String criacao;

    @Column(name = "MODIFIED")
    private String modificacao;

    @Column(name = "ID_STATUS")
    private Integer idStatus;

    public CadastroModelF(String tipoPagador, String nomeRazaoHub, String nomeRazaoSpk, String descricaoFlow, String criacao, String modificacao, Integer idStatus) {
        this.tipoPagador = tipoPagador;
        this.nomeRazaoHub = nomeRazaoHub;
        this.nomeRazaoSpk = nomeRazaoSpk;
        this.descricaoFlow = descricaoFlow;
        this.criacao = criacao;
        this.modificacao = modificacao;
        this.idStatus = idStatus;
    }
}
