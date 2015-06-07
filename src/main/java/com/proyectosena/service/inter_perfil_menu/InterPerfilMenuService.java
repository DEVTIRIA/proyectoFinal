package com.proyectosena.service.inter_perfil_menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.inter_perfil_menu.InterPerfilMenu;

public interface InterPerfilMenuService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(InterPerfilMenu interperfilmenu);
	
	public String update(InterPerfilMenu interperfilmenu);
	
	public void delete(InterPerfilMenu interperfilmenu);	
	
	public int getCount();
	
}
