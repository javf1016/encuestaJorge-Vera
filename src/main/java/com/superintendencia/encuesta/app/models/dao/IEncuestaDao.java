package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import com.superintendencia.encuesta.app.models.entity.Encuesta;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
public interface IEncuestaDao {

	public List<Encuesta> findAll();
	
	public Encuesta findOne(Long id);
	
	public void save (Encuesta encuesta);
	
	public void delete (Long id);
}
