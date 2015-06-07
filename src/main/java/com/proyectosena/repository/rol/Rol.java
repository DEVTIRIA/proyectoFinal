package com.proyectosena.repository.rol;

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
@Table(name = "rol")
public class Rol {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "rol_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="rol_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "rol_GEN")  
	@Column(name = "ROL_ROL")
	protected Long rol_rol; 
	 
	@Column(name = "ROL_NOMBRE")
	protected String rol_nombre; 

	public Rol(){
	
	}

	public Long getRol_rol(){
		return rol_rol;
	}
	
	public void setRol_rol(Long rol_rol){
		this.rol_rol = rol_rol;
	}

	public String getRol_nombre(){
		return rol_nombre;
	}
	
	public void setRol_nombre(String rol_nombre){
		this.rol_nombre = rol_nombre;
	}


	static public String[] getNames(){
		return new String[]{ "ROL_ROL", "ROL_NOMBRE" };
	}		
	
	static public String getColumnNames(){
		return " ROL_ROL, ROL_NOMBRE ";
	}
	
	public String toString(){
		return " ROL_ROL: "+ this.rol_rol 
			+" ROL_NOMBRE: "+ this.rol_nombre ;
	}
}
