package com.proyectosena.service.catalogo;

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
import com.proyectosena.repository.catalogo.Catalogo;
import com.proyectosena.repository.catalogo.CatalogoRepository;

@Service
public class CatalogoServiceImpl implements CatalogoService{
	
	@Autowired
	private CatalogoRepository catalogoRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the catalogoRepository
	 */
	public CatalogoRepository getCatalogoRepository() {
		return catalogoRepository;
	}

	/**
	 * @param catalogoRepository the catalogoRepository to set
	 */
	public void setCatalogoRepository(CatalogoRepository catalogoRepository) {
		this.catalogoRepository = catalogoRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_CATALOGO__ALL", "APP_CATALOGO__READ"})
	public String list(Long id){
		Catalogo listAll=catalogoRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_CATALOGO__ALL", "APP_CATALOGO__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Catalogo> listAll=catalogoRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return catalogoRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_CATALOGO__ALL", "APP_CATALOGO__UPDATE"})
	public String update(Catalogo catalogo){
		return gson.toJson(catalogoRepository.update(catalogo));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_CATALOGO__ALL", "APP_CATALOGO__DELETE"})
	public void delete(Catalogo catalogo){
		catalogoRepository.delete(catalogo);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_CATALOGO__ALL", "APP_CATALOGO__CREATE"})
	public String insert(Catalogo catalogo){
		return gson.toJson(catalogoRepository.insert(catalogo));
	}
	
}
