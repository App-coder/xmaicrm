<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head_portlets.jsp"%>
</head>
<body>
<table class="tablist">
	<tr>
		<td class="pl5">应收款客户汇总：共有${gathers.countofuser } 家客户，应收总计${gathers.countOfMoney } 元 </td>
	</tr>
	<tr>
		<td class="pl5">应付款客户汇总：共有 ${customercharge.countofuser } 家客户，应收总计${customercharge.countOfMoney }元 </td>
	</tr>
	<tr>
		<td class="pl5">应付款供应商汇总：共有 ${suppliercharge.countofuser } 家供应商，应收总计${suppliercharge.countOfMoney }元 </td>
	</tr>
</table>
</body>
</html>