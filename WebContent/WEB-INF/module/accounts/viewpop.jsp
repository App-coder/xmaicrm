<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../head_page.jsp"%>
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
<script>
//定义页面变量，需要前缀，防止多页面变量重复
var entitytype = '${entitytype}';
var viewtab = entitytype.toLowerCase();
var viewid = '${viewid}';
var tabid = ${tab.tabid};
var columnname = '${columnname}';
</script>
<script type="text/javascript" src="resources/desktop/module/accounts/viewpop.js"></script>
</head>
<body >
<table id="view_list" toolbar="#tabbar"   data-options="fitColumns:true,fit:true"  ></table>
	<div id="tabbar" class="gtb" style="display: block;" >  
		<span class="icon-filter ">视图：</span> <select
			class="sel_120" onchange="reloadView(this.value)" >
			<c:forEach items="${views}" var="v">
				<option value="${v.cvid }">${v.viewname}</option>
			</c:forEach>
		</select>&nbsp;<select><option>客户名称</option></select><input type="text" class="text vleftipt" /><a
	href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
	class="easyui-linkbutton"
	data-options="plain:true,iconCls:'icon-search'">查询</a>
	</div>
</body>
</html>