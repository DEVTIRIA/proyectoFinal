package com.proyectosena.controller.catalogo;

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


import com.proyectosena.service.catalogo.CatalogoService;
import com.proyectosena.repository.catalogo.Catalogo;

@Controller
@RequestMapping("/Catalogo")
public class CCatalogo {

	@Autowired
	private CatalogoService catalogoService;
	
	public CCatalogo() {
		super();
	}
			
	@RequestMapping("/Servicio")
	public String index() {
		return "/servicio/servicio";
	}
	
	
	
	@RequestMapping(value = "/{catalogo_catalogo}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("catalogo_catalogo") Long catalogo_catalogo){
		
		return this.catalogoService.list(catalogo_catalogo);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.catalogoService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Catalogo catalogo, HttpServletRequest request){
	
		return this.catalogoService.update(catalogo);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Catalogo catalogo, HttpServletRequest request){
	
		//catalogo.setesta("B");
		return this.catalogoService.update(catalogo);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Catalogo catalogo, HttpServletRequest request){
		
		return this.catalogoService.insert(catalogo);		
	}
}
