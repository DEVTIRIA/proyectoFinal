package com.proyectosena.service.user2;

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
import com.proyectosena.repository.user2.User2;
import com.proyectosena.repository.user2.User2Repository;

@Service
public class User2ServiceImpl implements User2Service{
	
	@Autowired
	private User2Repository user2Repository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the user2Repository
	 */
	public User2Repository getUser2Repository() {
		return user2Repository;
	}

	/**
	 * @param user2Repository the user2Repository to set
	 */
	public void setUser2Repository(User2Repository user2Repository) {
		this.user2Repository = user2Repository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_USER2__ALL", "APP_USER2__READ"})
	public String list(Long id){
		User2 listAll=user2Repository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_USER2__ALL", "APP_USER2__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<User2> listAll=user2Repository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return user2Repository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_USER2__ALL", "APP_USER2__UPDATE"})
	public String update(User2 user2){
		return gson.toJson(user2Repository.update(user2));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_USER2__ALL", "APP_USER2__DELETE"})
	public void delete(User2 user2){
		user2Repository.delete(user2);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_USER2__ALL", "APP_USER2__CREATE"})
	public String insert(User2 user2){
		return gson.toJson(user2Repository.insert(user2));
	}
	
}
