package com.proyectosena.repository.inter_user_rol;

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
@Table(name = "inter_user_rol")
public class InterUserRol {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "inter_user_rol_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="inter_user_rol_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "inter_user_rol_GEN")  
	@Column(name = "INTER1_INTER1")
	protected Long inter1_inter1; 
	 
	@Column(name = "INTER1_USER")
	protected Long inter1_user; 
	 
	@Column(name = "INTER1_ROL")
	protected Long inter1_rol; 

	public InterUserRol(){
	
	}

	public Long getInter1_inter1(){
		return inter1_inter1;
	}
	
	public void setInter1_inter1(Long inter1_inter1){
		this.inter1_inter1 = inter1_inter1;
	}

	public Long getInter1_user(){
		return inter1_user;
	}
	
	public void setInter1_user(Long inter1_user){
		this.inter1_user = inter1_user;
	}

	public Long getInter1_rol(){
		return inter1_rol;
	}
	
	public void setInter1_rol(Long inter1_rol){
		this.inter1_rol = inter1_rol;
	}


	static public String[] getNames(){
		return new String[]{ "INTER1_INTER1", "INTER1_USER", "INTER1_ROL" };
	}		
	
	static public String getColumnNames(){
		return " INTER1_INTER1, INTER1_USER, INTER1_ROL ";
	}
	
	public String toString(){
		return " INTER1_INTER1: "+ this.inter1_inter1 
			+" INTER1_USER: "+ this.inter1_user 
			+" INTER1_ROL: "+ this.inter1_rol ;
	}
}
