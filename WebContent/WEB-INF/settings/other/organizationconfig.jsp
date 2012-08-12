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
<table class="tab_editlist">
	<tr>
		<td class="edittd" >公司名称</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >LOGO名称</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >地址</td>
		<td><input type="text" class="text" /></td>
	</tr>
	<tr>
		<td class="edittd" >城市</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >省份</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >邮编</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >国家</td>
		<td><input type="text" class="text" /></td>
	</tr>		
	<tr>
		<td class="edittd" >电话</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >传真</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >网站</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >法定代表人</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >开户银行</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >银行帐号</td>
		<td><input type="text" class="text" /></td>
	</tr>	
	<tr>
		<td class="edittd" >税号</td>
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