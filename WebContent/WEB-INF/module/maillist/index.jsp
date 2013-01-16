<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<%@ include file="../../common/config.jsp"%>
<style>
.swfupload{float:left;}
</style>
<script>
var module = "${entitytype}";
</script>

<!-- 文件上传 -->
<script type="text/javascript" src="resources/plugins/swfupload/swfupload.js"></script>
<script type="text/javascript" src="resources/plugins/swfupload/handler.js"></script>
<script type="text/javascript" src="resources/plugins/swfupload/swfupload.css"></script>

<script charset="utf-8" src="resources/plugins/kindeditor/kindeditor.js"></script>
<script charset="utf-8" src="resources/plugins/kindeditor/lang/zh_CN.js"></script>

<script type="text/javascript" src="resources/desktop/module/maillist/index.js"></script>

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
		<div id="wind_mail"  iconCls="icon-sendemail"
			style="width:800px; height:494px;" class="easyui-window "
			<%=win_topbar%> title="群发邮件" >
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
					            		<td class="edittd" valign="top">邮件主题</td>
					            		<td valign="top" ><input type="text" class="text"/></td>
					            	</tr>
					            	<tr>
					            		<td colspan="2">
					            		<a class="easyui-linkbutton" iconCls="icon-ok" >选择Email模版</a>
					            		</td>
					            	</tr>
					            	<tr>
					            		<td colspan="2">
					            			<textarea class="fullarea" name="description" style="width:100%;visibility:hidden;height:300px;" >客户汇报表</textarea>
					            		</td>
					            	</tr>
					            	<tr>
					            		<td class="edittd" valign="top">附件</td>
					            		<td valign="top" >
					            			<input type="text" class="text fl" name="filename" id="filename" disabled="true"  />&nbsp;<span id="btnuploader"></span>
					            		</td>
					            	</tr>
					            </table>  
					            <fieldset class="mg10" >
					            	<legend>提示</legend>
					            	1)群发邮件主要是针对系统中的联系人。<br>
									2)只有管理员才能在控制面板定义Email摸版。<br>
									3)群发前请确认SMTP是否配置成功。<br>
									4)发件人是SMTP服务器信息中的邮件地址。
					            </fieldset>
					        </div> 
					        <div title="2.群发邮件规则" class="p10"  >  
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
					        <div title="3.确认接受人" class="p10"  >  
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
					<a class="easyui-linkbutton" iconCls="icon-sendemail" >测试发送给自己</a>
					<a class="easyui-linkbutton" iconCls="icon-sendemail" >开始发送</a>
					<a class="easyui-linkbutton" iconCls="icon-ok" >完成</a>					  
					<a class="easyui-linkbutton" iconCls="icon-cancel" >取消</a>
						</div>
				</div>
			</div>
		</div>
	
	<%@ include file="../../foot.jsp"%>
</body>
</html>