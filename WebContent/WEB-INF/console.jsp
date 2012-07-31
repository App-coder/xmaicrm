<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="header.jsp"%>
<script type="text/javascript" src="resources/desktop/js/index.js"></script>
</head>
<body id="bodycontainer" class="easyui-layout">
	<div region="north" style="height:66px; overflow: hidden;"
		class="headerNav" border="false" >
		<a class="logo"></a>
		<ul class="nav">
			<li><a>修改密码</a></li>
			<li><a>修改资料</a></li>
			<li><a href="admin/webmaster/loginout">退出</a></li>
		</ul>
		<div id="navMenu">
			<a href="javascript:void(0)" id="mb1" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-edit'">Edit</a>
		<a href="javascript:void(0)" id="mb2" class="easyui-menubutton" data-options="menu:'#mm2',iconCls:'icon-help'">Help</a>
		</div>
	</div>
	<div region="south" class="footercss" 
		style="height:40px;" border="false" >
		<table width="100%" cellspacing="0" cellpadding="5" border="0"
			style="padding: 8px 20px;">
			<tbody>
				<tr>
					<td align="left" class="small"><span
						style="color: rgb(153, 153, 153);">Powered by 新麦 CRM <span
							id="_vtiger_product_version_">2.0</span></span></td>
					<td align="right" class="small"><span>&copy; 2012-2014
							<a target="_blank" href="http://www.x-mai.com">x-mai.com</a>
					</span></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div region="center" style="overflow: hidden;" border="false" >
		<div id="tabs" tools="#tab-tools" fit="true" border="false"></div>
	</div>

	<div id="tab-tools">
		<a class="easyui-linkbutton" plain="true" title="页面重载"
			iconCls="icon-reload" onclick="javascript:reloadTab()"></a>
	</div>

	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>
</body>
</html>