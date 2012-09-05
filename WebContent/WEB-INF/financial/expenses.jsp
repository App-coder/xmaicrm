<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>

<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var expenses_columns = ${dview};
			var expenses_viewid = ${customview.cvid};
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var expenses_columns = "";
			var expenses_viewid = -1;
		</script>
	</c:otherwise>
</c:choose>

<script type="text/javascript" 	src="resources/desktop/financial/gathers.js"></script>


  

<div class="container">
	<div class="hidden">
		<div id="account_m1" style="width:100px;">
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
				<a href="javascript:void(0)" class="easyui-menubutton" data-options="menu:'#account_m1',iconCls:'icon-tool'">管理</a>
			</div>
		</div>
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="account_list" class="easyui-datagrid" data-options="fit:true,fitColumns:true" toolbar="#expenses_tb">
			  <thead>  
		        <tr>  
		            <th field="ck" checkbox="true"></th>  
		            <th field="itemid" width="60">应收款编号 </th>  
		            <th field="productid" width="80">应收金额 </th>  
		            <th field="listprice" align="right" width="70">应收日期 </th>  
		            <th field="unitcost" align="right" width="70">是否收款 </th>  
		            <th field="attr1" width="200">客户 </th>  
		            <th field="status" width="50">合同订单 </th>  
		        </tr>  
		    </thead> 
			</table>
			<div id="expenses_tb" style="padding:1px;height:auto">  
			    <div>  
			                            查看范围:   
			        <input class="easyui-combobox" style="width:100px"  
			                url="data/combobox_data.json"  
			                valueField="id" textField="text">  
			        <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>  
			    </div>  
			</div>
			
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
