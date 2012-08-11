<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<script>
    var pathname = "Email模版";
    var pathActive = "emailtemplates";
    
</script>
<%@ include file="../../../path.jsp"%>
<script charset="utf-8" src="resources/plugins/kindeditor/kindeditor.js"></script>
<script charset="utf-8" src="resources/plugins/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript"
	src="resources/desktop/settings/other/emailtemplates/showAdd.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<table style="width: 100%;">
			<tr>
				<td width="160px" valign="top"><%@ include
						file="../../../nav_setting.jsp"%></td>
				<td valign="top">
					<div class="path" id="navpath"></div>
					<form id="form_emailemplates" method="post">
						<input type="hidden" name="body" />
						<table class="tab_editlist">
							<tr>
								<td class="edittd">名称</td>
								<td><input type="text" class="text easyui-validatebox"
									data-options="required:true" name="organizationname"/></td>
									<td class="edittd">描述</td>
								<td><input type="text" class="text easyui-validatebox"
									data-options="required:true" name="organizationname" /></td>
							</tr>
							<tr>
								<td colspan="4" class="edittd">
								<span class="red">合并字段：使用您的个性化模版．您可以新增替换文字去合并任何字段。步骤 1. 选择字段类型，步骤 2. 选择字段 ，步骤 3. 复制&粘贴</span> 
								</td>
							</tr>
							<tr>
							<td class="edittd">步骤1</td>
								<td><select class="text"><option></option></select></td>
									<td class="edittd">步骤2</td>
								<td><select class="text"><option></option></select></td>
							</tr>
							<tr>
								<td class="edittd">步骤3</td>
								<td><input type="text" class="text easyui-validatebox"
									data-options="required:true" name="organizationname"/></td>
								<td colspan="2"></td>
							</tr>
							<tr>
								<td colspan="4">
									<textarea name="bodyHtml" style="width: 100%; visibility: hidden; height: 350px;"></textarea>
								</td>
							</tr>
						</table>
						<div class="bbar ">
							<a class="easyui-linkbutton" iconCls="icon-ok"
								onclick="submitRole()">添加</a> <a class="easyui-linkbutton"
								iconCls="icon-cancel" onclick="closeWin('roleadd')">取消</a>
						</div>
					</form>
				</td>
			</tr>
		</table>

	</div>
	<%@ include file="../../../foot.jsp"%>
</body>
</html>