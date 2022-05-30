<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
.con{
	width : 1200px;
	margin : auto;
	margin-top: 100px;
}
</style>
</head>
<body>
<div class="con">
	<div class="card card-primary">
		<div class="card-header">
			<h3 class="card-title" style="text-align : center">회원등록</h3>
		</div>
		<form action="update" method="post">
			<div class="card-body">
				<div class="form-group">
					<label for="idForm">아이디</label>
					<input class="form-control" name="id" id="idForm" placeholder="영문,숫자,4~8자리 입력 가능" required title="영어 또는 숫자 4~8로 입력해주세요" value="${member.id }">
				</div>
				<div class="form-group">
					<label for="pwdForm">패스워드</label>
					<input class="form-control" name="pwd" id="pwdForm" placeholder="대/소문자,특수문자,숫자 포함 8자리 이상 입력 가능" required value="${member.pwd }">
				</div>
				<div class="form-group">
					<label for="nameForm">이름</label>
					<input class="form-control" name="name" id="nameForm" placeholder="이름을 입력해주세요" required value="${member.name }">
				</div>
				<div class="form-group">
					<label for="emailForm">E-mail</label>
					<input class="form-control" name="email" id="emailForm" placeholder="Email을 입력해주세요" required value="${member.email }">
				</div>
				<div class="form-group">
					<label for="phoneForm">전화번호</label>
					<input class="form-control" name="phone" id="phoneForm" placeholder="전화번호를 입력해주세요" required title="010-0000-0000 형식에 맞게 작성해주세요" required value="${member.phone }">
				</div>
				<div class="form-group">
					<label for="addressForm">주소</label>
					<input class="form-control"  name="address" id="addressForm" placeholder="주소를 입력해주세요" required value="${member.address }">
				</div>
			</div>
			<div class="card-footer">
				<button type="submit" class="btn btn-primary" id="sendBtn">수정</button>
				<button type="submit" class="btn btn-m btn-danger">취소</button>
			</div>
		</form>
	</div> 
</div>
</body>
</html>