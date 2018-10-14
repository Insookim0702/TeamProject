<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이것이 휴게실이다.-입실하기</title>
<script src = "../js/jquery-3.3.1.min.js"></script>
<script src = "../js/time.js"></script>
<link rel ="stylesheet" type ="text/css" href ="../css/register.css">
</head>
<body>
<form method="post" action ="../registerController?command=register">
	<table>
	<!-- =====================년월일 표기========================= -->
	<tr ><td colspan="5" id ="output"></td></tr>
	<!--========= 현재시간 표기 ===========-->
	<tr><td colspan="5" id ="clock">	00:00:00 </td></tr>
	<!--========= 현재시간 표기 ===========-->
	<!--=================== 입력 폼 ===================-->
	
		<tr id ="menu"><td>학과</td><td>학번</td><td>이름</td><td>전화번호</td><td>침대번호</td> </tr>
		
		<tr>
		<td height="40px"><input  type ="text" id = "major" name ="major"  autofocus required placeholder="  학과을 입력하세요."></td>
		<td height="40px"><input  type ="text" id = "id" name ="id" required placeholder="  학번을 입력하세요."></td>
		<td height="40px"><input  type ="text" id ="name" name ="name" required placeholder="  이름을 입력하세요."></td>
		<td height="40px"><input  type ="text" id ="phone" name ="phone" required placeholder="  '-'없이 입력하세요." ></td>
		<td height="40px"><input type ="text" id ="bednum" name ="bednum" value="${param.no}" readonly></td>
		</tr>
		<tr><td colspan="5"><input type ="image" src = "../image/이용하기.png" width="230px"></td></tr>
	</table>
	</form>
	
</body>
</html>