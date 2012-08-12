<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "数据库备份";
    var pathActive = "dbbackup";
    
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/other/dbbackup.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
	<table style="width: 100%;">
			<tr>
				<td width="160px" valign="top"><%@ include
						file="../../nav_setting.jsp"%></td>
				<td valign="top">
					<div class="path" id="navpath"></div>
					<table id="tablist"></table>
					<fieldset class="mgt_10" >
						<legend>提示</legend>
						如果您的数据量比较小，您可以通过 http://localhost/phpmyadmin/备份和恢复数据库。<br>
						如果您采用不是xampp集成环境，请根据您所用运行环境的工具备份和恢复数据库。<br>
					</fieldset>
				</td>
			</tr>
	</table>
	</div>
		<%@ include file="../../foot.jsp"%>
</body>
</html>	