package com.superintendencia.encuesta.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.superintendencia.encuesta.app.models.dao.IMarcaDao;
import com.superintendencia.encuesta.app.models.entity.Marca;

@Service
public class MarcaServiceImpl implements IMarcaService{

	@Autowired
	private IMarcaDao marcaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAll() {
		return marcaDao.findAll();
	}

}
