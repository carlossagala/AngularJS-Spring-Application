var homeController = app.controller('homeController', ['$scope', '$state',
    function($scope, $state) {




    }
])

var loginController = app.controller('loginController', ['$scope', '$state', 'LoginService',
    function($scope, $state, LoginService) {

        $scope.usuario = { nombre: '', contrasenia: '' };

        $scope.verificarUsuario = function() {

            LoginService.goLogin($scope.usuario).then(

                function(response) {
                    if (response.data) {
                        $state.go('home');
                    } else {
                       $state.go('login');
                    }
                },
                function(errResponse) {}



            );
        }
    }
])

var registerController = app.controller('registerController', ['$scope', '$state',
    function($scope, $state) {
        $scope.goLogin = function() {
            $state.go("login");
        }

    }
])

var navController = app.controller('navController', ['$scope', '$state',
    function($scope, $state) {


    }
])


var seriesController = app.controller('seriesController', ['$scope', function($scope) {

}])

var cancionesController = app.controller('albunesController', ['$scope', 'albunesData', function($scope, albunesData) {
    $scope.albunes = albunesData.data;




}])

var peliculasController = app.controller('peliculasController', ['$scope', function($scope) {

}])
