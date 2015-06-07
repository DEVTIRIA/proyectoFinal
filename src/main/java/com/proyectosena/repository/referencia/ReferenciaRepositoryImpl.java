package com.proyectosena.repository.referencia;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		proyectosena  
  */                          

import java.util.List;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReferenciaRepositoryImpl implements ReferenciaRepository{
	
	@Autowired
	private SessionFactory sessionFactory;  	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Referencia por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Referencia = objeto de la case Referencia que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Referencia list(Long id){
		try{
			String sql = "select "+Referencia.getColumnNames()
					   + "from Referencia "
					   + "where referencia_referencia = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Referencia.class)					
					     .setParameter("id", id);
			return (Referencia)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Referencia
	 * @return Referencia = coleccion de objetos de la case Referencia que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Referencia> listAll(int init, int limit){
		try{
			String sql = "select "+Referencia.getColumnNames()
					   + "from Referencia ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Referencia.class);
						 
			if(init==0 && limit!=0){
				query.setFirstResult(init);			
				query.setMaxResults(limit);
			}
					     
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * Metodo de consulta para el conteo de los registros de la tabla Referencia
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Referencia ";
						
			Query query = getSession().createQuery(sql);
	        
			Iterator it = query.list().iterator();
	        Long ret = new Long(0);
	        
	        if (it != null)
		        if (it.hasNext()){
		        	ret = (Long) it.next();
		        }
	        
			return ret.intValue();
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * Metodo para actualizar los datos de un registro de la tabla Referencia por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Referencia = objeto de la case Referencia que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Referencia update(Referencia referencia){
		getSession().update(referencia);
		return referencia;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Referencia por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Referencia = objeto de la case Referencia que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Referencia referencia){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Referencia
	 * @value referencia_referencia
	 * @value referencia_nombre
	 * @return Referencia = objeto de la case Referencia que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Referencia insert(Referencia referencia){
		getSession().save(referencia);	
		return referencia;
	}
}
