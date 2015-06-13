package com.proyectosena.controller.user2;

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


import com.proyectosena.service.user2.User2Service;
import com.proyectosena.repository.user2.User2;

@Controller
@RequestMapping("/User2")
public class CUser2 {

	@Autowired
	private User2Service user2Service;
	
	public CUser2() {
		super();
	}
			
	@RequestMapping("/Contacto")
	public String index() {
		return "/contacto/contacto";
	}
	
	@RequestMapping("/Index")
	public String indexx() {
		return "/index/index";
	}
	
	
	@RequestMapping("/Perfil")
	public String indexxxxx() {
		return "/perfil/perfil";
	}
	
	
	
	@RequestMapping(value = "/{user_user}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("user_user") Long user_user){
		
		return this.user2Service.list(user_user);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.user2Service.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody User2 user2, HttpServletRequest request){
	
		return this.user2Service.update(user2);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody User2 user2, HttpServletRequest request){
	
		//user2.setesta("B");
		return this.user2Service.update(user2);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody User2 user2, HttpServletRequest request){
		
		return this.user2Service.insert(user2);		
	}
}
