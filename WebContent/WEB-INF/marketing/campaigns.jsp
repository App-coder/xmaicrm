<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../header.jsp"%>
<%@ include file="../common/config.jsp"%>
<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var campaign_columns = ${dview};
			var campaign_viewid = ${customview.cvid};
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var campaign_columns = "";
			var campaign_viewid = -1;
		</script>
	</c:otherwise>
</c:choose>


<script type="text/javascript"
	src="resources/desktop/marketing/campaigns.js"></script>
<div class="container">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north',border:false">
			<div class="d_view ">
				<span class="icon-filter view_span" >视图：</span>
				<select class="sel_120">
				<c:forEach items="${views}" var="v" >
					<option value="${v.cvid }">${v.viewname}</option>
				</c:forEach>
				</select>
				<a href="javascript:tab('营销活动 - 视图管理','customview/index?entitytype=Campaigns')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-view'">视图管理</a>
			</div>
		</div>
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="campaign_list" data-options="fit:true,fitColumns:true"></table>
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
<%@ include file="../footer.jsp"%>