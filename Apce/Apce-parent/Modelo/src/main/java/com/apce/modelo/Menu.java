package com.apce.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	
	@Id
	@GeneratedValue
	private Integer id_menu;
	private String nombre;
	private String descripcion;
	private Integer parent_menu;
	
	public Integer getIdMenu() {
		return id_menu;
	}
	public void setIdMenu(Integer id_menu) {
		this.id_menu = id_menu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getParentMenu() {
		return parent_menu;
	}
	public void setParentMenu(Integer parent_menu) {
		this.parent_menu = parent_menu;
	}
	
	

}
