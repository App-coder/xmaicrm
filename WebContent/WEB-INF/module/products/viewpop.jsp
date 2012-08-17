<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var tab_columns = ${dview};
			tab_columns = setDefWidth(tab_columns,80);
			var tab_viewid = ${customview.cvid};
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var tab_columns = "";
			var tab_viewid = -1;
		</script>
	</c:otherwise>
</c:choose>
<script >
//定义页面变量，需要前缀，防止多页面变量重复
var entitytype = '${entitytype}';
var viewtab = entitytype.toLowerCase();
var viewid = '${viewid}';
var tabid = ${tab.tabid};
var tablabel = '${tab.tablabel}';
var columnname = '${columnname}';
</script>
<script type="text/javascript" src="resources/desktop/module/products/viewpop.js"></script>
</head>
<body class="easyui-layout" data-options="border:false" >  
<div data-options="region:'north',border:false" >
<div class="d_view ">
<span class="icon-filter ">视图：</span> <select
	class="sel_120" onchange="reloadView(this.value)" >
	<c:forEach items="${views}" var="v">
		<option value="${v.cvid }">${v.viewname}</option>
	</c:forEach>
</select> <a
	href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
	class="easyui-linkbutton"
	data-options="plain:true,iconCls:'icon-view'">视图管理</a>
</div>
</div>
<div data-options="region:'west',border:false" style="width:150px;">
	<ul id="catalog" class="easyui-tree" url="crm/module/catalogs/getCatalogAll" method="get" lines="true" ></ul>
</div>  
<div data-options="region:'center',border:false" >
	<table id="view_list" data-options="fitColumns:true,fit:true"  ></table>
</div>  

</body>
</html>