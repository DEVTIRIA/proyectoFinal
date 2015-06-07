package com.proyectosena.repository.inter_user_perfil;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface InterUserPerfilRepository {
	
	public InterUserPerfil list(Long id);
	
	public List<InterUserPerfil> listAll(int init, int limit);	
	
	public InterUserPerfil update(InterUserPerfil interuserperfil);
	
	public void delete(InterUserPerfil interuserperfil);
	
	public InterUserPerfil insert(InterUserPerfil interuserperfil);
	
	public int getCount();
}
