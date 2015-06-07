package com.proyectosena.repository.catalogo;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface CatalogoRepository {
	
	public Catalogo list(Long id);
	
	public List<Catalogo> listAll(int init, int limit);	
	
	public Catalogo update(Catalogo catalogo);
	
	public void delete(Catalogo catalogo);
	
	public Catalogo insert(Catalogo catalogo);
	
	public int getCount();
}
