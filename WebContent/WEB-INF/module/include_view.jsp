<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="hidden">
    	
    	<div id="wind_batchUpdate" iconCls="icon-edit"
			style="width: 500px; height: 309px;" class="easyui-window p10"
			<%=win_topbar%> title="批量修改 " >
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding:10px;">
						<table class="tab_editlist">
							<tr>
								<td>选择字段</td>
							</tr>
							<tr>
								<td><select class="text" ></select></td>
							</tr>
						</table>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('wind_batchUpdate')">取消</a>
					</div>
				</div>
		</div>
		
		<div id="wind_smowerUpdate" iconCls="icon-edit"
			style="width: 500px; height: 309px;" class="easyui-window p10"
			<%=win_topbar%> title="修改负责人 " >
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding:10px;">
						<table class="tab_editlist">
							<tr>
								<td>选择负责人</td>
							</tr>
							<tr>
								<td>
									<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/relation/users/getSmowners'" ></select>
								</td>
							</tr>
						</table>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('wind_batchUpdate')">取消</a>
					</div>
				</div>
		</div>
		
		<div id="wind_share" iconCls="icon-edit"
			style="width: 500px; height: 309px;" class="easyui-window p10"
			<%=win_topbar%> title="共享" >
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" style="padding:10px;">
						<table class="tab_editlist">
							<tr>
								<td>选择共享用户</td>
							</tr>
							<tr>
								<td>
									<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/relation/users/getCkSmowners',checkbox:true,multiple:true"  ></select>
								</td>
							</tr>
						</table>
					</div>
					<div region="south" class="btnbar" border="false">
						<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('wind_share')">取消</a>
					</div>
				</div>
		</div>
</div>