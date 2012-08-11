<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "角色权限";
    var pathActive = "role";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/role.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="hidden">
			
			<!-- 查看关联用户 -->
			<div id="reluser" title="关联的用户" class="easyui-window" <%=win_topbar%>
				style="width: 700px; height: 432px;">
					<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<table id="tb_reluser"></table>
						</div>
					</div>
			</div>
			
			<div id="roleinfo" title="编辑角色信息" class="easyui-window" <%=win_topbar%>
				style="width: 700px; height: 432px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<table class="tab_form">
							<tr>
								<td class="edittd">上级角色</td>
								<td><input class="easyui-combobox"
										name="groupid"
										data-options="
										url:'crm/settings/role/getRoleTree',
										valueField:'id',
										textField:'text',
										panelHeight:'auto',
										required:true,
										editable:false
										" width="190px"></td>
							</tr>
							<tr>
								<td class="edittd">角色名称</td>
								<td><input type="text" class="text" /><span class="must">*</span>
								</td>
							</tr>
							<tr>
								<td class="edittd">描述</td>
								<td><textarea></textarea></td>
							</tr>
						</table>
					</div>
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('customview_edit')">取消</a>
				</div>
			</div>
			
			
		</div>
		<div class="path" id="navpath"></div>
		
		<table style="width:100%;">
			<tr>
				<td width="160px" valign="top">
					<%@ include file="../../nav_setting.jsp"%>
				</td>
				<td valign="top"><table id="rolelist"></table></td>
			</tr>
		</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>