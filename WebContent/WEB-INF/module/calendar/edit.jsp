<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script charset="utf-8" src="resources/plugins/kindeditor/kindeditor.js"></script>
<script charset="utf-8" src="resources/plugins/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript" src="resources/desktop/module/calendar/edit.js"></script>
<script>
var ptb = ${ptb.parenttabid};
var recordid = ${recordid};
var kinds = [];
var invitees = ${invitees};
var recurringtype = '${recurringtype}';
var recurringinfo = '${recurringinfo}';
</script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div class="hidden">
		<div id="optionwindow" iconCls="icon-save"
			style="width: 700px; height: 440px;" class="easyui-window"
			<%=win_topbar%> >  
  			<iframe id="optionframe" frameborder="0" width="100%" height="100%"></iframe>
    	</div>  
</div>
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;
<c:choose>
	<c:when test="${recordid!=0 }">
		编辑${tab.tablabel}
	</c:when>
	<c:otherwise>
		添加${tab.tablabel}
	</c:otherwise>
</c:choose>
</div>

<form name="form_calendar" id="form_calendar" method="post" >
<input type="hidden" name="edit_tabid" value="${tab.tabid}" />
<input type="hidden" name="edit_module" value="${entity.modulename }"/>
<input type="hidden" name="recordid" value="${recordid }"/>
<input type="hidden" name="rel_invitees" />
<c:forEach items="${blocks }" var="b" varStatus="vb"  >
<fieldset class="mb_10">
	<legend>${b.blocklabel }</legend>
	<table class="tab_form" >
		<tbody>
		<tr>
			<c:forEach items="${b.fields }" var="f" varStatus="vs" >
					<c:choose>
						<c:when test="${f.uitype == 19 }">
							<td colspan="4" >
							${f.fieldHtml }
							<script>
							var kind_${f.columnname} = initEdit('${f.columnname}','campaigns/${USERPERMISSION.user.userName}',1);
							kinds.push(kind_${f.columnname});
							</script>
							</td>
							</tr>
						</c:when>
						<c:otherwise>
							<td class="edittd2" valign="top">
							${f.fieldlabel }
							</td>
							<td width="350">
							${f.fieldHtml }
							</td>
							<c:choose>
								<c:when test="${vs.count%2!=0 &&vs.last == true }" >
								<td class="edittd2" valign="top" ></td><td  width="350"></td></tr>
								</c:when>
								<c:when test="${vs.count%2==0 &&vs.last == true }" >
								</tr>
								</c:when>
								<c:when test="${vs.count%2==0 &&vs.last == false }" >
								</tr>
								<tr>
								</c:when>
							</c:choose>						
						</c:otherwise>
					</c:choose>
			</c:forEach>
		</tbody>
	</table>
