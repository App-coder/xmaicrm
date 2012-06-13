<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "回收站";
    var pathActive = "recyclebin";
    
    var cols = ${cols};
</script>
<%@ include file="../../path.jsp"%>
<script type="text/javascript" src="resources/desktop/settings/other/recyclebin.js"></script>
</head>
<body id="wrap">
${navbar }
	<div id="main">
			<table style="width:100%;">
			<tr>
				<td width="160px" valign="top">
					<%@ include file="../../nav_setting.jsp"%>
				</td>
				<td valign="top">
				<div class="path" id="navpath"></div>
					<table id="tablist" toolbar="#tabbar" ></table>
					<div id="tabbar" class="gtb" style="display: block;" >  
						<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-return" >还原</a><a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" >彻底删除</a>
						&nbsp;查找：<input type="text" class="text"/><select><option>选项</option></select>&nbsp;
						<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" >查找</a>
						<select class="fr">
							<option>选择模块</option>
							<c:forEach items="${recyclemodules }" var="m">
								<option id="${m.tabid }" >${m.tablabel }</option>
							</c:forEach>
						</select>
					</div>
				</td>
			</tr>
			</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>