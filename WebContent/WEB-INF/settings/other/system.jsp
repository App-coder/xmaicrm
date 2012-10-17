<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "SMTP服务器 ";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/users.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<table class="tab_editlist">
	<tr>
		<td class="edittd" >SMTP服务器</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >SMTP端口</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >Email</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >密码</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >需要验证？</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >SMTP端口</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >发送人</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >发送邮件</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" ><a class="easyui-linkbutton" data-options="iconCls:'icon-edit'" >编辑</a></td>
		<td></td>
	</tr>	
</table>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>