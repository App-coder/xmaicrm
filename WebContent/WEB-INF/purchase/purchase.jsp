<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>

<div class="container">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north',border:false">
		</div>
		<div data-options="region:'center',border:false"
			style="overflow: hidden">
			<table id="account_list" data-options="fit:true,fitColumns:true">
			     <tr>
					<td align="center">
					<img border="0" src="resources/images/purchase/nav/pur_01.jpg"><br>
					<img border="0" src="resources/images/purchase/nav/pur_02.jpg"><br>
					<img border="0" usemap="#Map" src="resources/images/purchase/nav/pur_03.jpg">
					</td>
					<td></td>
				 </tr>
				 <tr class="lvtColDataHover">
					<td align="center">
					<font size="5">
					</td>
				  </tr>
			</table>
			<map id="Map" name="Map">
				<area href="" coords="135, 30, 225, 130" shape="rect">
				<area href="" coords="560, 30, 640, 130" shape="rect">
			</map>
		</div>
		<c:if test="${repfields!=null }">
			<div data-options="region:'south',border:false">
				<div class="d_report ">
					<span class="icon-report view_span" >报表：</span>
					<select class="sel_120">
						<c:forEach items="${repfields}" var="f">
							<option>${f.columnname}</option>
						</c:forEach>
					</select>
					<a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-view'">预览</a>
				</div>
			</div>
		</c:if>
	</div>
</div>
