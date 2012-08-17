<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<script>
var pathname = "营销活动";
</script>
<%@ include file="../path.jsp" %>
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
</script>
<script type="text/javascript" src="resources/desktop/public/viewcv.js"></script>
</head>
<body id="wrap">
<%@ include file="../nav.jsp"%>
<div class="hidden">
<c:if test="${repfields!=null }">
	<div id="winreport" class="easyui-window" <%=win_topbar %>
		style="width:700px; height: 499px;">
		<div class="wtop">
			显示类型：<select name="graphtype" class="text">
				<option value="vertical3D" selected="selected" >3D柱图</option>
				<option value="vertical2D">2D柱图</option>
				<option value="Line2D">折线图</option>
				<option value="Pie3D">3D饼图</option>
				<option value="Pie2D">2D饼图</option>
			</select>&nbsp;&nbsp;统计项目：<select name="grouptype" id="grouptype" class="text">
			${reportoptions }
			</select>&nbsp;&nbsp;<a href="javascript:viewReport()" iconCls="icon-view" class="easyui-linkbutton">预览</a>
		</div>
		<iframe src="" id="reportframe" frameborder="0" style="width:100%;height:430px;" ></iframe>
	</div>
</c:if>	

<!-- 合并记录的demo的html -->	
<div class="div_stat div_statdemo"> <span class="stat_name"></span>：<span class="stat_num"></span></div>
	
</div>
<div id="main">
<div class="path" id="navpath"></div>
	<div class="d_view ">
				<span class="icon-filter ">视图：</span> <select
					class="sel_120">
					<c:forEach items="${views}" var="v">
						<option value="${v.cvid }">${v.viewname}</option>
					</c:forEach>
				</select> <a
					href="customview/index?entitytype=${entitytype}"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-view'">视图管理</a>
			</div>
			<table id="view_list"
				data-options="fitColumns:true" ></table>
				<div class="stat_div hidden"></div>
	<c:if test="${repfields!=null }">
			<div data-options="region:'south',border:false">
				<div class="d_report ">
					<span class="icon-report view_span">报表：</span> <select id="reportselect">
						<c:forEach items="${repfields}" var="f">
							<option value='{"fieldname":"${f.fieldname}","fieldtable":"${f.tablename}","fieldcolname":"${f.columnname }","relatedmodule":"${entitytype}"}'>${f.fieldlabel}</option>
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