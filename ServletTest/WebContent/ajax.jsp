<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script>
function mydelete(){
	var flag = confirm("한번 삭제된 데이터는 복구할 수 없습니다. 그래도 삭제하시겠습니까?");
	if(!flag){
		return;
	}
	var m_id = $('#m_id').val();
	
	var postdata = {
	    'm_id': m_id
	}
	$.ajax({
	    type: 'POST',
	    url: 'mydelete',
	    data: JSON.stringify(postdata),
	    dataType : 'JSON',
	    contentType: "application/json",
	    success: function(data){
	    	if(data.result == "success"){
	    		alert("정상적으로 삭제되었습니다.");
	    		location.reload();
	    	}
	    },
	    error: function(request, status, error){
	    	console.log(request, status, error);
	    }
	})
}
</script>
</head>
<body>

<table border="1">
	<tr>
		<td>아이디</td>
		<td><input type="text" id="id" size="7"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" id="name" size="7"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" id="pwd" size="7"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" id="address" size="7"></td>
	</tr>
	<tr>
		<td>email</td>
		<td><input type="text" id="email" size="7"></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" id="phone" size="7"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="button" value="추가" onclick="myinsert()"/>
			<input type="button" value="수정" onclick="myupdate()"/>
			<input type="button" value="삭제" onclick="mydelete()"/>
		</td>
	</tr>
</table>
</body>
</html>