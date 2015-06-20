<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" ng-app=MainApp>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Registro - Bikes Co</title>
    
    <script >var WEB_SERVER='http://localhost:8080/baseWeb/sena/';</script>
    
    <script  src="lib/angular-1.3.15/angular.js"></script>              
        <script  src="lib/angular-1.3.15/angular-route.js"></script>
        <script  src="lib/angular-1.3.15/i18n/angular-locale_es-co.js"></script>
                
        <!--ng grid...-->
        <script  src="lib/angular-1.3.15/angular-ui-ng-grid/3.0/jquery.min.js"></script>
        <script  src="lib/angular-1.3.15/angular-ui-ng-grid/3.0/ng-grid.debug.js"></script>
        
    <script  src="WebResources/login/MainApp.js"></script>  
    <script  src="WebResources/login/MainController.js"></script>
    
    <script  src="WebResources/registro/registroController.js"></script>  
    <script  src="WebResources/registro/registroService.js"></script>
        
    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/estilos.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body data-ng-controller="registroController">

    <header>
        <div class="top-bar bottom ">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-12">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +57 301 227 75 30</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-12">
                       <div class="social">
                            <i style="color:#9FEEFF" class="fa fa-user"> </i>
                                <a href="login.jsp">Iniciar Sesion </a>
                            <i style="color:#9FEEFF" class="fa fa-star"></i>
                                <a href="registro.jsp">Registrarse </a>
                            
                       </div>
                    </div>
                </div>
            </div><!--Contenedor-->
        </div><!--Barra Superior-->

        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Barra de Navegacion</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>
                </div>
                
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li><a href="login.jsp">Inicio</a></li>
                        <li><a href="servicio.jsp">Servicios</a></li>
                        <li><a href="contacto.jsp">Contacto</a></li>
                        <li class="active"><a href="registro.jsp">Registro</a></li>
                        
                    </ul>
                </div>
            </div><!--container-->
        </nav><!--nav-->
        
    </header><!--header-->
	
	
	
	<section id="registro">
        <div class="container">
            <h2 class="text-center h2-registro tex-color">Regístrate</h2>
            <div class="col-md-6 col-md-offset-3 tex-color">
                <form action="">
                	<div class="col-xs-12">
                        <input type="number" class="form-control margin-bottom" id="cedula" required="required" placeholder="Cedula" data-ng-model="user_cedula">
                    </div>
                    <div class="col-xs-12">
                        <input type="text" class="form-control margin-bottom" id="username" required="required" placeholder="Usuario" data-ng-model="user_nick">
                    </div>
                    <div class="col-xs-12">
                        <input type="password" class="form-control margin-bottom" id="password" required="required" placeholder="Contraseña" data-ng-model="user_pass">
                    </div>
                    <div class="col-xs-12">
                        <input type="text" class="form-control margin-bottom" id="nombre" required="required" placeholder="Nombre" data-ng-model="user_nombre">
                    </div>
                    <div class="col-xs-12">
                        <input type="text" class="form-control margin-bottom" id="apellido" required="required" placeholder="Apellido" data-ng-model="user_apellido">
                    </div>
                    <div class="col-xs-12">
                        <input type="email" class="form-control margin-bottom" id="email" required="required" placeholder="Correo electrónico" data-ng-model="user_email">
                    </div>
                    <div class="col-xs-12 col-md-6">
                        <input type="number" class="form-control margin-bottom" id="telefono" required="required" placeholder="Telefono" data-ng-model="user_telefono">
                    </div>
                    <div class="col-xs-12 col-md-6">
                        <input type="text" class="form-control margin-bottom" id="ubicacion" required="required" placeholder="Ciudad" data-ng-model="user_ubicacion">
                    </div>
                     <div class="col-xs-12">
                        <input type="text" class="form-control" id="direccion" required="required" placeholder="Direccion" data-ng-model="user_direccion">
                    </div>
             
                    <div class="col-sm-6 margin">
                        <label for="" class="radio-inline">
                            <input type="radio" name="inlineRadioOptions" id="inlineRadio1" required="required" value="Masculino" data-ng-model="user_sexo"> Masculino
                        </label>
                        <label for="" class="radio-inline">
                            <input type="radio" name="inlineRadioOptions" id="inlineRadio2" required="required" value="Femenino" data-ng-model="user_sexo"> Femenino
                        </label>
                    </div>
                    <div class="col-xs-12">
                        <p>Al hacer click en Registrarse, aceptas los <a href="#">términos y condiciones</a></p>
                    </div>
                    <div class="col-xs-12">
                        <button type="submit" class="btn btn-primary" data-ng-click="registrar()" value="login.jsp">Registrarse</button>
                    </div>
                </form>
            </div>
        </div>
    </section>
    </div>

	<br><br>
    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-5">
                <center>&copy; 2015 <a target="_blank" href="http://www.facebook.com/billy.hetfieldd" title="">Bill Santamaria - Yeik Santamaria - Alejandro Tiria</a>. All Rights Reserved.
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
