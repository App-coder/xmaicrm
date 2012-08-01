<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<c:choose>
	<c:when test="${stuff.stufftype == 'accountmoney'}">
		<!-- 应收款，应付款，客户汇总 -->
		<table class="tablist" id="tab_accountmoney">
		</table>
	</c:when>
	<c:when test="${stuff.stufftype == 'gathersyear'}">
		<div id="chart_gathersyear" style="width:100%;height:252px;"></div>
	</c:when>
	<c:when test="${stuff.stufftype == 'top_salesbymonth' }">
		<div id="chart_top_salesbymonth" style="width:100%;height:252px;"></div>
	</c:when>
</c:choose>
  