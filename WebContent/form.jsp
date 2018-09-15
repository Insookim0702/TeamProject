<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	h1{
		color:yellow;
	}
</style>
<title>남학생 안정실</title>
<link rel ="stylesheet" type ="text/css" href ="css/common.css">
<link rel ="stylesheet" type ="text/css" href ="css/form.css">
<script src = "js/jquery-3.3.1.min.js"></script>
<script src ="js/time.js"></script>                  <!-- <================년월일시분초 불러오는 js파일 -->
<script src ="js/form.js"></script>              <!-- <===========상단메뉴 호버기능, 윈도우창에 맞추기===== -->
<script src ="js/popup.js"></script>
<script src="js/inoutbtn.js"></script>
<script type="text/javascript">
	window.name ="parentform";
</script>
</head>
<body>
           <!-- ******************************상단 고정 메뉴***************************** -->
	<table id ="topMenuBox" >
		<tr><td id ="main" top="3px">
		<form method ="post" action ="registerController?command=reload"><input type ="image" src=image/남학생안정실.png width="150px">
		<!-- <img  src=image/이것이휴게실이다2.png width="150px"> -->
		</form></td>
		<td><c:if test="${not empty sessionScope.name }"><h1>★${name}★</h1></c:if></td>
		<td>
		<c:if test="${empty sessionScope.name}"><a href ="jsp/login.jsp"><img id = "login" src=image/로그인.png width="130px"></a></c:if>
		
		<c:if test="${not empty sessionScope.name }"><a href ="loginlogout?command=logout"><img id ="logout" src ="image/로그아웃.png" width="130"></a></c:if>
		<c:if test="${not empty sessionScope.name}"><a href ="jsp/signup.jsp"><img id = "signup"  src=image/회원가입.png width="130px"></a></c:if>
		
		
		<a href ="https://www.shillahotels.com/index.do"><img id = "surround"  src=image/둘러보기.png width="130px"></a>
		<a href ="#"><img id = "proposal"  src=image/건의하기.png width="130px"></a></td></tr>
		</table>
		
		
	<!--==============메인화면 틀==================  -->
	<article id ="article">
	<span><table id ="registerTable" border ="1">  
			<thead>
			<tr><th colspan="9"><button onclick ="ajaxReq()">입실 현황 보기</button></th></tr>
			<tr><th width="170px">날짜</th><th width="170px">학번</th>
			<th width="110px">이름</th><th widtwh="180px">전화번호</th>
			<th width="90px">침대번호</th>
			<th width="170px">입실시간</th>
			<th width="170px">퇴실시간</th>
			<th width="90px">입퇴실현황</th>
			</tr></thead>
			<tbody id ="dataView"></tbody>
			
	</table></span>
		
	<c:if test="${not empty sessionScope.name }">
	<span><table>
	<tr><td colspan ="3" align="center"><h2>관리자</h2></td></tr>
		<tr id="time"><td width="55%" id ="output" align="center"></td><td height ="60px" colspan ="2" align="center" id = clock>00:00:00</td></tr>
		<!-- <div id ="dataView1">-->
		
		<tr>
			<td id ="td">
			
		      <c:set var ="it" value ="${requestScope.bednum1}"/>
		      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=1><img src = "image/bedempty1.png" id="bed1"></a></c:if> 
		      <%-- <c:if test="${it eq 'true'}"><input type ="image" onclick ="showPopupout1()" id ="usingbed1" src = "image/bed1.png" width ="310px"/></c:if></td> --%>
		      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=1><img id ="usingbed1" src = "image/bed1.png" width ="310px"></a></c:if></td>
		   
		      <td rowspan="5" width="300px"></td>
		      <td><c:set var ="it" value ="${requestScope.bednum5}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=5><img src = "image/bedempty5.png" id="bed5" ></a></c:if> 
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=5><img id ="usingbed5" src = "image/bed5.png" width ="310px"></a></c:if></td>
		</tr>
			
			<tr><td><c:set var ="it" value ="${requestScope.bednum2}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=2><img src = "image/bedempty2.png" id="bed2"></a></c:if> 
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=2><img id ="usingbed2" src = "image/bed2.png" width ="310px"></a></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum6}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=6><img src = "image/bedempty6.png" id="bed6"></a></c:if> 
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=6><img id ="usingbed6" src = "image/bed6.png" width ="310px"></a></c:if></td>
			</tr>	
			<tr><td><c:set var ="it" value ="${requestScope.bednum3}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=3><img src = "image/bedempty3.png" id="bed3"></a></c:if> 
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=3><img id ="usingbed3" src = "image/bed3.png" width ="310px"></a></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum7}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=7><img src = "image/bedempty7.png" id="bed7"></a></c:if> 
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=7><img id ="usingbed7" src = "image/bed7.png" width ="310px"></a></c:if></td>
			
			</tr>
			<tr><td><c:set var ="it" value ="${requestScope.bednum4}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=4><img src = "image/bedempty4.png" id="bed4"></a></c:if> 
			      <%-- <c:if test="${it eq 'true'}"><input type ="image" onclick ="showPopupout4()" id ="usingbed4" src = "image/bed4.png" width ="310px"/></c:if></td> --%>
			      <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=4><img id ="usingbed4" src = "image/bed4.png" width ="310px"></a></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum8}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=8><img src = "image/bedempty8.png" id="bed8"></a></c:if> 
			     <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=8><img id ="usingbed8" src = "image/bed8.png" width ="310px"></a></c:if></td>
			</tr>
			<tr><td></td><td><c:set var ="it" value ="${requestScope.bednum9}"/>
			      <c:if test="${it != 'true'}"><a href =jsp/register.jsp?no=9><img src = "image/bedempty9.png" id="bed9"></a></c:if> 
				  <c:if test="${it eq 'true'}"><a href = jsp/out.jsp?no=9><img id ="usingbed9" src = "image/bed9.png" width ="310px"></a></c:if></td>
			</tr>
		</table></span>
		</c:if>
		
		
		<c:if test="${empty sessionScope.name }">
			<span><table>
			<tr><td colspan ="3" align="center"><h2>학생</h2></td></tr>
			<tr id="time"><td width="55%" id ="output" align="center"></td><td height ="60px" colspan ="2" align="center" id = clock>00:00:00</td></tr>
			
			<tr>
				<td id ="td">
			      <c:set var ="it" value ="${requestScope.bednum1}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty1.png" id="bed1"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed1.png" width ="310px"></c:if></td>
			    <td rowspan="5" width="300px"></td>
			    <td><c:set var ="it" value ="${requestScope.bednum5}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty5.png" id="bed5" ></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed5.png" width ="310px"></c:if></td>
			</tr>
			
			<tr><td><c:set var ="it" value ="${requestScope.bednum2}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty2.png" id="bed2"></c:if> 
			    <c:if test="${it eq 'true'}"><img src = "image/bed2.png" width ="310px"></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum6}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty6.png" id="bed6"></c:if> 
			     <c:if test="${it eq 'true'}"><img src = "image/bed6.png" width ="310px"></c:if></td>
			</tr>	
			<tr><td><c:set var ="it" value ="${requestScope.bednum3}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty3.png" id="bed3"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed3.png" width ="310px"></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum7}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty7.png" id="bed7"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed7.png" width ="310px"></c:if></td>
			</tr>
			<tr><td><c:set var ="it" value ="${requestScope.bednum4}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty4.png" id="bed4"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed4.png" width ="310px"></c:if></td>
			    <td><c:set var ="it" value ="${requestScope.bednum8}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty8.png" id="bed8"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed8.png" width ="310px"></c:if></td>
			</tr>
			<tr><td></td><td><c:set var ="it" value ="${requestScope.bednum9}"/>
			      <c:if test="${it != 'true'}"><img src = "image/bedempty9.png" id="bed9"></c:if> 
			      <c:if test="${it eq 'true'}"><img src = "image/bed9.png" width ="310px"></c:if></td>
			</tr>
		</table></span>
		</c:if>
		
		<footer >
		<div>MADE BY INSOO</div>
		<div id ="insoophonenumber">문의 )010-8809-0702</div>
	</footer>

	</article>
	
</body>
</html>