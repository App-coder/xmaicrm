<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/performances/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<div class="d_view " >
			查找范围：<select><option>所有员工绩效</option></select>
			<select><option>自定义</option></select>开始日期：<input type="text"  class="text easyui-datebox"/>
			结束日期：<input type="text"  class="text easyui-datebox" />
			&nbsp;<a class="easyui-linkbutton" >确定</a>
			&nbsp;<a class="easyui-linkbutton" >设置用户</a>
		</div>
		<table id="tab_list" ></table>
		<div class="easyui-tabs mgt_10" >  
	        <div title="客户" >  
	            tab1  
	        </div>  
	        <div title="日程安排">  
	            tab2  
	        </div>  
	        <div title="联系记录">  
	            tab2  
	        </div> 
	        <div title="销售机会">  
	            tab2  
	        </div> 
	        <div title="报价单">  
	            tab2  
	        </div> 
	        <div title="合同订单">  
	            tab2  
	        </div> 
	        <div title="应收款">  
	            tab2  
	        </div> 	        	        	        	        	        
	    </div> 
	    <fieldset class="mgt_10">
	    	<legend>提示</legend>
	    	排序：点击标题即可根据标题排序<br>
			  	期初客户：开始日期之前创建的客户<br>
			  	新客户：开始日期和结束日期之间创建的客户<br>
			  	完成活动：开始日期和结束日期之间创建并完成的日程安排<br>
			  	销售机会：开始日期和结束日期之间预计完成的销售机会<br>
			  	合同金额：开始日期和结束日期之间签约并审批通过的合同订单的总金额<br>
			  	已收款：开始日期和结束日期之间已经收取的应收款
	    </fieldset> 
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>