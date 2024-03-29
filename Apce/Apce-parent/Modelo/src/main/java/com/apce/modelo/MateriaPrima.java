package com.apce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materias_primas")
public class MateriaPrima {

	@Id
	@Column(name="codigo_materia_prima")
	private String codigoMateriaPrima;
	private String tipo;
	private String tamanio;
	private String color;
	private String descripcion;
	private Integer kilos;
	private Integer litros;
	
	@Column(name="activa")
	private boolean isActiva;
	
	
	
	public String getCodigoMateriaPrima() {
		return this.codigoMateriaPrima;
	}
	public void setCodigoMateriaPrima(String codigo_materia_prima) {
		this.codigoMateriaPrima = codigo_materia_prima;
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
	
	public boolean isActiva() {
		return isActiva;
	}
	public void setActiva(boolean isActiva) {
		this.isActiva = isActiva;
	}
	
	
	


}
