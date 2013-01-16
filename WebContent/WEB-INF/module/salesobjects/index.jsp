<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/salesobjects/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div id="tabbar" class="d_view "  >  
			查找范围：<select><option>所有销售目标</option></select>&nbsp;年份：
			<select><option>2009</option></select>销售指标：
			<select><option>销售额</option></select>	&nbsp;<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" >目标查看</a>
			&nbsp;<a class="easyui-linkbutton" data-options="iconCls:'icon-tool'" >目标设置</a>
		</div>
		<table id="tab_list" ></table>
		<div id="chart" class="mgt_10">报表视图</div>
		<fieldset class="mgt_10" >
			<legend>提示</legend>
			1.目标值由人工设置，完成值由系统自动统计得出。<br>
    2.点击目标查看按钮可查看销售目标的完成情况，点击目标设置按钮可设置销售目标。<br>
    3.销售目标查看:（金额单位：元；客户数单位：个）<br>
    4.回款额表示已收取的应收款，根据收款日期计算。销售额表示审批通过而且没有撤单的合同订单金额，根据签约日期计算。客户数是表示负责的客户数，根据创建日期计算。
		</fieldset>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>