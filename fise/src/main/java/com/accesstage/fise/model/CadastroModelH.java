package com.accesstage.fise.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BIL_HISTORICO")
public class CadastroModelH {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_FORM")
    private Long id;

    @JsonProperty
    @Column(name = "TPO_RESPONSAVEL")
    private String tipoResponsavelH;

    @JsonProperty
    @Column(name = "ID_HISTORICO")
    private Integer idHistorico;

    @JsonProperty
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @JsonProperty
    @Column(name = "DSC_ACAO")
    private String descricaoAcao;

    @JsonProperty
    @Column(name = "DSC_LOG")
    private String descricaoLog;

}
