<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

 <c:choose>
    <c:when test="${approveid!=null || stepid!=null}">
       <script>
         var approveid=${approveid};
         var stepid=${stepid};
       </script>
    </c:when>
    <c:otherwise>
       <c:set  var="approveid" value="1"></c:set> 
    </c:otherwise>
 </c:choose>
 
 <c:choose>
   <c:when test="${type=='u'}">
     <script>
        var pathname = "编辑审批步骤";
     </script>
   </c:when>
   <c:otherwise>
     <script>
        var pathname = "新建审批步骤";
     </script>
    </c:otherwise>
 </c:choose>
 
 
<script>
var type="${type}";
var userid="${xmApprove.userid}";
var tabid=${tabid};
var pathActive = "multiapprove";
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript" src="resources/desktop/settings/system/editApproveStep.js"></script>
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
				<table class="tableHeading" width="100%" cellspacing="0" cellpadding="5" border="0">
					<tbody>
						<tr style="background-color: #EFEFEF;">
						<td class="small" align="left">
						<strong>审批流程： ${approvename}</strong>
						</td>
						</tr>
					</tbody>
				</table>
				<table class="listTableTopButtons" width="100%" cellspacing="0" cellpadding="5" border="0">
					<tbody>
						<tr>
						<td class="small"> </td>
						<td class="small" align="right">
						<input class="crmButton create small" type="button" onclick="doMultiApprove()" value="保存">
						<input class="crmButton edit small" type="button" onclick="window.history.back();" value="取消">
						</td>
						</tr>
					</tbody>
				</table>
				<div class="approvestep_tab">
				  <div class="easyui-tabs">  
			        <div title="基本信息" style="padding:10px;">  
			          <fieldset>
			            <legend class="schart">基本信息</legend>
							<table class="tab_form" cellpadding="5" celspacing="0">
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">步骤名称</td>
									<td class="dvtCellInfo" width="35%" colspan="3">
									<input class="detailedViewTextBox" type="text" onblur="this.className='detailedViewTextBox'" onfocus="this.className='detailedViewTextBoxOn'" tabindex="1" value="${xmApprove.name}" name="name">
									</td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">下一步骤</td>
									<td class="dvtCellInfo" width="35%">
									<select tabindex="3" width="50%" name="nextstep">
									   <c:forEach items="${xmApprovestep}" var="steps" varStatus="vs">
									        <c:choose>
											    <c:when test="${xmApprove.nextstepname}==${steps.name}">
											       <option value="${steps.id}" selected="">${steps.name}</option>
											    </c:when>
											    <c:otherwise>
											      <option value="${steps.id}">${steps.name}</option>
											    </c:otherwise>
									        </c:choose>
									   </c:forEach>
									   <c:choose>
											    <c:when test="${xmApprove.nextstepname=='无'}">
											       <option value="" selected="">无</option>
											    </c:when>
											    <c:otherwise>
											      <option value="0">无</option>
											    </c:otherwise>
									   </c:choose>
									</select>
									</td>
									<td class="dvtCellLabel" width="15%" align="right">是否可以结束整个流程</td>
									<td class="dvtCellInfo" width="35%">
									<select name="ended">
									   <c:choose>
										    <c:when test="${xmApprove.ended==0}">
										       <option selected="selected" value="0">否</option>
										       <option value="1">是</option>
										    </c:when>
										    <c:otherwise>
										       <option value="0">否</option>
										       <option selected="selected" value="1">是</option>
										    </c:otherwise>
									    </c:choose>
									</select>
									</td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">是否修改审批人 </td>
									<td class="dvtCellInfo" width="35%">
									<select  width="50%" name="alterapproveowner">
									    <c:choose>
										    <c:when test="${xmApprove.alterapproveowner==0}">
										       <option selected="selected" value="0">否</option>
										       <option value="1">是</option>
										    </c:when>
										    <c:otherwise>
										       <option value="0">否</option>
										       <option selected="selected" value="1">是</option>
										    </c:otherwise>
									    </c:choose>
									</select>
									</td>
									<td class="dvtCellInfo" width="15%" align="right"> </td>
									<td class="dvtCellInfo" width="35%"> </td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">备注</td>
									<td class="dvtCellInfo" width="35%" colspan="3">
									<textarea class="detailedViewTextBox" rows="8" cols="90" onblur="this.className='detailedViewTextBox'" name="memo" onfocus="this.className='detailedViewTextBoxOn'" tabindex="3">${xmApprove.memo}</textarea>
									</td>
								</tr>
							</table>
						  </fieldset><br>
						  <fieldset>
			                 <legend>审批人信息</legend>
			                 <table width="100%">
								<tbody>
								<tr class="lvtColDataHover">
								<td width="100%">
								<b>系统用户</b>
								</td>
								</tr>
								</tbody>
							 </table>
							 <table id="dept_system" width="40%" style="display:block;">
								<tbody>
								<tr id="row_2" class="lvtColData"  onmouseout="this.className='lvtColData'" onmouseover="this.className='lvtColDataHover'">
								<td  width="200" height="25">记录创建人</td>
								<td  width="200">
								<input class="StepUserClass" type="checkbox" check="false" value="-1" name="APPROVESTEP_system">
								<span id="StepUserAlternate_-1" style="display: none;">
								<input type="radio" checked="" value="1" name="user_alter_-1">
								正式
								<input type="radio" value="0" name="user_alter_-1">
								候补
								</span>
								</td>
								</tr>
								<tr id="row_2" class="lvtColData" bgcolor="white" onmouseout="this.className='lvtColData'" onmouseover="this.className='lvtColDataHover'">
								<td  width="200" height="25">记录负责人</td>
								<td  width="200">
								<input class="StepUserClass" type="checkbox" check="false" value="-2" name="APPROVESTEP_system">
								<span id="StepUserAlternate_-2" style="display: none;">
								<input type="radio" checked="" value="1" name="user_alter_-2">
								正式
								<input type="radio" value="0" name="user_alter_-2">
								候补
								</span>
								</td>
								</tr>
								</tbody>
							</table>
			              </fieldset>
						  
			        </div>  
			        <div id="countrycontainer2" title="字段权限" style="padding:10px;">  
			        </div>  
			        <div id="countrycontainer3" title="高级功能" style="padding:10px;">  
			        </div>  
		          </div> 
		          <table width="100%" cellspacing="0" cellpadding="5">
						<tbody>
							<tr>
								<td valign="top" nowrap="">
								提示：
								<ul class="small">
								<li>所选用户将参与当前审批步骤，每个审批步骤可以由1个或多个用户参与。</li>
								<li>如果选择"下一步骤"，审批中将可以直接跳转到"下一步骤"所指定的审批步骤。</li>
								<li>如果"是否可以结束整个流程"为"是"，当到达当前审批步骤审批时，审批人可以直接结束当前审批流程，不管是否还有未处理的审批步骤。</li>
								<li>如果"是否修改审批人"为"是"，当前审批流程结束时将自动修改审批人为当前审批人。</li>
								<li>记录的创建人和负责人也可以作为审批人参与审批流程。</li>
								</ul>
								</td>
							</tr>
						</tbody>
		          </table>
				</div>
				
				<div>
				  
				</div>
				</td>
			</tr>
		</table>
		
		
	</div>
	<div style='position: relative;top: 600px;'>
	  <%@ include file="../../foot.jsp"%>
	</div>
	
	
</body>
</html>