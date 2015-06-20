
var MainApp=angular.module('MainApp');

MainApp.service('perfilService', function($http, $rootScope) {	    	
    	
    	this.getData = function(username) {    		    		
    		return $http({
    	        method: 'GET',
    	        url:  WEB_SERVER+'User2/listUser.json',
    	     });
    	 }    	    		
    });    	
