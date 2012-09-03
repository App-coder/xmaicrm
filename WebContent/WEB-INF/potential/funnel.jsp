<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/product/catalog.js"></script>
<div class="container">
	<div class="container panel-noscroll">
		<div class="panel datagrid">
			<div class="panel-header">
				<div class="panel-title">销售漏斗</div>
				<div class="panel-tool"></div>
			</div>
			<div class="datagrid-wrap panel-body">
				<div style="display: block;" class="gtb datagrid-toolbar"
					id="serialnumbers_tb">
					<span>查看范围：</span> <input class="tipt"> <span>日期：</span> <input
						class="tipt"> <span>开始时间：</span> <select class="tipt"></select>
					<span>结束时间：</span> <select class="tipt"></select> 
					 <a onclick="doSearch()" plain="true"
						iconcls="icon-search" id="btn_search" title="查询"
						class="easyui-linkbutton "></a>
				</div>
				<div class="datagrid-view">
				各阶段销售机会数量<br>
				各阶段销售机会金额<br>
				</div>
			</div>
		</div>

	</div>
</div>