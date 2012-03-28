package com.apce.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materias_primas")
public class MateriaPrima {
	
	private Integer id_materia_prima;
	private String tipo;
	private String tamanio;
	private String color;
	private String descripcion;
	private Integer kilos;
	private Integer litros;
	
	@Id
	@GeneratedValue
	public Integer getId_materia_prima() {
		return id_materia_prima;
	}
	public void setId_materia_prima(Integer id_materia_prima) {
		this.id_materia_prima = id_materia_prima;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getKilos() {
		return kilos;
	}
	public void setKilos(Integer kilos) {
		this.kilos = kilos;
	}
	public Integer getLitros() {
		return litros;
	}
	public void setLitros(Integer litros) {
		this.litros = litros;
	}
	
	
	


}
