<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<%@ include file="common/config.jsp"%>
<script>
var pathname = "工作台";
</script>
<%@ include file="path.jsp" %>
<!-- portal页面的引用 -->
<link rel="stylesheet" type="text/css" href="resources/plugins/portal/portal.css">
<script type="text/javascript" src="resources/plugins/portal/jquery.portal.js"></script>
<script type="text/javascript" src="resources/desktop/desktop.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main" >
<div class="path" >&gt;<a  href="crm/module/home/index">工作台</a></div>
<div id="desktop" >
		 <div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${vs.index%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<iframe frameborder="0" width="100%" height="100%" src="crm/portlets/${stuff.stufftype }/index"></iframe>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+2)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<iframe frameborder="0" width="100%" height="100%" src="crm/portlets/${stuff.stufftype }/index"></iframe>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:34%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+1)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<iframe frameborder="0" width="100%" height="100%" src="crm/portlets/${stuff.stufftype }/index"></iframe>
				</div>
			</c:if>
			</c:forEach>
		</div> 
</div>

</div>
<%@ include file="foot.jsp"%>
</body>
</html>