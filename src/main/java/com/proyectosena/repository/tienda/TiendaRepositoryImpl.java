package com.proyectosena.repository.tienda;

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
public class TiendaRepositoryImpl implements TiendaRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Tienda por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Tienda = objeto de la case Tienda que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Tienda list(Long id){
		try{
			String sql = "select "+Tienda.getColumnNames()
					   + "from Tienda "
					   + "where tienda_tienda = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Tienda.class)					
					     .setParameter("id", id);
			return (Tienda)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Tienda
	 * @return Tienda = coleccion de objetos de la case Tienda que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Tienda> listAll(int init, int limit){
		try{
			String sql = "select "+Tienda.getColumnNames()
					   + "from Tienda ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Tienda.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Tienda
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Tienda ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Tienda por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Tienda = objeto de la case Tienda que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Tienda update(Tienda tienda){
		getSession().update(tienda);
		return tienda;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Tienda por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Tienda = objeto de la case Tienda que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Tienda tienda){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Tienda
	 * @value tienda_tienda
	 * @value tienda_user
	 * @value tienda_nombre
	 * @value tienda_ciudad
	 * @value tienda_direccion
	 * @value tienda_telefono
	 * @return Tienda = objeto de la case Tienda que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Tienda insert(Tienda tienda){
		getSession().save(tienda);	
		return tienda;
	}
}
