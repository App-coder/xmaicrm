<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script>
    var tuihuos_columns = ${dview};
    var tuihuos_viewid = ${customview.cvid}
</script>
<script type="text/javascript"
	src="resources/desktop/potential/tuihuos.js"></script>
<div class="container">
	<div class="hidden">
		<div id="tuihuos_m1" style="width:100px;">
			<div data-options="iconCls:'icon-add'" >创建视图</div>
			<div data-options="iconCls:'icon-edit'" >编辑</div>
			<div data-options="iconCls:'icon-remove'" >删除</div>
		</div>
	</div>
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north',border:false">
			<div class="d_view ">
				<span class="icon-filter view_span" >视图：</span>
				<select class="sel_120">
				<c:forEach items="${views}" var="v" >
					<option value="${v.cvid }">${v.viewname }</option>
				</c:forEach>
				</select>
				<a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#tuihuos_m1',iconCls:'icon-tool'">管理</a>
			</div>
		</div>
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="tuihuos_list" data-options="fit:true,fitColumns:true"></table>
		</div>
		<c:if test="${repfields!=null }">
		<div data-options="region:'south',border:false">
			<div class="d_report ">
				<span class="icon-report view_span" >报表：</span>
				<select class="sel_120">
					<c:forEach items="${repfields }" var="f">
						<option>${f.columnname }</option>
					</c:forEach>
				</select>
				<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-view'">预览</a>
			</div>
		</div>
		</c:if>
	</div>
</div>