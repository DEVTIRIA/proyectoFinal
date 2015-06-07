package com.proyectosena.service.inter_user_perfil;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import com.proyectosena.repository.inter_user_perfil.InterUserPerfil;

public interface InterUserPerfilService{
	
	public String list(Long id);
	
	public String listAll(int pageSize, int page);	
	
	public String insert(InterUserPerfil interuserperfil);
	
	public String update(InterUserPerfil interuserperfil);
	
	public void delete(InterUserPerfil interuserperfil);	
	
	public int getCount();
	
}
