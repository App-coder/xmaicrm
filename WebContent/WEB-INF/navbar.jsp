<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="home" value="<a href='welcome/homepage'>工作台</a>"></c:set>
<c:set var="marketing" value="<a href='customview/viewIndex?entitytype=Campaigns'>市场管理</a>"></c:set>
<c:set var="customer" value="<a href='customview/viewIndex?entitytype=Accounts'>客户</a>"></c:set>
<c:choose>
	<c:when test="${url=='customview/viewIndex?entitytype=Campaigns' }">
		${marketing }&gt;<a href="customview/viewIndex?entitytype=Campaigns">营销活动</a>
	</c:when>
</c:choose>	
