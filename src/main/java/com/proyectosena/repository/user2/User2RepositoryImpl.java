package com.proyectosena.repository.user2;

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
public class User2RepositoryImpl implements User2Repository{
	
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
	 * Metodo de consulta para los registros de la tabla User2 por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return User2 = objeto de la case User2 que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public User2 list(Long id){
		try{
			String sql = "select "+User2.getColumnNames()
					   + "from User2 "
					   + "where user_user = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(User2.class)					
					     .setParameter("id", id);
			return (User2)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla User2
	 * @return User2 = coleccion de objetos de la case User2 que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<User2> listAll(int init, int limit){
		try{
			String sql = "select "+User2.getColumnNames()
					   + "from User2 ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(User2.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla User2
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from User2 ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla User2 por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return User2 = objeto de la case User2 que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public User2 update(User2 user2){
		getSession().update(user2);
		return user2;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla User2 por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return User2 = objeto de la case User2 que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(User2 user2){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla User2
	 * @value user_user
	 * @value user_nombre
	 * @value user_apellido
	 * @value user_telefono
	 * @value user_cedula
	 * @value user_direccion
	 * @value user_nick
	 * @value user_pass
	 * @value user_enabled
	 * @return User2 = objeto de la case User2 que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public User2 insert(User2 user2){
		getSession().save(user2);	
		return user2;
	}
}
