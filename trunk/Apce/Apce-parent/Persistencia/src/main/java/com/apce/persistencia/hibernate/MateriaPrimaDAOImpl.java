package com.apce.persistencia.hibernate;

import java.util.List;

import com.apce.modelo.MateriaPrima;
import com.apce.modelo.Usuario;
import com.apce.persistencia.interfaz.MateriaPrimaDAO;

public class MateriaPrimaDAOImpl extends BaseDaoImpl implements MateriaPrimaDAO {

	public void altaMateriaPrima(MateriaPrima matPrima) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(matPrima);

	}

	public void bajaMateriaPrima(MateriaPrima matPrima) {
		//lo doy de baja logicamente
		matPrima.setActiva(false);
		getHibernateTemplate().saveOrUpdate(matPrima);
	}

	public void bajaMateriaPrima(Integer idMateriaPrima) {
		// TODO Auto-generated method stub

	}

	public void modificarMateria(MateriaPrima matPrima) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(matPrima);
	}

	public void getMateriaPrima(Integer idMateriaPrima) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existeMateriaPrima(String codigoMateriaPrima) {
		List<MateriaPrima> materiasPrimas = getHibernateTemplate().find("select m from MateriaPrima m where m.codigoMateriaPrima = " +  "'" + codigoMateriaPrima + "'");

		if(materiasPrimas.size() != 0)
			return true;
		else
			return false;
	}

	@Override
	public List<MateriaPrima> getMateriasPrimas() {
		// TODO Auto-generated method stub
		List<MateriaPrima> materiasPrimas= getHibernateTemplate().find("select m from MateriaPrima m");
		if(materiasPrimas.size() != 0)
			return materiasPrimas;
		else
			return null;

	}








}
