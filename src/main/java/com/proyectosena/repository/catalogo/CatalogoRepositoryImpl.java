package com.proyectosena.repository.catalogo;

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
public class CatalogoRepositoryImpl implements CatalogoRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Catalogo por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Catalogo = objeto de la case Catalogo que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Catalogo list(Long id){
		try{
			String sql = "select "+Catalogo.getColumnNames()
					   + "from Catalogo "
					   + "where catalogo_catalogo = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Catalogo.class)					
					     .setParameter("id", id);
			return (Catalogo)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Catalogo
	 * @return Catalogo = coleccion de objetos de la case Catalogo que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Catalogo> listAll(int init, int limit){
		try{
			String sql = "select "+Catalogo.getColumnNames()
					   + "from Catalogo ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Catalogo.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Catalogo
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Catalogo ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Catalogo por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Catalogo = objeto de la case Catalogo que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Catalogo update(Catalogo catalogo){
		getSession().update(catalogo);
		return catalogo;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Catalogo por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Catalogo = objeto de la case Catalogo que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Catalogo catalogo){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Catalogo
	 * @value catalogo_catalogo
	 * @value catalogo_tienda
	 * @value catalogo_producto
	 * @value catalogo_precio
	 * @value catalogo_enabled
	 * @return Catalogo = objeto de la case Catalogo que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Catalogo insert(Catalogo catalogo){
		getSession().save(catalogo);	
		return catalogo;
	}
}
