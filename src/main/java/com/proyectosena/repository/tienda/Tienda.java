package com.proyectosena.repository.tienda;

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
@Table(name = "tienda")
public class Tienda {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "tienda_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="tienda_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tienda_GEN")  
	@Column(name = "TIENDA_TIENDA")
	protected Long tienda_tienda; 
	 
	@Column(name = "TIENDA_USER")
	protected Long tienda_user; 
	 
	@Column(name = "TIENDA_NOMBRE")
	protected String tienda_nombre; 
	 
	@Column(name = "TIENDA_CIUDAD")
	protected String tienda_ciudad; 
	 
	@Column(name = "TIENDA_DIRECCION")
	protected String tienda_direccion; 
	 
	@Column(name = "TIENDA_TELEFONO")
	protected Long tienda_telefono; 

	public Tienda(){
	
	}

	public Long getTienda_tienda(){
		return tienda_tienda;
	}
	
	public void setTienda_tienda(Long tienda_tienda){
		this.tienda_tienda = tienda_tienda;
	}

	public Long getTienda_user(){
		return tienda_user;
	}
	
	public void setTienda_user(Long tienda_user){
		this.tienda_user = tienda_user;
	}

	public String getTienda_nombre(){
		return tienda_nombre;
	}
	
	public void setTienda_nombre(String tienda_nombre){
		this.tienda_nombre = tienda_nombre;
	}

	public String getTienda_ciudad(){
		return tienda_ciudad;
	}
	
	public void setTienda_ciudad(String tienda_ciudad){
		this.tienda_ciudad = tienda_ciudad;
	}

	public String getTienda_direccion(){
		return tienda_direccion;
	}
	
	public void setTienda_direccion(String tienda_direccion){
		this.tienda_direccion = tienda_direccion;
	}

	public Long getTienda_telefono(){
		return tienda_telefono;
	}
	
	public void setTienda_telefono(Long tienda_telefono){
		this.tienda_telefono = tienda_telefono;
	}


	static public String[] getNames(){
		return new String[]{ "TIENDA_TIENDA", "TIENDA_USER", "TIENDA_NOMBRE", "TIENDA_CIUDAD", "TIENDA_DIRECCION", "TIENDA_TELEFONO" };
	}		
	
	static public String getColumnNames(){
		return " TIENDA_TIENDA, TIENDA_USER, TIENDA_NOMBRE, TIENDA_CIUDAD, TIENDA_DIRECCION, TIENDA_TELEFONO ";
	}
	
	public String toString(){
		return " TIENDA_TIENDA: "+ this.tienda_tienda 
			+" TIENDA_USER: "+ this.tienda_user 
			+" TIENDA_NOMBRE: "+ this.tienda_nombre 
			+" TIENDA_CIUDAD: "+ this.tienda_ciudad 
			+" TIENDA_DIRECCION: "+ this.tienda_direccion 
			+" TIENDA_TELEFONO: "+ this.tienda_telefono ;
	}
}
