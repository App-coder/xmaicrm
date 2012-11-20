<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/module/qunfas/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a href="crm/module/qunfas/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<table id="tablist"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>