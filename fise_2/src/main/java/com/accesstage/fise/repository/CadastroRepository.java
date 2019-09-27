package com.accesstage.fise.repository;

import com.accesstage.fise.model.CadastroModelF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModelF, Long> {

    @Query(value = "SELECT F.TPO_PAGADOR, F.NM_RAZAO_HUB, F.NM_RAZAO_SPK, F.DSC_FLOW, F.CREATED, \\n\" +\n" +
            "//            \"F.MODIFIED, F.ID_STATUS, \\n\" +\n" +
            "//            \"H.ID_HISTORICO, H.ID_USUARIO, H.DSC_ACAO, H.DSC_LOG  " +
            "FROM cadastroModel1 cm WHERE F.ID_FORM = H.ID_FORM AND F.TPO_RESPONSAVEL = H.TPO_RESPONSAVEL ",
            nativeQuery = true)
    List<CadastroModelF> queryBy(@Param("ID_FORM") Long ID_FORM,
                                 @Param("TPO_RESPONSAVEL") String TPO_RESPONSAVEL );

}
