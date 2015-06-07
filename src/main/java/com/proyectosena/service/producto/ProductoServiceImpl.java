package com.proyectosena.service.producto;

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
import com.proyectosena.repository.producto.Producto;
import com.proyectosena.repository.producto.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	Gson gson;
	
	/**
	 * @return the productoRepository
	 */
	public ProductoRepository getProductoRepository() {
		return productoRepository;
	}

	/**
	 * @param productoRepository the productoRepository to set
	 */
	public void setProductoRepository(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PRODUCTO__ALL", "APP_PRODUCTO__READ"})
	public String list(Long id){
		Producto listAll=productoRepository.list(id);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PRODUCTO__ALL", "APP_PRODUCTO__READ"})
	public String listAll(int pageSize, int page){
	
		int limit=pageSize*page;
		int init=limit-pageSize;
		
		List<Producto> listAll=productoRepository.listAll(init, limit);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", listAll);
		result.put("count", this.getCount());
		
		return gson.toJson(result);	
	}	
	
	@Override
	public int getCount(){
				
		return productoRepository.getCount();
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PRODUCTO__ALL", "APP_PRODUCTO__UPDATE"})
	public String update(Producto producto){
		return gson.toJson(productoRepository.update(producto));
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PRODUCTO__ALL", "APP_PRODUCTO__DELETE"})
	public void delete(Producto producto){
		productoRepository.delete(producto);
	}
	
	@Override
	@RolesAllowed({"ADMINISTRATOR_ADMINISTRATOR", "APP_PRODUCTO__ALL", "APP_PRODUCTO__CREATE"})
	public String insert(Producto producto){
		return gson.toJson(productoRepository.insert(producto));
	}
	
}
