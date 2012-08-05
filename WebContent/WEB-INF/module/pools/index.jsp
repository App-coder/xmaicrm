<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript"
	src="resources/desktop/module/pools/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div class="hidden"></div>
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a
				href="crm/module/${fn:toLowerCase(entityname.modulename) }/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		
		<div class="easyui-tabs" fit="true">  
		    <div title="未分配" class="p10"  >  
		        <table id="unabsorbed" ></table>
		    </div>  
		    <div title="已分配" class="p10"  >  
		        <table id="assigned"></table>
		    </div>  
		    <div title="客户池设置" class="p10"  >  
		        <div class="easyui-tabs" fit="true">  
		        	<div title="客户池规则设置" class="p10"  >  
		        		<fieldset>
							<legend>客户池设置</legend>
							<p>
							是否启用客户池 <input type="checkbox" /><br>
							1、说明：客户池是一种压力型销售管理工具。<br>
							2、主要特点：将客户池客户领取或分配给某些销售，每个销售只能领取一定数量内的客户池客户，且在期限内必须达成签约或回款，否则客户就会自动回归客户池重新分配给其他销售。
	除非必要，我们更建议企业提供给销售人员积极和公平的竞争环境与保障，而不是过度依赖压力。<br>
							3、客户池权限：包括 客户池管理员，客户池用户
							</p>	        		
		        		</fieldset>
		        	</div>
		        	<div title="客户池普通用户设置" class="p10"  >  
		        	</div>
		        	<div title="客户池管理员设置" class="p10"  >  
		        	</div>		        			        	
		        </div>
		    </div>  
		</div> 
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>