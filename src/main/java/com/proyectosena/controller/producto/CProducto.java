package com.proyectosena.controller.producto;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.proyectosena.service.producto.ProductoService;
import com.proyectosena.repository.producto.Producto;

@Controller
@RequestMapping("/Producto")
public class CProducto {

	@Autowired
	private ProductoService productoService;
	
	public CProducto() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/producto/Producto";
	}
	
	@RequestMapping(value = "/{producto_producto}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("producto_producto") Long producto_producto){
		
		return this.productoService.list(producto_producto);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.productoService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Producto producto, HttpServletRequest request){
	
		return this.productoService.update(producto);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Producto producto, HttpServletRequest request){
	
		//producto.setesta("B");
		return this.productoService.update(producto);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Producto producto, HttpServletRequest request){
		
		return this.productoService.insert(producto);		
	}
}
