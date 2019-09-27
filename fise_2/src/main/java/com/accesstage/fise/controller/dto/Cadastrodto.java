//package com.accesstage.fise.controller.dto;
//
//import com.accesstage.fise.model.CadastroModelF;
//import com.accesstage.fise.model.CadastroModelH;
//import lombok.Data;
//
//@Data
//public class Cadastrodto {
//
//    private Long idFormF;
//    private String tipoResponsavelF;
//    private String tipoPagador;
//    private String nomeRazaoHub;
//    private String nomeRazaoSpk;
//    private String descricaoFlow;
//    private String criacao;
//    private String modificacao;
//    private Integer idStatus;
//    private Integer idHistorico;
//    private Integer idUsuario;
//    private String descricaoAcao;
//    private String descricaoLog;
//
//    public Cadastrodto(CadastroModelF cadastroModelF, CadastroModelH cadastroModelH) {
//
//        this.idFormF = cadastroModelF.getId();
//        this.tipoResponsavelF = cadastroModelF.getTipoResponsavelF();
//        this.tipoPagador = cadastroModelF.getTipoPagador();
//        this.nomeRazaoHub = cadastroModelF.getNomeRazaoHub();
//        this.nomeRazaoSpk = cadastroModelF.getNomeRazaoSpk();
//        this.descricaoFlow = cadastroModelF.getDescricaoFlow();
//        this.criacao = cadastroModelF.getCriacao();
//        this.modificacao = cadastroModelF.getModificacao();
//        this.idStatus = cadastroModelF.getIdStatus();
//        this.idHistorico = cadastroModelH.getIdHistorico();
//        this.idUsuario = cadastroModelH.getIdUsuario();
//        this.descricaoAcao = cadastroModelH.getDescricaoAcao();
//        this.descricaoLog = cadastroModelH.getDescricaoLog();
//    }
//}
