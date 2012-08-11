<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<script>
    var pathname = "添加角色";
</script>
<%@ include file="../../../path.jsp"%>
<script type="text/javascript"
	src="resources/desktop/settings/basic/role/showAdd.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div class="path" id="navpath"></div>
		<form method="post" id="form_roleadd" name="form_roleedit">
					<div id="tabs_roleadd" class="easyui-tabs">
						<input type="hidden" id="parentroleid" name="parentroleid" />
						<div title="第一步(共2步) : 设置角色基本信息" class="p10">
							<table class="tab_form">
								<tr>
									<td class="edittd">上级角色</td>
									<td>${parentRole.rolename }</td>
								</tr>
								<tr>
									<td class="edittd">角色名称</td>
									<td><input type="text" class="text" /><span class="must">*</span>
									</td>
								</tr>
								<tr>
									<td class="edittd">描述</td>
									<td><textarea></textarea></td>
								</tr>
							</table>
						</div>
						<div title="第二步(共2步) : 设置角色权限" class="p10">
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
										查看下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。</td>
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
								</c:choose>编辑下面所选模块的所有信息(包括不是自己负责)，此权限不受上下级角色的限制，请慎重选择。</td>
									</tr>
								</table>
							</fieldset>
							<fieldset class="mgb_10">
								<legend>模块权限 </legend>
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
												<td class="mod"><input type="checkbox" />&nbsp;${m.tablabel }</td>
												<td><input type="checkbox" /></td>
												<td><input type="checkbox" /></td>
												<td><input type="checkbox" /></td>
												<td><input type="checkbox" /></td>
												<td><a  class="easyui-linkbutton" onclick="changeFieldBlock('${m.tabid }_field',this)" >展开</a></td>
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
						</div>
					</div>
				</form>
		<div class="bbar">
		<a class="easyui-linkbutton" iconCls="icon-ok"
					onclick="submitRole()">添加</a> <a class="easyui-linkbutton"
					iconCls="icon-cancel" onclick="closeWin('roleadd')">取消</a>
		</div>

	</div>
	<%@ include file="../../../foot.jsp"%>
</body>
</html>