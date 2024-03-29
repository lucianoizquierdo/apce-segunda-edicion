package com.apce.modelo;




import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
	//TODO: pasar esto a isActivo
	@Column(name="activo")
	private boolean 	activo; 
	
	@OneToMany
	@JoinTable(name = "usuario_rol",
	    		joinColumns = {@JoinColumn(name="id_usuario", unique = true)},inverseJoinColumns = {@JoinColumn(name="id_rol")}
			  )
	  private Set<Rol> roles;
	/*
	@OneToOne
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name="idUsuario")
	private Permiso permiso;
	*/

	
	/*
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	*/
	
	
	public Integer getIdUsuario() {
		return idusuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idusuario = idUsuario;
	}
	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean isActivo) {
		this.activo = isActivo;
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
