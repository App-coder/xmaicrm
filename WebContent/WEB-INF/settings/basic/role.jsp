<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "角色权限";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/role.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="hidden">
			<div id="roleedit" class="easyui-window" <%=win_topbar%>
				style="width: 700px; height: 432px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<fieldset class="mgb_10">
							<legend>全局权限 </legend>
							<table class="tab_form">
								<tr>
									<td><input type="checkbox" />查看下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。</td>
								</tr>
								<tr>
									<td><input type="checkbox" />编辑下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。</td>
								</tr>
							</table>
						</fieldset>
						<fieldset class="mgb_10" >
							<legend>模块权限 </legend>
							<table class="tabauth " id="tabRoleAuth" >
								<thead>
								<tr class="datagrid-header">
									<td width="16%">模块名称 </td>
									<td width="16%">新增</td>
									<td width="16%">编辑</td>
									<td width="16%">查看</td>
									<td width="16%">删除</td>
									<td width="16%">字段/工具</td>
								</tr>
								</thead>
								<tbody>
										
								</tbody>
							</table>
						</fieldset>
						</div>
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitUser()">编辑</a>
					<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('useredit')">取消</a>
				</div>
			</div>
		</div>
		<div class="path" id="navpath"></div>
		<table id="rolelist"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>