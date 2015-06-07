package com.proyectosena.repository.producto;

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
public class ProductoRepositoryImpl implements ProductoRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Producto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Producto = objeto de la case Producto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Producto list(Long id){
		try{
			String sql = "select "+Producto.getColumnNames()
					   + "from Producto "
					   + "where producto_producto = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Producto.class)					
					     .setParameter("id", id);
			return (Producto)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Producto
	 * @return Producto = coleccion de objetos de la case Producto que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Producto> listAll(int init, int limit){
		try{
			String sql = "select "+Producto.getColumnNames()
					   + "from Producto ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Producto.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Producto
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Producto ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Producto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Producto = objeto de la case Producto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Producto update(Producto producto){
		getSession().update(producto);
		return producto;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Producto por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Producto = objeto de la case Producto que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Producto producto){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Producto
	 * @value producto_producto
	 * @value producto_marca
	 * @value producto_referencia
	 * @value producto_repuesto
	 * @return Producto = objeto de la case Producto que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Producto insert(Producto producto){
		getSession().save(producto);	
		return producto;
	}
}
