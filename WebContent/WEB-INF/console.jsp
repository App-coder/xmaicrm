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
		<!-- com.crm.marketing -->
		<div id="agora_item" style="width: 120px;" class="navmenuitem"  >
			<div><a href="customview/viewIndex?entitytype=Campaigns">营销活动</a></div>
			<div><a href="javascript:tab('群发短信','qunfa/index')">群发短信</a></div>
			<div><a href="javascript:tab('群发邮件','maillist/index')">群发邮件</a></div>
		</div>
		<div id="customer_item"  style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('客户','customview/viewIndex?entitytype=Accounts')">客户</a></div>
			<div><a href="javascript:tab('联系人','contact/index')">联系人</a></div>
			<div><a href="javascript:tab('客户关怀','care/index')">客户关怀</a></div>
			<div><a href="javascript:tab('联系记录','note/index')">联系记录</a></div>
			<div><a href="javascript:tab('客户任务计划','noteplans/index')">客户任务计划</a></div>
			<div><a href="javascript:tab('客户任务','note/index')">客户任务</a></div>
			<div><a href="javascript:tab('客户池','note/index')">客户池</a></div>
			<div><a href="javascript:tab('纪念日','memdays/index')">纪念日</a></div>
		</div>
		<div id="product_item"  style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('产品列表','product/index')" >产品列表</a></div>
			<div><a href="javascript:tab('产品分类','catalog/index')" >产品分类</a></div>
			<div><a href="javascript:tab('产品序号','serialnumbers/index')" >产品序号</a></div>
		</div>
		<div id="sale_item" style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('销售导航','potential/nav')" >销售导航</a></div>
			<div><a href="javascript:tab('销售机会','potential/index')" >销售机会</a></div>
			<div><a href="javascript:tab('销售漏斗','potential/funnel')" >销售漏斗</a></div>
			<div><a href="javascript:tab('报价单','quotes/index')" >报价单</a></div>
			<div><a href="javascript:tab('竞争对手','duishous/index')" >竞争对手</a></div>
			<div><a href="javascript:tab('合同订单','salesorder/index')" >合同订单</a></div>
			<div><a href="javascript:tab('发货单','invoice/index')" >发货单</a></div>
			<div><a href="javascript:tab('销售退货单','tuihuos/index')" >销售退货单</a></div>
			<div><a href="javascript:tab('员工绩效','performances/index')" >员工绩效</a></div>
			<div><a href="javascript:tab('销售目标','salestarget/index')" >销售目标</a></div>
		</div>
		<div id="buy_item" style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('采购导航','purchase/nav')">采购导航</a></div>
			<div><a href="javascript:tab('进货单','purchaseorder/index')">进货单</a></div>
			<div><a href="javascript:tab('供应商','vendor/index')">供应商</a></div>
			<div><a href="javascript:tab('供应商联系人','vcontacts/index')">供应商联系人</a></div>
			<div><a href="javascript:tab('供应商联系记录','vnotes/index')">供应商联系记录</a></div>
		</div>
		<div id="afterser_item" style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('客服控制台','accountrecordss/index')" >客服控制台</a></div>
			<div><a href="javascript:tab('客户服务','accountrecordss/index')" >客户服务</a></div>
			<div><a href="javascript:tab('客户投诉','complaints/index')" >客户投诉</a></div>
			<div><a href="javascript:tab('知识库','faq/index')" >知识库</a></div>
			<div><a href="javascript:tab('知识库分类','faqcategorys/index')" >知识库分类</a></div>
		</div>
		<div id="stock_item" style="width: 120px;" class="navmenuitem">
			<div><a href="javascript:tab('库存导航','inventory/nav')">库存导航</a></div>
			<div><a href="javascript:tab('入库单','warehouses/index')">入库单</a></div>
			<div><a href="javascript:tab('出库单','deliverys/index')">出库单</a></div>
			<div><a href="javascript:tab('盘点','checks/index')" >盘点</a></div>
			<div><a href="javascript:tab('库存余额','balances/index')">库存余额</a></div>
			<div><a href="javascript:tab('初始化库存','initinventory/index')">初始化库存</a></div>
			<div><a href="javascript:tab('库存调拨','warehousetransfers/index')">库存调拨</a></div>
			<div><a href="javascript:tab('库存流水帐','wareledgers/index')">库存流水帐</a></div>
			<div><a href="javascript:tab('库存台帐','inventoryledgers/index')">库存台帐</a></div>
		</div>
		<div id="finance_item" style="width: 120px;" class="navmenuitem"  >
			<div><a href="javascript:tab('财务导航','accounting/nav')" >财务导航</a></div>
			<div><a href="javascript:tab('应收款','gathers/index')" >应收款</a></div>
			<div><a href="javascript:tab('应付款','charges/index')" >应付款</a></div>
			<div><a href="javascript:tab('收款单','gathersrecords/index')" >收款单</a></div>
			<div><a href="javascript:tab('付款单','chargesrecords/index')" >付款单</a></div>
			<div><a href="javascript:tab('往来帐','forthamounts/index')" >往来帐</a></div>
			<div><a href="javascript:tab('期初余额','openingbalancess/index')" >期初余额</a></div>
			<div><a href="javascript:tab('费用报销','expenses/index')" >费用报销</a></div>
			<div><a href="javascript:tab('发票管理','billings/index')" >发票管理</a></div>
		</div>
		<div id="report_item" style="width: 120px;" class="navmenuitem" >
			<div><a href="javascript:tab('综合报表','integradedreports/index')" >综合报表</a></div>
			<div><a href="javascript:tab('常用报表','ureports/index')" >常用报表</a></div>
			<div><a href="javascript:tab('年终销售报表','salesreports/index')" >年终销售报表</a></div>
		</div>
		<!-- 
		<div id="service_item" style="width: 120px;" class="navmenuitem" >
			<div><a href="javascript:tab('服务合同','billings/index')" >服务合同</a></div>
			<div><a href="javascript:tab('项目里程碑','billings/index')" >项目里程碑</a></div>
			<div><a href="javascript:tab('项目任务','billings/index')" >项目任务</a></div>
			<div><a href="javascript:tab('项目','billings/index')" >项目</a></div>
			<div><a href="javascript:tab('常见问答','billings/index')" >常见问答</a></div>
		</div>
		 -->
		<div id="setting_item" style="width: 120px;" class="navmenuitem" >
			<div><a href="javascript:tab('控制面板','setting/index')" >控制面板</a></div>
			<div><a href="javascript:tab('业务规则','workflow/index')" >业务规则</a></div>
		</div>
	</div>
	<div region="north" style="height: 62px;overflow: hidden; "
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
				<li class="split"></li>
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
				
				<!-- 
				<li><a href="javascript:void(0)" id="service"
					class="easyui-menubutton" data-options="menu:'#service_item'">服务支持</a></li>
				<li class="split"></li>
				 -->
				
				<li><a href="javascript:void(0)" id="setting"
					class="easyui-menubutton" data-options="menu:'#setting_item'">控制面板</a></li>
				<li class="split"></li>
				
				<!-- 
				<li><a href="javascript:void(0)" id="quick"
					class="easyui-menubutton" data-options="menu:'#quick_item'"><input id="quick" name="dept" value="aa"></a></li>
				 -->
					
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