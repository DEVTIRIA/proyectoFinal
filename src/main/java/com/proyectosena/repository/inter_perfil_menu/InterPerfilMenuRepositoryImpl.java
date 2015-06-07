package com.proyectosena.repository.inter_perfil_menu;

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
public class InterPerfilMenuRepositoryImpl implements InterPerfilMenuRepository{
	
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
	 * Metodo de consulta para los registros de la tabla InterPerfilMenu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterPerfilMenu = objeto de la case InterPerfilMenu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterPerfilMenu list(Long id){
		try{
			String sql = "select "+InterPerfilMenu.getColumnNames()
					   + "from InterPerfilMenu "
					   + "where inter3_inter3 = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterPerfilMenu.class)					
					     .setParameter("id", id);
			return (InterPerfilMenu)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla InterPerfilMenu
	 * @return InterPerfilMenu = coleccion de objetos de la case InterPerfilMenu que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<InterPerfilMenu> listAll(int init, int limit){
		try{
			String sql = "select "+InterPerfilMenu.getColumnNames()
					   + "from InterPerfilMenu ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterPerfilMenu.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla InterPerfilMenu
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from InterPerfilMenu ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla InterPerfilMenu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterPerfilMenu = objeto de la case InterPerfilMenu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterPerfilMenu update(InterPerfilMenu interperfilmenu){
		getSession().update(interperfilmenu);
		return interperfilmenu;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla InterPerfilMenu por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterPerfilMenu = objeto de la case InterPerfilMenu que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(InterPerfilMenu interperfilmenu){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla InterPerfilMenu
	 * @value inter3_inter3
	 * @value inter3_menu
	 * @value inter3_perfil
	 * @return InterPerfilMenu = objeto de la case InterPerfilMenu que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterPerfilMenu insert(InterPerfilMenu interperfilmenu){
		getSession().save(interperfilmenu);	
		return interperfilmenu;
	}
}
