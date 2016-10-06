'use strict'
app.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise("/home/");

	$stateProvider.state('home', {
		url : '/home/',
		views : {
			'' : {
				templateUrl : 'views/home.html'
			},
			'navM@home' : {
				templateUrl : 'views/nav_bar.html',
				controller: 'navController as navCtrl'
			},
			'register@home' : {
				templateUrl : 'views/register_welcome.html',
				controller:'registerController as regCtrl'
			}
		}


	}).state('login', {
		url : '/login/',
		templateUrl : 'views/login.html',
		controller : 'loginController as loginCtrl'
	})

	.state('peliculas',{
		url:'/peliculas/',
		views:{
			'':{
				templateUrl:'views/peliculas.html',
				controller: 'peliculasController as pCtrl'
			},'navM@peliculas' : {
				templateUrl : 'views/nav_bar.html',
				controller: 'navController as navCtrl'
			}
		}
	})
		.state('albunes',{
		url:'/albunes/',
		views:{
			'':{
				templateUrl:'views/albunes.html',
				controller: 'albunesController as alCtrl',
				resolve:{
					albunesData: function(AlbunesService){
						return AlbunesService.obtenerAlbunes();
					}
				}
			},'navM@albunes' : {
				templateUrl : 'views/nav_bar.html',
				controller: 'navController as navCtrl'
			}
		}
	})
			.state('series',{
		url:'/series/',
		views:{
			'':{
				templateUrl:'views/series.html',
				controller: 'seriesController as sCtrl'
			},'navM@series' : {
				templateUrl : 'views/nav_bar.html',
				controller: 'navController as navCtrl'
			}
		}
	})

})