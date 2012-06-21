<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "相关信息模块字段";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/relmodfield.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
    <div class="hidden">
			<div id="relmodfield_window" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 150px;">
			   <table class="layerHeadingULine" width="100%" cellspacing="0" cellpadding="5" border="0">
				<tbody>
				<tr>
				<td id="gather_div_title" class="layerPopupHeading" nowrap="" align="left">相关信息</td>
				<td align="right">
				</tr>
				</tbody>
			   </table>
			   <table id="preTable"  width="100%" cellspacing="0" cellpadding="5" border="0" bgcolor="white">
			   </table>
			</div>
	</div>

    <div class="path" id="navpath"></div>
	<div id="relmodfield_tb" class="d_view" style="display: block;">
		<span>选择模块：</span> <select class="tipt" id="selectRelmodfield"
			onchange="reloadview(this.value)">
			<c:forEach items="${modules}" var="m">
				<option value="${m.name};${m.tabid}">${m.tablabel}</option>
			</c:forEach>
		</select>
		<a class="easyui-linkbutton"  onclick="javascript:editRelmodField()"
		 data-options="plain:true,iconCls:'icon-edit'">修改</a>
		 <a class="easyui-linkbutton"  onclick="javascript:previewRelmodTable()"
		 data-options="plain:true,iconCls:'icon-edit'">预览</a>
	</div>
	<div class="d_center">
      <table class="midtab" id="relmodfield_grid" toolbar="relmodfield_tb"></table>
    </div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>