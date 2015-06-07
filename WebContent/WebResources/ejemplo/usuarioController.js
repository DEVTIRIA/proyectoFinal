var MainApp=angular.module('MainApp');

MainApp.controller('usuarioController',['$scope', 'usuarioService', function($scope, usuarioService){

	$scope.saludo="Bienvenido a angular";

}]);