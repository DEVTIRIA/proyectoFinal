package com.proyectosena.repository.repuesto;

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
public class RepuestoRepositoryImpl implements RepuestoRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Repuesto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Repuesto = objeto de la case Repuesto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Repuesto list(Long id){
		try{
			String sql = "select "+Repuesto.getColumnNames()
					   + "from Repuesto "
					   + "where repuesto_repuesto = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Repuesto.class)					
					     .setParameter("id", id);
			return (Repuesto)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Repuesto
	 * @return Repuesto = coleccion de objetos de la case Repuesto que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Repuesto> listAll(int init, int limit){
		try{
			String sql = "select "+Repuesto.getColumnNames()
					   + "from Repuesto ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Repuesto.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Repuesto
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Repuesto ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Repuesto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Repuesto = objeto de la case Repuesto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Repuesto update(Repuesto repuesto){
		getSession().update(repuesto);
		return repuesto;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Repuesto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Repuesto = objeto de la case Repuesto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Repuesto repuesto){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Repuesto
	 * @value repuesto_repuesto
	 * @value repuesto_tipo
	 * @return Repuesto = objeto de la case Repuesto que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Repuesto insert(Repuesto repuesto){
		getSession().save(repuesto);	
		return repuesto;
	}
}
