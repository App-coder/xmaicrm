<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="head.jsp"%>
<%@ include file="common/config.jsp"%>
<script>
var pathname = "工作台";
</script>
<%@ include file="path.jsp" %>

<script type="text/javascript" src="resources/fusionchart/FusionCharts.js"></script>
<!-- portal页面的引用 -->
<link rel="stylesheet" type="text/css" href="resources/plugins/portal/portal.css">
<script type="text/javascript" src="resources/plugins/portal/jquery.portal.js"></script>
<script type="text/javascript" src="resources/lib/json2.js"></script>
<script type="text/javascript" src="resources/desktop/desktop.js"></script>
<link rel="stylesheet" type="text/css" href="resources/portlets.css">

<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
<script type="text/javascript" src="resources/desktop/portlets/${stuff.stufftype }.js"></script>
</c:forEach>

</head>
<body id="wrap">
<div class="hidden" >
	<div id="win_cfgorder" class="easyui-window" <%=win_topbar %>
		style="width:600px; height: 370px;"  >
		<div class="easyui-layout" data-options="fit:true,border:false">
				<div data-options="region:'center',border:false"  >
					<table id="tab_templatestuff"></table>
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="cfgStuffOrder()">保存</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('win_cfgorder')">取消</a>
				</div>
		</div>
	</div>
	
	<div id="win_plugtempsedit" class="easyui-window" <%=win_topbar %>
		style="width:800px; height: 494px;" >
		<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" style="padding:10px;">
				<form name="form_plugtempsedit" id="form_plugtempsedit" method="post" >
					<input type="hidden" name="hometemplatesid"  />
					<input type="hidden" name="templatesstuffs" />
					<fieldset>
						<legend>组件描述</legend>
						<table class="tab_editlist" >
							<tr>
								<td class="edittd">组件模板名称</td>
								<td><input type="text" value="" name="hometemplatesname" data-options="required:true" class="text easyui-validatebox "></td>
							</tr>
						</table>
					</fieldset>
					
					<fieldset>
						<legend>选择组件</legend>
							<table class="tabview td_r">
								<tr>
									<td>最近一个月客户纪念日 <input type="checkbox"
										value="AccountMemdays" name="stufftype"></td>
									<td>应收款、应付款客户汇总 <input type="checkbox"
										value="accountmoney" name="stufftype"></td>
									<td>公告 <input type="checkbox" value="announcements"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>新麦CRM新闻 <input type="checkbox" value="c3crm_news"
										name="stufftype"></td>
									<td>库存资产 <input type="checkbox" value="cangkuassets"
										name="stufftype"></td>
									<td>公司最近6个月回款任务完成情况 <input type="checkbox"
										value="com_gathersfinishedbymonth" name="stufftype"></td>
								</tr>
								<tr>
									<td>公司最近6个月销售任务完成情况 <input type="checkbox"
										value="com_salesfinishedbymonth" name="stufftype"></td>
									<td>日/周/月报 <input type="checkbox" value="datelogs"
										name="stufftype"></td>
									<td>费用报销（30天内） <input type="checkbox"
										value="expensesmonth" name="stufftype"></td>
								</tr>
								<tr>
									<td>标签列表 <input type="checkbox" value="free_tags"
										name="stufftype"></td>
									<td>公司应收款月度同比 <input type="checkbox" value="gathersyear"
										name="stufftype"></td>
									<td>关键视图 <input type="checkbox" value="key_customview"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>记事本(双击内容进入编辑模式) <input type="checkbox"
										value="note_pad" name="stufftype"></td>
									<td>过期未完成日程 <input type="checkbox" value="notok_calendar"
										name="stufftype"></td>
									<td>在线用户 <input type="checkbox" value="online_users"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>销售漏斗 <input type="checkbox" value="salesfunnels"
										name="stufftype"></td>
									<td>公司销售额月度同比 <input type="checkbox" value="salesyear"
										name="stufftype"></td>
									<td>公司年度销售情况 <input type="checkbox" value="salesyearinfo"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>快捷方式 <input type="checkbox" value="short_cuts"
										name="stufftype"></td>
									<td>下属本月销售数据 <input type="checkbox"
										value="sub_performance" name="stufftype"></td>
									<td>今日待联系客户 <input type="checkbox" value="today_account"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>最近联系客户 <input type="checkbox" value="top_account"
										name="stufftype"></td>
									<td>7天内日程 <input type="checkbox" value="top_calendar"
										name="stufftype"></td>
									<td>30天内及过期应收款 <input type="checkbox" value="top_gather"
										name="stufftype"></td>
								</tr>
								<tr>
									<td>最近联系记录 <input type="checkbox" value="top_notes"
										name="stufftype"></td>
									<td>个人本月销售数据 <input type="checkbox"
										value="top_performance" name="stufftype"></td>
									<td>金额较大的销售机会 <input type="checkbox"
										value="top_potential" name="stufftype"></td>
								</tr>
								<tr>
									<td>最新报价 <input type="checkbox" value="top_quote"
										name="stufftype"></td>
									<td>公司最近6个月销售情况 <input type="checkbox"
										value="top_salesbymonth" name="stufftype"></td>
									<td>最新已审批合同订单 <input type="checkbox"
										value="top_salesorder" name="stufftype"></td>
								</tr>
								<tr>
									<td>本人最近6个月销售情况 <input type="checkbox"
										value="user_salesbymonth" name="stufftype"></td>
									<td>本人最近3个月销售任务完成情况 <input type="checkbox"
										value="user_salesfinishedbymonth" name="stufftype"></td>
									<td></td>
								</tr>
							</table>
						</fieldset>
					
					<fieldset class="mgb_10" >
						<legend>选择角色</legend>
						<table class="tabview td_r" id="tab_role">
						</table>
					</fieldset>
					
				</form>
			</div>
			<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="plugtempsSave()">保存</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('win_plugtempsedit')">取消</a>
				</div>
		</div>
	</div>
	<div id="win_plugtemps" class="easyui-window" <%=win_topbar %>
		style="width:700px; height: 432px;">
		<table id="plugtemps"></table>
	</div>
</div>
${navbar }
<div id="main" >
<div class="path" >&gt;<a  href="crm/module/home/index">工作台</a>
<a iconCls="icon-tool" class="easyui-linkbutton fr" onclick="showPlugTempsPanel()">管理组件模版</a>
</div>
<div id="desktop" >
		 <div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${vs.index%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:33%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+2)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div>
		<div style="width:34%;">
			<c:forEach items="${stuffs}" var="stuff" varStatus="vs" >
			<c:if test="${(vs.index+1)%3==0 }">
				<div title="${stuff.stufftitle }" style="height:280px;overflow:hidden;">
					<%@ include file="portlets/select.jsp"%>
				</div>
			</c:if>
			</c:forEach>
		</div> 
</div>
</div>
<%@ include file="foot.jsp"%>
</body>
</html>