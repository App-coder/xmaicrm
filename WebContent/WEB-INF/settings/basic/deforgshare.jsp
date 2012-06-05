<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "全局共享规则";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/deforgshare.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<table id="deforgsharelist" data-options="fitColumns:true"></table>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>