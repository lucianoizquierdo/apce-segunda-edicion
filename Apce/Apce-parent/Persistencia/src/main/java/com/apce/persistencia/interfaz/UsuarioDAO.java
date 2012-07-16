package com.apce.persistencia.interfaz;

import java.util.List;

import com.apce.modelo.Usuario;


public interface UsuarioDAO extends BaseDAO {
	
	
	public Usuario getUsuario(String user, String pass, Integer sucursal);
	
	public void altaUsuario(Usuario usu);
	
	public void bajaUsuario(Usuario usu);
	
	public void bajaUsuario(Integer idUsuario);
	
	public void modificarUsuario(Usuario usu);
	
	public void modificarUsuario(Integer idusuario);

	public boolean existeUser(String aliasUsuario, Integer idSucursal);

	public List<Usuario> getUsuariosNoActivos(Integer IdSucrusal);

}
