package com.proyectosena.service.inter_user_perfil;

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
import com.proyectosena.repository.inter_user_perfil.InterUserPerfil;
import com.proyectosena.repository.inter_user_perfil.InterUserPerfilRepository;

@Service
public class InterUserPerfilServiceImpl implements InterUserPerfilService{
	
	@Autowired
	private InterUserPerfilRepository interuserperfilRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the interuserperfilRepository
	 */
	public InterUserPerfilRepository getInterUserPerfilRepository() {
		return interuserperfilRepository;
	}

	/**
	 * @param interuserperfilRepository the interuserperfilRepository to set
	 */
	public void setInterUserPerfilRepository(InterUserPerfilRepository interuserperfilRepository) {
		this.interuserperfilRepository = interuserperfilRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERPERFIL__ALL", "APP_INTERUSERPERFIL__READ"})
	public String list(Long id){
		InterUserPerfil listAll=interuserperfilRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERPERFIL__ALL", "APP_INTERUSERPERFIL__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<InterUserPerfil> listAll=interuserperfilRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return interuserperfilRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERPERFIL__ALL", "APP_INTERUSERPERFIL__UPDATE"})
	public String update(InterUserPerfil interuserperfil){
		return gson.toJson(interuserperfilRepository.update(interuserperfil));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERPERFIL__ALL", "APP_INTERUSERPERFIL__DELETE"})
	public void delete(InterUserPerfil interuserperfil){
		interuserperfilRepository.delete(interuserperfil);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_INTERUSERPERFIL__ALL", "APP_INTERUSERPERFIL__CREATE"})
	public String insert(InterUserPerfil interuserperfil){
		return gson.toJson(interuserperfilRepository.insert(interuserperfil));
	}
	
}
