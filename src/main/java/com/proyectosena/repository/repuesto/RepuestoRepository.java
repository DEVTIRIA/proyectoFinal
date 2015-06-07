package com.proyectosena.repository.repuesto;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface RepuestoRepository {
	
	public Repuesto list(Long id);
	
	public List<Repuesto> listAll(int init, int limit);	
	
	public Repuesto update(Repuesto repuesto);
	
	public void delete(Repuesto repuesto);
	
	public Repuesto insert(Repuesto repuesto);
	
	public int getCount();
}
