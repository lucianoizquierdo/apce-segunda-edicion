package com.apce.servicio.servicoInterfaz;

import com.apce.modelo.Sucursal;

public interface SucursalService extends BaseService{
	
	public void altaSucursal(Sucursal suc);
	
	public void bajaSucursal(Sucursal suc);
	
	public void modificarSurucsal(Sucursal sucursal);
	

}
