<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>

<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var accountrecordss_columns = ${dview};
			var accountrecordss_viewid = ${customview.cvid};
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var accountrecordss_columns = "";
			var accountrecordss_viewid = -1;
		</script>
	</c:otherwise>
</c:choose>	
	
<script type="text/javascript" 	src="resources/desktop/afterser/accountrecordss.js"></script>


<div class="container">
	<div class="hidden">
		<div id="accountrecordss_m1" style="width:100px;">
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
					<option value="${v.cvid }">${v.viewname}</option>
				</c:forEach>
				</select>
				<a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#accountrecordss_m1',iconCls:'icon-tool'">管理</a>
			</div>
		</div>
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="accountrecordss_list" data-options="fit:true,fitColumns:true"></table>
		</div>
		<c:if test="${repfields!=null }">
			<div data-options="region:'south',border:false">
				<div class="d_report ">
					<span class="icon-report view_span" >报表：</span>
					<select class="sel_120">
						<c:forEach items="${repfields}" var="f">
							<option>${f.columnname}</option>
						</c:forEach>
					</select>
					<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-view'">预览</a>
				</div>
			</div>
		</c:if>
	</div>
</div>