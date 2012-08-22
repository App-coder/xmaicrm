<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "显示区域";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/customblock.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
    <div class="hidden">
			<div id="block" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 232px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_block" name="form_block" method="post">
							<input type="hidden" name="blockid"/>
							<input type="hidden" name="action"/>
							<input type="hidden" name="tabid"/>
							<table class="tab_form">
								<tr>
									<td width="18%" class="edittd3">显示区域标题</td>
									<td width="32%"><input type="text" name="blocklabel" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
								<tr>
									<td width="18%" class="edittd3">显示顺序</td>
									<td width="32%"><input type="text" name="sequence" class="text3 easyui-validatebox" required="true"/></td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitBlock()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('block')">取消</a>
					</div>
				</div>
			</div>
		</div>

    <div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <table id="blocklist" class="easyui-datagrid"
        rownumbers="true" pagination="true">  
    </table> 
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>