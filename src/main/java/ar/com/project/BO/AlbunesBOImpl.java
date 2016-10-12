package ar.com.project.BO;

import java.util.LinkedList;	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.project.DAO.AlbunDAO;
import ar.com.project.model.Albun;

@Service("albunBO")
public class AlbunesBOImpl implements AlbunesBO {
	
	@Autowired
	private AlbunDAO albunDAO;
	
	public List<Albun> albunes() {
		
		try {
			return albunDAO.traerAlbunes();
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("fallo en el BO");
		}
		return null;
		
		
	
	}

	public AlbunDAO getAlbunDAO() {
		return albunDAO;
	}

	public void setAlbunDAO(AlbunDAO albunDAO) {
		this.albunDAO = albunDAO;
	}

	

}
