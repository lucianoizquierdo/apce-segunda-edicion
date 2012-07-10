package com.apce.servicio.servicio.Impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.security.userdetails.UserDetails;
import org.springframework.security.userdetails.UsernameNotFoundException;

import com.apce.modelo.Permiso;
import com.apce.modelo.Sucursal;
import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.servicio.servicoInterfaz.SecurityService;

public class SecurityServiceImpl implements SecurityService {

	Permiso permisoDao;
	
	@Override
	public void setDao(BaseDAO dao) {
		this.permisoDao = (Permiso)dao;
	}

	@Override
	public List getListControllersAccesibles(Usuario us, Sucursal suc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
