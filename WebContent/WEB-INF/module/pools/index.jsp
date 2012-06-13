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
		
		<div class="easyui-tabs">  
		    <div title="未分配" class="p10"  >
				<div class="d_bar" >  
		        查看范围：<select><option>所有客户</option></select>
		        &nbsp;<select><option>到期时间</option></select>
		        <select><option>自定义</option></select>
		        <input type="text" class="easyui-datebox"/>
		        <input type="text" class="easyui-datebox"/>
		        &nbsp;客户状态：<select><option>请选择</option></select>
		                     客户级别：<select><option>请选择</option></select>
		                     客户来源：<select><option>请选择</option></select>&nbsp;
				<select><option>客户名称</option></select>&nbsp;
				<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" >查找</a>                   
				</div> 
		        <table id="tb_unabsorbed" ></table>
		    </div>  
		    <div title="已分配" class="p10"  >  
		    				<div class="d_bar" >  
		        查看范围：<select><option>所有客户</option></select>
		        &nbsp;<select><option>到期时间</option></select>
		        <select><option>自定义</option></select>
		        <input type="text" class="easyui-datebox"/>
		        <input type="text" class="easyui-datebox"/>
		        &nbsp;客户状态：<select><option>请选择</option></select>
		                     客户级别：<select><option>请选择</option></select>
		                     客户来源：<select><option>请选择</option></select>&nbsp;
				<select><option>客户名称</option></select>&nbsp;
				<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" >查找</a>                   
				</div> 
		        <table id="assigned" toolbar="#tb_assigned" ></table>
		        <div id="tb_assigned" class="gtb" style="display: block;" >  
				</div>
		    </div>  
		    <div title="客户池设置" class="p10"  >  
		        <div class="easyui-tabs" >  
		        	<div title="客户池规则设置" class="p10"  >  
		        		<fieldset class="mgb_10">
							<legend>客户池设置</legend>
							<p>
							是否启用客户池 ：<input type="checkbox"  /><br>
							1、说明：客户池是一种压力型销售管理工具。<br>
							2、主要特点：将客户池客户领取或分配给某些销售，每个销售只能领取一定数量内的客户池客户，且在期限内必须达成签约或回款，否则客户就会自动回归客户池重新分配给其他销售。
	除非必要，我们更建议企业提供给销售人员积极和公平的竞争环境与保障，而不是过度依赖压力。<br>
							3、客户池权限：包括 客户池管理员，客户池用户
							</p>	        		
		        		</fieldset>
		        		<fieldset class="mgb_10">
		        			<legend>自动回归期限</legend>
		        			<p>
		        			天数：<input type="text" class="text" style="width:50px;" />天<br>
		        			说明：客户池客户被分配或领取到某用户之后，达到期限仍然没有新建回款且没有新建合同订单，则该客户自动回归客户池。<br>
		        			</p>
		        		</fieldset>
		        		<fieldset class="mgb_10">
		        			<legend>最迟联系天数</legend>
		        			<p>
		        			天数：<input type="text" class="text" style="width:50px;" />天<br>
		        			说明：客户池客户被分配或领取到某用户之后，达到期限仍然没有于客户联系，并创建联系记录的，则该客户自动回归客户池。
		        			</p>
		        		</fieldset>
		        		<fieldset class="mgb_10">
		        			<legend>一个用户可领取客户池客户数量上限</legend>
		        			<p>
		        			数量：<input type="text" class="text" style="width:50px;" /><br>
		        			说明：限制单一用户领取的客户池客户数量。
		        			</p>
		        		</fieldset>
		        		<p  class="mgb_10" >
		        		<a class="easyui-linkbutton" >设置</a>
		        		</p>
		        	</div>
		        	<div title="客户池普通用户设置" class="p10"  >  
		        		<fieldset class="mgb_10">
		        			<legend>客户池用户权限设置</legend>
		        			<p>
		        			说明：拥有客户池用户权限的用户，可以操作： <br>
		        			1.在客户列表看到客户池客户<br>
		        			2.领取客户池客户池中的客户池客户<br>
							3.可对已领取或分配给自己的客户池客户，进入视图，操作跟单<br>
							4.可以将已领取或分配给自己的客户池客户释放到客户池客户池中<br>
							<span class="red">注意：管理员权限的用户，自动拥有此权限。</span>
							<br>
							<input type="checkbox"/>ZHANGSAN
		        			</p>
		        		</fieldset>
		        		<p  class="mgb_10" >
		        		<a class="easyui-linkbutton" >设置</a>
		        		</p>
		        	</div>
		        	<div title="客户池管理员设置" class="p10"  >  
		        		<fieldset class="mgb_10">
		        			<legend>客户池管理员权限设置</legend>
		        			<p>
		        				说明：拥有客户池管理员权限的用户，可以操作： <br>
								1.将客户转为客户池客户或将客户池客户转为非客户池客户<br>
								2.可以将客户池客户分配给某个用户跟进（此用户必须是客户池用户）<br>
								3.可以延长某个客户池客户的期限，延缓其自动回归<br>
								4.可以将已分配的客户池客户释放回客户池<br>
								5.可以领取客户池池的客户池客户<br>
								6.可以批量导入客户池客户
								<br>
								<span class="red">注意：管理员权限的用户，自动拥有此权限。</span>
								<br>
								<input type="checkbox"/>ZHANGSAN
			        		</p>
		        		</fieldset>
		        		<p  class="mgb_10" >
		        		<a class="easyui-linkbutton" >设置</a>
		        		</p>
		        	</div>		        			        	
		        </div>
		    </div>  
		</div> 
		
	</div>
	<%@ include file="../../foot.jsp"%>
</body>
</html>