<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="nav_div">
	<ul id="nav">
		<li class="top" style="float: left;"><a href="#nogo1"
			class="top_link"><span class="down">工作台</span></a>
			<ul class="sub">
				<li><a href="#nogo19">首页</a></li>
				<li><a href="#nogo20">日程安排</a></li>
				<li><a>文档中心</a></li>
				<li><a>公告</a></li>
			</ul></li>
		<li class="top"><a href="#nogo2" class="top_link"><span
				class="down">市场管理</span></a>
			<ul class="sub">
				<li><a href="#nogo19">营销活动</a></li>
				<li><a href="#nogo20">群发短信</a></li>
				<li><a href="#nogo21">群发邮件</a></li>
			</ul></li>
		<li class="top"><a href="#nogo2" class="top_link"><span
				class="down">客户</span></a>
			<ul class="sub">
				<li><a
					href="javascript:tab('客户','customview/viewIndex?entitytype=Accounts')">客户</a></li>
				<li><a href="javascript:tab('联系人','contact/index')">联系人</a></li>
				<li><a href="javascript:tab('客户关怀','care/index')">客户关怀</a></li>
				<li><a href="javascript:tab('联系记录','note/index')">联系记录</a></li>
				<li><a href="javascript:tab('客户任务计划','noteplans/index')">客户任务计划</a></li>
				<li><a href="javascript:tab('客户任务','note/index')">客户任务</a></li>
				<li><a href="javascript:tab('客户池','note/index')">客户池</a></li>
				<li><a href="javascript:tab('纪念日','memdays/index')">纪念日</a></li>
			</ul></li>
		<li class="top"><a href="#nogo22" class="top_link"><span
				class="down">产品</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('产品列表','product/index')">产品列表</a></li>
				<li><a href="javascript:tab('产品分类','catalog/index')">产品分类</a></li>
				<li><a href="javascript:tab('产品序号','serialnumbers/index')">产品序号</a></li>
			</ul></li>
		<li class="top"><a href="#nogo27" class="top_link"><span
				class="down">销售</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('销售导航','potential/nav')">销售导航</a></li>
				<li><a href="javascript:tab('销售机会','potential/index')">销售机会</a></li>
				<li><a href="javascript:tab('销售漏斗','potential/funnel')">销售漏斗</a></li>
				<li><a href="javascript:tab('报价单','quotes/index')">报价单</a></li>
				<li><a href="javascript:tab('竞争对手','duishous/index')">竞争对手</a></li>
				<li><a href="javascript:tab('合同订单','salesorder/index')">合同订单</a></li>
				<li><a href="javascript:tab('发货单','invoice/index')">发货单</a></li>
				<li><a href="javascript:tab('销售退货单','tuihuos/index')">销售退货单</a></li>
				<li><a href="javascript:tab('员工绩效','performances/index')">员工绩效</a></li>
				<li><a href="javascript:tab('销售目标','salestarget/index')">销售目标</a></li>
			</ul></li>
		<li class="top"><a href="#nogo53" class="top_link"><span
				class="down">采购</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('采购导航','purchase/nav')">采购导航</a></li>
				<li><a href="javascript:tab('进货单','purchaseorder/index')">进货单</a></li>
				<li><a href="javascript:tab('供应商','vendor/index')">供应商</a></li>
				<li><a href="javascript:tab('供应商联系人','vcontacts/index')">供应商联系人</a></li>
				<li><a href="javascript:tab('供应商联系记录','vnotes/index')">供应商联系记录</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">售后</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('客服控制台','accountrecordss/index')">客服控制台</a></li>
				<li><a href="javascript:tab('客户服务','accountrecordss/index')">客户服务</a></li>
				<li><a href="javascript:tab('客户投诉','complaints/index')">客户投诉</a></li>
				<li><a href="javascript:tab('知识库','faq/index')">知识库</a></li>
				<li><a href="javascript:tab('知识库分类','faqcategorys/index')">知识库分类</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">库存</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('库存导航','inventory/nav')">库存导航</a></li>
				<li><a href="javascript:tab('入库单','warehouses/index')">入库单</a></li>
				<li><a href="javascript:tab('出库单','deliverys/index')">出库单</a></li>
				<li><a href="javascript:tab('盘点','checks/index')">盘点</a></li>
				<li><a href="javascript:tab('库存余额','balances/index')">库存余额</a></li>
				<li><a href="javascript:tab('初始化库存','initinventory/index')">初始化库存</a></li>
				<li><a href="javascript:tab('库存调拨','warehousetransfers/index')">库存调拨</a></li>
				<li><a href="javascript:tab('库存流水帐','wareledgers/index')">库存流水帐</a></li>
				<li><a href="javascript:tab('库存台帐','inventoryledgers/index')">库存台帐</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">财务</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('财务导航','accounting/nav')">财务导航</a></li>
				<li><a href="javascript:tab('应收款','gathers/index')">应收款</a></li>
				<li><a href="javascript:tab('应付款','charges/index')">应付款</a></li>
				<li><a href="javascript:tab('收款单','gathersrecords/index')">收款单</a></li>
				<li><a href="javascript:tab('付款单','chargesrecords/index')">付款单</a></li>
				<li><a href="javascript:tab('往来帐','forthamounts/index')">往来帐</a></li>
				<li><a href="javascript:tab('期初余额','openingbalancess/index')">期初余额</a></li>
				<li><a href="javascript:tab('费用报销','expenses/index')">费用报销</a></li>
				<li><a href="javascript:tab('发票管理','billings/index')">发票管理</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">报表</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('综合报表','integradedreports/index')">综合报表</a></li>
				<li><a href="javascript:tab('常用报表','ureports/index')">常用报表</a></li>
				<li><a href="javascript:tab('年终销售报表','salesreports/index')">年终销售报表</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">服务支持</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('服务合同','billings/index')">服务合同</a></li>
				<li><a href="javascript:tab('项目里程碑','billings/index')">项目里程碑</a></li>
				<li><a href="javascript:tab('项目任务','billings/index')">项目任务</a></li>
				<li><a href="javascript:tab('项目','billings/index')">项目</a></li>
				<li><a href="javascript:tab('常见问答','billings/index')">常见问答</a></li>
			</ul></li>
		<li class="top"><a href="#nogo57" class="top_link"><span
				class="down">控制面板</span></a>
			<ul class="sub">
				<li><a href="javascript:tab('控制面板','setting/index')">控制面板</a></li>
				<li><a href="javascript:tab('业务规则','workflow/index')">业务规则</a></li>
			</ul></li>
		<li class="top" style="float: right;"><a href="#nogo1"
			class="top_link"><span class="down">（BOSS）设置</span></a>
			<ul class="sub">
				<li><a href="#nogo54">手机短信</a></li>
				<li><a href="#nogo55">审批中心</a></li>
				<li><a href="#nogo56">自定义提醒</a></li>
				<li><a>我要提问</a></li>
				<li><a>帐号&设置</a></li>
				<li><a>退出</a></li>
			</ul></li>
	</ul>
</div>