<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>

	
<script type="text/javascript" 	src="resources/desktop/report/salestotal.js"></script>

<body id="wrap">
<div id="main">
<div class="container">
	    <div data-options="region:'north',border:false">
	       <table border="0" width="100%" height="40">
			  <tr>
			    <td width="100%">
			      <p style="font-size: 15pt; font-family: 黑体; color: #999999">销售综合汇总表：- 销售综合汇总</p>  
			    </td>
			  </tr>
			</table>
	    </div>
			<table title="销售综合汇总表:人员-月度表" class="easyui-datagrid" id="staffMonthly" data-options="width:670,height:140,fitColumns:true"></table>
</div>
</div>
</body>
