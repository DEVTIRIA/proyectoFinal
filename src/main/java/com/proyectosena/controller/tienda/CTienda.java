package com.proyectosena.controller.tienda;

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


import com.proyectosena.service.tienda.TiendaService;
import com.proyectosena.repository.tienda.Tienda;

@Controller
@RequestMapping("/Tienda")
public class CTienda {

	@Autowired
	private TiendaService tiendaService;
	
	public CTienda() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/tienda/Tienda";
	}
	
	@RequestMapping(value = "/{tienda_tienda}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("tienda_tienda") Long tienda_tienda){
		
		return this.tiendaService.list(tienda_tienda);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.tiendaService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Tienda tienda, HttpServletRequest request){
	
		return this.tiendaService.update(tienda);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Tienda tienda, HttpServletRequest request){
	
		//tienda.setesta("B");
		return this.tiendaService.update(tienda);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Tienda tienda, HttpServletRequest request){
		
		return this.tiendaService.insert(tienda);		
	}
}
