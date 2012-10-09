<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>APCE LOGIN</title>
<link rel="stylesheet" href="CSS/screen.css" type="text/css"
	media="screen" title="default" />
<!--  jquery core -->
<script src="Js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

<!-- Custom jquery scripts -->
<script src="Js/jquery/custom_jquery.js" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="Js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).pngFix();
	});
</script>
</head>
<body id="login-bg">

	<!-- Start: login-holder -->
	<form id="loginForm" name="loginForm"
		action="<c:url value='j_spring_security_check'/>" method="post">
		<div id="login-holder">

			<!-- start logo -->
			<div id="logo-login">
				<a href="index.html"><img src="images/shared/logo.png"
					width="156" height="40" alt="" /></a>
			</div>
			<!-- end logo -->

			<div class="clear"></div>
			<!--  start loginbox ................................................................................. -->
			<div id="loginbox">

				<!--  start login-inner -->
				<div id="login-inner">
					<table border="0" cellpadding="0" cellspacing="0">
						<tr>
							<th>Username</th>
							<td><input type="text" id='username' name='j_username'
								value='<c:if test="${not empty login_error}">
                                                     <c:out value="Error"/>
                                                     </c:if>'
								class="login-inp" /></td>
						</tr>
						<tr>
							<th>Password</th>
							<td><input type="password" name='j_password'
								value="************" onfocus="this.value=''" class="login-inp" /></td>
						</tr>
						<tr>
							<th></th>
							<td valign="top"><input type="checkbox"
								name='_spring_security_remember_me'
								id="_spring_security_remember_me" class="checkbox-size"
								id="login-check" /><label for="login-check">Remember me</label></td>
						</tr>
						<tr>
							<th></th>
							<td><c:if test="${not empty param.login_error}">
									<font color="red"> Invalid user name or password, try
									again.<br />
									<br />
									</font>
								</c:if></td>
						</tr>
						<tr>
							<th></th>
							<td><input type="submit" value="Submit" class="submit-login" /></td>
						</tr>
					</table>
				</div>
				<!--  end login-inner -->
				<div class="clear"></div>
				<a href="" class="forgot-pwd">Forgot Password?</a>
			</div>
			<!--  end loginbox -->


			<!--  start forgotbox ................................................................................... -->
			<div id="forgotbox">
				<div id="forgotbox-text">Please send us your email and we'll
					reset your password.</div>
				<!--  start forgot-inner -->
				<div id="forgot-inner">
					<table border="0" cellpadding="0" cellspacing="0">
						<tr>
							<th>Email address:</th>
							<td><input type="text" value="" class="login-inp" /></td>
						</tr>
						<tr>
							<th></th>
							<td><input type="submit" class="submit-login" /></td>
						</tr>
					</table>
				</div>
				<!--  end forgot-inner -->
				<div class="clear"></div>
				<a href="" class="back-login">Back to login</a>
			</div>
			<!--  end forgotbox -->

		</div>
	</form>
	<!-- End: login-holder -->
</body>
</html>