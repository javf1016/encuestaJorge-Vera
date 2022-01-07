package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import com.superintendencia.encuesta.app.models.entity.Encuesta;

public interface IEncuestaDao {

	public List<Encuesta> findAll();
}
