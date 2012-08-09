<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<script>
var duedate="${duedate}";
var id=${id};
</script>

<script type="text/javascript" 	src="resources/desktop/report/reports.js"></script>	
<script type="text/javascript" 	src="resources/desktop/report/modelreports.js"></script>
<script type="text/javascript" 	src="resources/desktop/report/querysql.js"></script>


<body id="wrap">
<div id="main">
<div class="container">
        <table border="0" width="100%" height="40" class=small>
		  <tr>
		    <td width="100%">
		      <p class='po'>
		        
		      </p>   
		    </td>
		  </tr>
		</table>
		<div style="height:600px">
		<table id="modelreports" data-options="fit:true,fitColumns:true"></table>
		</div>
</div>
</div>
</body>
