package com.apce.modelo;




import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "usuarios_seq") 
    @SequenceGenerator(name = "usuarios_seq", sequenceName = "usuarios_seq")
	private Integer 	idusuario;
	private String 		nombre;
	private String 		apellido;
	private String 		aliasUsuario; 
	private Integer 	dni;
	private Integer 	idSucursal;
	private Date 		fecha_nacimiento;
	private Integer 	telefono;
	private String 		direccion;
	private String 		pass;
	@Column(name="activo")
	private Boolean 	isActivo;

	
	public Integer getIdUsuario() {
		return idusuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idusuario = idUsuario;
	}
	
	public Boolean getIsActivo() {
		return isActivo;
	}

	public void setIsActivo(Boolean isActivo) {
		this.isActivo = isActivo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getAliasUsuario() {
		return aliasUsuario;
	}
	public void setAliasUsuario(String aliasUsuario) {
		this.aliasUsuario = aliasUsuario;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}
	public Date getFecha_nacimiento() {
		return this.fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date f) {
		this.fecha_nacimiento = f;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
