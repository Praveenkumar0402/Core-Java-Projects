<%@ page import="packages.*" %>
<%@ page import="com.org.day2.*"%>
<%@ page import="dao.*"%>
<%@ page import="service.*" %>
<%@ page import="servlets.*" %>
<%@ page import="java.util.*" %>


<jsp:useBean id="cart" scope="session" class="packages.ShoppingCart"/>
<jsp:useBean id="bookDB" scope="application" class="dao.UserDao"/>

<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900' rel='stylesheet' type='text/css'>
<!--//fonts-->