<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var tab_columns = ${dview};
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
</script>
<script type="text/javascript" src="resources/desktop/public/viewcv.js"></script>

</head>
<body id="wrap">
<%@ include file="../nav.jsp"%>
<div id="main">
<div class="path"><a href="/">市场管理</a>&gt;<a href="/sc/">营销活动</a></div>

	<div class="hidden">
		<div id="${fn:toLowerCase(entitytype)}_winreport"
			title="${tab.tablabel }-分布统计" class="easyui-window" <%=win_topbar %>
			style="width:700px; height: 500px;">
			<iframe style="width:100%;height:100%;" frameborder="0" id="reportframe" ></iframe>
		</div>
	</div>
	
	<div class="d_view ">
				<span class="icon-filter view_span">视图：</span> <select
					class="sel_120">
					<c:forEach items="${views}" var="v">
						<option value="${v.cvid }">${v.viewname}</option>
					</c:forEach>
				</select> <a
					href="javascript:tab('${tab.tablabel } - 视图管理','customview/index?entitytype=${entitytype}')"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-view'">视图管理</a>
			</div>
			<table id="${fn:toLowerCase(entitytype)}_list"
				data-options="fitColumns:true,height:300" ></table>
				
	<c:if test="${repfields!=null }">
			<div data-options="region:'south',border:false">
				<div class="d_report ">
					<span class="icon-report view_span">报表：</span> <select
						class="sel_120">
						<c:forEach items="${repfields}" var="f">
							<option>${f.fieldlabel}</option>
						</c:forEach>
					</select> <a href="javascript:viewSearchReport()" class="easyui-linkbutton"
						data-options="plain:true,iconCls:'icon-view'">预览</a>
				</div>
			</div>
		</c:if>
	
</div>


<%@ include file="../foot.jsp"%>
</body>
</html>