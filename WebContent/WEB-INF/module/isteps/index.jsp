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
		<table width="780" border="0">
			<tbody>
				<tr>
					<td align="center"><img border="0"
						src="resources/images/module/isteps/inv_01.jpg"><br> <img
						border="0" src="resources/images/module/isteps/inv_02.jpg"><br>
						<img border="0" usemap="#Map"
						src="resources/images/module/isteps/inv_03.jpg"></td>
					<td></td>
				</tr>
				<tr class="lvtColDataHover">
					<td align="center"><font size="5"><b></b></font></td>
				</tr>
			</tbody>
		</table>
		<map id="Map" name="Map">
			<area
				href=crm/module/warehouses/index?ptb=-1
				coords="235, 30, 320, 130" shape="rect">
			<area
				href="crm/module/deliverys/index?ptb=-1"
				coords="480, 30, 565, 130" shape="rect">
		</map>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>