<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "审批流程";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/system/multiapprove.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
	    <div class="hidden">
			<div id="multiapprove-window" class="easyui-window" <%=win_topbar%> style="width: 720px; height: 502px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_multiapprove" name="form_multiapprove" method="post">
						    <input type="hidden" name="action"/>
							<fieldset>
							<legend class="schart">基本信息</legend>
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr>
									<td class="edittd3" width="15%" align="right">流程名称</td>
									<td  width="35%">
									<input class="easyui-validatebox" required="true" type="text" name="name">
									</td>
									<td class="edittd3" width="15%" align="right">是否激活</td>
									<td  width="35%">
									<select  class="used" name="used">
										<option value="1">激活</option>
										<option value="0" selected="">不激活</option>
									</select>
									</td>
								</tr>
								<tr style="height:25px">
									<td class="edittd3" width="22%" align="right">允许指定下一步审批人</td>
									<td width="85%" colspan="3">
									<select class="userselected" name="userselected" data-options="required:true">
									<option value="0">否</option>
									<option value="1">是</option>
									</select>
									  注意：如果审批人有多个，可以使用此功能，下一步审批人将从下一步审批步骤中指定的审批人中选择，否则请选为"否"。
									</td>
								</tr>
								<tr>
									<td width="15%" align="right">备注</td>
									<td class="dvtCellInfo" width="35%" colspan="3">
									<textarea class="detailedViewTextBox" rows="8" cols="90" name="memo"></textarea>
									</td>
								</tr>
							</table>
						    </fieldset>
						    <div style="margin-top:5px;padding-left:5px;"><a href="javascript:" onclick="toggleAdvOpt();">高级选项</a></div>
						    <fieldset id="advopt" style="margin-bottom: 10px;">
							<legend class="schart">角色信息(所选角色提交的记录将通过当前审批流程审批)</legend>
							<table>
							<tr><td><ul id="role_tree" class="easyui-tree" 
							data-options="url:'crm/settings/role/getRoleTree',required:true,cascadeCheck:false" checkbox="true"></ul></td></tr>
							</table>
							</fieldset>
							<table style="margin-bottom: 10px;">
							<tr><td>
							提示：
							<ul class="small">
							<li>每个模块可以设置多个审批流程，每个用户可以参与多个审批流程，用户提交时单据时可以选择通过哪个审批流程进行审批。</li>
							<li>如果用户没有参与任何一个审批流程，其提交的记录将通过单级审批进行处理。</li>
							</ul>
							</td></tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitMultiApprove()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('multiapprove-window')">取消</a>
					</div>
				</div>
			</div>
		</div>
	
	
		<div class="path" id="navpath"></div>
		<table id="multiapprovelist" toolbar="#multiapprovelist_tb"></table>
		<div id="multiapprovelist_tb" class="gtb" style="display: block;">
			<span>选择模块：</span> <select class="tipt" id="selectmultiapprove"
				onchange="reloadGrid(this.value)">
				<c:forEach items="${modules }" var="m">
					<option value="${m.tabid }">${m.tablabel }</option>
				</c:forEach>
			</select><a onclick="javascript:editRelmodField()"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-add'">编辑审批步骤</a>
				<a onclick="javascript:editRelmodField()"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-add'">添加</a><a
			    onclick="javascript:editMultiApprove()"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-edit'">修改</a><a
				href="customview/index?entitytype=${entitytype}"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-remove'">删除</a>
		</div>
		<table class="listTable small" width="100%" cellspacing="0" cellpadding="5">
		<tbody>
			<tr>
				<td valign="top" nowrap="">
				提示：
				<ul class="small">
				<li>每个模块可以新增多个审批流程，如果没有设置审批流程，审批将是单级审批，记录负责人的上级具有审批权限。</li>
				<li>点击查看审批步骤可以新增和修改审批步骤，每个审批流程可以具有多个审批步骤，步骤数量没有限制。</li>
				<li>如果记录正在通过审批流程处理，那么所在的审批流程将不能修改和删除。</li>
				</ul>
				</td>
			</tr>
		</tbody>
		</table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>