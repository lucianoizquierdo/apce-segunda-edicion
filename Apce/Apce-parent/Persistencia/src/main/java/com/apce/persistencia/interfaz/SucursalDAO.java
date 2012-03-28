package com.apce.persistencia.interfaz;

import com.apce.modelo.Sucursal;

public interface SucursalDAO {

	public void altaSucursal(Sucursal suc);

	public void bajaSucursal(Sucursal suc);

	public void bajaSucrusal(Integer idSucursal);

	public void modificarSurucsal(Sucursal sucursal);

	public void modificarSurucsal(Integer idSucursal);

}
