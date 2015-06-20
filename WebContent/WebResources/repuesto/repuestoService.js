
var MainApp=angular.module('MainApp');

MainApp.service('repuestoService', function($http, $rootScope) {	    	
    	
    	this.getData = function(marca_descri, referencia_nombre, repuesto_tipo) {    		    		
    		return $http({
    	        method: 'GET',
    	        url:  WEB_SERVER+'Catalogo/listCatalogo.json',
    	        params: {marca_descri: marca_descri,referencia_nombre: referencia_nombre,repuesto_tipo: repuesto_tipo }
    	     });
    	 }
    	
    	
    	