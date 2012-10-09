package com.apce.servicio.servicio.Impl;

import java.util.List;

import javax.persistence.IdClass;

import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.persistencia.interfaz.UsuarioDAO;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDAO dao;

	@Override
	public void setDao(BaseDAO dao) {
		// TODO Auto-generated method stub
		this.dao = (UsuarioDAO)dao;
	}

	@Override
	public boolean existeUser(String aliasUsuario, Integer idSucursal) {
		// TODO Auto-generated method stub
		
		boolean existeUsuario = this.dao.existeUser(aliasUsuario,idSucursal);
		return existeUsuario;
	}

	@Override
	public Usuario getUsuario(String user, String pass, Integer sucursal) {
		// TODO Auto-generated method stub
		return dao.getUsuario(user, pass, sucursal);
	}

	@Override
	public void altaUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		dao.altaUsuario(usu);
	}

	@Override
	public void bajaUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		dao.bajaUsuario(usu);
	}

	@Override
	public void modificarUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		dao.modificarUsuario(usu);
	}

	@Override
	public List<Usuario> getUsuariosNoActivos(Integer idSucursal) {
		// TODO Auto-generated method stub
		return dao.getUsuariosNoActivos(idSucursal);
	}

	@Override
	public Usuario getUsuario(String user) {
		// TODO Auto-generated method stub
		return dao.getUsuario(user);
	}

	@Override
	public Object getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public UserDetails loadUserByUsername(String user)
			throws UsernameNotFoundException, DataAccessException {
		// TODO Auto-generated method stub
		
		dao.getUsuario(user);
		return null;
	}
*/
}
