package com.apce.servicio.servicio.Impl;

import org.springframework.aop.framework.autoproxy.BeanFactoryAdvisorRetrievalHelper;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.persistencia.interfaz.UsuarioDAO;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioDAO dao;

	@Override
	public void setDao(BaseDAO dao) {
		// TODO Auto-generated method stub
		this.dao = (UsuarioDAO)dao;
	}

	@Override
	public boolean validarUsuario(String user, Integer idSucursal) {
		// TODO Auto-generated method stub
		return dao.existeUser(user, idSucursal);
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
	public void bajaUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		dao.bajaUsuario(idUsuario);
	}

	@Override
	public void modificarUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		dao.modificarUsuario(usu);
	}

	@Override
	public void modificarUsuario(Integer idusuario) {
		// TODO Auto-generated method stub
		dao.modificarUsuario(idusuario);
	}

	/*public static UsuarioService getUsuarioService()
	{
		
	}
	*/
}
