<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/potential/performances.js"></script>
<div class="container"  >
	<table id="performances_list" title="员工绩效" toolbar="#performances_tb" ></table>
	<div id="performances_tb" class="gtb" style="display: block;" >  
	    <span>查看范围：</span>  
	    <select class="tipt" ></select>&nbsp;&nbsp;<select class="tipt" ></select>  
	    <span>开始日期：</span>  
	   	<select class="tipt" ></select>  
	    <span>结束日期：</span>  
	   	<select class="tipt" ></select>  
	    <a class="easyui-linkbutton" title="查询" id="btn_search" iconCls="icon-search" plain="true" onclick="doSearch()" ></a>
	</div>  
	<div class="easyui-tabs" style="margin-top:10px;" >  
        <div title="客户" class="p10" >  
           	<table id="performances_customer" ></table>
        </div>  
        <div title="日程安排" class="p10">  
             <table id="performances_schedule" ></table>
        </div>  
        <div title="联系记录" class="p10">  
            <table id="performances_contact" ></table>
        </div> 
        <div title="销售机会" class="p10">  
           <table id="performances_sale" ></table>  
        </div> 
        <div title="报价单" class="p10">  
           <table id="performances_quote" ></table>
        </div>
        <div title="合同订单" class="p10" >  
           <table id="performances_order" ></table>
        </div>
        <div title="应收款" class="p10" >  
            <table id="performances_account" ></table>
        </div>
    </div>  
    <p style="margin-top:10px;" class="p_tip">
    <span class="red">*</span>排序：点击标题即可根据标题排序<br>
    <span class="red">*</span>期初客户：开始日期之前创建的客户<br>
    <span class="red">*</span>新客户：开始日期和结束日期之间创建的客户<br>
    <span class="red">*</span>完成活动：开始日期和结束日期之间创建并完成的日程安排<br>
    <span class="red">*</span>销售机会：开始日期和结束日期之间预计完成的销售机会<br>
    <span class="red">*</span>合同金额：开始日期和结束日期之间签约并审批通过的合同订单的总金额<br>
    <span class="red">*</span>已收款：开始日期和结束日期之间已经收取的应收款<br>
    </p>	
</div>
