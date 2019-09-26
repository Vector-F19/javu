package com.accesstage.fise.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BIL_FORM")
public class CadastroModelF {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FORM")
    private Long id;

    @JsonProperty
    @Column(name = "TPO_RESPONSAVEL")
    private String tipoResponsavelF;

    @JsonProperty
    @Column(name = "TPO_PAGADOR")
    private String tipoPagador;

    @JsonProperty
    @Column(name = "NM_RAZAO_HUB")
    private String nomeRazaoHub;

    @JsonProperty
    @Column(name = "NM_RAZAO_SPK")
    private String nomeRazaoSpk;

    @JsonProperty
    @Column(name = "DSC_FLOW")
    private String descricaoFlow;

    @JsonProperty
    @Column(name = "CREATED")
    private String criacao;

    @JsonProperty
    @Column(name = "MODIFIED")
    private String modificacao;

    @JsonProperty
    @Column(name = "ID_STATUS")
    private Integer idStatus;

}
