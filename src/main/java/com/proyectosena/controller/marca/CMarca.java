package com.proyectosena.controller.marca;

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


import com.proyectosena.service.marca.MarcaService;
import com.proyectosena.repository.marca.Marca;

@Controller
@RequestMapping("/Marca")
public class CMarca {

	@Autowired
	private MarcaService marcaService;
	
	public CMarca() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/marca/Marca";
	}
	
	@RequestMapping(value = "/{marca_marca}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("marca_marca") Long marca_marca){
		
		return this.marcaService.list(marca_marca);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.marcaService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Marca marca, HttpServletRequest request){
	
		return this.marcaService.update(marca);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Marca marca, HttpServletRequest request){
	
		//marca.setesta("B");
		return this.marcaService.update(marca);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Marca marca, HttpServletRequest request){
		
		return this.marcaService.insert(marca);		
	}
}
