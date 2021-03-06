<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="path" >&gt;<a  href="crm/welcome/desktop">控制面板</a></div>
		<div class="container panel-noscroll">
			<div class="panel datagrid">
				<div class="panel-header">
					<div class="panel-title">基本设置</div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
					<div style="display: block;">
						<table width="100%" cellspacing="0" cellpadding="10" border="0">
							<tbody>
								<tr>
									<td width="12.5%" valign="top">
										<!-- icon 1-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/users/index"><img
															width="48" height="48" border="0" title="系统用户" alt="系统用户"
															src="resources/images/settings/panel/ico-users.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/users/index">系统用户</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									<td width="12.5%" valign="top">
										<!-- icon 2-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/role/index"><img
															width="48" height="48" border="0" title="角色权限" alt="角色权限"
															src="resources/images/settings/panel/ico-roles.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/role/index">角色权限</a></td>
												</tr>
											</tbody>
										</table>
									</td>

									<td width="12.5%" valign="top">
										<!-- icon 4-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/group/index"><img
															width="48" height="48" border="0" title="部门机构" alt="部门机构"
															src="resources/images/settings/panel/ico-groups.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/group/index">部门机构</a></td>
												</tr>
											</tbody>
										</table>
									</td>


									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/deforgshare/index"><img
															width="48" height="48" border="0" title="全局共享规则"
															alt="全局共享规则"
															src="resources/images/settings/panel/shareaccess.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/deforgshare/index">全局共享规则</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/customsharings/index"><img
															width="48" height="48" border="0" title="自定义共享规则"
															alt="自定义共享规则"
															src="resources/images/settings/panel/shareaccess.gif"></a>
													</td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/customsharings/index">自定义共享规则</a></td>
												</tr>

											</tbody>
										</table>
									</td>
								
									
									
									<td width="12.5%" valign="top">
										<!-- icon 8-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/systemlog/index"><img
															width="48" height="48" border="0" title="系统日志" alt="系统日志"
															src="resources/images/settings/panel/audit.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/systemlog/index">系统日志</a></td>
												</tr>
											</tbody>
										</table>
									</td>

									<td width="12.5%" valign="top">
										<!-- icon 8-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/loginhistory/index"><img
															width="48" height="48" border="0" title="登录历史" alt="登录历史"
															src="resources/images/settings/panel/set-IcoLoginHistory.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/loginhistory/index">登录历史</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									<td width="12.5%" valign="top"></td>
									
								</tr>
								<tr>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="panel datagrid mgt_10">
				<div class="panel-header">
					<div class="panel-title">系统定制</div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
					<div style="display: block;">
						<table width="100%" class="tab_center" cellspacing="0"
							cellpadding="10" border="0">
							<tbody>
								<tr>
									<td width="12.5%" valign="top">
										<!-- icon 10-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/customblock/index"><img
															border="0" title="显示区域" alt="显示区域"
															src="resources/images/settings/panel/blocklist.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/customblock/index">显示区域</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- icon 10-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/customfield/index"><img
															border="0" title="自定义字段" alt="自定义字段"
															src="resources/images/settings/panel/custom.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/customfield/index">自定义字段</a></td>
												</tr>

											</tbody>
										</table>
									</td>

									<td width="12.5%" valign="top">
										<!-- icon 10-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/picklist/index"><img
															border="0" title="下拉框选项" alt="下拉框选项"
															src="resources/images/settings/panel/picklist.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/picklist/index">下拉框选项</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- icon 10-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/layoutlist/index"><img
															border="0" title="页面布局" alt="页面布局"
															src="resources/images/settings/panel/layout.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/layoutlist/index">页面布局</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- empty-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/parenttab/index"><img
															border="0" title="主菜单" alt="主菜单"
															src="resources/images/settings/panel/mainmenu.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/parenttab/index">主菜单</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- empty-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/deforgfield/index"><img
															border="0" title="全局字段" alt="全局字段"
															src="resources/images/settings/panel/orgshar.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/deforgfield/index">全局字段</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- empty-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>

													<td valign="top"><a
														href="crm/settings/relatedlists/index"><img
															border="0" title="相关信息" alt="相关信息"
															src="resources/images/settings/panel/relatedinfo.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/relatedlists/index">相关信息</a></td>
												</tr>

											</tbody>
										</table>
									</td>
									
																	<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="javascript:tab('打印模板','settings/multiapprove/index')"><img
															width="48" height="48" border="0"
															src="resources/images/settings/panel/printtemplate.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="javascript:tab('打印模板','settings/multiapprove/index')">打印模板</a></td>
												</tr>
											</tbody>
										</table>
									</td>

								</tr>
								<tr>

									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/productfield/index"><img
															width="48" height="48" border="0"
															src="resources/images/settings/panel/productfield.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/productfield/index">关联产品字段</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/multiapprove/index"><img
															width="48" height="48" border="0"
															src="resources/images/settings/panel/approvelist.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/multiapprove/index">审批流程</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/multifield/index"><img
															width="48" height="48" border="0"
															src="resources/images/settings/panel/relatedfield.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/multifield/index">级联字段</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									
								 <td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/relmodfield/index"><img
															width="48" height="48" border="0"
															src="resources/images/settings/panel/productfield.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/relmodfield/index">相关信息模块字段</a></td>
												</tr>
											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top"></td>
									<td width="12.5%" valign="top"></td>
									<td width="12.5%" valign="top"></td>
									<td width="12.5%" valign="top"></td>
								</tr>
							</tbody>
						</table>
					</div>

				</div>
			</div>

			<div class="panel datagrid mgt_10">
				<div class="panel-header">
					<div class="panel-title">其它设置</div>
					<div class="panel-tool"></div>
				</div>
				<div class="datagrid-wrap panel-body p10 ">
					<div style="display: block;">
						<table width="100%" cellspacing="0" cellpadding="10" border="0">
							<tbody>
								<tr>

									<td width="12.5%" valign="top">
										<!-- icon 11-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/emailtemplates/index"><img
															border="0" title="Email模版" alt="Email模版"
															src="resources/images/settings/panel/ViewTemplate.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/emailtemplates/index">Email模版</a></td>

												</tr>

											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/dbbackup/index"><img
															border="0" title="数据库备份" alt="数据库备份"
															src="resources/images/settings/panel/dbbackup.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/dbbackup/index">数据库备份</a></td>

												</tr>

											</tbody>
										</table>
									</td>
									<td width="12.5%" valign="top">
										<!-- icon 16-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">

											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/organizationconfig/index"><img
															border="0" title="公司信息" alt="公司信息"
															src="resources/images/settings/panel/company.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/organizationconfig/index">公司信息</a></td>
												</tr>

											</tbody>
										</table>

									</td>
									<td width="12.5%" valign="top">
										<!-- icon 17-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/system/index"><img
															border="0" title="SMTP服务器" alt="SMTP服务器"
															src="resources/images/settings/panel/ogmailserver.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/system/index">SMTP服务器</a></td>
												</tr>


											</tbody>
										</table>
									</td>

									<td width="12.5%" valign="top">
										<!-- icon 17-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/messageaccount/index"><img
															border="0" title="短信通道" alt="短信通道"
															src="resources/images/settings/panel/ico_mobile.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/messageaccount/index">短信通道</a></td>
												</tr>


											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<!-- icon 17-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/currencyInfo/index"><img
															border="0" title="货币币种" alt="货币币种"
															src="resources/images/settings/panel/currency.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/currencyInfo/index">货币币种</a></td>
												</tr>


											</tbody>
										</table>
									</td>

									<td width="12.5%" valign="top">
										<!-- icon 17-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/license/index"><img
															border="0" title="授权许可" alt="授权许可"
															src="resources/images/settings/panel/license.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/license/index">授权许可</a></td>
												</tr>


											</tbody>
										</table>
									</td>
									
									<td width="12.5%" valign="top">
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/recyclebin/index"><img
															border="0" title="回收站" alt="回收站"
															src="resources/images/settings/panel/settingsTrash.gif"></a></td>

												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/recyclebin/index">回收站</a></td>

												</tr>
											</tbody>
										</table>
									</td>
									
									
								</tr>
								<tr >
<td width="12.5%" valign="top">
										<!-- icon 11-->
										<table width="100%" class="tab_center" cellspacing="0"
											cellpadding="5" border="0">
											<tbody>
												<tr>
													<td valign="top"><a
														href="crm/settings/cangkus/index"><img
															border="0" title="多仓库管理" alt="多仓库管理"
															src="resources/images/settings/panel/cangku.gif"></a></td>
												</tr>
												<tr>
													<td valign="top" class="big"><a
														href="crm/settings/cangkus/index">多仓库管理</a></td>

												</tr>

											</tbody>
										</table>
									</td>
									<td width="12.5%" valign="top">
									</td>
									<td width="12.5%" valign="top">
									</td>
									<td width="12.5%" valign="top">
									</td>
									<td width="12.5%" valign="top">
									</td>
									<td width="12.5%" valign="top">
									</td>
									<td width="12.5%" valign="top">
									</td>				
									<td width="12.5%" valign="top">
									</td>																																																		
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

	</div>
	<%@ include file="../foot.jsp"%>
</body>
</html>