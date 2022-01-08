package com.superintendencia.encuesta.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@Entity
@Table(name="MARCAS")
public class Marca implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -4289200805057630623L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
