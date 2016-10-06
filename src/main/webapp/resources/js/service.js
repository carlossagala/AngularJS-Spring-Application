var SharedService = app.service('SharedService', ['$http', function($http){
	
	var usuario = null;

	this.getUsuario = function(){
		return usuario;
	}

	this.setUsuario=function(id){
		usuario = id;
	}


}])

var LoginService = app.service('LoginService',['$http', function($http) {
    this.goLogin=function(usuario) {
        return $http.post('#/spring-login/', usuario);
    }
}]);

var AlbunesService = app.service('AlbunesService', ['$http', function($http){
	this.obtenerAlbunes=function(){
		return $http.get('http://localhost:8080/multimedia-online/cargar-albunes/');
	}
}])





