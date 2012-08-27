<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<script type="text/javascript" src="resources/desktop/module/qunfas/index.js"></script>
</head>
<body id="wrap">
	${navbar }
	<div id="main">
		<div id="navpath" class="path">
			${ptb.parenttabLabel }&gt;<a href="crm/module/qunfas/index?ptb=${ptb.parenttabid }">${tab.tablabel}</a>
		</div>
		<table id="tablist"></table>
	</div>
	
	
	<div class="hidden" >
		<div id="wind_message"  iconCls="icon-sendmsg"
			style="width:700px; height:432px;" class="easyui-window "
			<%=win_topbar%> title="群发短信" >
			<div class="easyui-layout" data-options="fit:true,border:false"">
				<div data-options="region:'center',border:false"  class="p10"  >
					    <div  class="easyui-tabs" data-options="fit:true">  
					        <div title="1.基本信息" class="p10" >  
					            <table class="tab_editlist">
					            	<tr>
					            		<td class="edittd">方案名称</td>
					            		<td><input type="text" class="text"/></td>
					            	</tr>
					            	<tr>
					            		<td class="edittd" valign="top">备注</td>
					            		<td valign="top" ><textarea></textarea></td>
					            	</tr>
					            	<tr>
					            		<td class="edittd" valign="top">短信内容</td>
					            		<td valign="top" ><textarea></textarea></td>
					            	</tr>
					            </table>  
					            <fieldset class="mg10" >
					            	<legend>提示</legend>
					            	1.群发短信主要是针对系统中的联系人。<br>
					            	2.群发前请确认企业短信通道是否配置成功。<br>
					            	3.短信内容超过60个字符将分多条发送。<br>
					            </fieldset>
					        </div> 
					        <div title="2.群发短信规则" class="p10"  >  
					          <fieldset>
					         	 <legend>基本选项</legend>
					         	 <table class="tabauth" >
					         	 	<thead>
									<tr class="datagrid-header" >
					         	 		<td width="50%" >字段</td>
					         	 		<td width="25%" >开始日期</td>
					         	 		<td width="25%" >结束日期</td>
					         	 	</tr>
									</thead>
					         	 	<tbody>
					         	 	<tr>
					         	 		<td>
					         	 			<select>
					         	 				<option>客户-公司成立时间</option>
					         	 			</select>&nbsp;
					         	 			<select>
					         	 				<option>自定义</option>
					         	 			</select>
					         	 		</td>
					         	 		<td>
					         	 			<input type="text" class="text easyui-datebox" />
					         	 		</td>
					         	 		<td>
					         	 			<input type="text" class="text easyui-datebox" />
					         	 		</td>
					         	 	</tr>
					         	 	</tbody>
					         	 </table>
					          </fieldset>
					          <fieldset class="mgt_10 mgb_10" >
					         	 <legend>高级选项</legend>
					         	 <table class="tabauth" >
					         	 	<thead>
									<tr class="datagrid-header" >
					         	 		<td width="35%" >字段</td>
					         	 		<td width="10%" >运算符</td>
					         	 		<td width="50%" >值</td>
					         	 		<td width="5%"></td>
					         	 	</tr>
									</thead>
									<tbody>
										<tr>
											<td><select><option>无</option></select></td>
											<td><select><option>无</option></select></td>
											<td><input type="text" class="text"/></td>
											<td>和</td>
										</tr>
										<tr>
											<td><select><option>无</option></select></td>
											<td><select><option>无</option></select></td>
											<td><input type="text" class="text"/></td>
											<td>和</td>
										</tr>
										<tr>
											<td><select><option>无</option></select></td>
											<td><select><option>无</option></select></td>
											<td><input type="text" class="text"/></td>
											<td>和</td>
										</tr>
										<tr>
											<td><select><option>无</option></select></td>
											<td><select><option>无</option></select></td>
											<td><input type="text" class="text"/></td>
											<td>和</td>
										</tr>
										<tr>
											<td><select><option>无</option></select></td>
											<td><select><option>无</option></select></td>
											<td><input type="text" class="text"/></td>
											<td></td>
										</tr>
									</tbody>
								</table>
								<fieldset class="mgt_10">
									<legend>提示</legend>
									1.通过在第三列输入多个用逗号分开的关键字以使用“or”运算符。<br>
									2.最多可输入 10 项，各项之间用逗号隔开。例如：输入 CA, NY, TX, FL 将搜索 CA 或 NY 或 TX 或 FL。<br>
									3.请用引号引起包含逗号的数据。例如，输入 "200,000","1,000,000" 将搜索 200,000 或 1,000,000。
								</fieldset>
					          </fieldset>
					        </div> 
					        <div title="3.确认收件人" class="p10"  >  
					            <table id="tablist" ></table>
					        </div> 
					        <div title="4.开始发送" class="p10"  >  
					                               发送状态显示
					        </div> 					        					        					         
					    </div>  
				</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-prev" >上一步</a>
					<a class="easyui-linkbutton" iconCls="icon-next" >下一步</a>
					<a class="easyui-linkbutton" iconCls="icon-sendmsg" >测试发送给自己</a>
					<a class="easyui-linkbutton" iconCls="icon-sendmsg" >开始发送</a>
					<a class="easyui-linkbutton" iconCls="icon-ok" >完成</a>					  
					<a class="easyui-linkbutton" iconCls="icon-cancel" >取消</a>
						</div>
				</div>
			</div>
		</div>
	
	<%@ include file="../../foot.jsp"%>
</body>
</html>