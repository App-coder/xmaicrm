<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<%@ include file="common/config.jsp"%>
<script>
var pathname = "工作台";
</script>
<%@ include file="path.jsp" %>

<script type="text/javascript" src="resources/fusionchart/FusionCharts.js"></script>
<!-- portal页面的引用 -->
<link rel="stylesheet" type="text/css" href="resources/plugins/portal/portal.css">
<script type="text/javascript" src="resources/plugins/portal/jquery.portal.js"></script>
<script type="text/javascript" src="resources/desktop/desktop.js"></script>
<link rel="stylesheet" type="text/css" href="resources/portlets.css">
<script type="text/javascript" src="resources/desktop/portlets.js"></script>

<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
<script type="text/javascript" src="resources/desktop/portlets/${stuff.stufftype }.js"></script>
</c:forEach>

</head>
<body id="wrap">
<div class="hidden" >
	<div id="win_plugtemps" class="easyui-window" <%=win_bar_1 %>
		style="width:700px; height: 432px;">
		<table id="plugtemps"></table>
	</div>
</div>
${navbar }
<div id="main" >
<div class="path" >&gt;<a  href="crm/module/home/index">工作台</a>
<a iconCls="icon-tool" class="easyui-linkbutton fr" onclick="showPlugTempsPanel()">管理组件模版</a>
</div>
<div id="desktop" >
		 <div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${vs.index%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+2)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:34%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+1)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div> 
</div>
</div>
<%@ include file="foot.jsp"%>
</body>
</html>