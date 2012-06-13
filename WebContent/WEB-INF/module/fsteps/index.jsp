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
		<div style="width:80%;position:relative;" class="small" id="ListViewContents">
			<table width="780" border="0">
			<tbody><tr><td align="center"><img border="0" usemap="#Map1" src="resources/images/module/fsteps/fi_01.jpg"><br>
			<img border="0" usemap="#Map2" src="resources/images/module/fsteps/fi_02.jpg"><br>
			<img border="0" usemap="#Map3" src="resources/images/module/fsteps/fi_03.jpg">
			</td><td></td></tr>
			<tr class="lvtColDataHover">
			<td align="center"><font size="5"><b></b></font></td>
			</tr>
			</tbody></table>
			<map id="Map1" name="Map1">
			<area href="crm/module/gathers/index?ptb=-1" coords="395, 5, 485, 90" shape="rect">
			</map>
			<map id="Map2" name="Map2">
			<area href="crm/module/charges/index?ptb=-1" coords="570, 15, 655, 105" shape="rect">
			</map>
			<map id="Map3" name="Map3">
			<area href="crm/module/expenses/index?ptb=-1" coords="440, 35, 535, 130" shape="rect">
			</map>
		</div>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>