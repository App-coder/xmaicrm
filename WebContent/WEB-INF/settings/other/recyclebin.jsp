<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
    var pathname = "回收站";
    var pathActive = "recyclebin";
    
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
						<a class="easyui-linkbutton" iconCls="icon-return" >还原</a>
						<a class="easyui-linkbutton" iconCls="icon-remove" >彻底删除</a>
					</div>
				</td>
			</tr>
			</table>
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>