<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="resources/css.css">
<link rel="stylesheet" type="text/css" href="resources/easyui_update.css">
<script type="text/javascript" src="resources/easyui/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="resources/easyui/locale/easyui-lang-zh_CN.js"></script>

<!-- JSON插件 -->
<script type="text/javascript" src="resources/lib/JSONUtil.js"></script>

<!-- easyuipack.js 补充拓展 -->
<script type="text/javascript" src="resources/easyui/easyuipack.js"></script>

<!-- loadmask -->
<link href="resources/plugins/loadmask/jquery.loadmask.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/plugins/loadmask/jquery.loadmask.min.js"></script>

<!-- 菜单 -->
<link rel="stylesheet" type="text/css" href="resources/prodrop/pro_drop.css" />
<script src="resources/prodrop/stuHover.js" type="text/javascript"></script>

<!-- 表单验证 -->
<script type="text/javascript" src="resources/lib/checkvalidate.js"></script>

<!-- 文件上传 -->
<script type="text/javascript" src="resources/plugins/ajaxfileupload.js"></script>
