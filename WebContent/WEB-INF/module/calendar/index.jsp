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
var searchtype = 'basicsearch';
</script>

<script type="text/javascript" src="resources/desktop/module/calendar/index.js"></script>
	
</head>
<body id="wrap">
	${navbar }
	<%@ include file="../include_view.jsp"  %>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<div class="easyui-tabs"   >  
	        <div title="日程安排" style="overflow:hidden;"  >  
	        <div class="def_div">
			<span class="fl mgl_10">
			查看范围：<select class="easyui-combotree " id="cbt_calendarscope" style="width:160px;"  data-options="url:'crm/customview/getCondition?entitytype=${entitytype }'"></select>
			</span>
			<span class="fr mgr_10" >
			<a class="easyui-linkbutton"
			data-options="iconCls:'icon-share'" onclick="advSearch()">共享日程</a>
			</span>
			</div>
	        	<iframe width="100%" name="frame_calendar" id="frame_calendar" height="1025px" scrolling="no" frameborder="0" src="crm/module/events/viewcalendar?_rd=${rd }" ></iframe>
	        </div> 
	        <div title="列表视图" class="p10" >
	        	<c:set var="searchtype" value="basicsearch"></c:set>
				<%@ include file="../include_view_search.jsp"  %>
        	 	<%@ include file="../include_index_toolbar.jsp" %>
				<table id="view_list"
					data-options="fitColumns:true" toolbar="#tabbar" ></table>
					<div class="stat_div hidden"></div>
	        	 
	        </div>	        
	    </div>  
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>