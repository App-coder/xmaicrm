<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<script>
    var pathname = "编辑权限";
    var pArgs = "${profile.profilename}";
</script>
<%@ include file="../../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/role/showAdd.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="path" id="navpath"></div>
		<fieldset class="mgb_10">
								<legend>全局权限 </legend>
								<table class="tab_form">
									<tr>
										<td>
								<c:choose>
									<c:when test="${globalpermissions[0].globalactionpermission == 1 }">
										<input  type="checkbox" />
									</c:when>
									<c:otherwise>
										<input  type="checkbox" checked="checked" />
									</c:otherwise>
								</c:choose>
										查看下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。<br>
										允许 "${role.rolename}" 查看下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。
										</td>
									</tr>
									<tr>
										<td>
								<c:choose>
									<c:when test="${globalpermissions[1].globalactionpermission == 1 }">
										<input  type="checkbox" />
									</c:when>
									<c:otherwise>
										<input  type="checkbox" checked="checked" />
									</c:otherwise>
								</c:choose>编辑下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。<br>
								允许 "${role.rolename}" 编辑下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。
								</td>
									</tr>
									<tr>
										<td><span class="red">注意：全局权限仅仅指角色对下面所选模块(即打勾模块)的统一操作权力，并不是对系统内所有模块的操作权限。</span></td>
									</tr>
								</table>
							</fieldset>
							<fieldset class="mgb_10">
								<legend>模块权限 </legend>
								<div class="bbar" >
								<span class="red" >注意：以下权限设置的记录仅仅是指本角色自己负责的记录，不涉及其他角色负责的记录，对其他用户负责记录权限的设置在共享规则中。</span>
								</div>
								<table class="tabauth " id="tabRoleAuth">
									<thead>
										<tr class="datagrid-header">
											<td width="16%">模块名称</td>
											<td width="16%">新增</td>
											<td width="16%">编辑</td>
											<td width="16%">查看</td>
											<td width="16%">删除</td>
											<td width="16%">字段/工具</td>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${modulePermission }" var="m">
											<tr>
												<td class="mod">
												<c:choose>
													<c:when test="${m.tabpermission == 0 }">
														<input type="checkbox" checked="checked"  />
													</c:when>
													<c:otherwise>
														<input type="checkbox"  />
													</c:otherwise>
												</c:choose>
												&nbsp;${m.tablabel }</td>
												
												<c:choose>
													<c:when test="${m.create ==null }">
														<td colspan="5">${m.permission }</td>
													</c:when>
													<c:otherwise>
													<td>
														<c:choose>
															<c:when test="${m.create == 0 }">
																<input type="checkbox" checked="checked"  />
															</c:when>
															<c:otherwise>
																<input type="checkbox"  />
															</c:otherwise>
														</c:choose>
														</td>
														<td>
														<c:choose>
															<c:when test="${m.edit == 0 }">
																<input type="checkbox" checked="checked"  />
															</c:when>
															<c:otherwise>
																<input type="checkbox"  />
															</c:otherwise>
														</c:choose></td>
														<td>
														<c:choose>
															<c:when test="${m.view == 0 }">
																<input type="checkbox" checked="checked"  />
															</c:when>
															<c:otherwise>
																<input type="checkbox"  />
															</c:otherwise>
														</c:choose>
														</td>
														<td>
														<c:choose>
															<c:when test="${m.del == 0 }">
																<input type="checkbox" checked="checked"  />
															</c:when>
															<c:otherwise>
																<input type="checkbox"  />
															</c:otherwise>
														</c:choose>
														</td>
														<td><a  class="easyui-linkbutton" onclick="changeFieldBlock('${m.tabid }_field',this)" >展开</a></td>
														
													</c:otherwise>
												</c:choose>
												
												
											</tr>
											<if test="${m.profile2fields!=null }">
												<tr id="${m.tabid }_field" class="hidden" >
													<td colspan="6" class="p10" >
														<table class="tab_field">
															<thead>
																<tr class="datagrid-header" >
																	<td width="15%">字段</td>
																	<td width="10%">权限</td>
																	<td width="15%">字段</td>
																	<td width="10%">权限</td>
																	<td width="15%">字段</td>
																	<td width="10%">权限</td>
																	<td width="15%">字段</td>
																	<td width="10%">权限</td>
																</tr>
															</thead>
															<tbody>
															<c:forEach items="${m.profile2fields }" var="p" varStatus="s">
																<c:if test="${s.count==0}">
																<tr class="p10">
																</c:if>
																	<td>
																		<input type="checkbox"/>&nbsp;${p.fieldlabel }
																	</td>
																	<td><input type="checkbox"/>&nbsp;可见</td>
																<c:choose>
																	<c:when test="${s.count%4==0&&s.count!=0&&s.count!=fn:length(m.profile2fields) }">
																	</tr>
																	<tr>
																	</c:when>
																	<c:when test="${s.count ==fn:length(m.profile2fields) }">
																		<c:if test="${s.count%4 > 0 }">
																		<c:forEach begin="1" end="${4-s.count%4}"><td></td><td></td></c:forEach>																		
																		</c:if>
																		</tr>
																	</c:when>
																</c:choose>
															</c:forEach>
															</tbody>
														</table>
													</td>
												</tr>
											</if>
										</c:forEach>
									</tbody>
								</table>
							</fieldset>
							<div class="bbar">
		<a class="easyui-linkbutton" iconCls="icon-ok"
					onclick="submitRole()">编辑</a> <a class="easyui-linkbutton"
					iconCls="icon-cancel" onclick="closeWin('roleadd')">取消</a>
		</div>
		<fieldset class="mgb_10">
			<legend>提示</legend>
			    通过角色可以控制全局权限，可以查看和编辑所选模块的所有记录。<br>
			    通过角色可以控制模块权限，可以新增、编辑、查看和删除模块的记录。<br>
			    通过角色可以控制字段权限，可以只读和编辑模块字段的值。<br>
			    点击模块最右边的下拉按钮，可以修改模块字段权限。<br>
			    模块字段右边的第一个复选框如果被选中，表示当前角色可以查看该字段，否则将看不到该字段。<br>
			    模块字段右边的第二个复选框如果被选中，表示当前角色可以编辑该字段，否则将只读该字段的值
		</fieldset>
		
		</div>
	<%@ include file="../../../foot.jsp"%>
</body>