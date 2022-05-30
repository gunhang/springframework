<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	tr.data{ cursor:pointer;}
	.con{
		width : 1200px;
		margin : auto;
		margin-top : 50px;
	}
</style>
</head>
<body>
<div class="con">
	<div class="card">
		<div class="card-header">
			<h1>회원리스트</h1>
		</div>
		<div class="card-body">
			<table class="table m-0">
				<thead>
					<tr>
						<th>아이디</th>
						<th>이름</th>
						<th>주소</th>
						<th>email</th>
						<th>전화번호</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty memberList }"><c:forEach items="${memberList }" var="member">
						<tr class="data" onclick="detail_go('${member.id}');">
							<td>${member.id }</td>
							<td>${member.name }</td>
							<td>${member.address }</td>
							<td>${member.email }</td>
							<td>${member.phone }</td>
						</tr>
					</c:forEach></c:if>
					<c:if test="${empty memberList }">
						<tr >
							<td colspan="6" style="text-align:center;">해당 내용이 없습니다.</td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
		<div class="card-footer">
			<a href="insert" class="btn btn-m btn-info float-right">회원등록</a>
			<div id="keyword" class="card-tools" style="width:500px;">
				<div class="input-group row">
					<select class="form-control col-md-3" name="perPageNum" id="perPageNum" onchange="list_go(1);">
						<option value="10">정렬개수</option>
						<option value="2">2개씩</option>
						<option value="3">3개씩</option>
						<option value="5">5개씩</option>
					</select>
					  <!-- search bar -->
					<select class="form-control col-md-3" name="searchType" id="searchType">
						<option value="">검색구분</option>
						<option value="i">아이디</option>
						<option value="p">전화번호</option>
						<option value="e">이메일</option>
					</select>
					<!-- keyword -->
					<input class="form-control" type="text" name="keyword" placeholder="검색어를 입력하세요." value="">
					<span class="input-group-append">
						<a href="#" class="btn btn-m btn-info">
							<i class="fa fa-fw fa-search"></i>
						</a>
					</span>
				<!-- end : search bar -->	
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	function detail_go(member_id){
		//alert(member_id);
		window.open('detail?id='+member_id,'800','700','');
	}
</script>
</body>
</html>






