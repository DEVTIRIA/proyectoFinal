package com.proyectosena.service.menu;

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
import com.proyectosena.repository.menu.Menu;
import com.proyectosena.repository.menu.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the menuRepository
	 */
	public MenuRepository getMenuRepository() {
		return menuRepository;
	}

	/**
	 * @param menuRepository the menuRepository to set
	 */
	public void setMenuRepository(MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MENU__ALL", "APP_MENU__READ"})
	public String list(Long id){
		Menu listAll=menuRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MENU__ALL", "APP_MENU__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Menu> listAll=menuRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return menuRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MENU__ALL", "APP_MENU__UPDATE"})
	public String update(Menu menu){
		return gson.toJson(menuRepository.update(menu));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MENU__ALL", "APP_MENU__DELETE"})
	public void delete(Menu menu){
		menuRepository.delete(menu);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MENU__ALL", "APP_MENU__CREATE"})
	public String insert(Menu menu){
		return gson.toJson(menuRepository.insert(menu));
	}
	
}
