<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "相关信息";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/relatedlists.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
    <div class="hidden">
			<div id="relatedlists_window" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 292px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_relatedlists" name="form_relatedlists" method="post">
						    <input type="hidden" name="presence"/>
						    <input type="hidden" name="relationId"/>
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>相关信息:</b>
										</td>
										<td width="70%" align="left">
										<input type="text" name="label" value="" style="width:150px" />
										</td>
								</tr>
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>显示顺序: </b>
										</td>
										<td width="70%" align="left">
										<input type="text" name="sequence" value="" style="width:150px" />
									    </select>  
										</td>
								</tr>
								<tr>
										<td class="dataLabel" width="30%" valign="top" nowrap="nowrap" align="right">
										<b>是否显示: </b>
										</td>
										<td width="70%" align="left">
										<input type="checkbox" name="_presence"/>
										</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitRelatedlists()">保存</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('relatedlists_window')">取消</a>
					</div>
				</div>
			</div>
		</div>


    <div class="path" id="navpath"></div>
	<table id="relatedlist" toolbar="#relatedlist_tb"></table>
	<div id="relatedlist_tb" class="gtb" style="display: block;">
		<span>选择模块：</span> <select class="tipt" id="selectrelated"
			onchange="reloadGrid(this.value)">
			<c:forEach items="${modules }" var="m">
				<option value="${m.tabid }">${m.tablabel }</option>
			</c:forEach>
		</select>
		<a class="easyui-linkbutton"  onclick="javascript:editRelated()"
		 data-options="plain:true,iconCls:'icon-edit'">修改</a>
	</div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>