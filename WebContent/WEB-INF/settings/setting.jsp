<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/product/catalog.js"></script>
<div class="container"  >
<div data-options="region:'center',title:'产品列表'" style="overflow:hidden" >

	<div class="container panel-noscroll">
			<div class="panel datagrid">
				<div class="panel-header">
					<div class="panel-title">基本设置</div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
				<div style="display: block;">
				<table width="100%" cellspacing="0" cellpadding="10" border="0">
				<tbody><tr>
					<td width="12.5%" valign="top">
					<!-- icon 1-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('系统用户','settings/users/index')"><img width="48" height="48" border="0" title="系统用户" alt="系统用户" src="resources/images/settings/panel/ico-users.gif"></a></td>
							</tr>
							<tr>
							<td valign="top" class="big"><a href="javascript:tab('系统用户','settings/users/index')">系统用户</a></td>
						</tr>
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 2-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('角色权限','settings/role/index')"><img width="48" height="48" border="0" title="角色权限" alt="角色权限" src="resources/images/settings/panel/ico-roles.gif"></a></td>
							</tr>
							<tr>
							<td valign="top" class="big"><a href="javascript:tab('角色权限','settings/role/index')">角色权限</a></td>
						</tr>
						</tbody></table>
					</td>
					
					<td width="12.5%" valign="top">
					<!-- icon 4-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('部门机构','settings/group/index')"><img width="48" height="48" border="0" title="部门机构" alt="部门机构" src="resources/images/settings/panel/ico-groups.gif"></a></td>
						</tr>
							<tr>
							<td valign="top" class="big"><a href="javascript:tab('部门机构','settings/group/index')">部门机构</a></td>
						</tr>
						</tbody></table>
					</td>
				
					<td width="12.5%" valign="top">
					<!-- icon 5-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('全局共享规则','settings/orgsharingdetailview/index')"><img width="48" height="48" border="0" title="全局共享规则" alt="全局共享规则" src="resources/images/settings/panel/shareaccess.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('全局共享规则','settings/orgsharingdetailview/index')">全局共享规则</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 5-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('自定义共享规则','settings/customsharingdetailview/index')"><img width="48" height="48" border="0" title="自定义共享规则" alt="全局共享规则" src="resources/images/settings/panel/shareaccess.gif"></a>
							</td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('自定义共享规则','settings/customsharingdetailview/index')">自定义共享规则</a></td>
						</tr>
						
						</tbody></table>
					</td>

					<td width="12.5%" valign="top">
					<!-- icon 8-->	
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('登录历史','settings/loginhistory/index')"><img width="48" height="48" border="0" title="登录历史" alt="登录历史" src="resources/images/settings/panel/set-IcoLoginHistory.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('登录历史','settings/loginhistory/index')">登录历史</a></td>
						</tr>
						

						</tbody></table>
					</td>
					<td width="12.5%" valign="top"></td>
					<td width="12.5%" valign="top"></td>
					<!-- Row 3 -->
					</tr><tr>
				</tr>
				</tbody></table></div>
				</div>
			</div>
			
				<div class="panel datagrid mgt_10">
				<div class="panel-header">
					<div class="panel-title">系统定制 </div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
				<div style="display: block;">
				<table width="100%" class="tab_center" cellspacing="0" cellpadding="10" border="0">
				<tbody><tr>
				
					<td width="12.5%" valign="top">
					<!-- icon 10-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>

							<td valign="top"><a href="javascript:tab('下拉框选项','settings/picklist/index')"><img border="0" title="下拉框选项" alt="下拉框选项" src="resources/images/settings/panel/picklist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('下拉框选项','settings/picklist/index')">下拉框选项</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
						<!-- empty-->
							<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
							<tbody><tr>

								<td valign="top"><a href="javascript:tab('主菜单','settings/customtab/index')"><img border="0" title="主菜单" alt="主菜单" src="resources/images/settings/panel/mainmenu.gif"></a></td>
							</tr>
							<tr>
								<td valign="top" class="big"><a href="javascript:tab('主菜单','settings/customtab/index')">主菜单</a></td>
							</tr>
							
							</tbody></table>
					</td>
					
										<td width="12.5%" valign="top">
					<!-- empty-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('审批流程','settings/multiapprove/index')"><img width="48" height="48" border="0" src="resources/images/settings/panel/approvelist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('审批流程','settings/multiapprove/index')">审批流程</a></td>
						</tr>

						</tbody></table>
					</td>
					<td width="12.5%" valign="top"></td>
					<td width="12.5%" valign="top"></td>
					<td width="12.5%" valign="top"></td>
					<td width="12.5%" valign="top"></td>
					<td width="12.5%" valign="top"></td>
					</tr>
					
					
					</tbody></table>
				</div>
				
				</div>
				</div>
				
				<div class="panel datagrid mgt_10">
				<div class="panel-header">
					<div class="panel-title">其它设置 </div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
				<div style="display:block;">
				<table width="100%" cellspacing="0" cellpadding="10" border="0">
				<tbody><tr>
				        
				        <td width="12.5%" valign="top">
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('Email模版','settings/emailtemplates/index')"><img border="0" title="Email模版" alt="Email模版" src="resources/images/settings/panel/ViewTemplate.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('Email模版','settings/emailtemplates/index')">Email模版</a></td>

						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('数据库备份','settings/dbbackup/index')"><img border="0" title="数据库备份" alt="数据库备份" src="resources/images/settings/panel/dbbackup.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('数据库备份','settings/dbbackup/index')">数据库备份</a></td>

						</tr>
						
						</tbody></table>
					</td>
					
			
					
					<td width="12.5%" valign="top">
					<!-- icon 16-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">

						<tbody><tr>
							<td valign="top"><a href="javascript:tab('公司信息','settings/organizationconfig/index')"><img border="0" title="公司信息" alt="公司信息" src="resources/images/settings/panel/company.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('公司信息','settings/organizationconfig/index')">公司信息</a></td>
						</tr>
						
						</tbody></table>

					</td>
					<td width="12.5%" valign="top">
					<!-- icon 17-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('SMTP服务器','settings/emailconfig/index')"><img border="0" title="SMTP服务器" alt="SMTP服务器" src="resources/images/settings/panel/ogmailserver.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('SMTP服务器','settings/emailconfig/index')">SMTP服务器</a></td>
						</tr>

						
						</tbody></table>
					</td>

					<td width="12.5%" valign="top">
					<!-- icon 17-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('短信通道','settings/messageconfig/index')"><img border="0" title="短信通道" alt="短信通道" src="resources/images/settings/panel/ico_mobile.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('短信通道','settings/messageconfig/index')">短信通道</a></td>
						</tr>

						
						</tbody></table>
					</td>

					<td width="12.5%" valign="top">
					<!-- icon 17-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
					<tbody><tr>
						<td valign="top"><a href="javascript:tab('授权许可','settings/licenseconfig/index')"><img border="0" title="短信通道" alt="授权许可" src="resources/images/settings/panel/license.gif"></a></td>
						</tr>
						<tr>
						<td valign="top" class="big"><a href="javascript:tab('授权许可','settings/licenseconfig/index')">授权许可</a></td>
					</tr>

					
					</tbody></table>
					</td>	
					      <td width="12.5%" valign="top">
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('回收站','settings/recyclebin/index')"><img border="0" title="回收站" alt="回收站" src="resources/images/settings/panel/settingsTrash.gif"></a></td>
							
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('回收站','settings/recyclebin/index')">回收站</a></td>

						</tr>
						</tbody></table>
					</td>
				        <td width="12.5%" valign="top">
				        
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="javascript:tab('多仓库管理','settings/multiwarehouse/index')"><img border="0" title="多仓库管理" alt="多仓库管理" src="resources/images/settings/panel/cangku.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="javascript:tab('多仓库管理','settings/multiwarehouse/index')">多仓库管理</a></td>

						</tr>
						
						</tbody></table>
					</td>				
				</tr>
		</tbody></table>
				</div>
				</div>
				</div>
				
			
			
	</div>
</div>
</div>