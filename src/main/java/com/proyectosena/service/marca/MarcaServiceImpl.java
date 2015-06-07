package com.proyectosena.service.marca;

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
import com.proyectosena.repository.marca.Marca;
import com.proyectosena.repository.marca.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService{
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the marcaRepository
	 */
	public MarcaRepository getMarcaRepository() {
		return marcaRepository;
	}

	/**
	 * @param marcaRepository the marcaRepository to set
	 */
	public void setMarcaRepository(MarcaRepository marcaRepository) {
		this.marcaRepository = marcaRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MARCA__ALL", "APP_MARCA__READ"})
	public String list(Long id){
		Marca listAll=marcaRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MARCA__ALL", "APP_MARCA__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Marca> listAll=marcaRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return marcaRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MARCA__ALL", "APP_MARCA__UPDATE"})
	public String update(Marca marca){
		return gson.toJson(marcaRepository.update(marca));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MARCA__ALL", "APP_MARCA__DELETE"})
	public void delete(Marca marca){
		marcaRepository.delete(marca);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_MARCA__ALL", "APP_MARCA__CREATE"})
	public String insert(Marca marca){
		return gson.toJson(marcaRepository.insert(marca));
	}
	
}
