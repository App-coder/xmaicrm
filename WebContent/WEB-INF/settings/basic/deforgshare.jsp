<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "全局共享规则";
var pathActive = "deforgshare";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/deforgshare.js"></script>
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
	<table id="deforgsharelist" data-options="fitColumns:true"></table>
	</td>
</tr>
</table>

</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>