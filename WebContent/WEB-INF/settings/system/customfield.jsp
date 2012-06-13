<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "自定义字段";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/customfield.js"></script>
<script type="text/javascript" src="resources/msdropdown/js/jquery.dd.js" ></script>
<link rel="stylesheet" type="text/css" href="resources/msdropdown/dd.css" />
</head>
<body id="wrap">
${navbar }
<div id="main">
    <div class="hidden">
			<div id="customfield" class="easyui-window" <%=win_topbar%> style="width: 700px; height: 432px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_customfield" name="form_customfield" method="post">
						    <input type="hidden" name="queryParams"/>
							<!-- <input type="hidden" name="cfField"/>
							<input type="hidden" name="tabid"/> -->
							<input type="hidden" name="action"/>
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr id="fieldType">
									<td width="18%" class="edittd3">选择字段类型</td>
									<td width="62%">
									  <select id="cfcombo" name="cfcombo" onchange="selFieldType(this.value)"  style="width:240px;">
									     <option value="-1">请选择字段类型</option>
									  </select>
									</td>
								</tr>
								<tr>
									<td class="dataLabel" width="30%" nowrap="nowrap" align="right">
									<b>是否必填: </b>
									</td>
									<td width="70%" align="left">
									<input class="txtBox"  type="checkbox" value="1" name="fldMandatory">
									</td>
								</tr>
								<tr>
									<td class="dataLabel" width="30%" nowrap="nowrap" align="right">
									<b>标签: </b>
									</td>
									<td width="70%" align="left">
									  <input class="txtBox" type="text" value="" name="fldLabel">
									</td>
                                </tr>
                                <tr id="lengthdetails">
									<td class="dataLabel" nowrap="nowrap" align="right">
									<b>长度: </b>
									</td>
									<td align="left">
									<input class="txtBox" type="text" value="" name="fldLength">
									</td>
								</tr>
								<tr id="decimaldetails">
									<td class="dataLabel" nowrap="nowrap" align="right">
									<b>小数点: </b>
									</td>
									<td align="left">
									<input class="txtBox" type="text" value="" name="fldDecimal">
									</td>
								</tr>
								<tr id="picklist">
										<td class="dataLabel" valign="top" nowrap="nowrap" align="right">
										<b>下拉框列表值: </b>
										</td>
										<td valign="top" align="left">
										<textarea class="txtBox" rows="10" name="fldPickList"></textarea>
										</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitCustomField()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('customfield')">取消</a>
					</div>
				</div>
			</div>
		</div>

    <div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <table id="customfieldlist" class="easyui-datagrid"
        rownumbers="true" pagination="true">  
    </table> 
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>