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
							<td valign="top"><a href="index.php?module=Users&amp;action=index&amp;parenttab=Settings"><img width="48" height="48" border="0" title="系统用户" alt="系统用户" src="resources/images/settings/panel/ico-users.gif"></a></td>
							</tr>
							<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=index&amp;parenttab=Settings">系统用户</a></td>
						</tr>
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 2-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=listroles&amp;parenttab=Settings"><img width="48" height="48" border="0" title="角色权限" alt="角色权限" src="resources/images/settings/panel/ico-roles.gif"></a></td>
							</tr>
							<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=listroles&amp;parenttab=Settings">角色权限</a></td>
						</tr>
						</tbody></table>
					</td>
					
					<td width="12.5%" valign="top">
					<!-- icon 4-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=listgroups&amp;parenttab=Settings"><img width="48" height="48" border="0" title="部门机构" alt="部门机构" src="resources/images/settings/panel/ico-groups.gif"></a></td>
						</tr>
							<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=listgroups&amp;parenttab=Settings">部门机构</a></td>
						</tr>
						</tbody></table>
					</td>
				
					<td width="12.5%" valign="top">
					<!-- icon 5-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=OrgSharingDetailView&amp;parenttab=Settings"><img width="48" height="48" border="0" title="全局共享规则" alt="全局共享规则" src="resources/images/settings/panel/shareaccess.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=OrgSharingDetailView&amp;parenttab=Settings">全局共享规则</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 5-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=CustomSharingDetailView&amp;parenttab=Settings"><img width="48" height="48" border="0" title="自定义共享规则" alt="全局共享规则" src="resources/images/settings/panel/shareaccess.gif"></a>
							</td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomSharingDetailView&amp;parenttab=Settings">自定义共享规则</a></td>
						</tr>
						
						</tbody></table>
					</td>

					
					<td width="12.5%" valign="top">
					<!-- icon 7-->
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=AuditTrailList&amp;parenttab=Settings"><img border="0" title="系统日志" alt="系统日志" src="resources/images/settings/panel/audit.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=AuditTrailList&amp;parenttab=Settings">系统日志</a></td>
						</tr>

						
						</tbody></table>

						
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 8-->	
						<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=ListLoginHistory&amp;parenttab=Settings"><img width="48" height="48" border="0" title="登录历史" alt="登录历史" src="resources/images/settings/panel/set-IcoLoginHistory.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=ListLoginHistory&amp;parenttab=Settings">登录历史</a></td>
						</tr>
						

						</tbody></table>
					</td>
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
					<!-- empty-->
						<table width="100%" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>

							<td valign="top"><a href="index.php?module=Settings&amp;action=CustomModuleList&amp;parenttab=Settings"><img border="0" title="模块开发" alt="模块开发" src="resources/images/settings/panel/modulelist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomModuleList&amp;parenttab=Settings">模块开发</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>

							<td valign="top"><a href="index.php?module=Settings&amp;action=CustomBlockList&amp;parenttab=Settings"><img border="0" title="显示区域" alt="显示区域" src="resources/images/settings/panel/blocklist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomBlockList&amp;parenttab=Settings">显示区域</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 9-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=CustomFieldList&amp;parenttab=Settings"><img border="0" title="自定义字段" alt="自定义字段" src="resources/images/settings/panel/custom.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomFieldList&amp;parenttab=Settings">自定义字段</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 10-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>

							<td valign="top"><a href="index.php?module=Settings&amp;action=PickList&amp;parenttab=Settings"><img border="0" title="下拉框选项" alt="下拉框选项" src="resources/images/settings/panel/picklist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=PickList&amp;parenttab=Settings">下拉框选项</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
						<!-- empty-->
							<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
							<tbody><tr>

								<td valign="top"><a href="index.php?module=Settings&amp;action=LayoutList&amp;parenttab=Settings"><img border="0" title="页面布局" alt="页面布局" src="resources/images/settings/panel/layout.gif"></a></td>
							</tr>
							<tr>
								<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=LayoutList&amp;parenttab=Settings">页面布局</a></td>
							</tr>
							
							</tbody></table>
					</td>
					<td width="12.5%" valign="top">
						<!-- empty-->
							<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
							<tbody><tr>

								<td valign="top"><a href="index.php?module=Settings&amp;action=CustomTabList&amp;parenttab=Settings"><img border="0" title="主菜单" alt="主菜单" src="resources/images/settings/panel/mainmenu.gif"></a></td>
							</tr>
							<tr>
								<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomTabList&amp;parenttab=Settings">主菜单</a></td>
							</tr>
							
							</tbody></table>
					</td>
					<!-- icon 6 -->
					<td width="12.5%" valign="top">
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Users&amp;action=DefaultFieldPermissions&amp;parenttab=Settings"><img width="48" height="48" border="0" title="全局字段" alt="全局字段" src="resources/images/settings/panel/orgshar.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=DefaultFieldPermissions&amp;parenttab=Settings">全局字段</a></td>
						</tr>
						
						</tbody></table>
					</td>
					
					<!-- icon 6 -->
					<td width="12.5%" valign="top">
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=RelatedList&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/relatedinfo.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=RelatedList&amp;parenttab=Settings">相关信息</a></td>
						</tr>
						
						</tbody></table>
					</td>
					</tr>
					</tbody></table>
				</div>
				
				<div style="display:block;">
				<table width="100%" class="tab_center" cellspacing="0" cellpadding="10" border="0">
				<tbody><tr>
				        <td width="12.5%" valign="top">
					<!-- empty-->
						<table width="100%" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=PrintTemplate&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/printtemplate.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=PrintTemplate&amp;parenttab=Settings">打印模板</a></td>
						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=ProductField&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/productfield.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=ProductField&amp;parenttab=Settings">关联产品字段</a></td>
						</tr>
						
						</tbody></table>
						
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=MultiApprove&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/approvelist.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=MultiApprove&amp;parenttab=Settings">审批流程</a></td>
						</tr>

						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=CustomMultiFieldList&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/relatedfield.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CustomMultiFieldList&amp;parenttab=Settings">级联字段</a></td>
						</tr>

						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=RelmodField&amp;parenttab=Settings"><img width="48" height="48" border="0" src="resources/images/settings/panel/productfield.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=RelmodField&amp;parenttab=Settings">相关信息模块字段</a></td>
						</tr>
						
						</tbody></table>
						
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						
					</td>
					<td width="12.5%" valign="top">
					<!-- empty-->
						
					</td>
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
							<td valign="top"><a href="index.php?module=Users&amp;action=listemailtemplates&amp;parenttab=Settings"><img border="0" title="Email模版" alt="Email模版" src="resources/images/settings/panel/ViewTemplate.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Users&amp;action=listemailtemplates&amp;parenttab=Settings">Email模版</a></td>

						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=db_backup&amp;parenttab=Settings"><img border="0" title="数据库备份" alt="数据库备份" src="resources/images/settings/panel/dbbackup.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=db_backup&amp;parenttab=Settings">数据库备份</a></td>

						</tr>
						
						</tbody></table>
					</td>
					
			
					
					<td width="12.5%" valign="top">
					<!-- icon 16-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">

						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=OrganizationConfig&amp;parenttab=Settings"><img border="0" title="公司信息" alt="公司信息" src="resources/images/settings/panel/company.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=OrganizationConfig&amp;parenttab=Settings">公司信息</a></td>
						</tr>
						
						</tbody></table>

					</td>
					<td width="12.5%" valign="top">
					<!-- icon 17-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=EmailConfig&amp;parenttab=Settings"><img border="0" title="SMTP服务器" alt="SMTP服务器" src="resources/images/settings/panel/ogmailserver.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=EmailConfig&amp;parenttab=Settings">SMTP服务器</a></td>
						</tr>

						
						</tbody></table>
					</td>

					<td width="12.5%" valign="top">
					<!-- icon 17-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=MessageConfig&amp;parenttab=Settings"><img border="0" title="短信通道" alt="短信通道" src="resources/images/settings/panel/ico_mobile.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=MessageConfig&amp;parenttab=Settings">短信通道</a></td>
						</tr>

						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- icon 18-->
					        <table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=CurrencyListView&amp;parenttab=Settings"><img border="0" title="货币币种" alt="货币币种" src="resources/images/settings/panel/currency.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=CurrencyListView&amp;parenttab=Settings">货币币种</a></td>
						</tr>

						
						</tbody></table>				       

					</td>

					
					
				       <td width="12.5%" valign="top">
					<!-- icon 9-->	
					<table width="100%" class="tab_center"  cellspacing="0" cellpadding="5" border="0">
					<tbody><tr>
						<td valign="top"><a href="index.php?module=Users&amp;action=DefModuleView&amp;parenttab=Settings"><img width="48" height="48" border="0" title="单页显示方式" alt="单页显示方式" src="resources/images/settings/panel/set-IcoTwoTabConfig.gif"></a></td>
					</tr>
					<tr>
						<td valign="top" class="big"><a href="index.php?module=Users&amp;action=DefModuleView&amp;parenttab=Settings">单页显示方式</a></td>
					</tr>
					

					</tbody></table>
					</td>
		
					<td width="12.5%" valign="top">
					<!-- icon 17-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
					<tbody><tr>
						<td valign="top"><a href="index.php?module=Settings&amp;action=LicenseConfig&amp;parenttab=Settings"><img border="0" title="短信通道" alt="授权许可" src="resources/images/settings/panel/license.gif"></a></td>
						</tr>
						<tr>
						<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=LicenseConfig&amp;parenttab=Settings">授权许可</a></td>
					</tr>

					
					</tbody></table>
					</td>					
				</tr>
                <tr>
				        <td width="12.5%" valign="top">
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Recyclebin&amp;action=index&amp;parenttab=Settings"><img border="0" title="回收站" alt="回收站" src="resources/images/settings/panel/settingsTrash.gif"></a></td>
							
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Recyclebin&amp;action=index&amp;parenttab=Settings">回收站</a></td>

						</tr>
						</tbody></table>
					</td>
				        <td width="12.5%" valign="top">
				        
					<!-- icon 11-->
						<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
						<tbody><tr>
							<td valign="top"><a href="index.php?module=Settings&amp;action=MultiWarehouseListView&amp;parenttab=Settings"><img border="0" title="多仓库管理" alt="多仓库管理" src="resources/images/settings/panel/cangku.gif"></a></td>
						</tr>
						<tr>
							<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=MultiWarehouseListView&amp;parenttab=Settings">多仓库管理</a></td>

						</tr>
						
						</tbody></table>
					</td>
					<td width="12.5%" valign="top">
					<!-- Sync Shopex DB-->
					<table width="100%" class="tab_center" cellspacing="0" cellpadding="5" border="0">
					<tbody><tr>
						<td valign="top"><a href="index.php?module=Settings&amp;action=ShopexConfig&amp;parenttab=Settings"><img border="0" title="导入Shopex" alt="导入Shopex" src="resources/images/settings/panel/ogmailserver.gif"></a></td>
						</tr>
						<tr>
						<td valign="top" class="big"><a href="index.php?module=Settings&amp;action=ShopexConfig&amp;parenttab=Settings">导入Shopex</a></td>
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