package com.accesstage.fise.controller;

import com.accesstage.fise.controller.dto.Cadastrodto;
import com.accesstage.fise.service.CadastroService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cadastroApi")
public class CadastroController {

    @Autowired
    CadastroService cadastroService;

    @GetMapping(path = "/cadastro")
    public List<Cadastrodto> findByParametter(Cadastrodto dto) {
        return cadastroService.findByParametter(dto.getIdFormF(), dto.getIdFormH(), dto.getTipoResponsavelF(),
                dto.getTipoResponsavelH(), dto.getTipoPagador(), dto.getNomeRazaoHub(), dto.getNomeRazaoSpk(),
                dto.getDescricaoFlow(), dto.getCriacao(), dto.getModificacao(), dto.getIdStatus(), dto.getIdHistorico(),
                dto.getIdUsuario(), dto.getDescricaoAcao(), dto.getDescricaoLog());
    }
}
