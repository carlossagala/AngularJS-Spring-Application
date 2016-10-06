package ar.com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.project.BO.AlbunesBO;
import ar.com.project.model.Albun;
import ar.com.project.model.Usuario;




@RestController
public class UsuarioController{
	
	@Autowired
	private AlbunesBO albunBO;
	
	
	@RequestMapping(value="/spring-login/",method=RequestMethod.POST)
	public ResponseEntity<Boolean> login(@RequestBody Usuario user){
		Boolean bool = new Boolean(true);
		System.out.println("paso por el login");
		if(user.nombre.equals("xyz") && user.contrasenia.equals("123")){
			
			return new ResponseEntity<Boolean>(bool,HttpStatus.OK);
		}
		bool = false;
		return new ResponseEntity<Boolean>(bool,HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value="/cargar-albunes/",method = RequestMethod.GET)
	public ResponseEntity<List<Albun>> albunes(){
		return new ResponseEntity<List<Albun>>( albunBO.albunes(),HttpStatus.OK);
		
	}

	public AlbunesBO getAlbunBO() {
		return albunBO;
	}

	public void setAlbunBO(AlbunesBO albunBO) {
		this.albunBO = albunBO;
	}

}
