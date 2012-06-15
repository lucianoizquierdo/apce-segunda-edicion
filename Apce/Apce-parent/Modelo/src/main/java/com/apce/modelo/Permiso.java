package com.apce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permisos")
public class Permiso {
	
	@Id
	private Integer idUsuario;
	private Integer id_rol;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdRol() {
		return id_rol;
	}
	public void setIdRol(Integer idRol) {
		this.id_rol = idRol;
	}
}
