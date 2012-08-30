<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../common/config.jsp" %>

	
<script type="text/javascript" 	src="resources/desktop/afterser/faqcategorys.js"></script>
<div class="container">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north',border:false">
		</div>
		<div data-options="region:'center',border:false" style="overflow: hidden">
			<table id="faqcategory_list" data-options="fit:true,fitColumns:true"></table>
		</div>
	</div>
</div>

<div class="hidden">
   <div id="addCategory" class="easyui-window" <%=win_topbar%> title="添加分类">  
		<div region="center"  border="false" class="bdcenter">
				<form method="post" id="form_faqcategory" >
					<input type="hidden" name="action" /> <input type="hidden" name="id"/>
					<table class="tab_form">
						<tr>
							<td class="edittd">上级分类:</td>
							<td><input id="parentfaqcategoryid" name="parentfaqcategoryid" lines="true" required="true" />
							</td>
						</tr>
						<tr>
							<td class="edittd">分类名称：</td>
							<td><input type="text" class="text easyui-validatebox" 	name="faqcategoryname" required="true" validType="length[1,100]" /></td>
						</tr>
						<tr>
							<td class="edittd">排序：</td>
							<td><input type="text" class="text easyui-validatebox"
								name="sortorder" required="true" max="9999" validType="numbervalid" />
							</td>
						</tr>
					</table>
				</form>
		</div>
		<div region="south" class="btnbar" border="false">
			<a class="easyui-linkbutton" iconCls="icon-ok"
				href="javascript:void(0)" onclick="addCategory();">确定</a>
			<a class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="closeWin('addCategory')">取消</a>
		</div>
   </div>  
</div>