</fieldset>
</c:forEach>

  <div class="easyui-tabs mb_10" style="height:200px;"  >  
      <div title="相关信息" class="p10" >  
          <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >相关信息：</td>
          		<td><input type=hidden value="${seactivityrel.accountid}" name="rel_accountid" /><input type="text" name="rel_accountid_text"  readonly="readonly" value="${seactivityrel.accountname }" class="text" >&nbsp;&nbsp;
          		<a class="easyui-linkbutton" iconCls="icon-search" onclick="relAccount()">选择</a>
          		</td>
          	</tr>
          </table>
      </div>  
      <div title="邀请同事" class="p10" >  
          <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >选择用户：</td>
          		<td>
          			<select id="rel_invite" style="width:200px;" ></select>
          		</td>
          	</tr>
          	<tr>
          		<td colspan="2" >
          			<fieldset>
          				<legend>提示</legend>
          				已选用户将接收有关该日程安排的Email
          			</fieldset>
          		</td>
          	</tr>
          </table>  
      </div>  
      <div title="设置提醒" class="p10" >  
            <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >设置提醒：</td>
          		<td>
          			<c:choose>
          				<c:when test="${fn:length(reminders)>0}" >
          					<input type="radio" checked="checked" name="cfgreminders" onclick="showCfgRemindertime()" value="1"  />是&nbsp;&nbsp;<input type="radio" name="cfgreminders" onclick="hideCfgRemindertime()"  />否
          				</c:when>
          				<c:otherwise>
          					<input type="radio" name="cfgreminders" onclick="showCfgRemindertime()" value="1"  />是&nbsp;&nbsp;<input type="radio" checked="checked" name="cfgreminders" onclick="hideCfgRemindertime()"  />否
          					<script>
          						$(function(){$("#cfg_remindertime").hide();});
          					</script>
          				</c:otherwise>
          			</c:choose>
          		</td>
          	</tr>
          	<tr id="cfg_remindertime">
          		<td></td>
          		<td>提前：
          		<select name="re_day">
          		<c:forEach var="x" begin="0" end="29" step="1">
          			<option>${x}</option>
				</c:forEach>
          		</select>
          		<script>
          		$(function(){$("select[name=re_day]").val(${re_day})});
          		</script>
          		天&nbsp;
          		<select name="re_hour">
          		<c:forEach var="x" begin="0" end="22" step="1">
          			<option>${x}</option>
				</c:forEach>
          		</select>
          		<script>
          		$(function(){$("select[name=re_hour]").val(${re_hour})});
          		</script>
          		小时&nbsp;
          		<select name="re_min" >
          		<c:forEach var="x" begin="0" end="22" step="1">
          			<option>${x}</option>
				</c:forEach>
          		</select>
          		<script>
          		$(function(){$("select[name=re_min]").val(${re_min})});
          		</script>
          		分&nbsp;
          		通过PM提醒我
          		</td>
          	</tr>
          </table>
      </div>
      <div title="重复日程" class="p10" >  
          <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >重复日程：</td>
          		<td>
          			<c:choose>
          				<c:when test="${recurring == true }">
          					<input type="checkbox" onclick="showCfgOption()" checked="checked" name="recurring" value="1" />
          				</c:when>
          				<c:otherwise>
          					<input type="checkbox" onclick="showCfgOption()" name="recurring" value="1"  />
          				</c:otherwise>
          			</c:choose>
          		</td>
       	</tr>
			<tr id="tr_recurring" class="isrecurring hidden">
				<td></td>
				<td>重复发生在：<select id="recType" name="recType" onchange="showRecOption(this.value)"><option value="Daily">天</option>
						<option value="Weekly">周</option>
						<option value="Monthly">月</option></select></td>
			</tr>
			<tr class="isrecurring hidden" id="tr_re_week" >
          		<td ></td>
							<td class="weekcfg" ><input type="checkbox" name="recurring_week" value="sunday" />周日&nbsp;&nbsp;<input
								type="checkbox" name="recurring_week" value="monday" />周一&nbsp;&nbsp;<input type="checkbox" name="recurring_week" value="tuesday"  />周二&nbsp;&nbsp;<input
								type="checkbox" name="recurring_week" value="wednesday" />周三&nbsp;&nbsp;<input type="checkbox" name="recurring_week" value="thursday" />周四&nbsp;&nbsp;<input
								type="checkbox" name="recurring_week" value="friday" />周五&nbsp;&nbsp;<input type="checkbox" name="recurring_week" value="saturday" />周六</td>
						</tr>
						<tr class="isrecurring hidden" id="tr_re_month">
							<td></td>
							<td><input type="radio" checked="checked" />&nbsp;&nbsp;第&nbsp;<input
								class="easyui-numberbox text" id="month_day"
								data-options="min:1,precision:0,max:31" type="text"
								name="month_day" style="width: 20px; margin: 0px;" />&nbsp;天</td>
						</tr>
					</table>  
      </div>  
  </div>  

</form>

<div class="tac" >
	<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_calendar')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="clearform('form_calendar')">取消</a>
</div>
</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>