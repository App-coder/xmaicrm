<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var ptb = ${ptb.parenttabid};
var module  = '${tab.name}';
var crmid = ${recordid};
</script>

<script type="text/javascript" src="resources/desktop/module/announcements/view.js"></script>

</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;预览${tab.tablabel}&gt;${record.announcementname }
</div>

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


</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>