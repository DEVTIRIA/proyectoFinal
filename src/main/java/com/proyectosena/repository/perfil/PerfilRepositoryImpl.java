package com.proyectosena.repository.perfil;

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
public class PerfilRepositoryImpl implements PerfilRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Perfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Perfil = objeto de la case Perfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Perfil list(Long id){
		try{
			String sql = "select "+Perfil.getColumnNames()
					   + "from Perfil "
					   + "where perfil_perfil = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Perfil.class)					
					     .setParameter("id", id);
			return (Perfil)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Perfil
	 * @return Perfil = coleccion de objetos de la case Perfil que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Perfil> listAll(int init, int limit){
		try{
			String sql = "select "+Perfil.getColumnNames()
					   + "from Perfil ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Perfil.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Perfil
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Perfil ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Perfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Perfil = objeto de la case Perfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Perfil update(Perfil perfil){
		getSession().update(perfil);
		return perfil;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Perfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Perfil = objeto de la case Perfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Perfil perfil){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Perfil
	 * @value perfil_perfil
	 * @value perfil_nombre
	 * @return Perfil = objeto de la case Perfil que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Perfil insert(Perfil perfil){
		getSession().save(perfil);	
		return perfil;
	}
}
