<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="http://localhost:8080/xmaicrm/"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${webtitle}</title>

<link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="resources/css.css">
<link rel="stylesheet" type="text/css" href="resources/easyui_update.css">
<script type="text/javascript" src="resources/easyui/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="resources/easyui/locale/easyui-lang-zh_CN.js"></script>

<!-- loadmask -->
<link href="resources/plugins/loadmask/jquery.loadmask.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/plugins/loadmask/jquery.loadmask.min.js"></script>

<script type="text/javascript" src="resources/global.js"></script>

<%@ include file="common/commonjs.jsp"%>