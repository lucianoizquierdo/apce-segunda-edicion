package com.apce.web.inicializacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InicializoModulos {
	
	private String[] modulos = null;
	private ApplicationContext applicationContextModulos;
	private static InicializoModulos instance = null;
	
	public static InicializoModulos getInstance()
	{
		if(instance == null)
			instance = new InicializoModulos();
		
		return instance;
	}
	
	public ApplicationContext getApplicationContextModulos()
	{
		modulos = new String[] { "classpath*:**/applicationContext-dao.xml", 	//Modulo Persitencia
								 "classpath*:**/applicationContext-service.xml"	//Modulo Servicios
			   				   };
		ApplicationContext ctx = new ClassPathXmlApplicationContext(modulos);
	
		return ctx;
	}

}
