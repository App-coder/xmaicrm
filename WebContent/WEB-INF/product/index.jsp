<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resource/admin/js/demo.js"></script>
<div class="container"  >
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north'" style="overflow:hidden;padding:10px">
			<h2>Layout in Panel</h2>
		</div>
		<div data-options="region:'south',split:true" style="height:50px;background:#fafafa;"></div>
		<div data-options="region:'east',iconCls:'icon-reload',split:true" title="East" style="width:180px;"></div>
		<div data-options="region:'west',split:true" title="West" style="width:100px;"></div>
		<div data-options="region:'center',title:'Main Title'" style="background:#fafafa;overflow:hidden">
			<table class="easyui-datagrid"
					data-options="url:'datagrid_data2.json',border:false,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'" width="80">Item ID</th>
						<th data-options="field:'productid'" width="100">Product ID</th>
						<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
						<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
						<th data-options="field:'attr1'" width="150">Attribute</th>
						<th data-options="field:'status',align:'center'" width="50">Status</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>