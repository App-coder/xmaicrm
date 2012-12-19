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
<script type="text/javascript" src="resources/desktop/module/campaigns/relatedlists.js"></script>
<script type="text/javascript" src="resources/desktop/module/campaigns/view.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;预览${tab.tablabel}&gt;${record.campaignname }
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
					<c:forEach items="${fields }" var="f" varStatus="vs" >
						<c:if test="${f.block == b.blockid }">
							<c:if test="${vs.first == true }">
								<tr>
							</c:if>
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
						</c:if>
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
										<input type="text" class="text"  />
									</td>
								</tr>
								<tr>
									<td>
									<a class="easyui-linkbutton" iconCls="icon-add" >贴标签</a>
									</td>
								</tr>
							</table>
							<div class="tag">
								<ul>
									<c:forEach items="${freetags }" var="tag">
										<li>${tag.tag }<span class="icon-mini-delete mini_delete" style="height:5px;" title="删除"></span></li>
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