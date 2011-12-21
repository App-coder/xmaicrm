<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="header.jsp"%>
<script type="text/javascript" src="resources/desktop/index.js"></script>
</head>
<body id="bodycontainer" class="easyui-layout consolebd">
	<div class="hidden">
		<div id="workspace_item" style="width: 120px;" class="navmenuitem" >
			<div><a href="javascript:tab('首页','welcome/homepage')">首页</a></div>
			<div>日程安排</div>
			<div>文档中心</div>
			<div>公告</div>
		</div>
		<div id="agora_item" style="width: 120px;" class="navmenuitem"  >
			<div>营销活动</div>
			<div>群发短信</div>
			<div>群发邮件</div>
		</div>
		<div id="customer_item"  style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('客户','Customer/Accounts')">客户</a></div>
			<div>联系人</div>
			<div>客户关怀</div>
			<div>联系记录</div>
			<div>纪念日</div>
		</div>
		<div id="product_item"  style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('产品列表','welcome/homepage')" >产品列表</a></div>
			<div>产品分类</div>
			<div>产品序号</div>
		</div>
		<div id="sale_item" style="width: 120px;" class="navmenuitem"  >
			<div>销售导航</div>
			<div>销售机会</div>
			<div>销售漏斗</div>
			<div>报价单</div>
			<div>竞争对手</div>
			<div>合同订单</div>
			<div>发货单</div>
			<div>销售退货单</div>
			<div>员工绩效</div>
			<div>销售目标</div>
		</div>
		<div id="buy_item" style="width: 120px;" class="navmenuitem"  >
			<div>采购导航</div>
			<div>进货单</div>
			<div>供应商</div>
			<div>供应商联系人</div>
			<div>供应商联系记录</div>
		</div>
		<div id="afterser_item" style="width: 120px;" class="navmenuitem"  >
			<div>客服控制台</div>
			<div>客户服务</div>
			<div>客户投诉</div>
			<div>知识库</div>
			<div>知识库分类</div>
		</div>
		<div id="stock_item" style="width: 120px;" class="navmenuitem"  >
			<div>库存导航</div>
			<div>入库单</div>
			<div>出库单</div>
			<div>盘点</div>
			<div>库存余额</div>
			<div>初始化库存</div>
			<div>库存调拨</div>
			<div>库存流水帐</div>
			<div>库存台帐</div>
		</div>
		<div id="finance_item" style="width: 120px;" class="navmenuitem"  >
			<div>财务导航</div>
			<div>应收款</div>
			<div>应付款</div>
			<div>收款单</div>
			<div>付款单</div>
			<div>往来帐</div>
			<div>期初余额</div>
			<div>费用报销</div>
			<div>发票管理</div>
		</div>
		<div id="report_item" style="width: 120px;" class="navmenuitem" >
			<div>综合报表</div>
			<div>常用报表</div>
			<div>年终销售报表</div>
		</div>
		<div id="service_item" style="width: 120px;" class="navmenuitem" >
			<div>服务合同</div>
			<div>项目里程碑</div>
			<div>项目任务</div>
			<div>项目</div>
			<div>常见问答</div>
		</div>
	</div>
	<div region="north" style="height: 68px; overflow: hidden;"
		class="headerNav" border="false">
		<a class="logo"></a>
		<ul class="nav">
			<li><a>手机短信</a></li>
			<li><a>我的审批中心</a></li>
			<li><a>自定义提醒</a></li>
			<li><a>我要提问</a></li>
			<li><a>帐号&设置</a></li>
			<li><a>退出（BOSS）</a></li>
		</ul>
		<div id="navMenu">
			<ul>
				<li><a href="javascript:void(0)" id="workspace"
					class="easyui-menubutton" data-options="menu:'#workspace_item'">工作台</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="agora"
					class="easyui-menubutton" data-options="menu:'#agora_item'">市场管理</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="customer"
					class="easyui-menubutton" data-options="menu:'#customer_item'">客户</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="product"
					class="easyui-menubutton" data-options="menu:'#product_item'">产品</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="sale"
					class="easyui-menubutton" data-options="menu:'#sale_item'">销售</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="buy"
					class="easyui-menubutton" data-options="menu:'#buy_item'">采购</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="afterser"
					class="easyui-menubutton" data-options="menu:'#afterser_item'">售后</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="stock"
					class="easyui-menubutton" data-options="menu:'#stock_item'">库存</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="finance"
					class="easyui-menubutton" data-options="menu:'#finance_item'">财务</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="report"
					class="easyui-menubutton" data-options="menu:'#report_item'">报表</a></li>
				<li class="split"></li>
				<li><a href="javascript:void(0)" id="service"
					class="easyui-menubutton" data-options="menu:'#service_item'">服务支持</a></li>
				<li><a href="javascript:void(0)" id="quick"
					class="easyui-menubutton" data-options="menu:'#quick_item'"><input id="quick" name="dept" value="aa"></a></li>
			</ul>
		</div>
	</div>
	<div region="south" class="footercss" style="height: 40px;"
		border="false">
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
	<div region="center" style="overflow: hidden;" border="false">
		<div id="tabs" tools="#tab-tools" fit="true" border="false"></div>
	</div>

	<div id="tab-tools">
		<a class="easyui-linkbutton" plain="true" title="页面重载"
			iconCls="icon-reload" onclick="javascript:reloadTab()"></a>
	</div>

	<div id="mm" class="easyui-menu" style="width: 150px;">
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