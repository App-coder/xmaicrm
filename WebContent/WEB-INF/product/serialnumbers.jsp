<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/product/serialnumbers.js"></script>
<div class="container"  >
	<table id="serialnumbers_list" title="产品序列号" fit="true" toolbar="#serialnumbers_tb" ></table>
	<div id="serialnumbers_tb" class="gtb" style="display: block;" >  
	    <span>产品：</span>  
	    <input class="tipt" >  
	    <span>序列号：</span>  
	   	<input class="tipt" >  
	   	<span>仓库：</span>  
	   	<select class="tipt" ></select>  
	    <span>状态：</span>  
	   	<select class="tipt" ></select>  
	    <span>是否补录：</span>  
	   	<select class="tipt" ></select>  
	    <a class="easyui-linkbutton" title="查询" id="btn_search" iconCls="icon-search" plain="true" onclick="doSearch()" ></a>
	</div>  	
</div>
