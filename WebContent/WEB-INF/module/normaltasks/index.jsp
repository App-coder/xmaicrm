<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script>
//定义页面变量，需要前缀，防止多页面变量重复
var entitytype = '${entitytype}';
var viewtab = entitytype.toLowerCase();
var viewid = '${viewid}';
var tabid = ${tab.tabid};
var tablabel = '${tab.tablabel}';
var ptb = ${ptb.parenttabid };
</script>
<script type="text/javascript" src="resources/desktop/module/normaltasks/index.js"></script>
</head>
<body id="wrap">
${navbar }
<div id="main">
<div id="navpath" class="path">
${ptb.parenttabLabel }&gt;<a href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
</div>
	<div class="d_view ">
	查看范围：
					<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/normaltasks/getCondition'"></select>
					<div class="fr" id="tasksstatus" style="margin-right: 10px;">
					<a class="easyui-linkbutton lb_ck" onclick="loadNormalTask(0,this)" >未处理（<span class="red">${notdo }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(2,this)" >跟进中（<span class="red">${follow }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(3,this)">转入（<span class="red">${change }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(5,this)">已过期（<span class="red">${overtime }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(1,this)">已完成（<span class="red">${finished }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(6,this)">过期完成（<span class="red">${outtimefinished }</span>）</a>
					<a class="easyui-linkbutton" onclick="loadNormalTask(7,this)">转出（<span class="red">${rollout }</span>）</a>					
					</div>
					
			</div>
			<table id="view_list" data-options="fitColumns:true" ></table>
</div>


<%@ include file="../../foot.jsp"%>
</body>
</html>