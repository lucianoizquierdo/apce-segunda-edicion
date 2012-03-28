import org.springframework.context.ApplicationContext;

import com.apce.web.inicializacion.InicializoModulos;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:**/applicationContext-dao.xml","classpath*:**/applicationContext-service.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"classpath*:**/applicationContext-dao.xml", "classpath*:**/applicationContext-service.xml"});
//		System.out.println("ctx: " + ctx);
//		CreateUser u = (CreateUser)ctx.getBean("createUser");
//		PropertyPlaceholderConfigurer u = (PropertyPlaceholderConfigurer)ctx.getBean("propertyConfigurerJdbc");
		
		ApplicationContext ctx = InicializoModulos.getInstance().getApplicationContextModulos();
		
//		UsuarioDAO u = (UsuarioDAOImpl)ctx.getBean("usuarioDAO");
//		LoginService l = (LoginServiceImpl)ctx.getBean("loginService");
//		System.out.println(u);
//		System.out.println(l);
//		
	}

}
