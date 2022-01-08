package com.superintendencia.encuesta.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superintendencia.encuesta.app.models.entity.Encuesta;
import com.superintendencia.encuesta.app.models.entity.Marca;
import com.superintendencia.encuesta.app.models.service.IEncuestaService;
import com.superintendencia.encuesta.app.models.service.IMarcaService;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@RestController
public class EncuestaControllerRest {
	
	@Autowired
	private IEncuestaService encuestaService;
	
	@Autowired
	private IMarcaService marcaService;
	
	@GetMapping(value = "/listarRest")
	public List<Encuesta> listar (Model model) {
		return encuestaService.findAll();
	}
	
	@GetMapping(value = "/listarMarcasRest")
	public List<Marca> listarMarcas (Model model) {
		return marcaService.findAll();
	}
	
	
}
