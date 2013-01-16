<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/wareledgers/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div class="easyui-tabs" id="tab_cangkus" >  
	        <div title="全部仓库" class="p10">  
		        <div id="tabbar"    > 
		      <select><option>全部</option></select><select><option>产品名称</option></select><input type="text" class="text"/>&nbsp;
		        <a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-search'" >查找</a>
		        </div>
				<table id="view_list_0" toolbar="#tabbar" data-options="fitColumns:true"></table>
	        </div>  
	        <c:forEach items="${cangkus }" var="ck">
		        <div title="${ck.cangkuname }" class="p10">  
		        	<div id="tabbar_${ck.cangkusid}" >
		        			      <select><option>全部</option></select><select><option>产品名称</option></select><input type="text" class="text"/>&nbsp;
		        <a class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-search'" >查找</a>
		        	</div>
					<table id="view_list_${ck.cangkusid}" toolbar="#tabbar_${ck.cangkusid}"  class="viewlist" data-options="fitColumns:true"></table>
		        </div>
	        </c:forEach>
	    </div>  
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>