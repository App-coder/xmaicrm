<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
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
var columnname = '${columnname}';
var entitytype = '${entitytype}';
var viewtab = entitytype.toLowerCase();
var viewid = '${viewid}';
var tabid = ${tab.tabid};
var tablabel = '${tab.tablabel}';
var ptb = '${ptb}';
</script>
<script type="text/javascript" src="resources/desktop/public/viewpop.js"></script>
</head>
<body id="wrap" class="easyui-layout">
<div data-options="region:'center',border:false" >
<div class="d_view " id="viewbar" style="border: none;">
	<span class="icon-filter ">视图：</span> <select class="sel_120">
		<c:forEach items="${views}" var="v">
			<option value="${v.cvid }">${v.viewname}</option>
		</c:forEach>
	</select> 
</div>
<table id="view_list" data-options="fitColumns:true,fit:true,border:false" toolbar="#viewbar"></table>
</div>
<div region="south" class="btnbar" border="false">
	<a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:selectValue()" >确定</a> <a
		class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:closeOptionWin()" >取消</a>
		</div>
</div>
</body>
</html>