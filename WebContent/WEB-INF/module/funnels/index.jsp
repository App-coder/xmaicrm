<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/funnels/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div id="tabbar" class="d_view " style="border:1px solid #CCCCCC;" >  
			查找范围：<select><option>所有销售漏斗</option></select>&nbsp;日期：
			<select><option>预计成交日期</option></select>
			<select><option>自定义</option></select>	开始时间：
			<input type="text"  class="text easyui-datebox"  />
			结束时间：<input type="text" class="text easyui-datebox" />&nbsp;<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" >查询</a>
		</div>
		
		<table style="width:100%;" class="tab_def" >
			<tr>
				<td width="50%"><strong>各阶段销售机会数量</strong></td>
				<td width="50%"><strong>各阶段销售机会金额</strong></td>
			</tr>
		</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>