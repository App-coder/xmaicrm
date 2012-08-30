<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script>
var entitytype = '${entitytype}';
</script>
<script type="text/javascript"
	src="resources/desktop/public/customview.js"></script>
<div class="container"  >
	<div class="hidden">
		<div id="customview_edit" iconCls="icon-save" style="width: 800px; height: 480px;" class="easyui-window" <%=win_topbar %> title="属性编辑">
		<div class="easyui-layout" data-options="fit:true">
			<div region="center" border="false" class="bdcenter">
				<fieldset>
					<legend>基本信息</legend>
					<table class="tab_form">
						<tr>
							<td>视图名称&nbsp;&nbsp;<input type="text" class="text"/></td>
							<td>默认视图&nbsp;&nbsp;<input type="checkbox"/></td>
							<td>首页关键视图列表中显示&nbsp;&nbsp;<input type="checkbox"/></td>
							<td>公共视图&nbsp;&nbsp;<input type="checkbox"/></td>
							<td>角色&nbsp;&nbsp;<select><option>财务总监</option></select></td>
						</tr>
					</table>
				</fieldset>
				<br>
				<fieldset>
					<legend>选择列表中显示字段 </legend>
					<table class="tab_form">
						<tr>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
						</tr>
						<tr>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
						</tr>
						<tr>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
							<td><input type="text" class="text"/></td>
					</table>
				</fieldset>
				<br>
				<fieldset>
					<legend>选择列表中汇总字段</legend>
					<table class="tab_form">
						<tr>
							<td><input type="text" class="text"/></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</fieldset>
				<br>
				<fieldset>
					<legend>设置过滤条件</legend>
					<table class="tab_form">
						<tr>
							<td>
							<div class="easyui-tabs" style="width:720px;"  >
						<div title="基本条件 " class="p10" >
						<p>
						设置查询条件以过滤视图列表：<br>
						1)当时间段为自定义时，开始日期和结束日期将为指定的日期，例如2010-10-10。<br>
						2)当时间段为非自定义时，开始日期和结束日期将为动态的日期，例如选择本周时，开始日期和结束日期将分别为本周的周一和周末，而不是固定的日期。<br>
						</p>
						<fieldset>
							<legend>根据时间类型字段设置过滤条件</legend>
							<table class="tab_form">
							<tr>
							<td class="edittd">
							选择查询字段
							</td>
							<td>
							<input type="text" class="text" />
							</td>
							</tr>
							<tr>
							<td class="edittd">
							选择时间段
							</td>
							<td>
							<input type="text" class="text"/>
							</td>
							</tr>
							<tr>
							<td class="edittd">
							开始日期
							</td>
							<td>
							<input type="text" class="text"/>
							</td>
							</tr>
							<tr>
							<td class="edittd">
							结束日期
							</td>
							<td>
							<input type="text" class="text"/>
							</td>
							</tr>
							</table>
						</fieldset>
						</div>
						<div title="高级条件 " class="p10" >
						<p>
						设置查询条件以过滤视图列表：<br>
						1)你可以在第三列中使用or来输入多个条件。<br>
						2)你至多可以输入10个条件，并以逗号分割。例如：CA, NY, TX, FL 查找CA 或 NY 或 TX 或 FL. <br>
						</p>
						<fieldset>
							<legend>根据字段设置过滤条件</legend>
							<table class="tab_form">
								<tr>
									<td><select class="text"></select></td>
									<td><select class="text"></select></td>
									<td><input type="text" class="text"/></td>
								</tr>
							</table>
						</fieldset>
						</div>
					</div>
							</td>
						</tr>
					</table>
				</fieldset>
				<br>
			</div>
			<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="editpos()">编辑</a> 
					<a class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="editpos()">取消</a> 
			</div>
		</div>
		</div>
	</div>
	<table id="customview_list" data-options="fit:true,fitColumns:true"></table>
</div>