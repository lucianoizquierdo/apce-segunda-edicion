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
	@Column(name="")
	private Integer id_perfil;
	
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
	public Integer getIdPerfil() {
		return id_perfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.id_perfil = idPerfil;
	}
	
	

}
