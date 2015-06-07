package com.proyectosena.repository.inter_user_rol;

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
public class InterUserRolRepositoryImpl implements InterUserRolRepository{
	
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
	 * Metodo de consulta para los registros de la tabla InterUserRol por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserRol = objeto de la case InterUserRol que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserRol list(Long id){
		try{
			String sql = "select "+InterUserRol.getColumnNames()
					   + "from InterUserRol "
					   + "where inter1_inter1 = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterUserRol.class)					
					     .setParameter("id", id);
			return (InterUserRol)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla InterUserRol
	 * @return InterUserRol = coleccion de objetos de la case InterUserRol que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<InterUserRol> listAll(int init, int limit){
		try{
			String sql = "select "+InterUserRol.getColumnNames()
					   + "from InterUserRol ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterUserRol.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla InterUserRol
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from InterUserRol ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla InterUserRol por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserRol = objeto de la case InterUserRol que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserRol update(InterUserRol interuserrol){
		getSession().update(interuserrol);
		return interuserrol;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla InterUserRol por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserRol = objeto de la case InterUserRol que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(InterUserRol interuserrol){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla InterUserRol
	 * @value inter1_inter1
	 * @value inter1_user
	 * @value inter1_rol
	 * @return InterUserRol = objeto de la case InterUserRol que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserRol insert(InterUserRol interuserrol){
		getSession().save(interuserrol);	
		return interuserrol;
	}
}
