package com.accesstage.fise.service;

import com.accesstage.fise.controller.dto.Cadastrodto;
import com.accesstage.fise.repository.CadastroRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepositoryImpl cadastroRepositoryImpl;

    public List<Cadastrodto> findByParametter(Long IDFORMF, Long IDFORMH, String TipoResponsavelF, String TipoResponsavelH, String TipoPagador, String NomeRazaoHub, String NomeRazaoSpk, String DescricaoFlow,
                                              String Criacao, String Modificacao, Integer IdStatus, Integer IdHistorico,
                                              Integer IdUsuario, String DescricaoAcao, String DescricaoLog) {

        return cadastroRepositoryImpl.findByParametter(IDFORMF,IDFORMH,TipoResponsavelF,TipoResponsavelH,TipoPagador, NomeRazaoHub, NomeRazaoSpk, DescricaoFlow, Criacao, Modificacao,
                IdStatus, IdHistorico, IdUsuario, DescricaoAcao, DescricaoLog);
    }
}
