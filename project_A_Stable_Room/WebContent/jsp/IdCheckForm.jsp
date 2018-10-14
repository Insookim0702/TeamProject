<%@ page language="java" contentType="text/html; charset=EUC-KR"    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#wrap{
	position:absolute;
    top:50%;
    left:50%;
	width:100%;
	height:100%;
    background: red;
    transform:translate(-50%, -50%);
}
#btn{
position:absolute;
	margin:0 auto ;
	vertical-align:middle;
}
.form-group {
	width:270px;
	position:absolute;
    top:60%;
    left:50%;
    font-color:white;
    background: red;
    transform:translate(-50%, -50%);
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src = "../js/IdCheckForm.js"></script>
<title>아이디 중복확인</title>
</head>
<body onload ="pValue()">
<div id ="wrap">
	<br>
	<p class="text-center"><font size ="4" color ="white">아이디 중복체크</font></p>
	<hr size ="1" width ="460">
	<br><br><br>
	<div id ="chk">
		<!-- <form id ="checkForm"> -->
			<div class="form-group" >
    			 <form id ="checkForm">
    			  <label for="inputsm"><font size ="4" color ="white">입력된 아이디</font></label>
    				<input  class="form-control input-lg" name ="idinput" id ="userId" type="text"><br>
    				<div class="col-sm-3" style="text-align:center;" >
    				<input class="btn btn-default" type ="button" value="중복확인" onclick="idCheck()">
    			</form>
    			<div id ="msg"></div><br>
					<input class="btn btn-default" id ="cancleBtn" type ="button" value="취소" onclick="window.close()"><br>
					<input class="btn btn-default" id ="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
  			
  					</div>
  			</div>
			<!-- <input type ="text" name ="idinput" id ="userId"><br><br> -->
			
		
		<!-- <div id ="msg"></div>
		<br>
		<input id ="cancleBtn" type ="button" value="취소" onclick="window.close()"><br>
		<input id ="useBtn" type="button" value="사용하기" onclick="sendCheckValue()"> -->
		
	</div>
</div>
</body>
</html>