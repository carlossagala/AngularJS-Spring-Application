package ar.com.project.DAO;

import java.util.LinkedList;	
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ar.com.project.model.Albun;


@Repository("albunDAO")
public class AlbunDAOImpl implements AlbunDAO{
	
	




	public List<Albun> traerAlbunes() throws Exception  {
		
//		try {
//
//			session = getSession();
//			return (List<Albun>) session.createQuery("from Albunes") ;
//		} catch (Exception e) {
//			System.out.println("fallo al traer de la base");
//			throw new Exception(e);
//		} finally {
//			session.flush();
//			session.close();
//		}	
		
		LinkedList<Albun> a = new LinkedList<Albun>();
		a.add(new Albun("aaa","sss",2121));
		
		return a;
		
	}


	

}
