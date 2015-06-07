package com.proyectosena.service.user2;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.user2.User2;

public interface User2Service{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(User2 user2);
	
	public String update(User2 user2);
	
	public void delete(User2 user2);	
	
	public int getCount();
	
}
