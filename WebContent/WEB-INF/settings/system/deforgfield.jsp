<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname = "全局字段";
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/deforgfield.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div class="path" id="navpath"></div>
<div  class="d_view" id="tb" style="display: block;" >  
    <span>选择模块：</span>  
    <select class="tipt" id="selectmodule" onchange="reloadview(this.value)">
    	<c:forEach items="${modules }" var="m">
    		<option value="${m.tabid }">${m.tablabel }</option>
    	</c:forEach>
    </select>
    <span>
      <a class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:submitDeforgFid()">保存</a> 
    </span>
</div>
<div class="d_center">
   <table class="midtab" id="dof_tab" toolbar="#tb"></table>
</div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>