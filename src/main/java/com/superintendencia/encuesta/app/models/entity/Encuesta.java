package com.superintendencia.encuesta.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@Entity
@Table(name="ENCUESTAS")
public class Encuesta implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -4496823553941906245L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_documento")
	private int numeroDocumento;
	
	private String email;
	
	private String comentarios;
	
	@ManyToOne
	@JoinColumn(name="marcas")
	private Marca marcas;
	
	@Column(name = "fecha_respuesta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRespuesta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Marca getMarcas() {
		return marcas;
	}

	public void setMarcas(Marca marcas) {
		this.marcas = marcas;
	}

	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

	@Override
	public String toString() {
		return "Encuesta [id=" + id + ", numeroDocumento=" + numeroDocumento + ", email=" + email + ", comentarios="
				+ comentarios + ", marcas=" + marcas + ", fechaRespuesta=" + fechaRespuesta + "]";
	}
	
	
	
}
