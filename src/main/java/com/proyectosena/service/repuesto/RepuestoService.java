package com.proyectosena.service.repuesto;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.repuesto.Repuesto;

public interface RepuestoService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Repuesto repuesto);
	
	public String update(Repuesto repuesto);
	
	public void delete(Repuesto repuesto);	
	
	public int getCount();
	
}
