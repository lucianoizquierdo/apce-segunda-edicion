package com.apce.servicio.servicio.Impl;

import com.apce.modelo.Sucursal;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.persistencia.interfaz.SucursalDAO;
import com.apce.servicio.servicoInterfaz.SucursalService;

public class SucursalServiceImpl extends BaseServiceImpl implements SucursalService{

	
	private SucursalDAO dao;
	
	@Override
	public void setDao(BaseDAO dao) {
		// TODO Auto-generated method stub
		this.dao = (SucursalDAO)dao;
	}


	@Override
	public void altaSucursal(Sucursal suc) {
		// TODO Auto-generated method stub
		dao.altaSucursal(suc);
	}

	@Override
	public void bajaSucursal(Sucursal suc) {
		// TODO Auto-generated method stub
		dao.bajaSucursal(suc);
	}

	@Override
	public void modificarSurucsal(Sucursal sucursal) {
		// TODO Auto-generated method stub
		dao.modificarSurucsal(sucursal);
	}

}
