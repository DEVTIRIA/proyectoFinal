package com.proyectosena.repository.user2;

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
@Table(name = "user_2")
public class User2 {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "user_2_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="user_2_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "user_2_GEN")  
	@Column(name = "USER_USER")
	protected Long user_user; 
	 
	@Column(name = "USER_NOMBRE")
	protected String user_nombre; 
	 
	@Column(name = "USER_APELLIDO")
	protected String user_apellido; 
	 
	@Column(name = "USER_TELEFONO")
	protected String user_telefono; 
	 
	@Column(name = "USER_CEDULA")
	protected String user_cedula; 
	 
	@Column(name = "USER_DIRECCION")
	protected String user_direccion; 
	 
	@Column(name = "USER_NICK")
	protected String user_nick; 
	 
	@Column(name = "USER_PASS")
	protected String user_pass; 
	 
	@Column(name = "USER_ENABLED")
	protected String user_enabled; 

	public User2(){
	
	}

	public Long getUser_user(){
		return user_user;
	}
	
	public void setUser_user(Long user_user){
		this.user_user = user_user;
	}

	public String getUser_nombre(){
		return user_nombre;
	}
	
	public void setUser_nombre(String user_nombre){
		this.user_nombre = user_nombre;
	}

	public String getUser_apellido(){
		return user_apellido;
	}
	
	public void setUser_apellido(String user_apellido){
		this.user_apellido = user_apellido;
	}

	public String getUser_telefono(){
		return user_telefono;
	}
	
	public void setUser_telefono(String user_telefono){
		this.user_telefono = user_telefono;
	}

	public String getUser_cedula(){
		return user_cedula;
	}
	
	public void setUser_cedula(String user_cedula){
		this.user_cedula = user_cedula;
	}

	public String getUser_direccion(){
		return user_direccion;
	}
	
	public void setUser_direccion(String user_direccion){
		this.user_direccion = user_direccion;
	}

	public String getUser_nick(){
		return user_nick;
	}
	
	public void setUser_nick(String user_nick){
		this.user_nick = user_nick;
	}

	public String getUser_pass(){
		return user_pass;
	}
	
	public void setUser_pass(String user_pass){
		this.user_pass = user_pass;
	}

	public String getUser_enabled(){
		return user_enabled;
	}
	
	public void setUser_enabled(String user_enabled){
		this.user_enabled = user_enabled;
	}


	static public String[] getNames(){
		return new String[]{ "USER_USER", "USER_NOMBRE", "USER_APELLIDO", "USER_TELEFONO", "USER_CEDULA", "USER_DIRECCION", "USER_NICK", "USER_PASS", "USER_ENABLED" };
	}		
	
	static public String getColumnNames(){
		return " USER_USER, USER_NOMBRE, USER_APELLIDO, USER_TELEFONO, USER_CEDULA, USER_DIRECCION, USER_NICK, USER_PASS, USER_ENABLED ";
	}
	
	public String toString(){
		return " USER_USER: "+ this.user_user 
			+" USER_NOMBRE: "+ this.user_nombre 
			+" USER_APELLIDO: "+ this.user_apellido 
			+" USER_TELEFONO: "+ this.user_telefono 
			+" USER_CEDULA: "+ this.user_cedula 
			+" USER_DIRECCION: "+ this.user_direccion 
			+" USER_NICK: "+ this.user_nick 
			+" USER_PASS: "+ this.user_pass 
			+" USER_ENABLED: "+ this.user_enabled ;
	}
}
