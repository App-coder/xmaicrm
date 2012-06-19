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
						<strong>审批流程： 经理</strong>
						</td>
						</tr>
					</tbody>
				</table>
				<table class="listTableTopButtons" width="100%" cellspacing="0" cellpadding="5" border="0">
					<tbody>
						<tr>
						<td class="small"> </td>
						<td class="small" align="right">
						<input class="crmButton create small" type="submit" value="保存">
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
									<input class="detailedViewTextBox" type="text" onblur="this.className='detailedViewTextBox'" onfocus="this.className='detailedViewTextBoxOn'" tabindex="1" value="销售经理审批" name="name">
									</td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">下一步骤</td>
									<td class="dvtCellInfo" width="35%">
									<select tabindex="3" width="50%" name="nextstep">
									<option value="">无</option>
									<option value="10" selected="">财务审批</option>
									</select>
									</td>
									<td class="dvtCellLabel" width="15%" align="right">是否可以结束整个流程</td>
									<td class="dvtCellInfo" width="35%">
									<select tabindex="2" name="ended">
									<option value="0">否</option>
									<option value="1">是</option>
									</select>
									</td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">是否修改审批人 </td>
									<td class="dvtCellInfo" width="35%">
									<select tabindex="3" width="50%" name="alterapproveowner">
									<option value="0">否</option>
									<option value="1">是</option>
									</select>
									</td>
									<td class="dvtCellInfo" width="15%" align="right"> </td>
									<td class="dvtCellInfo" width="35%"> </td>
								</tr>
								<tr>
									<td class="dvtCellLabel" width="15%" align="right">备注</td>
									<td class="dvtCellInfo" width="35%" colspan="3">
									<textarea class="detailedViewTextBox" rows="8" cols="90" onblur="this.className='detailedViewTextBox'" name="memo" onfocus="this.className='detailedViewTextBoxOn'" tabindex="3"></textarea>
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
			        <div title="字段权限" style="padding:10px;">  
			            
			        </div>  
			        <div title="高级功能" style="padding:10px;">  
			            Third Tab  
			        </div>  
		          </div> 
				</div>
				 
				</td>
			</tr>
		</table>
		
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>