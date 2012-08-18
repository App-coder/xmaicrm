<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "公司信息管理 ";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/other/organizationconfig.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<form id="form_organization" name="form_organization" method="post" >
<input type="hidden" name="logo" value="${details.logo }" />
<table class="tab_editlist">
	<tr>
		<td class="edittd" >公司名称</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true" value="${details.organizationname }" /></td>
	</tr>
	<tr>
		<td class="edittd" >LOGO名称</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.logoname }" /></td>
	</tr>
	<tr>
		<td class="edittd" >LOGO</td>
		<td><input type="file" id="logo" class="text easyui-validatebox"  size="30" /></td>
	</tr>
	<tr>
		<td></td>
		<td>
			<img class="grayborder" width="150" height="29" src="${details.logo }">
		</td>
	</tr>	
	<tr>
		<td class="edittd" >地址</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.address }" /></td>
	</tr>
	<tr>
		<td class="edittd" >城市</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.city }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >省份</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.state }"/></td>
	</tr>	
	<tr>
		<td class="edittd" >邮编</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.code }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >国家</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.country }" /></td>
	</tr>		
	<tr>
		<td class="edittd" >电话</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.phone }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >传真</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.fax }"  /></td>
	</tr>	
	<tr>
		<td class="edittd" >网站</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.website }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >法定代表人</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.person }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >开户银行</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.bankname }" /></td>
	</tr>	
	<tr>
		<td class="edittd" >银行帐号</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.bankaccount }"/></td>
	</tr>	
	<tr>
		<td class="edittd" >税号</td>
		<td><input type="text" class="text easyui-validatebox" data-options="required:true"  value="${details.taxno }"/></td>
	</tr>	
	<tr>
		<td class="edittd" ><a class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="organizationSubmit()" >编辑</a></td>
		<td></td>
	</tr>
</table>
</form>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>