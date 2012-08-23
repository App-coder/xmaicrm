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

<script type="text/javascript" src="resources/desktop/module/campaigns/relatedlists.js"></script>
<script type="text/javascript" src="resources/desktop/module/campaigns/view.js"></script>

</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;预览${tab.tablabel}&gt;${record.campaignname }
</div>

<div class="hidden" >
	<div id="wind_attachments"  iconCls="icon-save"
		style="width: 500px; height:309px;" class="easyui-window"
		<%=win_topbar%> title="新增附件" >
	<div class="easyui-layout" data-options="fit:true,border:false">
		<div data-options="region:'center',border:false" class="p10">
			<form name="form_attach" id="form_attach" method="post" enctype="multipart/form-data">
			<fieldset style="height:190px;">
				<legend>上传你的文件</legend>
				<table class="tab_form" >
					<tr>
						<td>
							<input type="text" class="text" name="filename" id="filename" disabled="true"  />&nbsp;&nbsp;(10 MB max)
						</td>
					</tr>
					<tr>
						<td>
						<span id="btnuploader"></span>
						</td>
					</tr>
					<tr>
						<td>
							<textarea name="description"  ></textarea>
						</td>
					</tr>
				</table>
			</fieldset>
			</form>
		</div>
		<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok" id="btn_attach_edit" onclick="submitAttach()" >编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('wind_attachments')">取消</a>
				</div>
		</div>
	</div>
	
	<div id="wind_accounts"  iconCls="icon-save"
		style="width: 700px; height:432px;" class="easyui-window"
		<%=win_topbar%> title="选择用户" >
	<div class="easyui-layout" data-options="fit:true,border:false">
		<div data-options="region:'center',border:false" >
			<iframe id="frame_get_accounts"  width="100%" height="100%" frameborder="0"  ></iframe>
		</div>
		</div>
	</div>
	
</div>


<div class="easyui-tabs">  
    <div title="营销活动信息" class="p10" >  
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
    			<td style="width:285px" valign="top">
    					<fieldset>
    						<legend>标签列表</legend>
    						<table class="tab_form">
								<tr>
									<td>
										<input type="text" name="tag" id="tag" class="text easyui-validatebox" data-options="required:true"   />
									</td>
								</tr>
								<tr>
									<td>
									<a class="easyui-linkbutton" iconCls="icon-add" href="javascript:pasteTag()" >贴标签</a>
									</td>
								</tr>
							</table>
							<div class="tag" id="tagdiv">
								<ul>
									<c:forEach items="${freetags }" var="tag">
										<li>${tag.tag }<span class="icon-mini-delete mini_delete" style="height:5px;" title="删除" onclick="deleteTag(${tag.id })" ></span></li>
									</c:forEach>
								</ul>
							</div>
    					</fieldset>
    			</td>
    		</tr>
    	</table>
    
    </div>  
    <div title="相关信息" class="p10"  >  
        <c:forEach items="${relatedlists }" var="related" >
        	<div class="mgb_10"><table id="tab_${related.name }" ></table></div>
        </c:forEach>
    </div>  
</div>

</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>