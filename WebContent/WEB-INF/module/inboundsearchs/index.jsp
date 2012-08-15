<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/inboundsearchs/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<table id="tablist" toolbar="#tabbar" ></table>
		<div id="tabbar" class="gtb" style="display: block;" >  
			<input type="text" class="text"/><a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" >查找客户</a>
			<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" >新增客户</a>（备注:可输入客户名称、客户行业、公司电话、客户编号、拼音字头作为搜索条件） 
		</div>
		<div class="h10"></div>
		<table id="tablist_faq" toolbar="#tabbar_faq" ></table>
		<div id="tabbar_faq" class="gtb" style="display: block;" >  
			查找FAQ：<input type="text" class="text"/><a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" >搜索</a>
			<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" >详情</a>1.搜索是模糊搜索，请尽量填写长关键字
2.可输入 问题、分类、状态、解决方案、关键字 作为搜索条件 
		</div>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>