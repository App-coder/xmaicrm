<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "系统用户";
    var pathActive = "users";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/users.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="hidden">
			<div id="useredit" class="easyui-window" <%=win_topbar%> style="width: 600px; height: 370px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
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
										data-options="url:'crm/settings/role/getRoleTree',required:true"
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
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="email1" data-options="validType:'email'"  required="true"/></td>
									<td width="18%" class="edittd3">手机</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="phoneMobile" required="true" /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">部门</td>
									<td width="32%"><input class="easyui-combobox"
										name="groupid"
										data-options="
										url:'crm/settings/group/getCombox',
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
									<td width="32%"><input type="text" name="userName" class="text3 easyui-validatebox" required="true" readonly="readonly" /></td>
									<td width="18%" class="edittd3">管理员</td>
									<td width="32%"><input type="checkbox" name="isAdmin"  /></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">Email</td>
									<td width="32%"><input type="text" class="text3 easyui-validatebox" name="email1" data-options="validType:'email'" required="true"/></td>
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
										data-options="url:'crm/settings/role/getRoleTree',required:true"
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
			
			<div id="userview" title="用户预览" class="easyui-window" <%=win_topbar%> style="width: 600px; height: 370px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<form name="formview" id="formview">
							<input type="hidden" id="id" />
							<table class="tab_form">
									<tr>
										<td width="18%" class="edittd3">用户名</td>
										<td width="32%"><span id="userName"></span></td>
										<td width="18%" class="edittd3">密码</td>
										<td width="32%"><a class="easyui-linkbutton" iconCls="icon-edit" onclick="updatePwd()" >修改密码</a></td>
									</tr>
									<tr>
										<td width="18%" class="edittd3">管理员</td>
										<td width="32%"><span id="isAdmin"></span></td>
										<td width="18%" class="edittd3">状态</td>
										<td width="32%"><span id="status"></span></td>
									</tr>
									<tr>
										<td width="18%" class="edittd3">姓名</td>
										<td width="32%"><span id="lastName"></span></td>
										<td width="18%" class="edittd3">角色</td>
										<td width="32%"><span id="roleid"></span></td>
									</tr>
									<tr>
										<td width="18%" class="edittd3">电话</td>
										<td width="32%"><span id="phoneWork"></span></td>
										<td width="18%" class="edittd3">Email</td>
										<td width="32%"><span id="email1"></span></td>
									</tr>
									<tr>
										<td width="18%" class="edittd3">手机</td>
										<td width="32%"><span id="phoneMobile"></span></td>
										<td width="18%" class="edittd3">部门</td>
										<td width="32%"><span id="groupid"></span></td>
									</tr>
							</table>
						</form>						
					</div>
				</div>
			</div>
			
			<div id="editpassword" title="修改密码" class="easyui-window" <%=win_topbar%> style="width: 300px; height: 175px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
							<form id="formpass" name="formpass" method="post"  >
							<input type="hidden" name="id" id="id" />
							<table class="tab_form">
									<tr>
										<td width="18%" class="edittd3">新密码</td>
										<td width="32%"><input type="password" name="userPassword" class="text3 easyui-validatebox" required="true" /></td>
									</tr>
									<tr>
										<td width="18%" class="edittd3">确认密码</td>
										<td width="32%"><input type="password" name="confirmPassword" class="text3 easyui-validatebox" required="true" /></td>
									</tr>
							</table>
							</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="updatePwdDo()">编辑</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('editpassword')">取消</a>
					</div>
				</div>
			</div>
			
			
		</div>
		<div class="path" id="navpath"></div>
		<table style="width:100%;">
			<tr>
				<td width="160px" valign="top">
					<%@ include file="../../nav_setting.jsp"%>
				</td>
				<td valign="top"><table id="user_list"></table></td>
			</tr>
		</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>