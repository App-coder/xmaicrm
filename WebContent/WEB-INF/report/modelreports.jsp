<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>
<script>
var duedate="${duedate}";
var id=${id};
</script>

<script type="text/javascript" 	src="resources/desktop/report/reports.js"></script>	
<script type="text/javascript" 	src="resources/desktop/report/modelreports.js"></script>
<script type="text/javascript" 	src="resources/desktop/report/querysql.js"></script>



<div class="container">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="modelreports" data-options="fit:true,fitColumns:true"></table>
		</div>
	</div>
</div>
