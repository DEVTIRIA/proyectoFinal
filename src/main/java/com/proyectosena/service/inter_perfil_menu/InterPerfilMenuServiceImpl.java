package com.proyectosena.service.inter_perfil_menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.proyectosena.repository.inter_perfil_menu.InterPerfilMenu;
import com.proyectosena.repository.inter_perfil_menu.InterPerfilMenuRepository;

@Service
public class InterPerfilMenuServiceImpl implements InterPerfilMenuService{
	
	@Autowired
	private InterPerfilMenuRepository interperfilmenuRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the interperfilmenuRepository
	 */
	public InterPerfilMenuRepository getInterPerfilMenuRepository() {
		return interperfilmenuRepository;
	}

	/**
	 * @param interperfilmenuRepository the interperfilmenuRepository to set
	 */
	public void setInterPerfilMenuRepository(InterPerfilMenuRepository interperfilmenuRepository) {
		this.interperfilmenuRepository = interperfilmenuRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERPERFILMENU__ALL", "APP_INTERPERFILMENU__READ"})
	public String list(Long id){
		InterPerfilMenu listAll=interperfilmenuRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERPERFILMENU__ALL", "APP_INTERPERFILMENU__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<InterPerfilMenu> listAll=interperfilmenuRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return interperfilmenuRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERPERFILMENU__ALL", "APP_INTERPERFILMENU__UPDATE"})
	public String update(InterPerfilMenu interperfilmenu){
		return gson.toJson(interperfilmenuRepository.update(interperfilmenu));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERPERFILMENU__ALL", "APP_INTERPERFILMENU__DELETE"})
	public void delete(InterPerfilMenu interperfilmenu){
		interperfilmenuRepository.delete(interperfilmenu);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERPERFILMENU__ALL", "APP_INTERPERFILMENU__CREATE"})
	public String insert(InterPerfilMenu interperfilmenu){
		return gson.toJson(interperfilmenuRepository.insert(interperfilmenu));
	}
	
}
