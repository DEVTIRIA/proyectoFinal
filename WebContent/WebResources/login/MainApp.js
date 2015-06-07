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
   	    
   	    when('/Catalogo', {
  	      templateUrl: function(params) {
  	          return  WEB_SERVER+'Catalogo/';
  	      },
  	      controller: 'catalogoController'
  	    }).  
  	    
  	    when('/Index', {
   	      templateUrl: function(params) {
   	          return  WEB_SERVER+'User2/Index';
   	      },
   	      controller: 'indexController'
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