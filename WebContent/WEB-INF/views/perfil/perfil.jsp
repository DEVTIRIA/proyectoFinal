<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div data-ng-controller="perfilController" data-ng-init="init()">
<header id="header">
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
								<a style="color:#0B72FF" href="#/Perfil" /> ${principal.username}</a>
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
	     <section id="perfil" style="color:#FFFFFF">
        <div class="container">
            <div class="col-md-4 col-md-offset-4 text-center">
                <img class="img_perfil" src="images/perfil.png" alt="">
            </div>
            <div class="col-xs-12">
                <h2 class="text-center h2">Información Personal</h2>
            </div>
            <div class="col-sm-6 col-sm-offset-3">
            	Identificacion: {{user_cedula}} <br>
            	Nombre: {{user_nombre}}  <br>
            	Apellido: {{user_apellido}} <br>
                Ubicación: {{user_ubicacion}}<br>
                Dirección: {{user_direccion}}<br> 
                Correo electronico: {{user_email}} <br><br>
                Sexo: {{ user_sexo}}<br>
                
                <span class="icon-skype"></span> Usuario: {{user_nick}} <br>
                <span class="icon-mobile"></span> Telefono: {{user_telefono}}
            </div>
            

        </div>
    </section>
    
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
                        <li><a href="Index.html">Inicio</a></li>
                        <li><a href="Nosotros.html">Nosotros</a></li>
                        <li><a href="Ayuda.html">Ayuda</a></li>
                        <li><a href="Contacto.html">Contacto</a></li>
                    </ul>
                </div>
            </div>
        </div>
<<<<<<< HEAD
    </footer><!--/#footer-->
    </div>
=======
    </footer><!--/#footer-->
>>>>>>> c4fb06493174fe20b1abb56a94d717c073bd8a4e
