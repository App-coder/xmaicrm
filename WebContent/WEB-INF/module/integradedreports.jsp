<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 综合报表界面 -->	
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>

 <c:choose>
    <c:when test="${year!=null}">
       <script>
       var year=${year};
       </script>
    </c:when>
    <c:otherwise>
       <c:set  var="year" value="2012"></c:set> 
    </c:otherwise>
 </c:choose>
   
<script type="text/javascript" src="resources/desktop/report/reports.js"></script>
<script type="text/javascript" src="resources/desktop/report/integradedreports.js"></script>

<style>
.report_panel{
    border-top: 1px dotted #999999;
    width:100%;
    margin-top: 5px;
}
.report_panel .report_details{
    width:20%
}

.schart{
  background: url("resources/images/report/schart.gif") no-repeat;
  padding-left: 12px;
}
a {
    color: #33338C;
    text-decoration: none;
}
</style>
<body id="wrap">
<%@ include file="../nav.jsp"%>
<div id="main">
<div class="path"><a href="/">报表</a>&gt;<a href="/sc/">综合报表</a></div>

<div>
	<div fit="true">
		<div data-options="border:false">
			<div class="d_view">
				<span class="icon-filter view_span" >年度选择：</span>
				<select class="selyear">
				    <option value=""></option>
					<option value="2010">2010</option>		
					<option value="2011">2011</option>
					<option value="2012">2012</option>
				</select>
			</div>
		</div>
		<div data-options="border:false" style="overflow: hidden;">
			<div class="d_center"  
			     collapsible="true" data-options="fit:true" style="padding:5px;">
				<table class="report_panel">
				   <tr>
				   <td class="report_details">
					   <fieldset>
						<legend class="schart">${year}年 销售汇总表:</legend>
						<table cellspacing="1" cellpadding="3" border="0" style="background-color:#CCCCCC;">
							<tbody>
								<tr bgcolor="white">
									<td bgcolor="#F7F7F0" align="center" colspan="2" style="line-height: 20px;">
									  <font color="#999999">表名</font></td>
								</tr>
								<tr bgcolor="white">
									<td height="40" align="right" style="line-height:30px;">
									  <font color="#3366FF">1.</font>
									  <a target="_blank" href="index?action=IntegradedreportsAjax&file=basicyear&parenttab=Analytics&year=2011">年度基本情况表</a></td>
									<td style="line-height: 30px;">
									  <font color="#3366FF">2.</font>
									  <a target="_blank" href="integradedreports/salestotal/index">销售综合汇总表</a></td>
								</tr>
							</tbody>
						</table>
					   </fieldset>
				   </td>
				   <td style="padding-left:60px">
					   <fieldset style="width:150px">
					   <legend class="schart">${year}年 库存资产表</legend>
					   <table cellspacing="1" cellpadding="3" border="0" style="background-color:#CCCCCC;margin-left:30px">
							<tbody>
								<tr bgcolor="white">
									<td bgcolor="#F7F7F0" align="center" colspan="2" style="line-height: 20px;">
									  <font color="#999999">表名</font></td>
								</tr>
								<tr bgcolor="white">
									<td height="40" align="right" style="line-height:30px;">
									  <font color="#3366FF">3.</font>
									  <a target="_blank" href="integradedreports/cangkuinfo/index">当前库存资产</a></td>
								</tr>
							</tbody>
						</table>
					   </fieldset>
				   </td>
				   </tr>
				</table>
				
				<!-- 销售明细表 -->
				<table class="report_panel">
				   <tr>
					   <td class="report_details">
						   <fieldset>
							<legend class="schart">${year}年 销售明细表:</legend>
							<table id="sales_details" cellspacing="1" cellpadding="3" border="0" style="line-height: 200%; background-color:#CCCCCC;">
							</table>
						   </fieldset>
					   </td>
				   </tr>
				</table>
				
				<!-- 采购和仓库管理统计表 -->
				<table class="report_panel">
				   <tr>
					   <td class="report_details">
						   <fieldset>
							<legend class="schart">${year}年 采购和仓库管理统计表:</legend>
							<table id="purchase_details" cellspacing="1" cellpadding="3" border="0" style="line-height: 200%; background-color:#CCCCCC;">
							</table>
						   </fieldset>
					   </td>
				   </tr>
				</table>
			</div>
		</div>
	</div>
</div>
<%@ include file="../foot.jsp"%>
</div>
</body>
