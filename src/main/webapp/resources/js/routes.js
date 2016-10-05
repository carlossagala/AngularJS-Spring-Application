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
				templateUrl : 'views/nav_bar.html'
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

})