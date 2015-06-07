package com.proyectosena.repository.user2;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface User2Repository {
	
	public User2 list(Long id);
	
	public List<User2> listAll(int init, int limit);	
	
	public User2 update(User2 user2);
	
	public void delete(User2 user2);
	
	public User2 insert(User2 user2);
	
	public int getCount();
}
