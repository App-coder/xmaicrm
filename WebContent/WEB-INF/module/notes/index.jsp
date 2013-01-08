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
<script type="text/javascript" src="resources/desktop/module/notes/index.js"></script>
</head>
<body id="wrap">
${navbar }
<div class="hidden">

<div id="win_batchEdit" iconCls="icon-edit"
			style="width: 500px; height:309px;" class="easyui-window"
			<%=win_topbar%> title="属性编辑" >
			<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" class="p10">
				<table class="tab_form">
					<tr><td><select><option>请选择</option></select></td></tr>
					<tr><td><input type="text" class="text" /></td></tr>
				</table>
			</div>
			<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('customview_edit')">取消</a>
				</div>
			</div>
	</div>
	
	<div id="win_editLeading" iconCls="icon-edit"
			style="width:300px; height:185px;" class="easyui-window"
			<%=win_topbar%> title="修改负责人" >
			<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" class="p10">
				<table class="tab_form">
					<tr><td>转移拥有关系</td></tr>
					<tr><td><select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/accounts/getLeadings'"></select></td></tr>
				</table>
			</div>
			<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('customview_edit')">取消</a>
				</div>
			</div>
	</div>
	
	<div id="win_share" iconCls="icon-edit"
			style="width:300px; height:185px;" class="easyui-window"
			<%=win_topbar%> title="共享" >
			<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" class="p10">
				<table class="tab_editlist">
					<tr><td>选择共享用户</td></tr>
					<tr><td><select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/accounts/getLeadings'"></select></td></tr>
				</table>
			</div>
			<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('customview_edit')">取消</a>
				</div>
			</div>
	</div>

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
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
</div>
	<div class="d_view ">
				<span class="icon-filter ">视图：</span> <select
					class="sel_120" >
					<c:forEach items="${views}" var="v">
						<option value="${v.cvid }">${v.viewname}</option>
					</c:forEach>
				</select> <a
					href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
					class="easyui-linkbutton"
					data-options="plain:true,iconCls:'icon-view'">视图管理</a>
			</div>
			
			<div id="tabbar" class="gtb" style="display: block;" >  
			查看范围：<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/notes/getCondition'"></select>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" onclick="add()" >添加</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="edit()" >修改</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="batchEdit()" >批量修改</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" onclick="view()" >预览</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="editLeading()">修改负责人</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-share" onclick="share()" >共享</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" onclick="del()" >删除</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-import" onclick="import()" >导入</a>	
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-excel" onclick="excel()" >导出</a>	
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" onclick="showSearch()" >查找</a>
				<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-undo" onclick="cacelSearch()" >取消查找</a>	  
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