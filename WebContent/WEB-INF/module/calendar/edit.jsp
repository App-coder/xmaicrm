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
<c:forEach items="${blocks }" var="b" varStatus="vb"  >
<fieldset class="mb_10">
	<legend>${b.blocklabel }</legend>
	<table class="tab_form" >
		<tbody>
		<tr>
			<c:forEach items="${b.fields }" var="f" varStatus="vs" >
					<c:choose>
						<c:when test="${f.uitype == 19 }">
							<td colspan="4">
							${f.fieldHtml }
							<script>
							var kind_${f.columnname} = initEdit('${f.columnname}','campaigns/${USERPERMISSION.user.userName}');
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
          		<td><input type="text"  class="text">&nbsp;&nbsp;
          		<a class="easyui-linkbutton" iconCls="icon-search" onclick="formsubmit('form_campaign')">选择</a>
          		</td>
          	</tr>
          </table>
      </div>  
      <div title="邀请同事" class="p10" >  
          <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >选择用户：</td>
          		<td>
          			<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/relation/users/getSmowners'"></select>
          		</td>
          	</tr>
          </table>  
      </div>  
      <div title="设置提醒" class="p10" >  
            <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >设置提醒：</td>
          		<td>
          			<input type="radio" />是&nbsp;&nbsp;<input type="radio" />否
          		</td>
          	</tr>
          </table>
      </div>
      <div title="重复日程" class="p10" >  
          <table class="tab_editlist">
          	<tr>
          		<td class="edittd" >重复日程：</td>
          		<td>
          			<input type="checkbox" />
          		</td>
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