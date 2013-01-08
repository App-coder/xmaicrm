<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<c:choose>
	<c:when test="${stuff.stufftype == 'accountmoney'}">
		<!-- 应收款，应付款，客户汇总 -->
		<table class="tablist" id="tab_accountmoney">
		</table>
	</c:when>
	<c:when test="${stuff.stufftype == 'gathersyear'}">
		<div id="chart_gathersyear" style="width:100%;height:252px;"></div>
	</c:when>
	<c:when test="${stuff.stufftype == 'com_gathersfinishedbymonth' }">
		<div id="chart_comgathersfinishedbymonth" style="width:100%;height:252px;"></div>
	</c:when>
	<c:when test="${stuff.stufftype == 'top_salesbymonth' }">
		<div id="chart_top_salesbymonth" style="width:100%;height:252px;"></div>
	</c:when>
	<c:when test="${stuff.stufftype =='salesyearinfo' }">
		<table class="tabsaleyearinfo">
		<thead>
			<tr>
				<td colspan="4"><span id="salesyearinfo_year"></span></td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td width="25%" class="lefttd" >回款</td>
				<td width="25%"><span id="salesyearinfo_sumgathersactual"></span></td>
				<td width="25%" class="lefttd" >费用</td>
				<td width="25%"><span id="salesyearinfo_sumexpensestotal"></span></td>
			</tr>
			<tr>
				<td class="lefttd" >签约额</td>
				<td><span id="salesyearinfo_salessumtotle"></span></td>
				<td class="lefttd" >签约数</td>
				<td><span id="salesyearinfo_salescount"></span></td>
			</tr>
			<tr>
				<td class="lefttd" >新客户</td>
				<td colspan="3"><span id="salesyearinfo_newcustomer"></span></td>
			</tr>
		</tbody>
	</table>
	</c:when>
	<c:when test="${stuff.stufftype == 'key_customview'}">
		<table id="tab_keycustomview"></table>
	</c:when>
	<c:when test="${stuff.stufftype == 'salesyear'}">
		<div id="chart_salesyear" style="width:100%;height:252px;"></div>
	</c:when>
	<c:when test="${stuff.stufftype == 'top_potential'}">
		<table id="tab_toppotential"></table>
	</c:when>
	<c:when test="${stuff.stufftype ==  'datelogs'}">
	<table class="tabcalendar">
		<thead>
		<tr>
			<td style="background-color: #003300;text-align: left;" class="ml_5" width="25%" >日/周/月报</td>
			<td width="25%" >日</td>
			<td width="25%" >周</td>
			<td width="25%" >月</td>
		</tr>
		</thead>
		<tbody>
			<tr>
				<td class="tdesc">写<img width="16" height="16" border="0" align="AbsBottom" src="resources/images/portlets/rep01.png" >：</td>
				<td><img width="16" height="16" border="0" src="resources/images/portlets/editlog.png" alt="点击写日报"></td>
				<td><img width="16" height="16" border="0" src="resources/images/portlets/editlog.png" alt="点击写日报"></td>
				<td><img width="16" height="16" border="0" src="resources/images/portlets/editlog.png" alt="点击写日报"></td>
			</tr>
			<tr>
				<td class="tdesc">看下级<img border="0" align="AbsBottom" src="resources/images/portlets/rep02.png" >：</td>
				<td>查看</td>
				<td>查看</td>
				<td>查看</td>
			</tr>
			<tr>
				<td class="tdesc">提交情况<img border="0" align="AbsBottom" src="resources/images/portlets/rep05.png" style="margin: 1px;">：</td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
			</tr>
			<tr>
				<td class="tdesc">汇总<img border="0" align="AbsBottom" src="resources/images/portlets/rep04.png" style="margin: 1px;">：</td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
				<td><img width="14" height="14" border="0" src="resources/images/portlets/pe2.png" alt="点击查看日报情况"></td>
			</tr>
		</tbody>
	</table>
	</c:when>	
	<c:when test="${stuff.stufftype == 'salesfunnels'}">
		<div id="portlets_salesfunnels"></div>
	</c:when>
	<c:when test="${stuff.stufftype == 'com_salesfinishedbymonth' }">
		<div id="chart_salesfinishedbymonth" style="width:100%;height:250px;"></div>
	</c:when>
	<c:when test="${ stuff.stufftype == 'cangkuassets' }">
		<table id="tab_cangkuassets"></table>
	</c:when>
	<c:when test="${stuff.stufftype =='AccountMemdays' }">
		<table id="tab_AccountMemdays"></table>
	</c:when>
	<c:when test="${stuff.stufftype=='announcements' }">
		<table class="tablist" id="tab_announcements">
		</table>
	</c:when>
	<c:when test="${stuff.stufftype=='c3crm_news' }">
		<table class="tablist" id="tab_c3crm_news">
			<tr>
				<td class="pl5">暂不可用</td>
			</tr>
		</table>
	</c:when>
	<c:when test="${ stuff.stufftype =='expensesmonth' }">
		<table id="tab_expensesmonth"></table>
	</c:when>
	<c:when test="${ stuff.stufftype =='free_tags' }" >
		<div id="div_free_tags" class="tag p10">
			<ul>
			</ul>
		</div>
	</c:when>
	<c:when test="${ stuff.stufftype =='note_pad' }"  >
		<textarea name="content" style="width:99%;height:250px;border:1px solid gray;" id="content" onblur="setNotepad()" ></textarea>
	</c:when>
	<c:when test="${stuff.stufftype=='notok_calendar' }">
		<table id="tab_notok_calendar"></table>
	</c:when>
	<c:when test="${stuff.stufftype=='online_users' }">
		<table id="tab_online_users"></table>
	</c:when>
	<c:when test="${stuff.stufftype=='short_cuts' }">
		<div class="p10">
		<table class="tabview">
			<tr>
				<td><a href="crm/module/accounts/showedit?recordid=0&ptb=-1&module=Accounts">新增客户</a></td><td><a href="crm/module/contacts/showedit?recordid=0&ptb=-1&module=Contacts">新增联系人</a></td>
			</tr>
			<tr>
				<td><a href="crm/module/notes/showedit?recordid=0&ptb=-1&module=Notes">新增联系记录</a></td><td><a href="crm/module/potentials/showedit?recordid=0&ptb=-1&module=Potentials">新增销售机会</a></td>
			</tr>
			<tr>
				<td><a href="crm/module/funnels/index?ptb=5" >销售漏斗</a></td><td><a href="crm/module/quotes/showedit?recordid=0&ptb=-1&module=Quotes">新增报价</a></td>
			</tr>
			<tr>
				<td><a href="crm/module/salesorder/showedit?recordid=0&ptb=-1&module=SalesOrder" >新增合同订单</a></td><td><a href="crm/module/performances/index?ptb=-1" >员工绩效</a></td>
			</tr>
		</table> 
		</div>
	</c:when>
</c:choose>
  