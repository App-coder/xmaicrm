<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/catalogs/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden">
		<div id="catalogs_edit" iconCls="icon-save"
			style="width: 400px; height: 247px;" class="easyui-window"
			<%=win_topbar%>>
			<div class="easyui-layout" data-options="fit:true,border:false">
				<div data-options="region:'center',border:false"
					style="padding: 10px; background: #fff;">
					<form name="form_catalogs" id="form_catalogs" method="post" >
						<input type="hidden" name="catalogid"/>
						<input type="hidden" name="parentcatalog"/>
						<input type="hidden" name="depth"/>
						<table  class="tab_form" >
							<tr>
								<td class="edittd">上级分类</td>
								<td><select id="parentcatalogid" name="parentcatalogid" class="easyui-combotree text" method="get" data-options="url:'crm/module/catalogs/getCatalogCbo',required:true"></select>  </td>
							</tr>
							<tr>
								<td class="edittd">分类名称</td>
								<td><input type="text" name="catalogname" class="text easyui-validatebox" data-options="required:true"  /></td>
							</tr>
							<tr>
								<td class="edittd">排序位置</td>
								<td><input type="text" name="sortorder" id="sortorder" class="text easyui-numberbox"  data-options="required:true,precision:0"  /></td>
							</tr>
						</table>
					</form>
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_catalogs')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('catalogs_edit')">取消</a>
						</div>
				</div>
			</div>

		</div>
	</div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<table id="catalogs_list" data-options="fitColumns:true"></table>
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>