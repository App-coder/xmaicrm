<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/potential/salestarget.js"></script>
<div class="container">
	<div class="container panel-noscroll">
		<div class="panel datagrid">
			<div class="panel-header">
				<div class="panel-title">销售目标</div>
				<div class="panel-tool"></div>
			</div>
			<div class="datagrid-wrap panel-body">
				<div style="display: block;" class="gtb datagrid-toolbar"
					id="serialnumbers_tb">
					<span>查看范围：</span> <input class="tipt"> <span>年份：</span> <input
						class="tipt"> <span>销售指标：</span> <select class="tipt"></select>
					 <a onclick="doSearch()" plain="true" id="btn_search"
						class="easyui-linkbutton ">目标查看</a><a onclick="doSearch()" plain="true" id="btn_search"
						class="easyui-linkbutton ">目标设置</a>
				</div>
				<div class="datagrid-view p10">
	<p class="p_tip">
	提示:<br>
    1.目标值由人工设置，完成值由系统自动统计得出。<br>
    2.点击目标查看按钮可查看销售目标的完成情况，点击目标设置按钮可设置销售目标。<br>
    3.销售目标查看:（金额单位：元；客户数单位：个）<br>
    4.回款额表示已收取的应收款，根据收款日期计算。销售额表示审批通过而且没有撤单的合同订单金额，根据签约日期计算。客户数是表示负责的客户数，根据创建日期计算。<br>
    </p>
				</div>
			</div>
		</div>

	</div>
</div>