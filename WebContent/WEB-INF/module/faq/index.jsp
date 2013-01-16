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
<script>
//定义页面变量，需要前缀，防止多页面变量重复
var entitytype = '${entitytype}';
var viewtab = entitytype.toLowerCase();
var viewid = '${viewid}';
var tabid = ${tab.tabid};
var tablabel = '${tab.tablabel}';
var ptb = ${ptb.parenttabid };
</script>
<script type="text/javascript"
	src="resources/desktop/module/faq/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
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
		
		<table style="width:100%;">
			<tr>
				<td style="width:200px;vertical-align: top;padding:10px;" valign="top"><ul id="catalog" class="easyui-tree" url="crm/module/faqcategorys/getCatalogAll" method="get" lines="true" ></ul></td>
				<td valign="top">
					<table id="view_list" data-options="fitColumns:true"  ></table>
					<div class="stat_div hidden"></div>
				</td>
			</tr>
		</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>