package com.accesstage.fise.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Data
@Entity
@Table(name = "BIL_HISTORICO", schema = "SITEACCESSTAGE")
public class CadastroModelH implements Serializable {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_FORM")
    @JoinColumn(name = "TPO_RESPONSAVEL")
    private CadastroModelF cadastroModel1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_HISTORICO")
    private Integer idHistorico;

    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @Column(name = "DSC_ACAO")
    private String descricaoAcao;

    @Column(name = "DSC_LOG")
    private String descricaoLog;

}
