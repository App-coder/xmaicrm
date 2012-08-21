<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="resources/desktop/module/view_search.js"></script> 
<div class="hidden">
	
	<table class="advCol" >
	<tr>
		<td width="30%"><select class="text" name="field"  onchange="setComp(this.value,this)" >${optionstr }</select></td>
		<td width="30%"><select class="text" name="reg"  >${filter }</select></td>
		<td width="30%"><input type="text" name="fval"  class="text"></td>
		<td width="10%">
		<span class="l-btn-left focus" onclick="removeThis(this)" ><span class="l-btn-text icon-remove" style="padding-left: 20px;height:25px;line-height:25px;"  >删除</span></span>
		</td>
	</tr>
	</table>

	<div id="wind_advSearch" iconCls="icon-search"
			style="width: 700px; height:432px;" class="easyui-window p10"
			<%=win_topbar%> title="高级查找 " >
				<div class="easyui-layout" data-options="fit:true,border:false">
					<div data-options="region:'center',border:false" >
						<div class="d_view">
							<input type="radio" name="matchMeth" value="and" checked="checked" />&nbsp;匹配以下所有条件&nbsp;&nbsp;
							<input type="radio" name="matchMeth" value="or" />&nbsp;匹配以下任意条件
						</div>
						<table id="tab_advfilter" class="tab_form tablist" style="border:1px solid #CCCCCC;border-collapse: collapse;"  >
							<tr>
								<td width="30%"><select class="text" name="field" onchange="setComp(this.value,this)" >${optionstr }</select></td>
								<td width="30%"><select class="text" name="reg" >${filter }</select></td>
								<td width="30%"><input type="text" name="fval" class="text"></td>
								<td width="10%">
								</td>
							</tr>
						</table>
						
						
					</div>
					<div region="south" class="btnbar" border="false">
						<span class="fl" >
							<a class="easyui-linkbutton" iconCls="icon-add"
							href="javascript:void(0)" onclick="addCollection()">增加条件</a> 
						</span>
						<span class="fr">
							<a class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="advSearchDo()">查找</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="closeWin('wind_advSearch')">取消</a>
						</span>
					</div>
				</div>
		</div>
</div>

<div class="d_view ">
<span class="icon-filter ">视图：</span> <select
	class="text" onchange="reloadView(this.value)" >
	<c:forEach items="${views}" var="v">
		<option value="${v.cvid }">${v.viewname}</option>
	</c:forEach>
</select> 
<a href="crm/customview/index?entitytype=${entitytype}&ptb=${ptb.parenttabid }"
	class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-view'">视图管理</a>
&nbsp;&nbsp;
<c:choose>
	<c:when test="${searchtype =='basicsearch' }">
	查找：<select class="text" name="basicsearchfield"></select>
		<input type="text" class="text" name="basicsearchvalue" />
		<a class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-search'"
			onclick="basicSearch()">查找</a>
		<a class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-undo'" onclick="cacelSearch()">取消查找</a>
	</c:when>
	<c:otherwise>
	查找：<select class="text" name="basicsearchfield"></select>
		<input type="text" class="text" name="basicsearchvalue" />
		<a class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-search'"
			onclick="basicSearch()">查找</a>
		<a class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-search'" onclick="advSearch()">高级查找</a>
		<a class="easyui-linkbutton"
			data-options="plain:true,iconCls:'icon-undo'" onclick="cacelSearch()">取消查找</a>
	</c:otherwise>
</c:choose>
</div>
