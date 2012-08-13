<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "自定义共享规则";
var pathActive = "customsharings";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/customsharings.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
	
			<table style="width:100%;">
			<tr>
				<td width="160px" valign="top">
					<%@ include file="../../nav_setting.jsp"%>
				</td>
				<td valign="top">
					<div class="path" id="navpath"></div>
					<table id="customsharingslist" toolbar="#customsharing_tb"></table>
					<div id="customsharing_tb" class="gtb" style="display: block;">
						<span>选择模块：</span> <select class="tipt" id="selectmodule"
							onchange="reloadGrid(this.value)">
							<option value="">--&nbsp;无&nbsp;--</option>
							<c:forEach items="${sharemodule }" var="m">
								<option value="${m.tabid }">${m.tablabel }</option>
							</c:forEach>
						</select> <a href="" class="easyui-linkbutton"
							data-options="plain:true,iconCls:'icon-add'">添加</a> <a href=""
							class="easyui-linkbutton"
							data-options="plain:true,iconCls:'icon-edit'">修改</a> <a href=""
							class="easyui-linkbutton"
							data-options="plain:true,iconCls:'icon-remove'">删除</a>
					</div>
				</td>
			</tr>
			</table>

	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>