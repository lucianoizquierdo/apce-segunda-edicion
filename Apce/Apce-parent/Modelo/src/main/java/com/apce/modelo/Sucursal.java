package com.apce.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursales")
public class Sucursal {
	
	private Integer idSucursal;
	private String 	ciudad;
	private String 	provincia;
	private String 	direccion;
	private String 	gerenteGeneral;
	
	@Id
	@GeneratedValue
	
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name="gerente_general")
	public String getGerenteGeneral() {
		return gerenteGeneral;
	}
	public void setGerenteGeneral(String gerenteGeneral) {
		this.gerenteGeneral = gerenteGeneral;
	}
	
	
	
	
}
