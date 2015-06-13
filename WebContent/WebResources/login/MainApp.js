var MainApp=angular.module('MainApp', ['ngGrid', 'ngRoute']);  

MainApp.config(['$routeProvider',
   	function($routeProvider) {
   	  $routeProvider.
   	    when('/Servicio', {
   	      templateUrl: function(params) {
   	          return  WEB_SERVER+'Catalogo/Servicio';
   	      },
   	      controller: 'servicioController'
   	    }).   	  
   	     	    
  	    when('/Index', {
   	      templateUrl: function(params) {
   	          return  WEB_SERVER+'User2/Index';
   	      },
   	      controller: 'indexController'
   	    }).   	  
   	    
   	    when('/Contacto', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'User2/Contacto';
  	      },
  	      controller: 'contactoController'
  	    }). 
  	    
  	  when('/Perfil', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'User2/Perfil';
  	      },
  	      controller: 'perfilController'
  	    }).
  	    
  	  when('/Login', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'User2/Login';
  	      },
  	      controller: 'loginController'
  	    }).
  	    
  	       	  
   	    
   	    when('/FrmPerfil', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'FrmPerfil/';
  	      },
  	      controller: 'FrmPerfilController'
  	    }). 
  	    
  	    when('/FrmPerfil', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'FrmPerfil/';
  	      },
  	      controller: 'FrmPerfilController'
  	    }).  
   	    otherwise({
   	      
   	    });
}]);