package com.nttdata.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regiones")
/**
 * Clase Region
 * 
 * @author javie
 *
 */
public class Region implements Serializable {

	/** Atributo estático Serial **/
	private static final long serialVersionUID = 1L;

	/** Atributo de tipo Long que recogerá la id **/
	private Long id;

	/** Atributo de tipo String que recogerá el nombre **/
	private String nombre;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
