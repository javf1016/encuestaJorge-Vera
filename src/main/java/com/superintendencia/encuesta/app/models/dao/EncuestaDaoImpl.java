package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.superintendencia.encuesta.app.models.entity.Encuesta;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@Repository
public class EncuestaDaoImpl implements IEncuestaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Encuesta> findAll() {
		return em.createQuery("from Encuesta").getResultList();
	}

	@Override
	public void save(Encuesta encuesta) {
		em.persist(encuesta);
	}

	@Override
	public Encuesta findOne(Long id) {
		return em.find(Encuesta.class, id);
	}

	@Override
	public void delete(Long id) {
		Encuesta encuesta = findOne(id);
		em.remove(encuesta);	
	}

}
