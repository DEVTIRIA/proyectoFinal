package com.proyectosena.service.marca;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.marca.Marca;

public interface MarcaService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Marca marca);
	
	public String update(Marca marca);
	
	public void delete(Marca marca);	
	
	public int getCount();
	
}
