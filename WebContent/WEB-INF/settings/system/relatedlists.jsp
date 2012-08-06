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
<div class="path" id="navpath"></div>
		<table id="relatedlist" toolbar="#relatedlist_tb"></table>
		<div id="relatedlist_tb" class="gtb" style="display: block;">
			<span>选择模块：</span> <select class="tipt" id="selectrelated"
				onchange="reloadGrid(this.value)">
				<c:forEach items="${modules }" var="m">
					<option value="${m.tabid }">${m.tablabel }</option>
				</c:forEach>
			</select>
			<a href="customview/index?entitytype=${entitytype}"
			class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-edit'">修改</a>
		</div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>