<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/afterser/faq.js"></script>
<div class="container"  >
	<div class="easyui-layout" fit="true">
		<div data-options="region:'west',split:true,minimizable:false" title="知识库分类" style="width:150px;">
			<ul id="tree_catalog"  ></ul>  
		</div>
		<div data-options="region:'center',title:'产品列表'" style="overflow:hidden" >
			<table class="easyui-datagrid" data-options="border:false,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'">产品名称</th>
						<th data-options="field:'productid'" >分类</th>
						<th data-options="field:'listprice'" >问题</th>
						<th data-options="field:'unitcost'" >状态</th>
						<th data-options="field:'attr1'">创建人</th>
						<th data-options="field:'status'" >创建时间</th>
						<th data-options="field:'status'" >工具</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>