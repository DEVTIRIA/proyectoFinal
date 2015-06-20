var MainApp=angular.module('MainApp');

MainApp.controller('perfilController',['$scope', 'perfilService', function($scope, perfilService){

	
	
	$scope.init= function(){
		perfilService.getData().then(function(dataResponse) {
    		console.log(dataResponse.data.data);
    		$scope.user_direccion=dataResponse.data.data.user_direccion;
    		$scope.user_email=dataResponse.data.data.user_email;
    		$scope.user_nick=dataResponse.data.data.user_nick;
    		$scope.user_cedula=dataResponse.data.data.user_cedula;
    		$scope.user_nombre=dataResponse.data.data.user_nombre;
    		$scope.user_apellido=dataResponse.data.data.user_apellido;
    		$scope.user_telefono=dataResponse.data.data.user_telefono;
    		$scope.user_ubicacion=dataResponse.data.data.user_ubicacion;
    		$scope.user_sexo=dataResponse.data.data.user_sexo;
    		$scope.user_email=dataResponse.data.data.user_email;
        }); 
    }
}]);