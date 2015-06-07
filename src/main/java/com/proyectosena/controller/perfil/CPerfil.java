package com.proyectosena.controller.perfil;

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


import com.proyectosena.service.perfil.PerfilService;
import com.proyectosena.repository.perfil.Perfil;

@Controller
@RequestMapping("/Perfil")
public class CPerfil {

	@Autowired
	private PerfilService perfilService;
	
	public CPerfil() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/perfil/Perfil";
	}
	
	@RequestMapping(value = "/{perfil_perfil}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("perfil_perfil") Long perfil_perfil){
		
		return this.perfilService.list(perfil_perfil);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.perfilService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Perfil perfil, HttpServletRequest request){
	
		return this.perfilService.update(perfil);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Perfil perfil, HttpServletRequest request){
	
		//perfil.setesta("B");
		return this.perfilService.update(perfil);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Perfil perfil, HttpServletRequest request){
		
		return this.perfilService.insert(perfil);		
	}
}
