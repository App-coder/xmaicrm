<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="resources/desktop/module/index_toolbar.js"></script>
<div id="tabbar" class="gtb" style="display: block;" >  
<c:if test="${barmap['scope']!=null}">
查看范围：<select class="easyui-combotree " id="cbt_scope" style="width:160px;"  data-options="url:'crm/customview/getCondition?entitytype=${entitytype }'"></select>
</c:if>
<c:if test="${barmap['insert']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-add" onclick="insert()" >添加</a>
</c:if>
<c:if test="${barmap['edit']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="edit()" >修改</a>
</c:if>
<c:if test="${barmap['deleteRecord']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" onclick="deleteRecord()" >删除</a>
</c:if>
<c:if test="${barmap['batchUpdate']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="batchUpdate()" >批量修改</a>
</c:if>
<c:if test="${barmap['view']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-view" onclick="view()" >预览</a>
</c:if>
<c:if test="${barmap['smowerUpdate']!=null}">
<div class="hidden">
	<div id="win_editSmowners" iconCls="icon-edit"
			style="width:300px; height:185px;" class="easyui-window"
			<%=win_topbar%> title="修改负责人" >
			<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" class="p10">
				<table class="tab_form">
					<tr><td>转移拥有关系</td></tr>
					<tr><td><select id="cbt_smowners" class="easyui-combotree" style="width:200px;" data-options="url:'crm/relation/users/getSmowners'"></select></td></tr>
				</table>
			</div>
			<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="smowerUpdateDo()">编辑</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('win_editSmowners')">取消</a>
				</div>
			</div>
	</div>
</div>
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-edit" onclick="smowerUpdate()" >修改负责人</a>
</c:if>
<c:if test="${barmap['shareUpdate']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-share" onclick="shareUpdate()" >共享</a>
</c:if>
<c:if test="${barmap['import']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-import" onclick="import()" >导入</a>
</c:if>
<c:if test="${barmap['excel']!=null}">
<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-excel" onclick="excel()" >导出</a>	
</c:if>
</div>





	
