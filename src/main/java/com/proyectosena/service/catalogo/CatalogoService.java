package com.proyectosena.service.catalogo;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.catalogo.Catalogo;

public interface CatalogoService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Catalogo catalogo);
	
	public String update(Catalogo catalogo);
	
	public void delete(Catalogo catalogo);	
	
	public int getCount();
	
}
