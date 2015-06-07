package com.proyectosena.repository.producto;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface ProductoRepository {
	
	public Producto list(Long id);
	
	public List<Producto> listAll(int init, int limit);	
	
	public Producto update(Producto producto);
	
	public void delete(Producto producto);
	
	public Producto insert(Producto producto);
	
	public int getCount();
}
