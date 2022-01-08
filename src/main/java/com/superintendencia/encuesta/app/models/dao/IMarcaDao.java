package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import com.superintendencia.encuesta.app.models.entity.Marca;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
public interface IMarcaDao {

	public List<Marca> findAll();
	
}
