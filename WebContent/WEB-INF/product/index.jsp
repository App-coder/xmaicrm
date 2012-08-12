<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/product/index.js"></script>
<div class="container"  >
	<div class="easyui-layout" fit="true">
		<div data-options="region:'west',split:true,minimizable:false" title="产品分类" style="width:150px;">
			<ul id="tree_catalog"  ></ul>  
		</div>
		<div data-options="region:'center',title:'产品列表'" style="overflow:hidden" >
			<table class="easyui-datagrid" data-options="border:false,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'">产品名称</th>
						<th data-options="field:'productid'" >产品编码</th>
						<th data-options="field:'listprice'" >产品类别</th>
						<th data-options="field:'unitcost'" >型号</th>
						<th data-options="field:'attr1'">供应商名称</th>
						<th data-options="field:'status'" >单价</th>
						<th data-options="field:'status'" >总库存数量</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>