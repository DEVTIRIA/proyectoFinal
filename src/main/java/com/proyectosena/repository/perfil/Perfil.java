package com.proyectosena.repository.perfil;

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
@Table(name = "perfil")
public class Perfil {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "perfil_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="perfil_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "perfil_GEN")  
	@Column(name = "PERFIL_PERFIL")
	protected String perfil_perfil; 
	 
	@Column(name = "PERFIL_NOMBRE")
	protected String perfil_nombre; 

	public Perfil(){
	
	}

	public String getPerfil_perfil(){
		return perfil_perfil;
	}
	
	public void setPerfil_perfil(String perfil_perfil){
		this.perfil_perfil = perfil_perfil;
	}

	public String getPerfil_nombre(){
		return perfil_nombre;
	}
	
	public void setPerfil_nombre(String perfil_nombre){
		this.perfil_nombre = perfil_nombre;
	}


	static public String[] getNames(){
		return new String[]{ "PERFIL_PERFIL", "PERFIL_NOMBRE" };
	}		
	
	static public String getColumnNames(){
		return " PERFIL_PERFIL, PERFIL_NOMBRE ";
	}
	
	public String toString(){
		return " PERFIL_PERFIL: "+ this.perfil_perfil 
			+" PERFIL_NOMBRE: "+ this.perfil_nombre ;
	}
}
