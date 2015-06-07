package com.proyectosena.repository.menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface MenuRepository {
	
	public Menu list(Long id);
	
	public List<Menu> listAll(int init, int limit);	
	
	public Menu update(Menu menu);
	
	public void delete(Menu menu);
	
	public Menu insert(Menu menu);
	
	public int getCount();
}
