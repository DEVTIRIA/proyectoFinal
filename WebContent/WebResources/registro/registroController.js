var MainApp=angular.module('MainApp');

MainApp.controller('registroController',['$scope', 'registroService',  function($scope, registroService){

	$scope.saludo="Bienvenido a angular";

}]);