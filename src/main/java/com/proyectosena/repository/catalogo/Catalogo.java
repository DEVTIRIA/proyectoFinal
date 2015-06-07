package com.proyectosena.repository.catalogo;

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
@Table(name = "catalogo")
public class Catalogo {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "catalogo_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="catalogo_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "catalogo_GEN")  
	@Column(name = "CATALOGO_CATALOGO")
	protected Long catalogo_catalogo; 
	 
	@Column(name = "CATALOGO_TIENDA")
	protected Long catalogo_tienda; 
	 
	@Column(name = "CATALOGO_PRODUCTO")
	protected Long catalogo_producto; 
	 
	@Column(name = "CATALOGO_PRECIO")
	protected Long catalogo_precio; 
	 
	@Column(name = "CATALOGO_ENABLED")
	protected String catalogo_enabled; 

	public Catalogo(){
	
	}

	public Long getCatalogo_catalogo(){
		return catalogo_catalogo;
	}
	
	public void setCatalogo_catalogo(Long catalogo_catalogo){
		this.catalogo_catalogo = catalogo_catalogo;
	}

	public Long getCatalogo_tienda(){
		return catalogo_tienda;
	}
	
	public void setCatalogo_tienda(Long catalogo_tienda){
		this.catalogo_tienda = catalogo_tienda;
	}

	public Long getCatalogo_producto(){
		return catalogo_producto;
	}
	
	public void setCatalogo_producto(Long catalogo_producto){
		this.catalogo_producto = catalogo_producto;
	}

	public Long getCatalogo_precio(){
		return catalogo_precio;
	}
	
	public void setCatalogo_precio(Long catalogo_precio){
		this.catalogo_precio = catalogo_precio;
	}

	public String getCatalogo_enabled(){
		return catalogo_enabled;
	}
	
	public void setCatalogo_enabled(String catalogo_enabled){
		this.catalogo_enabled = catalogo_enabled;
	}


	static public String[] getNames(){
		return new String[]{ "CATALOGO_CATALOGO", "CATALOGO_TIENDA", "CATALOGO_PRODUCTO", "CATALOGO_PRECIO", "CATALOGO_ENABLED" };
	}		
	
	static public String getColumnNames(){
		return " CATALOGO_CATALOGO, CATALOGO_TIENDA, CATALOGO_PRODUCTO, CATALOGO_PRECIO, CATALOGO_ENABLED ";
	}
	
	public String toString(){
		return " CATALOGO_CATALOGO: "+ this.catalogo_catalogo 
			+" CATALOGO_TIENDA: "+ this.catalogo_tienda 
			+" CATALOGO_PRODUCTO: "+ this.catalogo_producto 
			+" CATALOGO_PRECIO: "+ this.catalogo_precio 
			+" CATALOGO_ENABLED: "+ this.catalogo_enabled ;
	}
}
