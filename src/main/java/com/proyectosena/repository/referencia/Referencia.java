package com.proyectosena.repository.referencia;

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
@Table(name = "referencia")
public class Referencia {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "referencia_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="referencia_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "referencia_GEN")  
	@Column(name = "REFERENCIA_REFERENCIA")
	protected Long referencia_referencia; 
	 
	@Column(name = "REFERENCIA_NOMBRE")
	protected String referencia_nombre; 

	public Referencia(){
	
	}

	public Long getReferencia_referencia(){
		return referencia_referencia;
	}
	
	public void setReferencia_referencia(Long referencia_referencia){
		this.referencia_referencia = referencia_referencia;
	}

	public String getReferencia_nombre(){
		return referencia_nombre;
	}
	
	public void setReferencia_nombre(String referencia_nombre){
		this.referencia_nombre = referencia_nombre;
	}


	static public String[] getNames(){
		return new String[]{ "REFERENCIA_REFERENCIA", "REFERENCIA_NOMBRE" };
	}		
	
	static public String getColumnNames(){
		return " REFERENCIA_REFERENCIA, REFERENCIA_NOMBRE ";
	}
	
	public String toString(){
		return " REFERENCIA_REFERENCIA: "+ this.referencia_referencia 
			+" REFERENCIA_NOMBRE: "+ this.referencia_nombre ;
	}
}
