<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</meta>
<base href="<%=basePath %>"/>

<link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css"/>
<link rel="stylesheet" type="text/css" href="resources/css.css"/>
<link rel="stylesheet" type="text/css" href="resources/easyui_update.css"/>
<link rel="stylesheet" type="text/css" href="resources/css.css" />
<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/cupertino/theme.css' />
<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/fullcalendar.css' />
<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/fullcalendar.print.css' media='print' />
<script type='text/javascript' src='resources/lib/date.js'></script>
<script type='text/javascript' src='resources/plugins/fullcalendar/jquery-1.8.1.min.js'></script>
<script type='text/javascript' src='resources/plugins/fullcalendar/jquery-ui-1.8.23.custom.min.js'></script>
<script type='text/javascript' src='resources/plugins/fullcalendar/fullcalendar.min.js' charset="utf-8"></script>
<script type="text/javascript" src="resources/desktop/module/calendar/view.js"></script>

</head>
<body id="wrap" class="p10"  >
	<div class="def_div">
	<span class="fl">
	查看范围：<select><option>所有日程安排</option></select>
	</span>
	<span class="fr" >
	<a onclick="formsubmit('form_customview')" href="javascript:void(0)" iconcls="icon-share" class="easyui-linkbutton l-btn" id=""><span class="l-btn-left"><span class="l-btn-text icon-share" style="padding-left: 20px;">共享日程</span></span></a>
	</span>
	</div>
	<div id='calendar' class="mgb_10" ></div>
</body>
</html>    