<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
  <div class="text-center">
  </div>
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-default text-center">
      <!-- 관리자 페이지 -->
	<c:if test="${not empty sessionScope.name }">
	<span><table>
	<tr><td colspan ="3" align="center"><h2>관리자</h2></td></tr>
		<tr id="time"><td width="55%" id ="output" align="center"></td><td height ="60px" colspan ="2" align="center" id = clock>00:00:00</td></tr>
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
        <!-- admin 계정이 로그인 안 됐을 때    --일반사용자가 보는 페이지-->
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
      </div> 
    </div> 
   <div class="col-sm-4">
      <div class="panel panel-default text-center">
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
      </div> 
    </div> 
  </div>
</div>

</body>
</html>