<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "多仓库管理";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/other/cangkus.js"></script>
</head>
<body id="wrap">
	<%@ include file="../../nav.jsp"%>
	<div id="main">
		<div class="hidden">
			<div id="cangkus" class="easyui-window" <%=win_topbar%>
				style="width: 700px; height: 432px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false"
						style="padding: 10px;">
						<form id="form_cangkus" name="form_cangkus" method="post" class="hidden">
						
						
						</form>
						</div>
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok" onclick="formsubmit('form_cangkus')">编辑</a>
					<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('cangkus')">取消</a>
				</div>
			</div>
		</div>
		<div class="path" id="navpath"></div>
		<table id="cangkus_list"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>