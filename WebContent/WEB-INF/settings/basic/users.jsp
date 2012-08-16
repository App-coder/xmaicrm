<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "系统用户";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/users.js"></script>
</head>
<body id="wrap">
	<%@ include file="../../nav.jsp"%>
	<div id="main">
		<div class="hidden">
			<div id="useredit" class="easyui-window" <%=win_topbar%> style="width: 700px; height: 432px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px; background: #fff;">
						<input type="hidden" value="" name="todo"/>
						<form id="form_add" name="form_add" method="post" class="hidden">
							<input type="hidden" name="action" value="add"/>
							<input type="hidden" name="id"/>
							<table class="tab_form">
								<tr>
									<td width="18%" class="edittd3">用户名</td>
									<td width="32%"><input type="text" name="userName" class="text3 easyui-validatebox" required="true" /></td>
									<td width="18%" class="edittd3">管理员</td>
									<td width="32%"><input type="checkbox" name="isAdmin" value="on"  /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">密码</td>
									<td width="32%"><input type="password" class="text3 easyui-validatebox" name="userPassword" required="true" /></td>
									<td width="18%" class="edittd3">状态</td>
									<td width="32%"><select name="status" class="text3">
										${userstatus }
									</select></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3"  >确认密码</td>
									<td width="32%"><input type="password" name="confirmPassword" class="text3 easyui-validatebox" required="true" /></td>
									<td width="18%" class="edittd3">角色</td>
									<td width="32%"><input id="roleid" name="roleid"
										class="easyui-combotree"
										data-options="url:'settings/role/getRoleTree',required:true"
										style="width: 190px;"></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">姓名</td>
									<td width="32%"><input type="text" name="lastName" class="text3 easyui-validatebox" required="true" /></td>
									<td width="18%" class="edittd3">电话</td>
									<td width="32%"><input type="text" name="phoneWork" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">Email</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="email1" required="true"/></td>
									<td width="18%" class="edittd3">手机</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="phoneMobile" required="true" /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">部门</td>
									<td width="32%"><input class="easyui-combobox"
										name="groupid"
										data-options="
										url:'settings/group/getCombox',
										valueField:'id',
										textField:'text',
										panelHeight:'auto',
										required:true,
										editable:false
										" width="190px"></td>
									<td colspan="2"></td>
								</tr>
							</table>
						</form>
						<form id="form_edit" name="form_edit" method="post" class="hidden">
							<input type="hidden" name="action" value="update"/>
							<input type="hidden" name="id"/>
							<table class="tab_form">
								<tr>
									<td width="18%" class="edittd3">用户名</td>
									<td width="32%"><input type="text" name="userName" class="text3 easyui-validatebox" required="true" /></td>
									<td width="18%" class="edittd3">管理员</td>
									<td width="32%"><input type="checkbox" name="isAdmin" value="on"  /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">Email</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="email1" required="true"/></td>
									<td width="18%" class="edittd3">状态</td>
									<td width="32%"><select name="status" class="text3">
										${userstatus }
									</select></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">姓名</td>
									<td width="32%"><input type="text" name="lastName" class="text3 easyui-validatebox" required="true" /></td>
									<td width="18%" class="edittd3">角色</td>
									<td width="32%"><input id="roleid" name="roleid"
										class="easyui-combotree"
										data-options="url:'settings/role/getRoleTree',required:true"
										style="width: 190px;"></td>
								</tr>
								<tr>
									
									<td width="18%" class="edittd3">电话</td>
									<td width="32%"><input type="text" name="phoneWork" class="text3 easyui-validatebox" required="true"/></td>
									<td width="18%" class="edittd3">手机</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="phoneMobile" required="true" /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">部门</td>
									<td width="32%"><input class="easyui-combobox"
										name="groupid"
										data-options="
										url:'settings/group/getCombox',
										valueField:'id',
										textField:'text',
										panelHeight:'auto',
										required:true,
										editable:false
										" width="190px"></td>
									<td colspan="2"></td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitUser()">编辑</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('useredit')">取消</a>
					</div>
				</div>
			</div>
		</div>
		<div class="path" id="navpath"></div>
		<table id="user_list"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>