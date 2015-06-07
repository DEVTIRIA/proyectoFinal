package com.proyectosena.repository.inter_user_rol;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface InterUserRolRepository {
	
	public InterUserRol list(Long id);
	
	public List<InterUserRol> listAll(int init, int limit);	
	
	public InterUserRol update(InterUserRol interuserrol);
	
	public void delete(InterUserRol interuserrol);
	
	public InterUserRol insert(InterUserRol interuserrol);
	
	public int getCount();
}
