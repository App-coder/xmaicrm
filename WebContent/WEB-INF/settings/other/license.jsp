<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "授权许可";
var pathActive = "license";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/users.js"></script>
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
	<table class="tab_editlist">
		<tr>
			<td class="edittd" >开始时间</td>
			<td>${starttime }</td>
		</tr>
		<tr>
			<td class="edittd" >结束时间</td>
			<td>${endtime }</td>
		</tr>
	</table>
	</td>
</tr>
</table>


</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>