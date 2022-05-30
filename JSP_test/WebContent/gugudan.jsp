<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
	int dan=2, gopp=0;

	for(;dan<10; dan++){ %>

	<%=dan %>단<br>

	<%for(int gop=1; gop<=9; gop++){ %>

	<%=dan%> * <%=gop%> =  <%=dan*gop %><br>
	
	<%} %>

	<br>

<%
	}

%>
</body>
</html>

