package com.proyectosena.repository.inter_user_perfil;

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
@Table(name = "inter_user_perfil")
public class InterUserPerfil {
	@Id 
	// Habilite este codigo para generar automaticamente la llave primaria esta depende de una tabla
	@TableGenerator(name = "inter_user_perfil_GEN", //<= nombre de la tabla con el cual se va a identificar la llave
	                 table = "FRM_PKID",              //<= Este string define la tabla dond se almacenan el consecutivo
	                 pkColumnName="PKIDNOMB",         //<= NOMBRE DE LA LLAVE PRIMARIA DE LA TABLA    
	                 valueColumnName="PKIDVALU",      //<= Valor del consecutivo en el que va la llave primaria
	                 pkColumnValue="inter_user_perfil_PK", 
	                 initialValue = 1,                //<= Valor inicial de la llave primario
	                 allocationSize = 1)              //<= Valor a buscar por medio de la llave primaria
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "inter_user_perfil_GEN")  
	@Column(name = "INTER2_INTER2")
	protected Long inter2_inter2; 
	 
	@Column(name = "INTER2_PERFIL")
	protected String inter2_perfil; 
	 
	@Column(name = "INTER2_USER")
	protected Long inter2_user; 

	public InterUserPerfil(){
	
	}

	public Long getInter2_inter2(){
		return inter2_inter2;
	}
	
	public void setInter2_inter2(Long inter2_inter2){
		this.inter2_inter2 = inter2_inter2;
	}

	public String getInter2_perfil(){
		return inter2_perfil;
	}
	
	public void setInter2_perfil(String inter2_perfil){
		this.inter2_perfil = inter2_perfil;
	}

	public Long getInter2_user(){
		return inter2_user;
	}
	
	public void setInter2_user(Long inter2_user){
		this.inter2_user = inter2_user;
	}


	static public String[] getNames(){
		return new String[]{ "INTER2_INTER2", "INTER2_PERFIL", "INTER2_USER" };
	}		
	
	static public String getColumnNames(){
		return " INTER2_INTER2, INTER2_PERFIL, INTER2_USER ";
	}
	
	public String toString(){
		return " INTER2_INTER2: "+ this.inter2_inter2 
			+" INTER2_PERFIL: "+ this.inter2_perfil 
			+" INTER2_USER: "+ this.inter2_user ;
	}
}
