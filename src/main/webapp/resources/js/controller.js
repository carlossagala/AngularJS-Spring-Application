var homeController = app.controller('homeController', ['$scope', '$state',
    function($scope, $state) {


       

    }
])

var loginController = app.controller('loginController', ['$scope',
    function($scope) {

    }
])

var registerController = app.controller('registerController', ['$scope','$state',
	function($scope,$state){
		 $scope.goLogin = function() {
            $state.go("login");
        }

	}
])

var navController = app.controller('navController', ['$scope',
    function($scope) {

    }
])
