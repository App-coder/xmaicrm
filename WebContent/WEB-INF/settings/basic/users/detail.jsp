<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<script>
    var pathname = "帐号&设置";
    
    var detail = ${login};
</script>
<%@ include file="../../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/users/detail.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="hidden">
			<div id="editpassword" title="修改密码" class="easyui-window" <%=win_topbar%> style="width: 300px; height: 175px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
							<form id="formpass" name="formpass" method="post"  >
							<input type="hidden" name="id" id="id" />
							<table class="tab_form">
									<tr>
										<td  class="edittd3">新密码</td>
										<td><input type="password" name="userPassword" class="text3 easyui-validatebox" required="true" /></td>
									</tr>
									<tr>
										<td  class="edittd3">确认密码</td>
										<td><input type="password" name="confirmPassword" class="text3 easyui-validatebox" required="true" /></td>
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
			<form name="formview" id="formview">
							<input type="hidden" id="id" />
							<table class="tab_view">
									<tr>
										<td class="label">用户名</td>
										<td class="info"><span id="userName"></span></td>
										<td class="label">密码</td>
										<td class="info"><a class="easyui-linkbutton" iconCls="icon-edit" onclick="updatePwd()" >修改密码</a></td>
									</tr>
									<tr>
										<td class="label">管理员</td>
										<td ><span id="isAdmin"></span></td>
										<td class="label">状态</td>
										<td ><span id="status"></span></td>
									</tr>
									<tr>
										<td class="label">姓名</td>
										<td ><span id="lastName"></span></td>
										<td class="label">角色</td>
										<td ><span id="roleid"></span></td>
									</tr>
									<tr>
										<td class="label">电话</td>
										<td ><span id="phoneWork"></span></td>
										<td class="label">Email</td>
										<td ><span id="email1"></span></td>
									</tr>
									<tr>
										<td class="label">手机</td>
										<td ><span id="phoneMobile"></span></td>
										<td class="label">部门</td>
										<td ><span id="groupid"></span></td>
									</tr>
							</table>
							<div class="bbar ">
								<a class="easyui-linkbutton" iconCls="icon-ok" onclick="showupdate()">编辑</a>
							</div>
						</form>
						<form id="form_edit" name="form_edit" method="post" class="hidden">
							<input type="hidden" name="action" value="update"/>
							<input type="hidden" name="id"/>
							<table class="tab_editlist">
								<tr>
									<td  class="edittd">用户名</td>
									<td><input type="text" name="userName" class="text3 easyui-validatebox" required="true" readonly="readonly" /></td>
									<td  class="edittd">管理员</td>
									<td><input type="checkbox" name="isAdmin"  /></td>
								</tr>
								<tr>
									<td  class="edittd">Email</td>
									<td><input type="text" class="text3 easyui-validatebox" name="email1" data-options="validType:'email'" required="true"/></td>
									<td  class="edittd">状态</td>
									<td><select name="status" class="text3">
										${userstatus }
									</select></td>
								</tr>
								<tr>
									<td  class="edittd">姓名</td>
									<td><input type="text" name="lastName" class="text3 easyui-validatebox" required="true" /></td>
									<td  class="edittd">角色</td>
									<td><input id="roleid" name="roleid"
										class="easyui-combotree"
										data-options="url:'crm/settings/role/getRoleTree',required:true"
										style="width: 190px;"></td>
								</tr>
								<tr>
									
									<td  class="edittd">电话</td>
									<td><input type="text" name="phoneWork" class="text3 easyui-validatebox" required="true"/></td>
									<td  class="edittd">手机</td>
									<td><input type="text" class="text3 easyui-validatebox" name="phoneMobile" required="true" /></td>
								</tr>
								<tr>
									<td  class="edittd">部门</td>
									<td><input class="easyui-combobox"
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
							<div class="bbar pl10">
								<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_edit')">编辑</a>
							</div>
						</form>
		
	</div>
	<%@ include file="../../../foot.jsp"%>
</body>
</html>