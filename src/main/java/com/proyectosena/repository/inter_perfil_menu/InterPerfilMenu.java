package com.proyectosena.repository.inter_perfil_menu;

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
@Table(name = "inter_perfil_menu")
public class InterPerfilMenu {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "inter_perfil_menu_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="inter_perfil_menu_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "inter_perfil_menu_GEN")  
	@Column(name = "INTER3_INTER3")
	protected Long inter3_inter3; 
	 
	@Column(name = "INTER3_MENU")
	protected Long inter3_menu; 
	 
	@Column(name = "INTER3_PERFIL")
	protected String inter3_perfil; 

	public InterPerfilMenu(){
	
	}

	public Long getInter3_inter3(){
		return inter3_inter3;
	}
	
	public void setInter3_inter3(Long inter3_inter3){
		this.inter3_inter3 = inter3_inter3;
	}

	public Long getInter3_menu(){
		return inter3_menu;
	}
	
	public void setInter3_menu(Long inter3_menu){
		this.inter3_menu = inter3_menu;
	}

	public String getInter3_perfil(){
		return inter3_perfil;
	}
	
	public void setInter3_perfil(String inter3_perfil){
		this.inter3_perfil = inter3_perfil;
	}


	static public String[] getNames(){
		return new String[]{ "INTER3_INTER3", "INTER3_MENU", "INTER3_PERFIL" };
	}		
	
	static public String getColumnNames(){
		return " INTER3_INTER3, INTER3_MENU, INTER3_PERFIL ";
	}
	
	public String toString(){
		return " INTER3_INTER3: "+ this.inter3_inter3 
			+" INTER3_MENU: "+ this.inter3_menu 
			+" INTER3_PERFIL: "+ this.inter3_perfil ;
	}
}
