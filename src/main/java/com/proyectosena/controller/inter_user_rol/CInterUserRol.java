package com.proyectosena.controller.inter_user_rol;

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


import com.proyectosena.service.inter_user_rol.InterUserRolService;
import com.proyectosena.repository.inter_user_rol.InterUserRol;

@Controller
@RequestMapping("/InterUserRol")
public class CInterUserRol {

	@Autowired
	private InterUserRolService interuserrolService;
	
	public CInterUserRol() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/interuserrol/InterUserRol";
	}
	
	@RequestMapping(value = "/{inter1_inter1}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("inter1_inter1") Long inter1_inter1){
		
		return this.interuserrolService.list(inter1_inter1);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.interuserrolService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody InterUserRol interuserrol, HttpServletRequest request){
	
		return this.interuserrolService.update(interuserrol);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody InterUserRol interuserrol, HttpServletRequest request){
	
		//interuserrol.setesta("B");
		return this.interuserrolService.update(interuserrol);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody InterUserRol interuserrol, HttpServletRequest request){
		
		return this.interuserrolService.insert(interuserrol);		
	}
}
