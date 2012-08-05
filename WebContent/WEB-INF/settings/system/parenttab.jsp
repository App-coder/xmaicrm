<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "主菜单";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/parenttab.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div class="hidden" >
	<div id="parenttabedit" class="easyui-window" <%=win_topbar%> style="width:825px; height:510px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<form id="form_parenttab" name="form_parenttab" method="post" >
							<input type="hidden" name="parenttabid"/>
							<input type="hidden" name="tabrel" />
							<input type="hidden" name="visible" />
							<table class="tab_form">
								<tr>
									<td width="39%" class="edittd3">主菜单</td>
									<td width="61%"><input type="text" name="parenttabLabel" class="text3 easyui-validatebox" required="true" /></td>
								</tr>
								<tr>
									<td width="39%" class="edittd3">显示顺序</td>
									<td width="61%"><input type="text" name="sequence" class="text3 easyui-validatebox" required="true" /></td>
								</tr>								
							</table>
							<table class="tab_form">
								<tr>
									<td width="50%">
										<table id="viewmodule"></table>
									</td>
									<td width="50%">
										<table id="allmodule"></table>
									</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_parenttab')">编辑</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('parenttabedit')">取消</a>
					</div>
				</div>
			</div>
</div>
<div class="path" id="navpath"></div>
<table id="parenttab_list"></table>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>