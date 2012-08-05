<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "货币币种";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/other/currencyinfo.js"></script>
</head>
<body id="wrap">
${navbar }
	<div id="main">
		<div class="hidden">
			<div id="currencyinfo" class="easyui-window" <%=win_topbar%>
				style="width: 500px; height: 309px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<form id="form_currencyinfo" name="form_currencyinfo" method="post" >
							<input type="hidden" name="id"/>
							<input type="hidden" name="defaultid" value="0" />
							<table class="tab_form">
								<tr>
									<td width="39%" class="edittd3">货币名称</td>
									<td width="61%"><input type="text" name="currencyName" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="39%" class="edittd3">货币编码</td>
									<td width="61%"><input type="text" name="currencyCode" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="39%" class="edittd3">货币标志</td>
									<td width="61%"><input type="text" name="currencySymbol" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="39%" class="edittd3">汇率</td>
									<td width="61%"><input type="text" name="conversionRate" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="39%" class="edittd3">状态</td>
									<td width="61%"><select name="currencyStatus" class="text3">
									${asOptions }
									</select></td>
								</tr>
							</table>
						</form>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_currencyinfo')">编辑</a>
							<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('currencyinfo')">取消</a>
						</div>
				</div>
			</div>
		</div>
		<div class="path" id="navpath"></div>
		<table id="currencyinfo_list"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>