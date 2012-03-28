package com.apce.servicio.servicoInterfaz;

import com.apce.modelo.Usuario;

/**
 * Clase que se encarga de manejar el logon a la aplicacion.
 * @author lizquier
 *
 */
public interface LoginService extends BaseService{
	
	public Usuario getUsuario(String user, String pass, Integer sucursal);

	public boolean existeUser(String aliasUsuario, Integer idSucursal);
	
	
	
	
	
	
	
	

}
