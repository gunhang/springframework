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

	<h1>회원상세보기</h1>
	<hr/>
	<ul>
		<li>아이디 : ${member.id }</li>
		<li>패스워드 : ${member.pwd }</li>
		<li>이름 : ${member.name }</li>
		<li>이메일 : ${member.email }</li>
		<li>전화번호 : ${member.phone }</li>
		<li>주소 : ${member.address }</li>
		<li>가입일 : ${member.regDate }</li>
		<li>권한 : ${member.authority }</li>		 
	</ul>
	<input type="hidden" id="id" value="${member.id }" />
	<button onclick="update('${member.id }')">수정</button><button onclick="delete_go('${member.id}')">삭제</button>

<script>
	function update(member_id){
		window.open('update?id='+member_id,'800','700','');
	}
	function delete_go(member_id){
  		window.open('delete?id='+member_id,'800', '700', ''); 
	}
	$(document).ready(function(){
	      opener.location.reload();
	});
</script>	
</body>
</html>
