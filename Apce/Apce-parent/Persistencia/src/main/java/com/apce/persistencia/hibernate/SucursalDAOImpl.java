package com.apce.persistencia.hibernate;

import java.util.List;

import com.apce.modelo.Sucursal;
import com.apce.persistencia.interfaz.SucursalDAO;

public class SucursalDAOImpl extends BaseDaoImpl implements SucursalDAO{

	
	public void altaSucursal(Sucursal suc) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(suc);
		
	}

	public void bajaSucursal(Sucursal suc) {
		// TODO Auto-generated method stub
		//La borro logicamente
		suc.setActiva(false);
		getHibernateTemplate().saveOrUpdate(suc);
		
	}


	public void modificarSurucsal(Sucursal sucursal) {
		getHibernateTemplate().saveOrUpdate(sucursal);
		
	}

	
	public List<Sucursal> getSucursales() {
		// TODO Auto-generated method stub
		List<Sucursal> sucursales = (List<Sucursal>)getHibernateTemplate().find("select s from Sucursal s");
		return sucursales;
	}



}
