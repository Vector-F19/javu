package com.mapas.apiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.mapas.apiRest.models.Mapa;

import com.mapas.apiRest.repository.MapaRepository;

@Service
public interface MapaRepository extends CrudRepository<Mapa, Long> {

	Mapa findById(long id);
	List<Mapa> findMapaBynumero_mapa(String numero_mapa);

}
