package com.proyectosena.repository.marca;

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
@Table(name = "marca")
public class Marca {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "marca_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="marca_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "marca_GEN")  
	@Column(name = "MARCA_MARCA")
	protected Long marca_marca; 
	 
	@Column(name = "MARCA_DESCRI")
	protected String marca_descri; 

	public Marca(){
	
	}

	public Long getMarca_marca(){
		return marca_marca;
	}
	
	public void setMarca_marca(Long marca_marca){
		this.marca_marca = marca_marca;
	}

	public String getMarca_descri(){
		return marca_descri;
	}
	
	public void setMarca_descri(String marca_descri){
		this.marca_descri = marca_descri;
	}


	static public String[] getNames(){
		return new String[]{ "MARCA_MARCA", "MARCA_DESCRI" };
	}		
	
	static public String getColumnNames(){
		return " MARCA_MARCA, MARCA_DESCRI ";
	}
	
	public String toString(){
		return " MARCA_MARCA: "+ this.marca_marca 
			+" MARCA_DESCRI: "+ this.marca_descri ;
	}
}
