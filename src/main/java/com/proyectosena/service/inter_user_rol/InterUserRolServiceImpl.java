package com.proyectosena.service.inter_user_rol;

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
import com.proyectosena.repository.inter_user_rol.InterUserRol;
import com.proyectosena.repository.inter_user_rol.InterUserRolRepository;

@Service
public class InterUserRolServiceImpl implements InterUserRolService{
	
	@Autowired
	private InterUserRolRepository interuserrolRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the interuserrolRepository
	 */
	public InterUserRolRepository getInterUserRolRepository() {
		return interuserrolRepository;
	}

	/**
	 * @param interuserrolRepository the interuserrolRepository to set
	 */
	public void setInterUserRolRepository(InterUserRolRepository interuserrolRepository) {
		this.interuserrolRepository = interuserrolRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERROL__ALL", "APP_INTERUSERROL__READ"})
	public String list(Long id){
		InterUserRol listAll=interuserrolRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERROL__ALL", "APP_INTERUSERROL__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<InterUserRol> listAll=interuserrolRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return interuserrolRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERROL__ALL", "APP_INTERUSERROL__UPDATE"})
	public String update(InterUserRol interuserrol){
		return gson.toJson(interuserrolRepository.update(interuserrol));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERROL__ALL", "APP_INTERUSERROL__DELETE"})
	public void delete(InterUserRol interuserrol){
		interuserrolRepository.delete(interuserrol);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERROL__ALL", "APP_INTERUSERROL__CREATE"})
	public String insert(InterUserRol interuserrol){
		return gson.toJson(interuserrolRepository.insert(interuserrol));
	}
	
}
