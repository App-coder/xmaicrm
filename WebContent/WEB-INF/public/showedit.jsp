<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<c:choose>
	<c:when test="${recordid!=null }">
		<script>
			var pathname = "编辑营销活动";
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var pathname = "添加营销活动";
		</script>
	</c:otherwise>
</c:choose>

<%@ include file="../path.jsp" %>
</head>
<body id="wrap">
<%@ include file="../nav.jsp"%>
<div id="main">
<div class="path" id="navpath"></div>
<c:forEach items="${blocks }" var="b">
<fieldset class="mb_10">
	<legend>${b.blocklabel }</legend>
	<table class="tab_form" >
		<tbody>
			<c:forEach items="${fields }" var="f" varStatus="vs" >
				<c:if test="${f.block == b.blockid }">
					<c:if test="${vs.first == true }">
						<tr>
					</c:if>
					<td class="edittd2">
					${f.fieldlabel }
					</td>
					<td>
					<input type="text" class="text2"/>
					</td>
					<c:choose>
						<c:when test="${vs.count%2!=0 &&vs.last == true }" >
						<td></td><td></td></tr>
						</c:when>
						<c:when test="${vs.count%2==0 &&vs.last == true }" >
						</tr>
						</c:when>
						<c:when test="${vs.count%2==0 &&vs.last == false }" >
						</tr>
						</c:when>
					</c:choose>
				</c:if>
			</c:forEach>
		</tbody>
	</table>
</fieldset>
</c:forEach>

</div>
<%@ include file="../foot.jsp"%>
</body>
</html>