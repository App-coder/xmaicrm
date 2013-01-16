<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
	var fcangkuid = ${fCangkus.cangkusid};
</script>
<script type="text/javascript" src="resources/desktop/module/prdtnums/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div class="easyui-tabs" id="tab_cangkus" >  
	        <c:forEach items="${cangkus }" var="ck">
		        <div title="${ck.cangkuname }" class="p10">  
					<table id="view_list_${ck.cangkusid}"  class="viewlist" data-options="fitColumns:true"></table>
		        </div>
	        </c:forEach>
	    </div> 
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>