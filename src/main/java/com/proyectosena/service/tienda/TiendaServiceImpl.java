package com.proyectosena.service.tienda;

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
import com.proyectosena.repository.tienda.Tienda;
import com.proyectosena.repository.tienda.TiendaRepository;

@Service
public class TiendaServiceImpl implements TiendaService{
	
	@Autowired
	private TiendaRepository tiendaRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the tiendaRepository
	 */
	public TiendaRepository getTiendaRepository() {
		return tiendaRepository;
	}

	/**
	 * @param tiendaRepository the tiendaRepository to set
	 */
	public void setTiendaRepository(TiendaRepository tiendaRepository) {
		this.tiendaRepository = tiendaRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_TIENDA__ALL", "APP_TIENDA__READ"})
	public String list(Long id){
		Tienda listAll=tiendaRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_TIENDA__ALL", "APP_TIENDA__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Tienda> listAll=tiendaRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return tiendaRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_TIENDA__ALL", "APP_TIENDA__UPDATE"})
	public String update(Tienda tienda){
		return gson.toJson(tiendaRepository.update(tienda));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_TIENDA__ALL", "APP_TIENDA__DELETE"})
	public void delete(Tienda tienda){
		tiendaRepository.delete(tienda);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_TIENDA__ALL", "APP_TIENDA__CREATE"})
	public String insert(Tienda tienda){
		return gson.toJson(tiendaRepository.insert(tienda));
	}
	
}
