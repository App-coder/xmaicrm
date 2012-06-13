<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<script>
    var pathname = "Email模版预览";
    var pathActive = "emailtemplates";
    
</script>
<%@ include file="../../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/other/emailtemplates/show.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<table style="width: 100%;">
			<tr>
				<td width="160px" valign="top"><%@ include
						file="../../../nav_setting.jsp"%></td>
				<td valign="top">
					<div class="path" id="navpath"></div>
					<table class="tab_view">
						<tr>
							<td class="label" >名称</td><td>${templates.templatename }</td>
						</tr>
						<tr>
							<td class="label" >描述</td><td>${templates.description }</td>
						</tr>
						<tr>
							<td colspan="2" class="label"  >
								Email模版
							</td>
						</tr>
						<tr>
							<td class="label" >主题</td><td>${templates.subject }</td>
						</tr>
						<tr>
							<td class="label" valign="top" >模版内容</td><td>${templates.body }</td>
						</tr>
					</table>
				</td>
				</tr>
		</table>
	</div>
	<%@ include file="../../../foot.jsp"%>
</body>
</html>	