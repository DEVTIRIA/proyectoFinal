package com.proyectosena.repository.tienda;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface TiendaRepository {
	
	public Tienda list(Long id);
	
	public List<Tienda> listAll(int init, int limit);	
	
	public Tienda update(Tienda tienda);
	
	public void delete(Tienda tienda);
	
	public Tienda insert(Tienda tienda);
	
	public int getCount();
}
