package com.apce.servicio.servicoInterfaz;

import java.util.List;

import com.apce.modelo.Sucursal;
import com.apce.modelo.Usuario;

public interface SecurityService extends BaseService {
	
	List getListControllersAccesibles(Usuario us, Sucursal suc);

}
