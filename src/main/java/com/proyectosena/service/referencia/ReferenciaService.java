package com.proyectosena.service.referencia;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.referencia.Referencia;

public interface ReferenciaService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Referencia referencia);
	
	public String update(Referencia referencia);
	
	public void delete(Referencia referencia);	
	
	public int getCount();
	
}
