/**
 * Esta clase se va a encargar de la seguridad de la aplicacion, dicece: Roles, Perfiles, Permisos, etc..
 */

package com.apce.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apce.modelo.Sucursal;
import com.apce.modelo.Usuario;

public class SecurityController extends SimpleFormController {
	
	public List<SimpleFormController> getControllersAccesibles(Usuario usu, Sucursal suc)
	{
		return null;
	}

}
