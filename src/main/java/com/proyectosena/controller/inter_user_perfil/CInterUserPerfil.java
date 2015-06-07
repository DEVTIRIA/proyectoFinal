package com.proyectosena.controller.inter_user_perfil;

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


import com.proyectosena.service.inter_user_perfil.InterUserPerfilService;
import com.proyectosena.repository.inter_user_perfil.InterUserPerfil;

@Controller
@RequestMapping("/InterUserPerfil")
public class CInterUserPerfil {

	@Autowired
	private InterUserPerfilService interuserperfilService;
	
	public CInterUserPerfil() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/interuserperfil/InterUserPerfil";
	}
	
	@RequestMapping(value = "/{inter2_inter2}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("inter2_inter2") Long inter2_inter2){
		
		return this.interuserperfilService.list(inter2_inter2);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.interuserperfilService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody InterUserPerfil interuserperfil, HttpServletRequest request){
	
		return this.interuserperfilService.update(interuserperfil);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody InterUserPerfil interuserperfil, HttpServletRequest request){
	
		//interuserperfil.setesta("B");
		return this.interuserperfilService.update(interuserperfil);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody InterUserPerfil interuserperfil, HttpServletRequest request){
		
		return this.interuserperfilService.insert(interuserperfil);		
	}
}
