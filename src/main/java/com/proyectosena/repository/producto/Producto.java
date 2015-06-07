package com.proyectosena.repository.producto;

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
@Table(name = "producto")
public class Producto {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "producto_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="producto_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "producto_GEN")  
	@Column(name = "PRODUCTO_PRODUCTO")
	protected Long producto_producto; 
	 
	@Column(name = "PRODUCTO_MARCA")
	protected Long producto_marca; 
	 
	@Column(name = "PRODUCTO_REFERENCIA")
	protected Long producto_referencia; 
	 
	@Column(name = "PRODUCTO_REPUESTO")
	protected Long producto_repuesto; 

	public Producto(){
	
	}

	public Long getProducto_producto(){
		return producto_producto;
	}
	
	public void setProducto_producto(Long producto_producto){
		this.producto_producto = producto_producto;
	}

	public Long getProducto_marca(){
		return producto_marca;
	}
	
	public void setProducto_marca(Long producto_marca){
		this.producto_marca = producto_marca;
	}

	public Long getProducto_referencia(){
		return producto_referencia;
	}
	
	public void setProducto_referencia(Long producto_referencia){
		this.producto_referencia = producto_referencia;
	}

	public Long getProducto_repuesto(){
		return producto_repuesto;
	}
	
	public void setProducto_repuesto(Long producto_repuesto){
		this.producto_repuesto = producto_repuesto;
	}


	static public String[] getNames(){
		return new String[]{ "PRODUCTO_PRODUCTO", "PRODUCTO_MARCA", "PRODUCTO_REFERENCIA", "PRODUCTO_REPUESTO" };
	}		
	
	static public String getColumnNames(){
		return " PRODUCTO_PRODUCTO, PRODUCTO_MARCA, PRODUCTO_REFERENCIA, PRODUCTO_REPUESTO ";
	}
	
	public String toString(){
		return " PRODUCTO_PRODUCTO: "+ this.producto_producto 
			+" PRODUCTO_MARCA: "+ this.producto_marca 
			+" PRODUCTO_REFERENCIA: "+ this.producto_referencia 
			+" PRODUCTO_REPUESTO: "+ this.producto_repuesto ;
	}
}
