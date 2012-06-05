<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<%@ include file="common/config.jsp"%>
<script>
var pathname = "工作台";
</script>
<%@ include file="path.jsp" %>
<!-- portal页面的引用 -->
<link rel="stylesheet" type="text/css" href="resources/plugins/portal/portal.css">
<script type="text/javascript" src="resources/plugins/portal/jquery.portal.js"></script>
<script type="text/javascript" src="resources/desktop/desktop.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main" >
<div class="path" >&gt;<a  href="crm/welcome/desktop">工作台</a></div>
<div id="desktop" >
	<div style="width:33%;">
		<div title="Clock" style="text-align:center;background:#f3eeaf;height:150px;padding:5px;">
			<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="100" height="100">
		      <param name="movie" value="http://www.respectsoft.com/onlineclock/analog.swf">
		      <param name=quality value=high>
		      <param name="wmode" value="transparent">
		      <embed src="http://www.respectsoft.com/onlineclock/analog.swf" width="100" height="100" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" wmode="transparent"></embed>
		    </object>
	    </div>
	    <div title="Tutorials" collapsible="true" closable="true" style="height:200px;padding:5px;">
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/datagrid/datagrid1.php">Build border layout for Web Pages</a></div>
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/panel.php">Complex layout on Panel</a></div>
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/accordion.php">Create Accordion</a></div>
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/tabs.php">Create Tabs</a></div>
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/tabs2.php">Dynamically add tabs</a></div>
	    	<div class="t-list"><a href="http://www.jeasyui.com/tutorial/layout/panel2.php">Create XP style left panel</a></div>
	    </div>
	</div>
	<div style="width:34%;">
		<div id="pgrid" title="DataGrid" closable="true" style="height:200px;">
			<table class="easyui-datagrid" style="width:650px;height:auto"
					fit="true" border="false"
					singleSelect="true"
					idField="itemid" url="datagrid_data.json">
				<thead>
					<tr>
						<th field="itemid" width="60">Item ID</th>
						<th field="productid" width="60">Product ID</th>
						<th field="listprice" width="80" align="right">List Price</th>
						<th field="unitcost" width="80" align="right">Unit Cost</th>
						<th field="attr1" width="120">Attribute</th>
						<th field="status" width="50" align="center">Status</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div style="width:33%;">
		<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
			<input class="easyui-searchbox">
		</div>
		<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
			<input class="easyui-searchbox">
		</div>
		<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
			<input class="easyui-searchbox">
		</div>
		<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
			<input class="easyui-searchbox">
		</div>
		<div title="Searching" iconCls="icon-search" closable="true" style="height:80px;padding:10px;">
			<input class="easyui-searchbox">
		</div>
		<div title="Graph" closable="true" style="height:200px;text-align:center;">
			<img height="160" src="http://knol.google.com/k/-/-/3mudqpof935ww/ip4n5y/web-graph.png"></img>
		</div>
	</div>
</div>

</div>
<%@ include file="foot.jsp"%>
</body>
</html>