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
                        <li class="active"><a href="#/Contacto">Contacto</a></li>
                        <li><a href="#/Perfil">Perfil</a></li>
                        
                    </ul>
                </div>
            </div><!--container-->
        </nav><!--nav-->
        
    </header><!--header-->
	<div data-ng-view></div> 
	
	<section id="contact-info">
        <div class="center"><br>                
            <h2 style="color:#FFFFFF">Ubicación</h2>
            <p style="color:#FFFFFF" class="lead">Puedes encontrarnos en nuestra oficina en Bogota en los horarios de 8:00 AM - 5:00 PM</p>
        </div>
        <div class="gmap-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 text-center">
                        <div class="gmap">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m22!1m12!1m3!1d3977.039913789326!2d-74.13964049457996!3d4.586859109536756!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m7!1i0!3e6!4m0!4m3!3m2!1d4.5868858999999995!2d-74.14075369999999!5e0!3m2!1ses!2s!4v1431469607498" width="600" height="450" frameborder="0" style="border:0"></iframe>
                        </div>
                    </div>

                    <div class="col-sm-3 map-content col-md-offset-3">
                        <ul class="row">
                            <li class="col-sm-12">
                                <address>
                                    <center>
                                    <h2 style="color:#43DFF2">Oficina Principal</h2>
                                    <p style="color:#FFFFFF">Calle 53 Sur # 36 A 93 <br>
                                    Bogotá - Colombia</p>
                                    <p style="color:#FFFFFF">Telefono 301-227-7530 <br>
                                    E-mail billy_hetfield@hotmail.com</p>
                                    </center>
                                </address>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>  <!--/Area del mapa -->

    <section id="contact-page">
        <div class="container">
            <div class="center">        
                <h2 style="color:#FFFFFF">Contactanos</h2>
                <p style="color:#FFFFFF" class="lead">Puedes hacerlo por medio de este pequeño formulario y nos pondremos en contacto.</p>
            </div> 
            <div class="row contact-wrap"> 
                <div class="status alert alert-success" style="display: none"></div>
                <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="mailer.php">
                    <div class="col-sm-5 col-sm-offset-1">
                        <div class="form-group">
                            <label style="color:#FFFFFF">Nombre *</label>
                            <input type="text" id="Nombre" name="Nombre" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label style="color:#FFFFFF">E-mail *</label>
                            <input type="email" id="Email" name="Email" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label style="color:#FFFFFF">Telefono *</label>
                            <input name="Telefono" id="Telefono" type="number" class="form-control"  required="required">
                        </div>
                        <div class="form-group">
                            <label style="color:#FFFFFF">Ciudad *</label>
                            <input name="Ciudad" type="text" id="Ciudad" class="form-control"  required="required">
                        </div>                        
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label style="color:#FFFFFF">Asunto *</label>
                            <input type="text" name="Asunto" id="Asunto" class="form-control" required="required">
                        </div>
                        <div class="form-group">
                            <label style="color:#FFFFFF">Mensaje *</label>
                            <textarea name="message" id="Mensaje" id="Mensaje" required="required" class="form-control" rows="8"></textarea>
                        </div>                        
                        <div class="form-group">
                            <button type="submit" name="submit" class="btn btn-primary btn-lg" required="">Enviar Mensaje</button>
                        </div>
                    </div>
                </form> 
            </div><!--/.row-->
        </div><!--/.container-->
    </section><!--/#contact-page-->
    
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">