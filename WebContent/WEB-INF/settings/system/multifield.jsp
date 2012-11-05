<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "级联字段";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/system/multifield.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="path" id="navpath"></div>
		<table id="multifieldlist" toolbar="#multifield_tb"></table>
		<div id="multifield_tb" class="gtb" style="display: block;">
			<span>选择模块：</span> <select class="tipt" id="selectmodule"
				onchange="reloadGrid(this.value)">
				<c:forEach items="${modules }" var="m">
					<option value="${m.tabid }">${m.tablabel }</option>
				</c:forEach>
			</select><a href="customview/index?entitytype=${entitytype}"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-add'">添加</a><a
				href="customview/index?entitytype=${entitytype}"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-edit'">修改</a><a
				href="customview/index?entitytype=${entitytype}"
				class="easyui-linkbutton"
				data-options="plain:true,iconCls:'icon-remove'">删除</a>
		</div>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>