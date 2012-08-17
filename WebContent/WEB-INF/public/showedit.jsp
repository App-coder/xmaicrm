<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
</head>
<body id="wrap">
<%@ include file="../nav.jsp"%>
<div id="main">

<c:forEach items="${blocks }" var="b">
<fieldset>
	<legend>${b.blocklabel }</legend>
	<table class="tab_form" >
	<tr>
		<td>sdf</td><td>sdf</td>
	</tr>
</table>
</fieldset>
</c:forEach>

</div>
<%@ include file="../foot.jsp"%>
</body>
</html>