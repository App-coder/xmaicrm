<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "显示区域";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/customblock.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <table id="blocklist" class="easyui-datagrid"
        rownumbers="true" pagination="true">  
    </table> 
    
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>