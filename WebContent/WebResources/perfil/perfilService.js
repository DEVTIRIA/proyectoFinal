
var MainApp=angular.module('MainApp');

MainApp.service('perfilService', function($http, $rootScope) {	    	
    	
    	this.getData = function(pageSize, page) {    		    		
    		return $http({
    	        method: 'GET',
    	        url:  WEB_SERVER+'FrmPerfil/listAll.json',
    	        params: {page: page, pageSize: pageSize }
    	     });
    	 }
    	
    	this.getI18n = function() {    		    		
    		return $http({
    	        method: 'GET',
    	        url: WEB_SERVER+'FrmI18n/listModulo.json',
    	        params: {modulo: 'FRM_PERFIL,FRM_PERFMODU,FRM_MODUROPE,FRM_MODULO,FRM_ROLEPERM,FRM_APLICACIONES' }
    	     });
    	 }
    	
    	this.insertRecord = function(peficons, pefinomb, pefidesc, pefifecr, pefiesta) {    	
    		
    		data = {peficons: peficons, pefinomb: pefinomb, pefidesc: pefidesc, pefifecr: pefifecr, pefiesta: pefiesta};
    		
    		return $http({
    	        method: 'POST',
    	        url: WEB_SERVER+'FrmPerfil/insert',
    	        data: data
    	     });
    	 }
    	
		this.updateRecord = function(peficons, pefinomb, pefidesc, pefifecr, pefiesta) {    	
    		
			data = {peficons: peficons, pefinomb: pefinomb, pefidesc: pefidesc, pefifecr: pefifecr, pefiesta: pefiesta};
    		
			return $http({
    	        method: 'POST',
    	        url: WEB_SERVER+'FrmPerfil/update',
    	        data: dataUpdate
    	     });
    	 }
		
		this.deleteRecord = function(peficons, pefinomb, pefidesc, pefifecr, pefiesta) {    	
    		
    		data = {peficons: peficons, pefinomb: pefinomb, pefidesc: pefidesc, pefifecr: pefifecr, pefiesta: pefiesta};
    		
    		return $http({
    	        method: 'POST',
    	        url: WEB_SERVER+'FrmPerfil/deleteR',
    	        data: data
    	     });
    	 }				
    });    	
