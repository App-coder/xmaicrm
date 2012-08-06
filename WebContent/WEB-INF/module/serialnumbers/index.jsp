<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/serialnumbers/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<div class="d_bar" >  
	       产品：<input type="text" class="text"/>&nbsp;序列号：<input type="text" class="text"/>&nbsp;
	       仓库：<select><option>请选择</option></select>&nbsp;是否补录：<select><option>请选择</option></select>&nbsp;
			<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" >查找</a>                   
			</div> 
		<table id="view_list" data-options="fitColumns:true"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>