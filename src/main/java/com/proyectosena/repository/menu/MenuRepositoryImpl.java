package com.proyectosena.repository.menu;

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
public class MenuRepositoryImpl implements MenuRepository{
	
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
	 * Metodo de consulta para los registros de la tabla Menu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Menu = objeto de la case Menu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Menu list(Long id){
		try{
			String sql = "select "+Menu.getColumnNames()
					   + "from Menu "
					   + "where menu_menu = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Menu.class)					
					     .setParameter("id", id);
			return (Menu)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla Menu
	 * @return Menu = coleccion de objetos de la case Menu que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<Menu> listAll(int init, int limit){
		try{
			String sql = "select "+Menu.getColumnNames()
					   + "from Menu ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(Menu.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla Menu
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from Menu ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla Menu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Menu = objeto de la case Menu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Menu update(Menu menu){
		getSession().update(menu);
		return menu;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla Menu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return Menu = objeto de la case Menu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(Menu menu){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla Menu
	 * @value menu_menu
	 * @value menu_nombre
	 * @return Menu = objeto de la case Menu que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public Menu insert(Menu menu){
		getSession().save(menu);	
		return menu;
	}
}
