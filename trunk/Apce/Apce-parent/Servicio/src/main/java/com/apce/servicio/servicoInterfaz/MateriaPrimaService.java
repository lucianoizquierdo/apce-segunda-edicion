package com.apce.servicio.servicoInterfaz;

import com.apce.modelo.MateriaPrima;

public interface MateriaPrimaService extends BaseService {
	
	public void altaMateriaPrima(MateriaPrima matPrim);
	
	public void bajaMateriaPrima(MateriaPrima matPrim);
	
	public void modificarMateriaPrima(MateriaPrima matPrim);

}
