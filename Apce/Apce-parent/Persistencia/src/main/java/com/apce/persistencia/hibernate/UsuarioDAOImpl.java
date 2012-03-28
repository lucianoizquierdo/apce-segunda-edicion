package com.apce.persistencia.hibernate;

import java.util.List;

import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.UsuarioDAO;
 
public class UsuarioDAOImpl extends BaseDaoImpl implements UsuarioDAO{

	public UsuarioDAOImpl() {
		// TODO Auto-generated constructor stub
	}
//	
//	public UsuarioDAOImpl(SessionFactory sessionFactory) {
//		// TODO Auto-generated constructor stub
//		super.setSessionFactory(sessionFactory);
//	}
	
	

	public void altaUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		
	}

	public void bajaUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		
	}

	public void bajaUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		
	}

	public void modificarUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		
	}

	public void modificarUsuario(Integer idusuario) {
		// TODO Auto-generated method stub
		
	}


	public boolean existeUser(String alias, Integer idSucursal) {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = getHibernateTemplate().find("select u from Usuario u where u.aliasUsuario = " + "'luckyzener'" +  "AND u.idSucursal = " + idSucursal);
		
		if(usuarios.size() != 0)
			return true;
		else
			return false;
	}
	

	public Usuario getUsuario(String user, String pass, Integer idSucursal) {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = getHibernateTemplate().find("select u from Usuario u where u.aliasusuario = " + "'luckyzener'" + " AND u.pass =" + pass  + " AND u.idSucursal = " + idSucursal);
		
		if(usuarios.size() != 0)
			return usuarios.get(0);
		else
			return null;
		
	}
	

}
