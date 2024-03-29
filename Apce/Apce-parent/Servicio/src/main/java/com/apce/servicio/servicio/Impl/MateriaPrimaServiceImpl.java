package com.apce.servicio.servicio.Impl;

import java.util.List;

import com.apce.modelo.MateriaPrima;
import com.apce.persistencia.interfaz.BaseDAO;
import com.apce.persistencia.interfaz.MateriaPrimaDAO;
import com.apce.servicio.servicoInterfaz.MateriaPrimaService;

public class MateriaPrimaServiceImpl implements MateriaPrimaService {

	private MateriaPrimaDAO dao;
	
	@Override
	public void setDao(BaseDAO dao) {
		// TODO Auto-generated method stub
		this.dao = (MateriaPrimaDAO)dao;
	}


	@Override
	public void altaMateriaPrima(MateriaPrima matPrima) {
		// TODO Auto-generated method stub
		dao.altaMateriaPrima(matPrima);
	}

	@Override
	public void bajaMateriaPrima(MateriaPrima matPrima) {
		// TODO Auto-generated method stub
		dao.bajaMateriaPrima(matPrima);
	}

	@Override
	public void modificarMateriaPrima(MateriaPrima matPrima) {
		// TODO Auto-generated method stub
		dao.modificarMateria(matPrima);
		
	}

	@Override
	public boolean existeMateriaPrima(String codigoMateriaPrima) {
		// TODO Auto-generated method stub
		return dao.existeMateriaPrima(codigoMateriaPrima);
	}


	@Override
	public List<MateriaPrima> getMateriasPrimas() {
		// TODO Auto-generated method stub
		return dao.getMateriasPrimas();
	}

}
