<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<table >
		     <tr>
				<td align="center">
				<img border="0" src="resources/images/module/bsteps/pur_01.jpg"><br>
				<img border="0" src="resources/images/module/bsteps/pur_02.jpg"><br>
				<img border="0" usemap="#Map" src="resources/images/module/bsteps/pur_03.jpg">
				</td>
				<td></td>
			 </tr>
			 <tr class="lvtColDataHover">
				<td align="center">
				</td>
			  </tr>
		</table>
		<map id="Map" name="Map">
			<area href="crm/module/purchaseorder/index?ptb=-1" coords="135, 30, 225, 130" shape="rect">
			<area href="crm/module/charges/index?ptb=-1" coords="560, 30, 640, 130" shape="rect">
		</map>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>