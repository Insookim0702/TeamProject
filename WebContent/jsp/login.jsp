<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel ="stylesheet" type ="text/css" href ="css/login.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background: #f8f8f8;
        padding: 60px 0;
    }
    #form{
    	position:absolute;
	    top:30%;
	    left:50%;
		width:360px;
		height:50%;
	    transform:translate(-50%, -50%);
    }
    #login-form > div {
        margin: 15px 0;
    }

</style>
</head>
<body>
<div class="container">
    <div  id = "form" class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div  class="panel panel-success">
            <div class="panel-heading">
            <br><h2>LOGIN</h2><hr>
                <div class="panel-title">환영합니다!</div>
            </div>
            <div class="panel-body">
                <form method="post" action ="../loginlogout?command=login">
                    <div>
                        <input type="text" class="form-control" id ="id" name ="id" placeholder="Username" autofocus>
                    </div><br>
                    <div>
                        <input type="password" class="form-control" id ="pwcheck" name ="pwcheck" placeholder="Password">
                    </div><br>
                    <div>
                        <button type="submit" class="form-control btn btn-primary">로그인</button>
                    </div><br>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>