
var MainApp=angular.module('MainApp');

MainApp.service('registroService', function($http, $rootScope) {	    	    	    	
    	
	this.insertRecord = function(user_cedula, user_nick, user_pass, user_nombre, user_apellido, user_email, user_telefono, user_ubicacion, user_direccion, user_sexo) {    	
		
		data = {user_cedula: user_cedula, user_nick: user_nick, user_pass: user_pass, user_nombre:user_nombre, user_apellido: user_apellido, user_email: user_email, user_telefono: user_telefono, user_ubicacion: user_ubicacion, user_direccion: user_direccion, user_sexo: user_sexo};
		
		return $http({
	        method: 'POST',
	        url: WEB_SERVER+'User2/insert',
	        data: data
	     });
	 }
	
});    	
