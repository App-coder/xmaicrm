<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

 <c:choose>
    <c:when test="${approveid!=null}">
       <script>
       var approveid=${approveid};
       </script>
    </c:when>
    <c:otherwise>
       <c:set  var="approveid" value="1"></c:set> 
    </c:otherwise>
 </c:choose>
 
 
<script>
var pathname = "编辑审批步骤";
var pathActive = "multiapprove";
var contextpath = "${contextPath}";
var modulename="${modulename}";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript" src="resources/desktop/settings/system/multiapprovestep.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
	   <table style="width:100%;">
			<tr>
				<td width="160px" valign="top">
					<%@ include file="../../nav_setting.jsp"%>
				</td>
				<td valign="top">
				<div class="path" id="navpath"></div>
				<table  class="small" width="100%" cellspacing="0" cellpadding="0" border="0">
					  <tr>
					      <td colspan="2">							
							<input class="crmButton edit small" type="button" onclick="forceApproveFinish();" value="强制审批完成">
							<input class="crmButton edit small" type="button" onclick="forceApproveRetStart();" value="强制返回选择流程">
							<input class="crmButton edit small" type="button" onclick="document.location.href='crm/settings/multiapprove/index';" value="返回列表">
						  </td>
					  </tr>
					  <tr style="height:3px">
						  <td></td>
					  </tr>
					  <tr>
					     <td colspan="2">
					        <fieldset>
								<legend class="schart">流程信息</legend>
								<table class="tab_form" cellpadding="5" celspacing="0">
									<tr style="height:25px">
										<td class="dvtCellLabel" width="15%" align="right">流程名称</td>
										<td class="dvtCellInfo" width="35%"> ${xmApprove.name}</td>
										<td class="dvtCellLabel" width="15%" align="right">激活状态</td>
										<td class="dvtCellInfo" width="35%"> 
										  <c:choose>
											    <c:when test="${xmApprove.used=='1'}">
											                  激活
											    </c:when>
											    <c:otherwise>
											                 禁止
											    </c:otherwise>
										  </c:choose>
										</td>
									</tr>
									<tr style="height:25px">
										<td class="dvtCellLabel" width="15%" align="right">允许指定下一步审批人</td>
										<td class="dvtCellInfo" width="85%" colspan="3"> 
										  <c:choose>
											    <c:when test="${xmApprove.userselected=='1'}">
											                  是
											    </c:when>
											    <c:otherwise>
											                 否
											    </c:otherwise>
										  </c:choose>注意：如果审批人有多个，可以使用此功能，下一步审批人将从下一步审批步骤中指定的审批人中选择，否则请选为"否"。 
										</td>
									</tr>
									<tr style="height:25px">
										<td class="dvtCellLabel" width="15%" align="right">备注</td>
										<td class="dvtCellInfo" width="35%" colspan="3">${xmApprove.memo} </td>
									</tr>
								</table>
					      </fieldset>
					     </td>
					  </tr>
					  <tr style="height:5px">
										<td> </td>
									</tr>
				</table>
				
				<div style="margin-bottom: 15px;margin-top:5px;padding-left:5px;"><a href="javascript:" onclick="toggleAdvOpt();">高级选项</a></div>
			    <fieldset id="advopt" style="margin-bottom: 10px;">
				<legend class="schart">角色信息(所选角色提交的记录将通过当前审批流程审批)</legend>
				<table>
				<tr><td><ul id="roletree" class="easyui-tree" 
				data-options="required:true,cascadeCheck:false" checkbox="true"></ul></td></tr>
				</table>
				</fieldset>

				<table id="multiapprovesteplist" data-options="title:'审批步骤 '" toolbar="#multiapprovesteplist_tb"></table>
				<table class="listTable small" width="100%" cellspacing="0" cellpadding="5">
					<tbody>
						<tr>
							<td valign="top" nowrap="">
							提示：
							<ul class="small">
							<li>如果没有设置审批步骤的字段权限，审批人将不能修改当前审批的记录。</li>
							<li>如果设置审批步骤的字段权限，审批人将可以根据字段权限修改当前审批的记录。</li>
							<li>如果管理员参与审批，管理员将可以修改当前审批的记录。</li>
							</ul>
							</td>
						</tr>
					</tbody>
				</table>
				</td>
			</tr>
		</table>
		
		<div id="multiapprovesteplist_tb" class="gtb" style="display: block;">
			<a onclick="javascript:doMultiApproveStep('add')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-add'">新增审批步骤</a>
			<a onclick="javascript:doMultiApproveStep('edit')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'">修改审批步骤</a>
			<a onclick="javascript:doMultiApproveStep('delete')" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-remove'">删除</a>
		</div>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>