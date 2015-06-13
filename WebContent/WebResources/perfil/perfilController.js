var MainApp=angular.module('MainApp');

MainApp.controller('perfilController',['$scope', 'perfilService', function($scope, perfilService){

	$scope.saludo="Bienvenido a angular";

}]);