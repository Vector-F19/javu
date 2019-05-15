package com.mapas.apiRest.controller;


import com.mapas.apiRest.models.Mapa;
import com.mapas.apiRest.repository.FindMapaByParansRepository;
import com.mapas.apiRest.repository.MapaRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/mapas")
@Api(value = "API REST Mapas")
@CrossOrigin(origins = "*")
public class MapaController {


    @Autowired
    MapaRepository mapaRepository;

    @Autowired
    FindMapaByParansRepository findMapaByParansRepository;

    @GetMapping("numeroMapa/{numeroMapa}")
    public List<Mapa> buscaPorMapa(@PathVariable(value = "numeroMapa") String numeroMapa) {

        List<Mapa> retorno = mapaRepository.findMapaByNumeroMapa(numeroMapa);
        return retorno;

    }

    @GetMapping("bancoEntrada/{bancoEntrada}")
    public List<Mapa> buscaPorBancoEntrada(@PathVariable(value = "bancoEntrada") String bancoEntrada) {

        List<Mapa> retorno1 = mapaRepository.findMapaByBancoEntrada(bancoEntrada);
        return retorno1;
    }


    @GetMapping("bancoSaida/{bancoSaida}")
    public List<Mapa> buscaPorBancoSaida(@PathVariable(value = "bancoSaida") String bancoSaida) {

        List<Mapa> retorno2 = mapaRepository.findMapaByBancoSaida(bancoSaida);
        return retorno2;
    }

    @GetMapping("produto/{produto}")
    public List<Mapa> buscaPorProduto(@PathVariable(value = "produto") String produto) {

        List<Mapa> retorno2 = mapaRepository.findMapaByProduto(produto);
        return retorno2;
    }
    @GetMapping("fluxo/{fluxo}")
    public List<Mapa> buscaPorFluxo(@PathVariable(value = "fluxo") String fluxo) {

        List<Mapa> retorno2 = mapaRepository.findMapaByFluxo(fluxo);
        return retorno2;
    }

    @RequestMapping(path ="teste/{numeroMapa}/{fluxo}/{produto}/{bancoEntrada}/{bancoSaida}", method = RequestMethod.GET)
    public List<Mapa> pegaAe(
                    @PathVariable String numeroMapa,
                    @PathVariable String fluxo,
                    @PathVariable String produto,
                    @PathVariable String bancoEntrada,
                    @PathVariable String bancoSaida
    ) {

        List<Mapa> retorno2 = mapaRepository.findMapaByNumeroMapaAndFluxoAndProdutoAndBancoEntradaAndBancoSaida(numeroMapa,fluxo,produto,bancoEntrada,bancoSaida);
        return retorno2;
    }

    @PostMapping(path = "/parans")
    public List<Mapa> saveParametros(@Valid @RequestBody Mapa mapa){
        return findMapaByParansRepository.findByParametter(mapa);
    }
    @GetMapping("modal/{modal}")
    public List<Mapa> buscaPorModal(@PathVariable(value = "modal") String modal) {

        List<Mapa> retorno8 = mapaRepository.findByModal(modal);
        return retorno8;
    }
}
