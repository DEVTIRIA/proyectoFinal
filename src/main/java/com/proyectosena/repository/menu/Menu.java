package com.proyectosena.repository.menu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "menu")
public class Menu {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "menu_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="menu_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "menu_GEN")  
	@Column(name = "MENU_MENU")
	protected Long menu_menu; 
	 
	@Column(name = "MENU_NOMBRE")
	protected String menu_nombre; 

	public Menu(){
	
	}

	public Long getMenu_menu(){
		return menu_menu;
	}
	
	public void setMenu_menu(Long menu_menu){
		this.menu_menu = menu_menu;
	}

	public String getMenu_nombre(){
		return menu_nombre;
	}
	
	public void setMenu_nombre(String menu_nombre){
		this.menu_nombre = menu_nombre;
	}


	static public String[] getNames(){
		return new String[]{ "MENU_MENU", "MENU_NOMBRE" };
	}		
	
	static public String getColumnNames(){
		return " MENU_MENU, MENU_NOMBRE ";
	}
	
	public String toString(){
		return " MENU_MENU: "+ this.menu_menu 
			+" MENU_NOMBRE: "+ this.menu_nombre ;
	}
}
