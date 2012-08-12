<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "Email模版";
    var pathActive = "emailtemplates";
    
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript" src="resources/desktop/settings/other/emailtemplates.js"></script>
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
				<table id="emailtemplates_list"></table>
				</td>
			</tr>
			</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>