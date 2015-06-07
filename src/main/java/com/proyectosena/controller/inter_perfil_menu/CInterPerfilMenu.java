package com.proyectosena.controller.inter_perfil_menu;

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


import com.proyectosena.service.inter_perfil_menu.InterPerfilMenuService;
import com.proyectosena.repository.inter_perfil_menu.InterPerfilMenu;

@Controller
@RequestMapping("/InterPerfilMenu")
public class CInterPerfilMenu {

	@Autowired
	private InterPerfilMenuService interperfilmenuService;
	
	public CInterPerfilMenu() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/interperfilmenu/InterPerfilMenu";
	}
	
	@RequestMapping(value = "/{inter3_inter3}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("inter3_inter3") Long inter3_inter3){
		
		return this.interperfilmenuService.list(inter3_inter3);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.interperfilmenuService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody InterPerfilMenu interperfilmenu, HttpServletRequest request){
	
		return this.interperfilmenuService.update(interperfilmenu);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody InterPerfilMenu interperfilmenu, HttpServletRequest request){
	
		//interperfilmenu.setesta("B");
		return this.interperfilmenuService.update(interperfilmenu);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody InterPerfilMenu interperfilmenu, HttpServletRequest request){
		
		return this.interperfilmenuService.insert(interperfilmenu);		
	}
}
