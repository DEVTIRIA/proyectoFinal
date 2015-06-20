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
                        <li class="active"><a href="#/Repuesto">Repuestos</a></li>
                        <li><a href="#/Servicio">Servicios</a></li>
                        <li><a href="#/Contacto">Contacto</a></li>
                        <li><a href="#/Perfil">Perfil</a></li>
                        
                    </ul>
                </div>
            </div><!--container-->
        </nav><!--nav-->
        
    </header><!--header-->
	<div data-ng-view></div> 

    <section>
        <div class="container">
            <div class="row">
                <h2 class="h2 text-center">Seleccione de la lista el pruducto que esta buscando</h2><br><br>
            </div>
            <div class="row">
                <form action="">
                    <div class="col-sm-4">
                        <label for="" class="tex-color">Marca: </label>
                        <select name="" id="" class="form-control">
                            <option value="">Todas</option>
                            <option value="">Yamaha</option>
                            <option value="">Kawasaki</option>
                            <option value="">Honda</option>
                            <option value="">Bajaj</option>
                            <option value="">KTM</option>
                        </select>
                    </div>
                    <div class="col-sm-4">
                        <label for="" class="tex-color">Referencia: </label>
                        <select name="" id="" class="form-control">
                            <option value="">Todas</option>
                            <option value="">Z1000</option>
                            <option value="">R1</option>
                            <option value="">CBR 250</option>
                            <option value="">Pulsar 200</option>
                            <option value="">Duke 390</option>
                        </select>
                    </div>
                    <div class="col-sm-4">
                        <label for="" class="tex-color">Accesorio: </label>
                        <select name="" id="" class="form-control">
                            <option value="">Todos</option>
                            <option value="">Espejo</option>
                            <option value="">Carenaje</option>
                            <option value="">Unidad</option>
                            <option value="">Stop</option>
                            <option value="">Tablero</option>
                        </select>
                    </div>
                    <div class="col-sm-12 text-center"><br><br>
                        <button class="btn btn-danger btn-color">Buscar</button>
                        <br><br>
                    </div>
                    
                </form>
                <div>
                
                <div class="table-responsive">
  					<table class="table table-bordered" style="color:#FFFFFF">
				    <thead>
				      <tr>
				        <th>Tienda</th>
				        <th>Direccion</th>
				        <th>Telefono</th>
				        <th>Precio</th>
				        <th>Ciudad</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <td>Moto GP</td>
				        <td>Call 23</td>
				        <td>1252321</td>
				        <td>$200.000</td>
				        <td>Bogota</td>
				      </tr>
				      <tr>
				        <td>Moto GP</td>
				        <td>Call 23</td>
				        <td>1252321</td>
				        <td>$200.000</td>
				        <td>Bogota</td>
				      </tr>
				      <tr>
				        <td>Moto GP</td>
				        <td>Call 23</td>
				        <td>1252321</td>
				        <td>$200.000</td>
				        <td>Bogota</td>
				      </tr>
				    </tbody>
				  </table>
				</div>

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
    </footer><!--/#footer-->    