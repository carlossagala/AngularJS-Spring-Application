package ar.com.project.BO;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.project.model.Albun;

@Service("albunBO")
public class AlbunesBOImpl implements AlbunesBO {

	public List<Albun> albunes() {
		
		LinkedList<Albun> albunes = new LinkedList<Albun>();
		albunes.add(new Albun("XYZ","1111",2016));
		albunes.add(new Albun("ABC","123",2013));
		
		
		
		return albunes;
	}

}
