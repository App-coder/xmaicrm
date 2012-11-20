<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "关联产品字段";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/productfield.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
    <div class="hidden">
			<div id="productfield_window" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 150px;">
			   <table class="layerHeadingULine" width="100%" cellspacing="0" cellpadding="5" border="0">
				<tbody>
				<tr>
				<td id="gather_div_title" class="layerPopupHeading" nowrap="" align="left">产品详细信息</td>
				<td align="right">
				</tr>
				</tbody>
			   </table>
			   <table id="preTable"  width="100%" cellspacing="0" cellpadding="5" border="0" bgcolor="white">
			   </table>
			</div>
	</div>

    <div class="path" id="navpath"></div>
	<div id="productfield_tb" class="d_view" style="display: block;">
		<span>选择模块：</span> <select class="tipt" id="selectproduct"
			onchange="reloadGrid(this.value)">
			<c:forEach items="${modules }" var="m">
				<option value="${m.name}">${m.tablabel}</option>
			</c:forEach>
		</select>
		<a class="easyui-linkbutton"  onclick="javascript:editProductField()"
		 data-options="plain:true,iconCls:'icon-edit'">修改</a>
		 <a class="easyui-linkbutton"  onclick="javascript:previewProductTable()"
		 data-options="plain:true,iconCls:'icon-edit'">预览</a>
	</div>
	<div class="d_center">
      <table class="midtab" id="productfield_grid" toolbar="#productfield_tb"></table>
    </div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>