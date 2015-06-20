var MainApp=angular.module('MainApp');

MainApp.controller('repuestoController',['$scope', 'repuestoService', function($scope, repuestoService){
	
	$scope.init= function(){
		repuestoService.getData().then(function(dataResponse) {
    		console.log(dataResponse.data.data);
    		
    		
    		$scope.user_direccion=dataResponse.data.data.user_direccion;
    		$scope.user_email=dataResponse.data.data.user_email;
    		$scope.user_nick=dataResponse.data.data.user_nick;
    		
        }); 

}]);