package com.proyectosena.service.referencia;

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
import com.proyectosena.repository.referencia.Referencia;
import com.proyectosena.repository.referencia.ReferenciaRepository;

@Service
public class ReferenciaServiceImpl implements ReferenciaService{
	
	@Autowired
	private ReferenciaRepository referenciaRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the referenciaRepository
	 */
	public ReferenciaRepository getReferenciaRepository() {
		return referenciaRepository;
	}

	/**
	 * @param referenciaRepository the referenciaRepository to set
	 */
	public void setReferenciaRepository(ReferenciaRepository referenciaRepository) {
		this.referenciaRepository = referenciaRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REFERENCIA__ALL", "APP_REFERENCIA__READ"})
	public String list(Long id){
		Referencia listAll=referenciaRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REFERENCIA__ALL", "APP_REFERENCIA__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Referencia> listAll=referenciaRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return referenciaRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REFERENCIA__ALL", "APP_REFERENCIA__UPDATE"})
	public String update(Referencia referencia){
		return gson.toJson(referenciaRepository.update(referencia));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REFERENCIA__ALL", "APP_REFERENCIA__DELETE"})
	public void delete(Referencia referencia){
		referenciaRepository.delete(referencia);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_REFERENCIA__ALL", "APP_REFERENCIA__CREATE"})
	public String insert(Referencia referencia){
		return gson.toJson(referenciaRepository.insert(referencia));
	}
	
}
