package com.apce.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@GeneratedValue
	private Integer id_rol;
	private String descripcion;
	
	public Integer getIdRol() {
		return id_rol;
	}
	
	public void setIdRol(Integer idRol) {
		this.id_rol = idRol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
