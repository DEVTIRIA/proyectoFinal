package com.proyectosena.controller.referencia;

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


import com.proyectosena.service.referencia.ReferenciaService;
import com.proyectosena.repository.referencia.Referencia;

@Controller
@RequestMapping("/Referencia")
public class CReferencia {

	@Autowired
	private ReferenciaService referenciaService;
	
	public CReferencia() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/referencia/Referencia";
	}
	
	@RequestMapping(value = "/{referencia_referencia}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("referencia_referencia") Long referencia_referencia){
		
		return this.referenciaService.list(referencia_referencia);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.referenciaService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Referencia referencia, HttpServletRequest request){
	
		return this.referenciaService.update(referencia);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Referencia referencia, HttpServletRequest request){
	
		//referencia.setesta("B");
		return this.referenciaService.update(referencia);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Referencia referencia, HttpServletRequest request){
		
		return this.referenciaService.insert(referencia);		
	}
}
