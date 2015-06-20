<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" ng-app=MainApp>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title> Bikes Co</title>
    
    <!-- LINKS CSS  -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/estilos.css" rel="stylesheet">
    <!--Si el Navegador es Internet Explorer 9-->

    <!-- <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script> -->
       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    
    
    
    	<script >var WEB_SERVER='http://localhost:8080/baseWeb/sena/';</script>
        
        <script  src="lib/angular-1.3.15/angular.js"></script>              
        <script  src="lib/angular-1.3.15/angular-route.js"></script>
        <script  src="lib/angular-1.3.15/i18n/angular-locale_es-co.js"></script>
                
        <!--ng grid...-->
        <script  src="lib/angular-1.3.15/angular-ui-ng-grid/3.0/jquery.min.js"></script>
        <script  src="lib/angular-1.3.15/angular-ui-ng-grid/3.0/ng-grid.debug.js"></script>
        
        <script  src="lib/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script  src="lib/bootstrap/3.1.1/js/bootstrap.js"></script>  
        
        <script  src="WebResources/login/MainApp.js"></script>  
        <script  src="WebResources/login/MainController.js"></script>  
        
        <script  src="WebResources/usuario/usuarioController.js"></script>
        <script  src="WebResources/usuario/usuarioService.js"></script>
        
        <script  src="WebResources/catalogo/catalogoController.js"></script>
        <script  src="WebResources/catalogo/catalogoService.js"></script>
    
    	<script  src="WebResources/perfil/perfilController.js"></script>
        <script  src="WebResources/perfil/perfilService.js"></script>
</head>
<body>

<body class="homepage" data-ng-controller="MainController">
<div data-ng-view></div>
    

	
	
    


    
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    
</body>
</html>