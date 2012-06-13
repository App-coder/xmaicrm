<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname ='页面布局';
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/layoutlist.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
    <div class="hidden">
			<div id="layoutlist" class="easyui-window" <%=win_topbar%> style="width: 400px; height: 252px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_layout" name="form_layout" method="post">
						<input type="hidden" name="fieldid"/>
						<input type="hidden" name="typeofdata"/>
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>字段标签: </b>
										</td>
										<td width="70%" align="left">
										<input type="text" name="fieldlabel" value="" style="width:150px" />
										</td>
								</tr>
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>显示区域: </b>
										</td>
										<td width="70%" align="left">
										<select id="block" name="block" style="width:150px">  
									    </select>  
										</td>
								</tr>
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>是否必填: </b>
										</td>
										<td width="70%" align="left">
										<input type="checkbox" name="_typeofdata"/>
										</td>
								</tr>
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>显示顺序: </b>
										</td>
										<td width="70%" align="left">
										<input type="text" name="sequence" value="" style="width:150px" />
										</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitLayoutlist()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('layoutlist')">取消</a>
					</div>
				</div>
			</div>
	</div>

    <div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择CRM模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <div class="d_center" id="cfList">
    
    </div>


</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>