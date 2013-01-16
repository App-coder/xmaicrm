<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/dailylogs/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div class="def_div bggray plr_5 mgb_10" style="height:22px;line-height:22px;" >
		<span class="fl">2012-08-26(星期日) 管理员  过去5天： 2012-08-22 写 2012-08-23 写 2012-08-24 写 2012-08-25 写 2012-08-26 看</span>
		<span class="fr">日报日期：<input type="text" id="startdate"  class="text easyui-datebox" />&nbsp;
		负责人：<select class="easyui-combotree" style="width:160px;" data-options="url:'crm/module/dailylogs/getCondition'"></select>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
		</span>
		</div>
		
		<fieldset class="mgb_10" >
			<legend>1.当日数据参考</legend>
		</fieldset>
		
		<fieldset class="mgb_10" >
			<legend>2.查看计划，撰写今日工作总结</legend>
			<table class="tab_form">
				<tr>
					<td width="10%" valign="top" class="edittd3">今日总结</td><td width="40%">
					<textarea ></textarea>
					</td><td width="10%" valign="top" class="edittd3">今日计划<br>（昨日填写）</td><td width="40%" ></td>
				</tr>
			</table>
		</fieldset>
		
		<fieldset class="mgb_10" >
			<legend>3.撰写明日计划</legend>
			<table class="tab_form">
				<tr>
					<td width="10%" valign="top" class="edittd3">明日计划</td><td width="40%">
					<textarea ></textarea>
					</td><td colspan="2" valign="bottom">
					调入说明：明日日程：开始日期<=明天<=结束日期；
					</td>
				</tr>
				<tr>
					<td></td>
					<td><a class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a></td>
					<td colspan="2"></td>
				</tr>
			</table>
		</fieldset>
		
		<div class="def_div tac" >
			<a class="easyui-linkbutton" data-options="iconCls:'icon-save'">暂存</a>&nbsp;<a class="easyui-linkbutton" data-options="iconCls:'icon-submit'">交周报</a>
		</div>
		
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>