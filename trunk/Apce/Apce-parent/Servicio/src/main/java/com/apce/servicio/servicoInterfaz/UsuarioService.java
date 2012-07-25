package com.apce.servicio.servicoInterfaz;

import java.util.List;

import com.apce.modelo.Usuario;

/**
 * Clase que se encarga de los usuarios de la aplicacion
 * @author lizquier
 *
 */
public interface UsuarioService extends BaseService{
	
	/**
	 * Devuelve true si el usuario existe para esa sucursal, de caso contrario devuelve false
	 * @param user
	 * @param pass
	 * @param sucursal
	 * @return
	 */
	public boolean existeUser(String aliasUsuario, Integer idSucursal);
	
	/**
	 * Devuelve un usuario o null si el usuario no existe.
	 * @param user
	 * @param pass
	 * @param sucursal
	 * @return
	 */
	public Usuario getUsuario(String user, String pass, Integer sucursal);
	
	/**
	 * Devuelve un usuario o null si el usuario no existe.
	 * @param user
	 * @return Usuario
	 */
	public Usuario getUsuario(String user);
	
	public void altaUsuario(Usuario usu); 

	public void bajaUsuario(Usuario usu) ;

	public void modificarUsuario(Usuario usu);
	
	public List<Usuario> getUsuariosNoActivos(Integer idSucursal);
}
