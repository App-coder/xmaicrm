<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "部门机构";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/group.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="hidden">
	<div id="groupedit" class="easyui-window" <%=win_topbar%> style="width: 400px; height:247px;">
			<div class="easyui-layout" data-options="fit:true,border:false">
				<div data-options="region:'center',border:false"
						style="padding: 10px; background: #fff;">
						<form id="form_group" method="post" name="form_group">
							<input type="hidden" name="action" />
							<input type="hidden" name="groupid" />
							<table class="tab_form">
									<tr>
										<td width="39%" class="edittd3" >
											部门
										</td>
										<td width="61%">
										<input type="text" name="groupname" class="text3 easyui-validatebox" required="true" />
										</td>
									</tr>
									<tr>
										<td width="39%" class="edittd3" >
											描述
										</td>
										<td width="61%">
										<input type="text" name="description" class="text3 easyui-validatebox" required="true" />
										</td>
									</tr>
							</table>						
						</form>
				</div>
				<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_group')">编辑</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('groupedit')">取消</a>
				</div>
			</div>
	</div>
</div>
<div class="path" id="navpath"></div>
<table id="grouplist" data-options="fitColumns:true"></table>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>