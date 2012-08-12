<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "SMTP服务器 ";
var pathActive = "system";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/other/system.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">

<table style="width:100%;">
<tr>
	<td width="160px" valign="top">
		<%@ include file="../../nav_setting.jsp"%>
	</td>
	<td valign="top">
	<div class="path" id="navpath"></div>
	<form id="form_email" method="post" >
<input type="hidden" name="id" value="${smtp.id }"/>
<input type="hidden" name="serverType"  value="${smtp.serverType }" />
<table class="tab_editlist">
	<tr>
		<td class="edittd" >SMTP服务器</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="server" value="${smtp.server }" /></td>
	</tr>
	<tr>
		<td class="edittd" >SMTP端口</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="serverPort" value="${smtp.serverPort }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >Email</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="serverUsername" value="${smtp.serverUsername }" /></td>
	</tr>
	<tr>
		<td class="edittd" >密码</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="serverPassword" value="${smtp.serverPassword }" /></td>
	</tr>
	<tr>
		<td class="edittd" >需要验证？</td>
		<td>
		<c:if test="${smtp.smtpAuth == true }">
			<input type="checkbox" name="smtpAuth" checked="checked" />是
		</c:if>
		<c:if test="${smtp.smtpAuth == false }">
			<input type="checkbox" name="smtpAuth" />是
		</c:if>
		</td>
	</tr>
	<tr>
		<td class="edittd" >发送人</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" name="fromName" value="${smtp.fromName }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >发送邮件</td>
		<td><input type="text" class="text easyui-validatebox" name="fromEmail" value="${smtp.fromEmail }" /></td>
	</tr>	
	<tr>
		<td class="edittd" ><a class="easyui-linkbutton" data-options="iconCls:'icon-edit'" href="javascript:formsubmit('form_email')" >编辑</a></td>
		<td></td>
	</tr>	
</table>
</form>
	</td>
</tr>
</table>

</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>