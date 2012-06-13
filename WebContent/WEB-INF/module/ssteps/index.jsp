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
			<tbody><tr><td align="center"><img border="0" src="resources/images/module/ssteps/sal_01.jpg"><br>
			<img border="0" src="resources/images/module/ssteps/sal_02.jpg"><br>
			<img border="0" usemap="#Map" src="resources/images/module/ssteps/sal_03.jpg">
			</td><td></td></tr>
			<tr class="lvtColDataHover">
			<td align="center"><font size="5"><b></b></font></td>
			</tr>
			</tbody></table>
			<map id="Map" name="Map">
		<area href="crm/module/potentials/index?ptb=-1" coords="140, 8, 220, 100" shape="rect">
		<area href="crm/module/salesorder/index?ptb=-1" coords="360, 8, 440, 100" shape="rect">
		<area href="crm/module/invoice/index?ptb=-1" coords="565, 8, 645, 100" shape="rect">
		</map>
		</div>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>