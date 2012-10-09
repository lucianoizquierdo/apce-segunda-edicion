package com.apce.servicio.servicoInterfaz;

import java.util.List;

import com.apce.modelo.Sucursal;

public interface SucursalService extends BaseService{
	
	public void altaSucursal(Sucursal suc);
	
	public void bajaSucursal(Sucursal suc);
	
	public void modificarSurucsal(Sucursal sucursal);
	
	public List<Sucursal> getSucursales();
	

}
