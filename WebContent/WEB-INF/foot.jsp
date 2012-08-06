<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="div_foot" class="footercss">
	<table width="100%" cellspacing="0" cellpadding="5" border="0"
		style="padding: 8px 20px; display: table; height: 40px;">
		<tbody>
			<tr>
				<td align="left" class="small"><span
					style="color: rgb(153, 153, 153);">Powered by 新麦 CRM <span
						id="_vtiger_product_version_">2.0</span></span></td>
				<td align="right" class="small"><span>&copy; 2012-2014 <a
						href="http://www.x-mai.com" target="_blank">x-mai.com</a>
				</span></td>
			</tr>
		</tbody>
	</table>
</div>
<div class="hidden">
	<div id="wind_msg" iconCls="icon-save"
		style="width: 700px; height: 432px;" class="easyui-window p10"
		<%=win_topbar %> title="手机短信">
		<div  class="easyui-tabs" fit="true" >
			<div title="发短信" class="p10">
				<table class="tab_form">
					<tr>
						<td class="edittd" valign="top">短信账号</td>
						<td valign="top"><textarea style="height:78px;"></textarea></td>
						<td valign="top" style="width:100px;" rowspan="2" >
						<a class="easyui-linkbutton mgb_5" width="90px" onclick="formsubmit('form_customview')">选择联系人</a><br>
						<a class="easyui-linkbutton mgb_5" width="90px" onclick="formsubmit('form_customview')">选择用户</a><br>
						<a class="easyui-linkbutton mgb_5" width="90px" onclick="formsubmit('form_customview')">选择供应商</a>
						</td>
					</tr>
					<tr>
						<td class="edittd" valign="top">短信内容</td>
						<td valign="top" >
							<textarea style="height:78px;"></textarea>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>你还能输入:<span class="red">65</span>个字...</td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td colspan="2">
						<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">发送</a>
						<a class="easyui-linkbutton fr" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">测试发送给自己</a>
						</td>
					</tr>
				</table>
			</div>
			<div title="收件箱" class="p10">
				<table id="messagelist"></table>
			</div>
			<div title="查看余额" class="p10">
				<table class="tab_form">
					<tr>
						<td class="edittd" >余额</td>
						<td></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div id="wind_approve" iconCls="icon-save"
		style="width: 700px; height: 432px;" class="easyui-window p10"
		<%=win_topbar %> title="我的审批中心"></div>
	<div id="wind_remind" iconCls="icon-save"
		style="width: 700px; height: 432px;" class="easyui-window p10"
		<%=win_topbar %> title="自定义提醒"></div>
</div>
<script type="text/javascript" src="resources/desktop/foot.js"></script>
