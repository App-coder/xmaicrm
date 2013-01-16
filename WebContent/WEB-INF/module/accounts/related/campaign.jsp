<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../../head.jsp"%>
<%@ include file="../../../common/config.jsp"%>
<c:choose>
	<c:when test="${customview.cvid!=null && dview!=null}">
		<script>
			var tab_columns = ${dview};
			tab_columns = setDefWidth(tab_columns,80);
			var tab_viewid = ${customview.cvid};
		</script>
	</c:when>
	<c:otherwise>
		<script>
			var tab_columns = "";
			var tab_viewid = -1;
		</script>
	</c:otherwise>
</c:choose>
<script>
//定义页面变量，需要前缀，防止多页面变量重复
var entitytype = '${entitytype}';
var viewid = '${viewid}';
var exists = '${exists}';
var related = 'Campaigns';
var campaignid = ${campaignid};
</script>
<script type="text/javascript" src="resources/desktop/module/accounts/related/campaign.js"></script>
</head>
<body>
<div class="d_view ">
				<span class="icon-filter ">视图：</span> <select
					class="sel_120" >
					<c:forEach items="${views}" var="v">
						<option value="${v.cvid }">${v.viewname}</option>
					</c:forEach>
				</select> 
				<a class="easyui-linkbutton" iconCls="icon-ok" onclick="selectUser()" >选择</a>
				
				<span class="fr mr_5" >
				<select>
					<option>客户名称</option>
				</select>
				<input type="text" class="text" />
				<a class="easyui-linkbutton" iconCls="icon-search"  >立即查找</a>
				<a class="easyui-linkbutton" iconCls="icon-add"  >新增客户</a>
				</span>
				
			</div>
			
			<table id="view_list"
				data-options="fitColumns:true"    ></table>
</body>
</html>