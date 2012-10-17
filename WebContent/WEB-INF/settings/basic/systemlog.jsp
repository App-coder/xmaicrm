<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "系统日志";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/systemlog.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<table class="tab_form mgb_10">
<tr>
	<td>日志状态：已开启&nbsp;&nbsp;<a class="easyui-linkbutton" data-options="iconCls:'icon-logstop'" >停止</a></td>
</tr>
</table>
<table id="loglist" data-options="fitColumns:true"></table>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>