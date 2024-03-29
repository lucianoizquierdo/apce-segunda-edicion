package com.apce.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@GeneratedValue
	private Integer id_rol;
	private String descripcion;
	@OneToMany
	@JoinTable(name = "rol_perfil",
	    		joinColumns = {@JoinColumn(name="id_rol", unique = true)},inverseJoinColumns = {@JoinColumn(name="id_perfil")}
			  )
	private Set<Perfil> perfiles;
	
	
	
	
	
	public Set<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(Set<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

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
