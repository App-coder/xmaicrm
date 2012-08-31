<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "相关模块字段";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/relmodfield.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div class="path" id="navpath"></div>

<table id="relmodfield"  toolbar="#relmodfield_tb" ></table>
<div id="relmodfield_tb" class="gtb" style="display: block;" >  
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