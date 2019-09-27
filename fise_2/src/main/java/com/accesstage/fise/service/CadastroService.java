package com.accesstage.fise.service;

import com.accesstage.fise.model.CadastroModelF;
import com.accesstage.fise.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public List<CadastroModelF> queryBy(Long ID_FORM, String TPO_RESPONSAVEL) {

        return cadastroRepository.queryBy(ID_FORM, TPO_RESPONSAVEL);
    }

}
