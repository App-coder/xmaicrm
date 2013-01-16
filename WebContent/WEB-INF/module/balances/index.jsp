<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/balances/index.js"></script>
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
	            		<div class="d_view ">
							<span class="icon-filter ">视图：</span> <select class="sel_120"
								onchange="reloadView(this.value,1)">
								<option>所有</option>
								<option>库存预警 </option>
								<option>采购预警</option>
							</select> 
						</div>
						<table id="view_list_0"   data-options="fitColumns:true"></table>
	        </div>  
	        <c:forEach items="${cangkus }" var="ck">
		        <div title="${ck.cangkuname }" class="p10">  
			        <div class="d_view ">
						<span class="icon-filter ">视图：</span> <select class="sel_120"
							onchange="reloadView(this.value,${ck.cangkusid})">
							<option>所有</option>
							<option>库存预警 </option>
							<option>采购预警</option>
						</select> 
					</div>
					<table id="view_list_${ck.cangkusid}"  class="viewlist" data-options="fitColumns:true"></table>
		        </div>
	        </c:forEach>
	    </div>  
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>