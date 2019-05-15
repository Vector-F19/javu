package com.mapas.apiRest.controller;


import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapas.apiRest.models.Mapa;
import com.mapas.apiRest.repository.MapaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Mapas")
@CrossOrigin(origins = "*")
@Service
@ComponentScan(basePackageClasses={MapaController.class})
public class MapaController {
	
	
	@Autowired 
	MapaRepository mapaRepository;
	
	@GetMapping("/{numero_mapa}")
	public List<Mapa> buscaPorMapa(@PathVariable(value = "numero_mapa")String numero_mapa){
		
		List<Mapa> retorno = mapaRepository.findMapaBynumero_mapa(numero_mapa);
			return retorno;
		
	}
	
	@GetMapping("/dados")
	public List<Mapa> dados(){
	List <Mapa> mapa = new ArrayList<>();
			return mapa;
	
	}
	}

