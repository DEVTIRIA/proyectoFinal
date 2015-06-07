package com.proyectosena.service.inter_user_rol;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.inter_user_rol.InterUserRol;

public interface InterUserRolService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(InterUserRol interuserrol);
	
	public String update(InterUserRol interuserrol);
	
	public void delete(InterUserRol interuserrol);	
	
	public int getCount();
	
}
