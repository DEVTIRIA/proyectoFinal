package com.proyectosena.service.tienda;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.tienda.Tienda;

public interface TiendaService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Tienda tienda);
	
	public String update(Tienda tienda);
	
	public void delete(Tienda tienda);	
	
	public int getCount();
	
}
