package com.proyectosena.service.menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.menu.Menu;

public interface MenuService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Menu menu);
	
	public String update(Menu menu);
	
	public void delete(Menu menu);	
	
	public int getCount();
	
}
