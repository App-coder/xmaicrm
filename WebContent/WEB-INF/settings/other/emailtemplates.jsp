<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "Email模版";
    var pathActive = "emailtemplates";
    
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript" src="resources/desktop/settings/other/emailtemplates.js"></script>
</head>
<body id="wrap">
${navbar }
	<div id="main">
		<div class="hidden">
			<div id="emailtemplatesedit" class="easyui-window" <%=win_topbar%> style="width: 700px; height: 432px;" >
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<form id="form_emailemplates" method="post">
								<input type="hidden" name="body" />
								<table class="tab_form">
									<tr>
										<td colspan="4">
											<fieldset>
												<legend>基本信息</legend>
												<table class="tab_form">
													<tr>
														<td width="18%" class="edittd3">名称</td>
														<td width="32%"><input type="text" name="userName" class="text3 easyui-validatebox" required="true" /></td>
														<td width="18%" class="edittd3">描述</td>
														<td width="32%"><input type="text" name="userName" class="text3 easyui-validatebox" required="true" /></td>
													</tr>
												</table>
											</fieldset>
										</td>
									</tr>
									<tr>
										<td colspan="4">
											<fieldset>
												<legend>Email模版</legend>
												<table class="tab_form">
													<tr>
														<td width="33%" >步骤 1. 选择字段类型</td>
														<td width="33%" >步骤 2. 选择字段 </td>
														<td width="33%" >步骤 3. 复制&粘贴 </td>
													</tr>
													<tr>
														<td><select class="text3"></select></td>
														<td><select class="text3"></select></td>
														<td><select class="text3"></select></td>
													</tr>
													<tr>
														<td>主题</td>
														<td colspan="2"></td>
													</tr>
													<tr>
														<td colspan="3"><input type="text" class="text3"/></td>
													</tr>
													<tr>
														<td colspan="3">
															<textarea name="bodyHtml" style="width:100%;visibility:hidden;height:350px;"></textarea>
														</td>
													</tr>
												</table>
											</fieldset>
										</td>
									</tr>
								</table>
						</form>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_emailemplates')">编辑</a>
							<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('emailtemplatesedit')">取消</a>
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
				<td valign="top">
				<table id="emailtemplates_list"></table>
				</td>
			</tr>
			</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>