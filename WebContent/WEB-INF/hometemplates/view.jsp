<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<script>
var pathname = "组件模版预览";
var pArgs = "${hometemplates.hometemplatesname}";
</script>
<%@ include file="../path.jsp" %>

<script type="text/javascript" src="resources/fusionchart/FusionCharts.js"></script>
<!-- portal页面的引用 -->
<link rel="stylesheet" type="text/css" href="resources/plugins/portal/portal.css">
<script type="text/javascript" src="resources/plugins/portal/jquery.portal.js"></script>
<script type="text/javascript" src="resources/desktop/desktop.js"></script>
<link rel="stylesheet" type="text/css" href="resources/portlets.css">

<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
<script type="text/javascript" src="resources/desktop/portlets/${stuff.stufftype }.js"></script>
</c:forEach>

</head>
<body id="wrap">
${navbar }
<div id="main" >
<div id="navpath" class="path"></div>
<div id="desktop" >
		 <div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${vs.index%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					${stuff.stufftitle }
					<%@ include file="../portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+2)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					${stuff.stufftitle }
					<%@ include file="../portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:34%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+1)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					${stuff.stufftitle }
					<%@ include file="../portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div> 
</div>
</div>
<%@ include file="../foot.jsp"%>
</body>
</html>