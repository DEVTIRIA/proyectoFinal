package com.proyectosena.repository.repuesto;

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
@Table(name = "repuesto")
public class Repuesto {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "repuesto_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="repuesto_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "repuesto_GEN")  
	@Column(name = "REPUESTO_REPUESTO")
	protected Long repuesto_repuesto; 
	 
	@Column(name = "REPUESTO_TIPO")
	protected String repuesto_tipo; 

	public Repuesto(){
	
	}

	public Long getRepuesto_repuesto(){
		return repuesto_repuesto;
	}
	
	public void setRepuesto_repuesto(Long repuesto_repuesto){
		this.repuesto_repuesto = repuesto_repuesto;
	}

	public String getRepuesto_tipo(){
		return repuesto_tipo;
	}
	
	public void setRepuesto_tipo(String repuesto_tipo){
		this.repuesto_tipo = repuesto_tipo;
	}


	static public String[] getNames(){
		return new String[]{ "REPUESTO_REPUESTO", "REPUESTO_TIPO" };
	}		
	
	static public String getColumnNames(){
		return " REPUESTO_REPUESTO, REPUESTO_TIPO ";
	}
	
	public String toString(){
		return " REPUESTO_REPUESTO: "+ this.repuesto_repuesto 
			+" REPUESTO_TIPO: "+ this.repuesto_tipo ;
	}
}
