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
	        <!-- 
	        <div title="日程安排" style="overflow:hidden;"  >  
	        	<iframe width="100%" height="650px"  frameborder="0" src="crm/module/calendar/viewcalendar?_rd=${rd }" ></iframe>
	        </div>  
	         -->
	        <div title="列表视图" class="p10" >
	        	 
        	 	<div class="d_view ">
					<span class="icon-filter ">视图：</span> <select
						class="text" onchange="reloadView(this.value)" >
						<c:forEach items="${views}" var="v">
							<option value="${v.cvid }">${v.viewname}</option>
						</c:forEach>
					</select> <a
						href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
						class="easyui-linkbutton"
						data-options="plain:true,iconCls:'icon-view'">视图管理</a>&nbsp;&nbsp;
						<c:set var="searchtype" value="basicsearch"></c:set>
						<%@ include file="../include_view_search.jsp"  %>
				</div>
				<div id="tabbar" class="gtb" style="display: block;" >  
					<%@ include file="../include_index_toolbar.jsp" %>
				</div>
				<table id="view_list"
					data-options="fitColumns:true" toolbar="#tabbar"   ></table>
					<div class="stat_div hidden"></div>
	        	 
	        </div>	        
	    </div>  
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>