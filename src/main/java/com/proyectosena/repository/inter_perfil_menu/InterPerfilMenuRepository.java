package com.proyectosena.repository.inter_perfil_menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;

public interface InterPerfilMenuRepository {
	
	public InterPerfilMenu list(Long id);
	
	public List<InterPerfilMenu> listAll(int init, int limit);	
	
	public InterPerfilMenu update(InterPerfilMenu interperfilmenu);
	
	public void delete(InterPerfilMenu interperfilmenu);
	
	public InterPerfilMenu insert(InterPerfilMenu interperfilmenu);
	
	public int getCount();
}
