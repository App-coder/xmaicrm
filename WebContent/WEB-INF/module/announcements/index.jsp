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
	src="resources/desktop/module/announcements/index.js"></script>
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
					class="text" onchange="reloadView(this.value)" >
					<c:forEach items="${views}" var="v">
						<option value="${v.cvid }">${v.viewname}</option>
					</c:forEach>
				</select> <a
					href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-view'">视图管理</a>&nbsp;&nbsp;
					查找：
					<select class="text" ></select>
					<input type="text" class="text" />
					<a class="easyui-linkbutton" 
					data-options="plain:true,iconCls:'icon-search'">查找</a>
			</div>
			<div id="tabbar" class="gtb" style="display: block;" >  
			查看范围：<select class="default" >
					<option>所有的公告</option>
					<option>我创建的公告</option>
					<option>我收到的公告</option>
					</select>
					<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" onclick="insert()" >添加</a>
					<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="edit()" >修改</a>
					<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" onclick="view()" >预览</a>
					<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" onclick="deleteRecord()" >删除</a>
			</div>
			<table id="view_list"
				data-options="fitColumns:true" toolbar="#tabbar"  ></table>
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
	<%@ include file="../../foot.jsp"%>
</body>
</html>