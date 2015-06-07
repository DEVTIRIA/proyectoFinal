package com.proyectosena.service.perfil;

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
import com.proyectosena.repository.perfil.Perfil;
import com.proyectosena.repository.perfil.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService{
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the perfilRepository
	 */
	public PerfilRepository getPerfilRepository() {
		return perfilRepository;
	}

	/**
	 * @param perfilRepository the perfilRepository to set
	 */
	public void setPerfilRepository(PerfilRepository perfilRepository) {
		this.perfilRepository = perfilRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PERFIL__ALL", "APP_PERFIL__READ"})
	public String list(Long id){
		Perfil listAll=perfilRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PERFIL__ALL", "APP_PERFIL__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Perfil> listAll=perfilRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return perfilRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PERFIL__ALL", "APP_PERFIL__UPDATE"})
	public String update(Perfil perfil){
		return gson.toJson(perfilRepository.update(perfil));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PERFIL__ALL", "APP_PERFIL__DELETE"})
	public void delete(Perfil perfil){
		perfilRepository.delete(perfil);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PERFIL__ALL", "APP_PERFIL__CREATE"})
	public String insert(Perfil perfil){
		return gson.toJson(perfilRepository.insert(perfil));
	}
	
}
