package ar.com.project.DAO;

import java.util.List;

import ar.com.project.model.Albun;

public interface AlbunDAO {
	public List<Albun> traerAlbunes() throws Exception;
}
