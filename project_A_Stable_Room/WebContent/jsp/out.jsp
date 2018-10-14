<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	#no{
		display: none
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${param.no}번 침대 퇴실.</title>
<script src = "../js/jquery-3.3.1.min.js"></script>
<script src = "../js/time.js"></script>
<script type="text/javascript">

function closeSelf(){
	window.opener.name = "parentPage";
	document.myForm.target ="parentPage";
	document.myForm.submit();
	if(opener !=null){
		opener.out1 =null;
		self.close();
	}
}

</script>
<link rel ="stylesheet" type ="text/css" href ="../css/register.css">
</head>
<body>
<form method = "post" action ="../outController?command=out${param.no}" name ="myForm">
<table>
	<!-- =====================년월일 표기========================= -->
	<tr ><td colspan="5" id ="output"></td></tr>
	<!--========= 현재시간 표기 ===========-->
	<tr><td colspan="5" id ="clock">	00:00:00 </td></tr>
	<div id="no"><input type ="text" id ="bednum" name ="bednum" value="${param.no}" readonly></div>
	<tr><td><h1>${param.no} 번. 퇴실하시겠습니까??</h1></td></tr>
	
	<tr><td><input type ="image" src ="../image/퇴실하기.png" width="300px"></td></tr>
</table>
</form>
</body>
</html>