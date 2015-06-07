package com.proyectosena.repository.inter_user_perfil;

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
public class InterUserPerfilRepositoryImpl implements InterUserPerfilRepository{
	
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
	 * Metodo de consulta para los registros de la tabla InterUserPerfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserPerfil = objeto de la case InterUserPerfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserPerfil list(Long id){
		try{
			String sql = "select "+InterUserPerfil.getColumnNames()
					   + "from InterUserPerfil "
					   + "where inter2_inter2 = :id ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterUserPerfil.class)					
					     .setParameter("id", id);
			return (InterUserPerfil)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Metodo de consulta para los registros de la tabla InterUserPerfil
	 * @return InterUserPerfil = coleccion de objetos de la case InterUserPerfil que contiene los datos encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public List<InterUserPerfil> listAll(int init, int limit){
		try{
			String sql = "select "+InterUserPerfil.getColumnNames()
					   + "from InterUserPerfil ";
						
			Query query = getSession().createSQLQuery(sql)
						 .addEntity(InterUserPerfil.class);
						 
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
	 * Metodo de consulta para el conteo de los registros de la tabla InterUserPerfil
	 * @return int = cantidad de registros encontrados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public int getCount(){
		try{
			String sql = "select count(*) "
					   + "from InterUserPerfil ";
						
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
	 * Metodo para actualizar los datos de un registro de la tabla InterUserPerfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserPerfil = objeto de la case InterUserPerfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserPerfil update(InterUserPerfil interuserperfil){
		getSession().update(interuserperfil);
		return interuserperfil;
	}
	
	/**
	 * Metodo para borrar un registro de la tabla InterUserPerfil por id
	 * @value id = id de la llave primaria a consultar el registro
	 * @return InterUserPerfil = objeto de la case InterUserPerfil que contiene los datos encontrados dado el id
	 * @throws Exception
	 */
	@Override
	@Transactional
	public void delete(InterUserPerfil interuserperfil){
		
	}
	
	/**
	 * Metodo para ingresar un registro de la tabla InterUserPerfil
	 * @value inter2_inter2
	 * @value inter2_perfil
	 * @value inter2_user
	 * @return InterUserPerfil = objeto de la case InterUserPerfil que contiene los datos ingresados
	 * @throws Exception
	 */
	@Override
	@Transactional
	public InterUserPerfil insert(InterUserPerfil interuserperfil){
		getSession().save(interuserperfil);	
		return interuserperfil;
	}
}
