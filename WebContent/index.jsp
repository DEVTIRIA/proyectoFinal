<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" ng-app=MainApp>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Perfil - Bikes Co</title>
    
    <!-- LINKS CSS  -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
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
    
</head>
<body>

<body class="homepage" data-ng-controller="MainController">
<div data-ng-view></div>
    

	
	
    

<footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-5">
                <center>&copy; 2015 <a target="_blank" href="http://www.facebook.com/billy.hetfieldd" title="">Bill Santamaria</a>. All Rights Reserved.
                </center></div>

                <div class="col-xs-11 col-sm-3 center-block">
                    <center>
                    <ul class="social-share ">
                        <li><a href="https://www.facebook.com/billy.hetfieldd"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    </ul>
                    </center>
                </div>

                <div class="col-xs-12  col-sm-4">
                    <ul class="pull-right">
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><a href="Nosotros.html">Nosotros</a></li>
                        <li><a href="Ayuda.html">Ayuda</a></li>
                        <li><a href="Contacto.html">Contacto</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->
    
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    
</body>
</html>