package com.apce.web.inicializacion;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicoInterfaz.UsuarioService;

public class StartupListener extends ContextLoaderListener {
	
	//private FacadeService facadeService = FacadeService.getInstance();
	
	public void contextInitialized(ServletContextEvent event)
	{
		System.out.println("--INICIALIZO LA APLICACION--");
		WebApplicationContext wc =  WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		
		//CARGO LOS SERVICIOS EN EL FACADE
//		UsuarioDAO u = (UsuarioDAOImpl)wc.getBean("usuarioDAO");
//		LoginService l = (LoginServiceImpl)wc.getBean("loginService");
//		Prueba p = (Prueba)wc.getBean("prueba");
//		System.out.println(p);
//		System.out.println("u: " + u);
//		System.out.println("l: " + l);
		
		
		//facadeService.setUsuarioService((UsuarioService)wc.getBean("usuarioService"));
		    
		   
		 
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
