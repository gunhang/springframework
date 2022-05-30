<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
       #header{            
           width:100%;
           height:50px;
           text-align: center;
           background-color: aqua;
       }
       #left{
           float:left;
            width:15%;
           background-color: gray;
       }
       #main{
           float:left;
            width:85%;
           background-color: lime;
       }
       #footer{
           width: 100%;
           height: 50px;            
           text-align: center;
           background-color: orange;
           clear:both;
       }
        #left, #main{ 
              min-height: 600px;
        } 
</style>
<body>
	<div id="header"></div>
	<div id="left"></div>
	<div id="main"></div>
	<div id="footer"></div>
</body>
</html>