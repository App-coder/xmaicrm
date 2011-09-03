<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<div class="container"  >
<div style="width:80%;position:relative;" >
	<table width="780" border="0">
	<tbody><tr><td align="center"><img border="0" src="resources/images/inventory/nav/inv_01.jpg"><br>
	<img border="0" src="resources/images/inventory/nav/inv_02.jpg"><br>
	<img border="0" usemap="#Map" src="resources/images/inventory/nav/inv_03.jpg">
	</td><td></td></tr>
	<tr class="lvtColDataHover">
	<td align="center"><font size="5"><b></b></font></td>
	</tr>
	</tbody></table>
	<map id="Map" name="Map">
	<area href="index.php?action=index&amp;module=Warehouses&amp;parenttab=Inventory" coords="235, 30, 320, 130" shape="rect">
	<area href="index.php?action=index&amp;module=Deliverys&amp;parenttab=Inventory" coords="480, 30, 565, 130" shape="rect">
	</map>
</div>
</div>