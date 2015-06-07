package com.proyectosena.service.perfil;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.perfil.Perfil;

public interface PerfilService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(Perfil perfil);
	
	public String update(Perfil perfil);
	
	public void delete(Perfil perfil);	
	
	public int getCount();
	
}
