<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var pathname ='页面布局';
</script>
<%@ include file="../../path.jsp" %>
<script type="text/javascript" src="resources/desktop/settings/system/layoutlist.js"></script>
</head>
<body id="wrap">
<%@ include file="../../nav.jsp"%>
<div id="main">
    <%-- <div class="hidden">
			<div id="picklist" class="easyui-window" <%=win_topbar%> style="width: 500px; height: 292px;">
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding: 10px; background: #fff;">
						<form id="form_picklist" name="form_picklist" method="post">
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr id="picklist">
										<td class="dataLabel" valign="top" nowrap="nowrap" align="right">
										<b>下拉框列表值: </b>
										</td>
										<td valign="top" align="left">
										<textarea class="fldPickList" rows="15" name="fldPickList"></textarea>
										</td>
								</tr>
							</table>
						</form>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok" onclick="submitPicklist()">确定</a>
						<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="closeWin('picklist')">取消</a>
					</div>
				</div>
			</div>
		</div> --%>

    <div class="path" id="navpath"></div>
    <div class="d_view" id="tb">
		<span>选择CRM模块:</span>
		<select class="importBox" name="pick_module"></select>
	</div>    
    <!-- <table id="picklist_datagrid" class="easyui-datagrid"
        rownumbers="true" pagination="true">  
    </table>  -->
    <div class="d_center">
    <table cellspacing="1" cellpadding="3">
    <tr><td>
       <table class="easyui-datagrid" data-options="pagination:true" style="width:410px;height:315px" >  
	    <thead>  
	        <tr>  
	            <th data-options="field:'code'">Code</th>  
	            <th data-options="field:'name'">Name</th>  
	            <th data-options="field:'price'">Price</th>  
	            
	        </tr>  
	    </thead>  
	    <tbody>  
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr>  
	        <tr>  
	            <td>002</td><td>name2</td><td>4612</td>  
	        </tr>  
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr> 
	    </tbody>  
	</table>
    </td>
    <td>
    <table  class="easyui-datagrid" style="width:400px;height:250px" >  
	    <thead>  
	        <tr>  
	            <th data-options="field:'code'">Code</th>  
	            <th data-options="field:'name'">Name</th>  
	            <th data-options="field:'price'">Price</th>  
	        </tr>  
	    </thead>  
	    <tbody>  
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr>  
	        <tr>  
	            <td>002</td><td>name2</td><td>4612</td>  
	        </tr>  
	    </tbody>  
	</table>
    </td>
    <td>
    <table class="easyui-datagrid" style="width:400px;height:250px" >  
	    <thead>  
	        <tr>  
	            <th data-options="field:'code'">Code</th>  
	            <th data-options="field:'name'">Name</th>  
	            <th data-options="field:'price'">Price</th>  
	        </tr>  
	    </thead>  
	    <tbody>  
	        <tr>  
	            <td>001</td><td>name1</td><td>2323</td>  
	        </tr>  
	        <tr>  
	            <td>002</td><td>name2</td><td>4612</td>  
	        </tr>  
	    </tbody>  
	</table>
    </td>
    </tr>
    </table>
    
     </div>


</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>