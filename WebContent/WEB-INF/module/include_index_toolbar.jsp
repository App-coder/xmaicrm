<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="resources/desktop/module/index_toolbar.js"></script>
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






	
