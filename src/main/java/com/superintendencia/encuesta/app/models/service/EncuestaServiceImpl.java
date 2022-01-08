package com.superintendencia.encuesta.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.superintendencia.encuesta.app.models.dao.IEncuestaDao;
import com.superintendencia.encuesta.app.models.entity.Encuesta;

@Service
public class EncuestaServiceImpl implements IEncuestaService{

	@Autowired
	private IEncuestaDao encuestaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Encuesta> findAll() {
		return encuestaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Encuesta findOne(Long id) {
		return encuestaDao.findOne(id);
	}

	@Override
	@Transactional
	public void save(Encuesta encuesta) {
		encuestaDao.save(encuesta);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		encuestaDao.delete(id);
	}

}
