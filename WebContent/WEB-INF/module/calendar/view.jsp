<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var ptb = ${ptb.parenttabid};
var relateds = ${relatedstr};
var module  = '${tab.name}';
var crmid = ${recordid};
</script>

<!-- 文件上传 -->
<script type="text/javascript" src="resources/plugins/swfupload/swfupload.js"></script>
<script type="text/javascript" src="resources/plugins/swfupload/handler.js"></script>
<script type="text/javascript" src="resources/plugins/swfupload/swfupload.css"></script>

<script type="text/javascript" src="resources/desktop/module/calendar/view.js"></script>

</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;预览${tab.tablabel}&gt;${record.subject }
</div>

<div class="easyui-tabs">  
    <div title="日程安排信息" class="p10" >  
    	<table style="width:100%;">
    		<tr>
    			<td valign="top">
    			<form name="form_campaign" id="form_campaign" method="post" >
		<input type="hidden" name="edit_tabid" value="${tab.tabid}" />
		<input type="hidden" name="edit_module" value="${entity.modulename }"/>
		<input type="hidden" name="recordid" value="${recordid }"/>
		<c:forEach items="${blocks }" var="b">
		<fieldset class="mb_10">
			<legend>${b.blocklabel }</legend>
			<table class="tabview" >
				<tbody>
					<tr>
					<c:forEach items="${b.fields }" var="f" varStatus="vs" >
					<c:choose>
						<c:when test="${f.uitype == 19 }">
							<td colspan="4">
							${f.fieldHtml }
							</td>
							</tr>
						</c:when>
						<c:otherwise>
							<td class="label" valign="top">
							${f.fieldlabel }
							</td>
							<td width="350">
							${f.fieldHtml }
							</td>
							<c:choose>
								<c:when test="${vs.count%2!=0 &&vs.last == true }" >
								<td class="label" valign="top" ></td><td  width="350"></td></tr>
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
		
		<div class="easyui-panel" border="false"  >
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
		</div>
		
		
		
		
		</form>
		<div class="tac" >
			<a class="easyui-linkbutton" iconCls="icon-edit"  href="crm/module/campaigns/showedit?recordid=${recordid}&ptb=${ptb.parenttabid}&module=${tab.name}" >编辑</a>
								<a 
								class="easyui-linkbutton" iconCls="icon-view"
								href="crm/module/campaigns/index?ptb=${ptb.parenttabid}" >返回列表</a>
								<a class="easyui-linkbutton" iconCls="icon-remove"
								href="javascript:deleteRecord('crm/module/campaigns/deleteById?ptb=${ptb.parenttabid}&recordid=${recordid}')" >删除</a>
		</div>
    			
    			</td>
    		</tr>
    	</table>
    
    </div>  
</div>

</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>