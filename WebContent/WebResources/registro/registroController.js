var MainApp=angular.module('MainApp');

MainApp.controller('registroController',['$scope', 'registroService',  function($scope, registroService){

	$scope.saludo="Bienvenido a angular";

	$scope.registrar = function(){	            
        console.log("registrar()");
        
        console.log($scope.user_cedula);
        console.log($scope.user_nick);
        console.log($scope.user_pass);
        console.log($scope.user_nombre);
        console.log($scope.user_apellido);
        console.log($scope.user_email);
        console.log($scope.user_telefono);
        console.log($scope.user_ubicacion);
        console.log($scope.user_direccion);
        console.log($scope.user_sexo);
        
        registroService.insertRecord($scope.user_cedula, $scope.user_nick, $scope.user_pass, $scope.user_nombre, $scope.user_apellido, $scope.user_email, $scope.user_telefono, $scope.user_ubicacion, $scope.user_direccion, $scope.user_sexo).then(function(dataResponse) {   	        	
	        console.log(dataResponse.data);
        });
    };
    
}]);