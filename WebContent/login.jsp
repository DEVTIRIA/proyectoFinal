<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login - Bikes Co</title>
    
    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    
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

<body>

    <header id="header">
        <div class="top-bar bottom ">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-12">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +57 301 227 75 30</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-12">
                       <div class="social">
                            <a href="login.jsp">Iniciar Sesion </a>
                           <i style="color:#FFFFFF" class="fa fa-angle-up"></i>
                           <a href="Registro.html">Registrarse </a>
                            
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
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><a href="Nosotros.html">Bike Co</a></li>
                        <li><a href="Servicios.html">Servicios</a></li>
                        <li><a href="Contacto.html">Contacto</a></li>
                        <li><a href="login.jsp">Login</a></li>
                        

                    </ul>
                </div>
            </div><!--container-->
        </nav><!--nav-->
        
    </header><!--header-->
	
	<br><br>
	
	<div class="contenedor">
    
        <c:if test="${!empty param.login_error}">
            <div style="color: red; margin-bottom:1em; font-size:large;"><center>Usuario o Clave Incorrecto</center> </div>
        </c:if>
        
        <section id="login-page">
        <div class="container">
            <div class="center">        	
                <h2 style="color:#FFFFFF"> Iniciar Sesion</h2>
                <p style="color:#FFFFFF" class="lead"> Inicia sesion para acceder a los servicios Bike Co</p>
            </div> 
            
            <div class="row contact-wrap center col-md-offset-4 "> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-login-form" class="login-form " name="insertar" method="post" action="<c:url value='/j_spring_security_check'/>">
                    <div class="col-sm-6  block-center">
                        <div class="form-group">
                            <label style="color:#FFFFFF">Usuario *</label>
                            <input type="text" id="Nombre" name="j_username" class="form-control" required="required " placeholder="Nombre de usuario">
                        </div>
                        <div class="form-group">
                            <label style="color:#FFFFFF">Contraseña *</label>
                            <input type="password" id="Email" name="j_password" class="form-control" required="required " placeholder="Contrasena">
                        </div>
						<div class="form-group">
                            <button type="submit" name="enviar" value="INICIAR SESIÓN" class="btn btn-primary btn-lg" id="regist">Login</button>
                        </div>
                    </div>
                </form> 
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->
    </div>
























	<br><br>
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
