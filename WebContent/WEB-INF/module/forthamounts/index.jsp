<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/forthamounts/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div id="tabbar"    >  
			查找：<select><option>客户</option><option>供应商</option></select><input type="text" class="text"/><a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-search'" ></a>&nbsp;
			时间：<select><option>自定义</option></select><input type="text" class="text easyui-datebox" />-<input type="text" class="text easyui-datebox" />&nbsp;
			<input type="radio" />未结账&nbsp;<input type="radio" />已结账&nbsp;
			<a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-search'" >查询</a>
			<a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-excel'" >导出</a>
			<a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-print'" >打印</a>
			<a class="easyui-linkbutton" data-options="plain:true" >批量结账</a>
		</div>
		
		<table id="tab_list" toolbar="#tabbar"  data-options="fitColumns:true"></table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>