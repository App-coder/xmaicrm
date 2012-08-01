<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../head_portlets.jsp"%>
<cache:cache>
<script type="text/javascript" src="resources/desktop/portlets/salesyearinfo.js"></script>
</head>
<body>
<table class="tabsaleyearinfo">
	<thead>
		<tr>
			<td colspan="4"><span id="year"></span></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td width="25%" class="lefttd" >回款</td>
			<td width="25%"><span id="sumgathersactual"></span></td>
			<td width="25%" class="lefttd" >费用</td>
			<td width="25%"><span id="sumexpensestotal"></span></td>
		</tr>
		<tr>
			<td class="lefttd" >签约额</td>
			<td><span id="salessumtotle"></span></td>
			<td class="lefttd" >签约数</td>
			<td><span id="salescount"></span></td>
		</tr>
		<tr>
			<td class="lefttd" >新客户</td>
			<td colspan="3"><span id="newcustomer"></span></td>
		</tr>
	</tbody>
</table>
</body>
</html>
</cache:cache>