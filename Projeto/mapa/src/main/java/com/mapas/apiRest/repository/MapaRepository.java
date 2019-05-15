package com.mapas.apiRest.repository;

import com.mapas.apiRest.models.Mapa;
import org.springframework.data.repository.CrudRepository;

import javax.sound.sampled.Line;
import java.util.List;

public interface MapaRepository extends CrudRepository<Mapa, Line> {

    List<Mapa> findMapaByNumeroMapa(String numeroMapa);

    List<Mapa> findMapaByBancoEntrada(String bancoEntrada);

    List<Mapa> findMapaByBancoSaida(String bancoSaida);

    List<Mapa> findMapaByProduto(String produto);

    List<Mapa> findMapaByFluxo(String Fluxo);

    List<Mapa> findMapaByNumeroMapaAndFluxoAndProdutoAndBancoEntradaAndBancoSaida(String numeroMapa,String fluxo,String produto,String bancoEntrada,String bancoSaida);

    List<Mapa> findByModal(String modal);

}
