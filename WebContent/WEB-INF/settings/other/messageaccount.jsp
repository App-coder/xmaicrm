<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "短信通道";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/users.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div class="path" id="navpath"></div>
<form id="form_messageaccount" method="post" >
<table class="tab_editlist">
	<tr>
		<td class="edittd" >短信账号</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="username" value="${msgaccount.username }" /></td>
	</tr>
	<tr>
		<td class="edittd" >密码</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="password" value="${msgaccount.password }" /></td>
	</tr>
	<tr>
		<td class="edittd" >可发短信条数</td>
		<td><span id="msgcount"></span></td>
	</tr>
	<tr>
		<td class="edittd" ><a class="easyui-linkbutton" data-options="iconCls:'icon-edit'" href="javascript:formsubmit('form_email')" >编辑</a></td>
		<td></td>
	</tr>	
</table>
</form>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>