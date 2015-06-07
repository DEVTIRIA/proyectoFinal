package com.proyectosena.controller.repuesto;

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


import com.proyectosena.service.repuesto.RepuestoService;
import com.proyectosena.repository.repuesto.Repuesto;

@Controller
@RequestMapping("/Repuesto")
public class CRepuesto {

	@Autowired
	private RepuestoService repuestoService;
	
	public CRepuesto() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/repuesto/Repuesto";
	}
	
	@RequestMapping(value = "/{repuesto_repuesto}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("repuesto_repuesto") Long repuesto_repuesto){
		
		return this.repuestoService.list(repuesto_repuesto);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.repuestoService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Repuesto repuesto, HttpServletRequest request){
	
		return this.repuestoService.update(repuesto);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Repuesto repuesto, HttpServletRequest request){
	
		//repuesto.setesta("B");
		return this.repuestoService.update(repuesto);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Repuesto repuesto, HttpServletRequest request){
		
		return this.repuestoService.insert(repuesto);		
	}
}
