package com.proyectosena.repository.perfil;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface PerfilRepository {
	
	public Perfil list(Long id);
	
	public List<Perfil> listAll(int init, int limit);	
	
	public Perfil update(Perfil perfil);
	
	public void delete(Perfil perfil);
	
	public Perfil insert(Perfil perfil);
	
	public int getCount();
}
