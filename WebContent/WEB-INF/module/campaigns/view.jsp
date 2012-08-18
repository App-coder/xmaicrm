<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
var ptb = ${ptb.parenttabid};
</script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entity.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>&gt;预览${tab.tablabel}
</div>

<div class="easyui-layout" fit="true" >  
	<div data-options="region:'center',border:false" >
			<div class="easyui-tabs">  
				    <div title="营销活动 信息" class="p10" >  
				        <form name="form_campaign" id="form_campaign" method="post" >
						<input type="hidden" name="edit_tabid" value="${tab.tabid}" />
						<input type="hidden" name="edit_module" value="${entity.modulename }"/>
						<input type="hidden" name="recordid" value="${recordid }"/>
						<c:forEach items="${blocks }" var="b">
						<fieldset class="mb_10">
							<legend>${b.blocklabel }</legend>
							<table class="tab_form" >
								<tbody>
									<c:forEach items="${fields }" var="f" varStatus="vs" >
										<c:if test="${f.block == b.blockid }">
											<c:if test="${vs.first == true }">
												<tr>
											</c:if>
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
							<a class="easyui-linkbutton" iconCls="icon-ok"
												href="javascript:void(0)" onclick="formsubmit('form_campaign')">编辑</a>
												<a 
												class="easyui-linkbutton" iconCls="icon-view"
												href="javascript:void(0)" onclick="clearform('form_campaign')">返回列表</a>
												<a class="easyui-linkbutton" iconCls="icon-remove"
												href="javascript:void(0)" onclick="clearform('form_campaign')">删除</a>
						</div>
				    </div>  
				    <div title="相关信息" class="p10"  >  
				        tab2  
				    </div>  
				</div>
	</div>  
	<div data-options="region:'east',border:false" style="width:290px;" >
	<div class="navcontainer rightfl">
			<div class="datagrid-toolbar">标签列表</div>
			<table class="tab_form">
				<tr>
					<td>
						<input type="text" class="text" style="width:155px;" /><a class="easyui-linkbutton" iconCls="icon-add" >贴标签</a>
					</td>
				</tr>
			</table>
			<div class="tag">
				<ul></ul>
			</div>
		</div>
	</div>  
</div>

</div>
<%@ include file="../../foot.jsp"%>
</body>
</html>