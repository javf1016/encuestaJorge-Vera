package com.superintendencia.encuesta.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.superintendencia.encuesta.app.models.entity.Marca;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@Repository
public class MarcaDaoImpl implements IMarcaDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Marca> findAll() {
		return em.createQuery("from Marca").getResultList();
	}

}
