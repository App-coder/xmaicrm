<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript" src="resources/lib/checkvalidate.js"></script> 
<script>
var pathname = "登入历史";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/basic/loginhistory.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<table id="loginlist"  toolbar="#logs_tb" ></table>
<div id="logs_tb" class="gtb" style="display: block;" >  
    <span>选择用户：</span>  
    <select class="tipt" id="selectuser" onchange="reloadGrid(this.value)">
    	<option value="">--&nbsp;无&nbsp;--</option>
    	<c:forEach items="${users }" var="u">
    		<option value="${u.userName }">${u.userName }</option>
    	</c:forEach>
    </select>
</div> 
 
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>