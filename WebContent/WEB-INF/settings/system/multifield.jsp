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
		    <div class="hidden">
				<div id="block" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 232px;">
					<div class="easyui-layout" data-options="fit:true,border:false">
						<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
							<table id="multifield_grid"></table>
						</div>
						<div region="south" class="btnbar" border="false">
							<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitBlock()">确定</a>
							<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('block')">取消</a>
						</div>
					</div>
				</div>
		</div>
	  
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