<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/public/showedit.js"></script>
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
${ptb }&gt;<a href="crm/customview/viewIndex?entitytype=${entity.modulename }&ptb=${ptb }">${tab.tablabel}</a>&gt;
<c:choose>
	<c:when test="${recordid!=null }">
		编辑${tab.tablabel}
	</c:when>
	<c:otherwise>
		添加${tab.tablabel}
	</c:otherwise>
</c:choose>
</div>

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

</div>
<%@ include file="../foot.jsp"%>
</body>
</html>