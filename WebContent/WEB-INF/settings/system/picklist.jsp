<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname ='下拉框选项';
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/picklist.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
    <div class="hidden">
			<div id="picklist" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 292px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_picklist" name="form_picklist" method="post">
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr id="picklist">
										<td class="dataLabel" valign="top" nowrap="nowrap" align="right">
										<b>下拉框列表值: </b>
										</td>
										<td valign="top" align="left">
										<textarea class="fldPickList" rows="15" name="fldPickList"></textarea>
										</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitPicklist()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('picklist')">取消</a>
					</div>
				</div>
			</div>
		</div>

    <div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择CRM模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <table id="picklist_datagrid" class="easyui-datagrid"
        rownumbers="true" pagination="true">  
    </table> 
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>