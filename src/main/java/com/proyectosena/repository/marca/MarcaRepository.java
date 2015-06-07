package com.proyectosena.repository.marca;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface MarcaRepository {
	
	public Marca list(Long id);
	
	public List<Marca> listAll(int init, int limit);	
	
	public Marca update(Marca marca);
	
	public void delete(Marca marca);
	
	public Marca insert(Marca marca);
	
	public int getCount();
}
