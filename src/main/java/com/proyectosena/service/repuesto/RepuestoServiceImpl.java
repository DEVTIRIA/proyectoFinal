package com.proyectosena.service.repuesto;

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
import com.proyectosena.repository.repuesto.Repuesto;
import com.proyectosena.repository.repuesto.RepuestoRepository;

@Service
public class RepuestoServiceImpl implements RepuestoService{
	
	@Autowired
	private RepuestoRepository repuestoRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the repuestoRepository
	 */
	public RepuestoRepository getRepuestoRepository() {
		return repuestoRepository;
	}

	/**
	 * @param repuestoRepository the repuestoRepository to set
	 */
	public void setRepuestoRepository(RepuestoRepository repuestoRepository) {
		this.repuestoRepository = repuestoRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REPUESTO__ALL", "APP_REPUESTO__READ"})
	public String list(Long id){
		Repuesto listAll=repuestoRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REPUESTO__ALL", "APP_REPUESTO__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Repuesto> listAll=repuestoRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return repuestoRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REPUESTO__ALL", "APP_REPUESTO__UPDATE"})
	public String update(Repuesto repuesto){
		return gson.toJson(repuestoRepository.update(repuesto));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REPUESTO__ALL", "APP_REPUESTO__DELETE"})
	public void delete(Repuesto repuesto){
		repuestoRepository.delete(repuesto);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REPUESTO__ALL", "APP_REPUESTO__CREATE"})
	public String insert(Repuesto repuesto){
		return gson.toJson(repuestoRepository.insert(repuesto));
	}
	
}
