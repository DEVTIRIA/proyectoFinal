<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header id="header" data-ng-controller="contactoController">
        <div class="top-bar bottom">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-6">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +57 301 227 75 30</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-6 block-">
                       <div class="social">
                            <i style="color:#9FEEFF" class="fa fa-user"> </i>
                            	<font style="color:#0B72FF">
                                <sec:authentication var="principal" property="principal" />
								<a style="color:#0B72FF" href="#/perfil.jsp" /> ${principal.username}</a>
								<i style="color:#9FEEFF" class="fa fa-key"> </i>
								<a style="color:#0B72FF" href="<c:url value="j_spring_security_logout" />" > Logout</a>	
								</font>						                                                  
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
                        <li><a href="index.jsp#/Index">Inicio</a></li>
                        <li><a href="#/Repuesto">Repuestos</a></li>
                        <li><a href="#/Servicio">Servicios</a></li>
                        <li><a href="#/Contacto">Contacto</a></li>
                        <li class="active"><a href="#/Perfil">Perfil</a></li>
                        
                    </ul>
                </div>
            </div><!--container-->
        </nav><!--nav-->
        
    </header><!--header-->
	<div data-ng-view></div> 
	     <section id="perfil" style="color:#FFFFFF">
        <div class="container">
            <div class="col-md-4 col-md-offset-4 text-center">
                <img class="img_perfil" src="images/perfil.png" alt="">
            </div>
            <div class="col-xs-12">
                <h2 class="text-center h2">Información de contacto</h2>
            </div>
            <div class="col-sm-6 col-sm-offset-3">
                Ubicación: <br>
                Dirección: <br>
                Correo electronico: <br><br>
                <span class="icon-skype"></span> usuario <br>
                <span class="icon-phone"></span> (x) x xxxxxx <br>
                <span class="icon-mobile"></span> (+xx) xxx xxxxxxx
            </div>
            <div class="col-xs-12">
                <h2 class="text-center h2">Información básica</h2>
            </div>
            <div class="col-sm-6 col-sm-offset-3">
                Usuario: <br>
                Fecha de nacimiento: <br>
                Sexo: <br>
            </div>

        </div>
    </section>
    
     <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/estilos.css" rel="stylesheet">