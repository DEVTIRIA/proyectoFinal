package com.proyectosena.service.producto;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.producto.Producto;

public interface ProductoService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Producto producto);
	
	public String update(Producto producto);
	
	public void delete(Producto producto);	
	
	public int getCount();
	
}
