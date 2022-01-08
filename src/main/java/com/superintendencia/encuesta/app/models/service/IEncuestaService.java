package com.superintendencia.encuesta.app.models.service;

import java.util.List;

import com.superintendencia.encuesta.app.models.entity.Encuesta;

public interface IEncuestaService {

	public List<Encuesta> findAll();
	
	public Encuesta findOne(Long id);
	
	public void save (Encuesta encuesta);
	
	public void delete (Long id);
}
