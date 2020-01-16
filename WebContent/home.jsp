<%@page import="model.Producto"%>
<%@page import="model.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es-ES">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/mycss.css" />
<title>Foster's Hollywood</title>
</head>

<body>
	<div class="container bg-light">
		<header>
			<nav class="navbar bg-header navbar-light">
				<a class="navbar-brand" href="#"> <img src="img/logo.png"
					height="30" alt="">
				</a>
			</nav>
		</header>
		<%
			ArrayList<Categoria> categorias = (ArrayList<Categoria>) session.getAttribute("categorias");
		%>
		<div id="carouselExampleControls" class="carousel slide"
			data-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="img/slider1.png" class="d-block w-100"
						alt=BlackLabelBurger>
				</div>
				<div class="carousel-item">
					<img src="img/slider2.png" class="d-block w-100" alt="Costillas">
				</div>
				<div class="carousel-item">
					<img src="img/slider3.png" class="d-block w-100"
						alt="Bacon-cheese-fries">
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
		<div class="row mt-5">
			<%
				for (Categoria categoria : categorias) {
			%>

			<div class="col-md-6 col-sm-12 col-lg-4 mb-5 card-cat">

				<div class="card">
					<a
						href="Controller?op=dameplatos&idcategoria=<%=categoria.getId()%>"
						type="sum" id="categoriaid" name="categoriaig"> <img
						src="img/<%=categoria.getNombre()%>.png" class="card-img-top"
						alt="<%=categoria.getNombre()%>">
						<div class="card-body">
							<h5 class="card-title"><%=categoria.getNombre()%></h5>
						</div>
					</a>
				</div>

			</div>
			<%
				}
			%>
		</div>
	</div>
	<footer class="footer container fixed-bottom">
		<h1 class="footer">Foster's Hollywood</h1>
	</footer>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
	<script src="js/myjs.js"></script>
</body>

</html>