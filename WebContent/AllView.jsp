<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table bor="1"> 
	<c:forEach items="${requestScope.allData }" var="data">
		<tr>
			<td>${data.today}</td>
			<td>${data.id}</td>
			<td>${data.name}</td>
			<td>${data.phone}</td>
			<td>${data.bednum}</td>
			<td>${data.intime }</td>
			<td>${data.outtime }</td>
			<td>${data.inout }</td>
	</c:forEach>
</table>
