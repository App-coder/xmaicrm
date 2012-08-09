<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>


<script type="text/javascript" 	src="resources/desktop/report/cangkuinfo.js"></script>

<body id="wrap">
<div id="main">
	<div class="container">
		<table border="0" width="100%" height="40" class=small>
		  <tr>
		    <td width="100%">
		      <p class='po'></p>   
		    </td>
		  </tr>
		</table>
        <p><font color="#808080">说明：根据当前产品库存数量和产品当前成本价，计算得出库存资产。</font></p>
		<table title="当前库存资产表" id="cangkuinfo" data-options="height:200,fitColumns:true"></table>
	</div>
</div>
</body>
