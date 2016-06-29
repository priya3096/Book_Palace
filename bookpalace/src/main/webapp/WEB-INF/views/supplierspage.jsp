<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<title>Suppliers</title>
</head>
<body background="C:\Users\Manoj\Desktop\ecommerce project\images.jpg">
<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index1.jsp">BOOK PALACE</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="AboutUs.jsp">About</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Genres <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Fiction</a></li>
							<li><a href="#">Autobiography</a></li>
							<li><a href="#">Non Fiction</a></li>
							<li><a href="#">Horror</a></li>
							<li><a href="#">Education</a></li>
							<li><a href="#">Comedy</a></li>
						</ul></li>
					<li><a href="getProducts">All Products</a></li>

					<li> <form:form action="isValidUser" method="post"><input type="text" name="uname" placeholder="UserId" >
						<input type="password" name="password" placeholder="Password" >
						<input type="submit" value="LOGIN">Sign In</form:form ></li>
				</ul>
			</div>
						<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<h2>List of Suppliers</h2>
		<table width="60%">
			<tr>
				<td>S.No</td>
				<td>Supplier Id</td>
				<td>Supplier Name</td>
				<td>City</td>
			</tr>
			<c:forEach items="${supplierList}" var="supplier" varStatus="status">
				<tr>
					<td align="center">${status.count }</td>
					<td><input name="supplierList[${ status.index}].supplierId" value="${supplier.supplierId }"></td>
					<td><input name="supplierList[${ status.index}].supplierName" value="${supplier.supplierName }"></td>
					<td><input name="supplierList[${ status.index}].supplierCity" value="${supplier.supplierCity }"></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>