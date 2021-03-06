<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
	    var tab_columns = ${dview};
	    tab_columns = setDefWidth(tab_columns, 80);
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
    var ptb = ${ptb.parenttabid};
</script>
<script type="text/javascript"
	src="resources/desktop/module/checks/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden">
		<c:if test="${repfields!=null }">
			<div id="winreport" class="easyui-window" <%=win_topbar%>
				style="width: 700px; height: 499px;">
				<div class="wtop">
					显示类型：<select name="graphtype" class="text">
						<option value="vertical3D" selected="selected">3D柱图</option>
						<option value="vertical2D">2D柱图</option>
						<option value="Line2D">折线图</option>
						<option value="Pie3D">3D饼图</option>
						<option value="Pie2D">2D饼图</option>
					</select>&nbsp;&nbsp;统计项目：<select name="grouptype" id="grouptype"
						class="text"> ${reportoptions }
					</select>&nbsp;&nbsp;<a href="javascript:viewReport()" iconCls="icon-view"
						class="easyui-linkbutton">预览</a>
				</div>
				<iframe src="" id="reportframe" frameborder="0"
					style="width: 100%; height: 430px;"></iframe>
			</div>
		</c:if>

		<!-- 合并记录的demo的html -->
		<div class="div_stat div_statdemo">
			<span class="stat_name"></span>：<span class="stat_num"></span>
		</div>

	</div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div class="easyui-tabs" id="tab_cangkus" >  
	        <div title="全部仓库" class="p10">  
	            		<div class="d_view ">
							<span class="icon-filter ">视图：</span> <select class="sel_120"
								onchange="reloadView(this.value,1)">
								<c:forEach items="${views}" var="v">
									<option value="${v.cvid }">${v.viewname}</option>
								</c:forEach>
							</select> <a
								href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
								class="easyui-linkbutton"
								data-options="plain:true,iconCls:'icon-view'">视图管理</a>
						</div>

						<div id="tabbar" class="gtb" style="display: block;" >
							查看范围：<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/accounts/getCondition'"></select>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" onclick="add()" >添加</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="edit()" >修改</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" onclick="view()" >预览</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" onclick="del()" >删除</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" onclick="showSearch()" >查找</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-undo" onclick="cacelSearch()" >取消查找</a>		  
						</div>

						<table id="view_list_1"  toolbar="#tabbar" data-options="fitColumns:true"></table>
						<div class="stat_div_1 hidden"></div>
	        </div>  
	        <c:forEach items="${cangkus }" var="ck">
		        <div title="${ck.cangkuname }" class="p10">  
			        <div class="d_view ">
						<span class="icon-filter ">视图：</span> <select class="sel_120"
							onchange="reloadView(this.value,${ck.cangkusid})">
							<c:forEach items="${views}" var="v">
								<option value="${v.cvid }">${v.viewname}</option>
							</c:forEach>
						</select> <a
							href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
							class="easyui-linkbutton"
							data-options="plain:true,iconCls:'icon-view'">视图管理</a>
					</div>
					
						<div id="tabbar_${ck.cangkusid}" class="gtb" style="display: block;" >
							查看范围：<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/accounts/getCondition'"></select>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" onclick="add()" >添加</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="edit()" >修改</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" onclick="view()" >预览</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" onclick="del()" >删除</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" onclick="showSearch()" >查找</a>
							<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-undo" onclick="cacelSearch()" >取消查找</a>		  
						</div>
					<table id="view_list_${ck.cangkusid}" toolbar="#tabbar_${ck.cangkusid}" class="viewlist" data-options="fitColumns:true"></table>
					<div class="stat_div_${ck.cangkusid} hidden"></div>
		        </div>
	        </c:forEach>
	    </div>  
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>