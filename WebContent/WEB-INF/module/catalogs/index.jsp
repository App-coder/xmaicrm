<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/catalogs/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden">
				<div id="catalogs_edit" iconCls="icon-save"
			style="width: 400px; height: 247px;" class="easyui-window"
			<%=win_topbar%> >
				
			</div>
	</div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<table id="catalogs_list" data-options="fitColumns:true"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>