package com.proyectosena.controller.menu;

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


import com.proyectosena.service.menu.MenuService;
import com.proyectosena.repository.menu.Menu;

@Controller
@RequestMapping("/Menu")
public class CMenu {

	@Autowired
	private MenuService menuService;
	
	public CMenu() {
		super();
	}
			
	@RequestMapping("/")
	public String index() {
		return "proyectosena/menu/Menu";
	}
	
	@RequestMapping(value = "/{menu_menu}.json", method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String list(@PathVariable("menu_menu") Long menu_menu){
		
		return this.menuService.list(menu_menu);
	}
	
	@RequestMapping(value = "/listAll.json", params = {"page","pageSize"},  method = RequestMethod.GET, produces={"application/json"})
	@ResponseBody
	public String listAll(@RequestParam("pageSize") int pageSize, @RequestParam("page") int page){
	
		return this.menuService.listAll(pageSize, page);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String update(@RequestBody Menu menu, HttpServletRequest request){
	
		return this.menuService.update(menu);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public String delete(@RequestBody Menu menu, HttpServletRequest request){
	
		//menu.setesta("B");
		return this.menuService.update(menu);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces={"application/json"})
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public String insert(@RequestBody Menu menu, HttpServletRequest request){
		
		return this.menuService.insert(menu);		
	}
}
