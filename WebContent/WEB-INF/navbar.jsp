<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 导航的基本链接 -->
<c:set var="home" value="<a href='welcome/homepage'>工作台</a>"></c:set>
<c:set var="marketing" value="<a href='customview/viewIndex?entitytype=Campaigns'>市场管理</a>"></c:set>
<c:set var="customer" value="<a href='customview/viewIndex?entitytype=Accounts'>客户</a>"></c:set>
<!-- 系统设置的链接 -->
<c:set var="syssetting" value="<a href='setting/index' >系统设置</a>" ></c:set>
<c:choose>
	<c:when test="${pathname eq '营销活动' }">
		${marketing }&gt;<a href="${url }">营销活动</a>
	</c:when>
	<c:when test="${pathname=='添加营销活动'}">
		${marketing }&gt;<a href="${url }">添加营销活动</a>
	</c:when>
	<c:when test="${pathname=='编辑营销活动'}">
		${marketing }&gt;<a href="${url }">编辑营销活动</a>
	</c:when>
	<c:when test="${pathname=='系统用户' }">
		${syssetting }&gt;<a href="${url }">系统用户</a>
	</c:when>
	<c:when test="${pathname=='角色权限' }">
		${syssetting }&gt;<a href="${url }">角色权限</a>
	</c:when>
	<c:when test="${pathname=='部门机构' }">
		${syssetting }&gt;<a href="${url }">部门机构</a>
	</c:when>
	<c:when test="${pathname=='全局共享规则' }">
		${syssetting }&gt;<a href="${url }">全局共享规则</a>
	</c:when>	
	<c:otherwise>
		导航设置不正确！
	</c:otherwise>
</c:choose>	
