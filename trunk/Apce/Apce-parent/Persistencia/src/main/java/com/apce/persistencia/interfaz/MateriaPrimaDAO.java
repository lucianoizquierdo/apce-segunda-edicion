package com.apce.persistencia.interfaz;

import com.apce.modelo.MateriaPrima;

public interface MateriaPrimaDAO extends BaseDAO {
	
	public void altaMateriaPrima(MateriaPrima matPrima);
	
	public void bajaMateriaPrima(MateriaPrima matPrima);
	
	public void bajaMateriaPrima(Integer idMateriaPrima);
	
	public void modificarMateria(MateriaPrima matPrima);
	
	public void getMateriaPrima(Integer idMateriaPrima);
	
	

}
