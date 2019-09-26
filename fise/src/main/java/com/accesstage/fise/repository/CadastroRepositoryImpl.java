package com.accesstage.fise.repository;

import com.accesstage.fise.controller.dto.Cadastrodto;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class CadastroRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Cadastrodto> findByParametter(Long IDFORMF, Long IDFORMH, String TipoResponsavelF,
                                              String TipoResponsavelH, String TipoPagador, String NomeRazaoHub,
                                              String NomeRazaoSpk, String DescricaoFlow, String Criacao,
                                              String Modificacao, Integer IdStatus, Integer IdHistorico,
                                              Integer IdUsuario, String DescricaoAcao, String DescricaoLog) {

        StringBuilder strQuery = new StringBuilder("SELECT F.TPO_PAGADOR, F.NM_RAZAO_HUB, F.NM_RAZAO_SPK, F.DSC_FLOW, F.CREATED, F.MODIFIED, F.ID_STATUS, H.ID_HISTORICO, H.ID_USUARIO, H.DSC_ACAO, \\n\" +\n" +
                "                \"H.DSC_LOG   FROM SITEACCESSTAGE.BIL_FORM F ,SITEACCESSTAGE.BIL_HISTORICO H WHERE F.ID_FORM = H.ID_FORM AND F.TPO_RESPONSAVEL = H.TPO_RESPONSAVEL");
        Map<String, Object> values = new HashMap<>();

        Optional.ofNullable(IDFORMF)
                .ifPresent(ID_FORM -> {
                    strQuery.append(" and F.ID_FORM = " + IDFORMF);
                });
        Optional.ofNullable(IDFORMH)
                .ifPresent(ID_FORM -> {
                    strQuery.append(" and H.ID_FORM = " + IDFORMH);
                });

        Optional.ofNullable(TipoResponsavelH)
                .ifPresent(TPO_RESPONSAVEL -> {
                    strQuery.append(" and F.TPO_RESPONSAVEL = " + TipoResponsavelH);
                });

        Optional.ofNullable(TipoResponsavelF)
                .ifPresent(TPO_RESPONSAVEL -> {
                    strQuery.append(" and F.TPO_RESPONSAVEL = " + TipoResponsavelF);
                });

        Optional.ofNullable(TipoPagador)
                .ifPresent(TPO_PAGADOR -> {
                    strQuery.append(" and F.TPO_PAGADOR = " + TipoPagador);
                });

        Optional.ofNullable(NomeRazaoHub)
                .ifPresent(NM_RAZAO_HUB -> {
                    strQuery.append(" and F.NM_RAZAO_HUB = " + NomeRazaoHub);
                });

        Optional.ofNullable(NomeRazaoSpk)
                .ifPresent(NM_RAZAO_SPK -> {
                    strQuery.append(" and F.NM_RAZAO_SPK = " + NomeRazaoSpk);
                });

        Optional.ofNullable(DescricaoFlow)
                .ifPresent(DSC_FLOW -> {
                    strQuery.append(" and F.DSC_FLOW = " + DescricaoFlow);
                });

        Optional.ofNullable(Criacao)
                .ifPresent(CREATED -> {
                    strQuery.append(" and F.CREATED = " + Criacao);
                });

        Optional.ofNullable(Modificacao)
                .ifPresent(MODIFIED -> {
                    strQuery.append(" and F.MODIFIED = " + Modificacao);
                });

        Optional.ofNullable(IdStatus)
                .ifPresent(ID_STATUS -> {
                    strQuery.append(" and F.ID_STATUS = " + IdStatus);
                });

        Optional.ofNullable(IdHistorico)
                .ifPresent(ID_HISTORICO -> {
                    strQuery.append(" and H.ID_HISTORICO = " + IdHistorico);
                });

        Optional.ofNullable(IdUsuario)
                .ifPresent(ID_USUARIO -> {
                    strQuery.append(" and H.ID_USUARIO = " + IdUsuario);
                });

        Optional.ofNullable(DescricaoAcao)
                .ifPresent(DSC_ACAO -> {
                    strQuery.append(" and H.DSC_ACAO = " + DescricaoAcao);
                });

        Optional.ofNullable(DescricaoLog)
                .ifPresent(DSC_LOG -> {
                    strQuery.append(" and H.DSC_LOG = " + DescricaoLog);
                });


        TypedQuery<Cadastrodto> query = entityManager.createQuery(strQuery.toString(), Cadastrodto.class);
        values.forEach((key, value) -> query.setParameter(key, value));
        return query.getResultList();

    }
}
