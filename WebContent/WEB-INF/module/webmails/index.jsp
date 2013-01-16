<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/webmails/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div  class="easyui-layout" data-options="fit:true" >   
	        <div data-options="region:'west',split:false" style="width:210px;border-right:0px;">
		        <div class="navcontainer1" style="margin-right:0px;border:none;">
		        	<div class="datagrid-toolbar" >
		        		<span class="icon-writeemail iconblock">写邮件</span>&nbsp;&nbsp;
		        		<span class="icon-receiveemail iconblock">收邮件</span>&nbsp;&nbsp;
		        		<span class="icon-emailcfg iconblock">帐号</span>
		        	</div>
		        	<ul>
		        		<li style="height:20px;line-height:20px;">
		        			<select class="easyui-combotree" style="width:200px;" data-options="url:'crm/module/webmails/getCondition'"></select>
		        		</li>
		        	</ul>
					<div class="datagrid-toolbar"><span class="icon-folder iconblock">文件夹</span></div>
					<ul>
						<li><span class="icon-inbox iconblock">收件箱</span></li>
						<li><span class="icon-sendmsg iconblock">已发送</span></li>
						<li><span class="icon-remove iconblock">已删除</span></li>
						<li><span class="icon-draft iconblock">草稿箱</span></li>
						<li><span class="icon-dustbin iconblock">垃圾箱</span></li>
					</ul>
				</div>
	        </div>  
	        <div data-options="region:'center'" >
	        	<div class="d_view "  style="display: block;height:25px;border:none;border-bottom: 1px solid #99BBE8;" >
		        	<span class="fl">
			         [收件箱] - 未读 0 封 共 1 封 
			         </span>
			         <span class="fr">
			         	<input type="text" class="text" />
			         	<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-search" >查找</a>
			         </span>
	        	</div>
		        <div id="tabbar" class="gtb" style="display: block;" > 
		         	<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" >删除</a>
		         	<a class="easyui-linkbutton" data-options="plain:true" iconCls="icon-remove" >永久删除</a>
		         	<select><option>标记为</option></select>
		         	<select><option>移动到</option></select>
		         	<select><option>复制到</option></select>
		        </div>
				<table id="view_list" data-options="fitColumns:true,fit:true,border:false" toolbar="#tabbar"  ></table>
			</div>  
	    </div>  
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>