package com.apce.web.inicializacion;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.apce.persistencia.hibernate.UsuarioDAOImpl;
import com.apce.persistencia.interfaz.UsuarioDAO;
import com.apce.servicio.servicio.Impl.FacadeService;
import com.apce.servicio.servicio.Impl.LoginServiceImpl;
import com.apce.servicio.servicoInterfaz.LoginService;

public class StartupListener extends ContextLoaderListener {
	
	private FacadeService facadeService = FacadeService.getInstance();
	
	public void contextInitialized(ServletContextEvent event)
	{
		System.out.println("--INICIALIZO LA APLICACION--");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"classpath*:**/applicationContext-dao.xml", "classpath*:**/applicationContext-service.xml"});
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:**/applicationContext-dao.xml");
		WebApplicationContext wc =  WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		
		//CARGO LOS SERVICIOS EN EL FACADE
		UsuarioDAO u = (UsuarioDAOImpl)wc.getBean("usuarioDAO");
		LoginService l = (LoginServiceImpl)wc.getBean("loginService");
//		Prueba p = (Prueba)wc.getBean("prueba");
//		System.out.println(p);
		System.out.println("u: " + u);
		System.out.println("l: " + l);
		// facadeService.setLoginService((LoginService)wc.getBean("loginService"));
		    
		   
		 
		//UsuarioDAO u = (UsuarioDAOImpl)ctx.getBean("usuarioDAO");
		//LoginService l = (LoginServiceImpl)ctx.getBean("loginService");
//		System.out.println(u);
	//	Prueba p = (Prueba) wc.getBean("prueba");
	//	System.out.println("P: " + p);
		//UsuarioDAO d =  (UsuarioDAO) ctx.getBean("usuarioDAO");
		//UsuarioDAO d =  (UsuarioDAO) wc.getBean("usuarioDAO");
		//System.out.println("d: " + d);
		
		//ApplicationContext ctx = InicializoModulos.getInstance().getApplicationContextModulos();
		
//		UsuarioDAO u = (UsuarioDAOImpl)wc.getBean("usuarioDAO");
//		LoginService l = (LoginServiceImpl)wc.getBean("loginService");
//		System.out.println(u);
//		System.out.println(l);
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
