var MainApp=angular.module('MainApp', ['ui.tree', 'ngGrid', 'ngRoute', 'ui.bootstrap' ]);  

MainApp.config(['$routeProvider',
   	function($routeProvider) {
   	  $routeProvider.
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