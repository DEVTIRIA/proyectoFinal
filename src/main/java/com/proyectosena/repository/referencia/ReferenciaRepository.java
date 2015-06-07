package com.proyectosena.repository.referencia;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface ReferenciaRepository {
	
	public Referencia list(Long id);
	
	public List<Referencia> listAll(int init, int limit);	
	
	public Referencia update(Referencia referencia);
	
	public void delete(Referencia referencia);
	
	public Referencia insert(Referencia referencia);
	
	public int getCount();
}
