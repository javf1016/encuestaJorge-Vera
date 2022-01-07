package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.superintendencia.encuesta.app.models.entity.Encuesta;

@Repository("encuestaDaoJPA")
public class EncuestaDaoImpl implements IEncuestaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Encuesta> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Encuesta").getResultList();
	}

}
