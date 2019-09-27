package com.accesstage.fise.controller;

import com.accesstage.fise.model.CadastroModelF;
import com.accesstage.fise.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cadastroApi")
public class CadastroController {

    @Autowired
    CadastroService cadastroService;

    @GetMapping(path = "/cadastro")
    public List<CadastroModelF> queryBy(@RequestParam("ID_FORM") Long ID_FORM,
                                        @RequestParam("TPO_RESPONSAVEL") String TPO_RESPONSAVEL) {
        return cadastroService.queryBy(ID_FORM, TPO_RESPONSAVEL);
    }
}
