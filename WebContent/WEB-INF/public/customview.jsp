<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head.jsp"%>
<%@ include file="../common/config.jsp"%>
<script> 
var entitytype = '${entitytype}';
</script>
<script type="text/javascript" src="resources/plugins/dateutils.js"></script>
<script type="text/javascript"
	src="resources/desktop/public/customview.js"></script>
<script>
    function showDateRange(type) {
	var start_prevfy;
	var end_newday;
	
	if (type == "custom") {
		$("#startdate").datebox('setValue', '');
		$("#enddate").datebox('setValue', '');
		
		$("#form_customview").find("input[name=startdate]").val("");
		$("#form_customview").find("input[name=enddate]").val("");
		
	}

	if (type == "today") {
	    start_prevfy = '${timeoptions.start_prevfy}';
	    end_newday = '${timeoptions.end_prevfy}';
	} else if (type == "yesterday") {
	    start_prevfy = '${timeoptions.start_yesterday}';
	    end_newday = '${timeoptions.end_yesterday}';
	} else if (type == "tomorrow") {
	    start_prevfy = '${timeoptions.start_tomorrow}';
	    end_newday = '${timeoptions.end_tomorrow}';
	} else if (type == "thisweek") {
	    start_prevfy = '${timeoptions.start_thisweek}';
	    end_newday = '${timeoptions.end_thisweek}';
	} else if (type == "lastweek") {
	    start_prevfy = '${timeoptions.start_lastweek}';
	    end_newday ='${timeoptions.end_lastweek}';
	} else if (type == "nextweek") {
	    start_prevfy = '${timeoptions.start_nextweek}';
	    end_newday = '${timeoptions.end_nextweek}';
	} else if (type == "thismonth") {
	    start_prevfy = '${timeoptions.start_thismonth}';
	    end_newday = '${timeoptions.end_thismonth}';
	} else if (type == "lastmonth") {
	    start_prevfy = '${timeoptions.start_lastmonth}';
	    end_newday = '${timeoptions.end_lastmonth}';
	} else if (type == "nextmonth") {
	    start_prevfy = '${timeoptions.start_nextmonth}';
	    end_newday = '${timeoptions.end_nextmonth}';
	} else if (type == "before3days") {
	    start_prevfy = '${timeoptions.start_before3days}';
	    end_newday = '${timeoptions.end_before3days}';
	} else if (type == "before7days") {
	    start_prevfy = '${timeoptions.start_before7days}';
	    end_newday ='${timeoptions.end_before7days}';
	} else if (type == "before15days") {
	    start_prevfy = '${timeoptions.start_before15days}';
	    end_newday ='${timeoptions.end_before15days}';
	} else if (type == "before30days") {
	    start_prevfy = '${timeoptions.start_before30days}';
	    end_newday = '${timeoptions.end_before30days}';
	} else if (type == "before60days") {
	    start_prevfy = '${timeoptions.start_before60days}';
	    end_newday = '${timeoptions.end_before60days}';
	} else if (type == "before100days") {
	    start_prevfy = '${timeoptions.start_before100days}';
	    end_newday ='${timeoptions.end_before100days}';
	} else if (type == "before180days") {
	    start_prevfy = '${timeoptions.start_before180days}';
	    end_newday = '${timeoptions.end_before180days}';
	} else if (type == "after3days") {
	    start_prevfy = '${timeoptions.start_after3days}';
	    end_newday = '${timeoptions.end_after3days}';
	} else if (type == "after7days") {
	    start_prevfy = '${timeoptions.start_after7days}';
	    end_newday = '${timeoptions.end_after7days}';
	} else if (type == "after15days") {
	    start_prevfy = '${timeoptions.start_after15days}';
	    end_newday = '${timeoptions.end_after15days}';
	} else if (type == "after30days") {
	    start_prevfy = '${timeoptions.start_after30days}';
	    end_newday = '${timeoptions.end_after30days}';
	} else if (type == "after60days") {
	    start_prevfy = '${timeoptions.start_after60days}';
	    end_newday = '${timeoptions.end_after60days}';
	} else if (type == "after100days") {
	    start_prevfy = '${timeoptions.start_after100days}';
	    end_newday = '${timeoptions.end_after100days}';
	} else if (type == "after180days") {
	    start_prevfy = '${timeoptions.start_after180days}';
	    end_newday = '${timeoptions.end_after180days}';
	} else if (type == "next3days") {
	    start_prevfy = '${timeoptions.start_next3days}';
	    end_newday = '${timeoptions.end_next3days}';
	} else if (type == "next7days") {
	    start_prevfy = '${timeoptions.start_next7days}';
	    end_newday = '${timeoptions.end_next7days}';
	} else if (type == "next15days") {
	    start_prevfy = '${timeoptions.start_next15days}';
	    end_newday = '${timeoptions.end_next15days}';
	} else if (type == "next30days") {
	    start_prevfy = '${timeoptions.start_next30days}';
	    end_newday = '${timeoptions.end_next30days}';
	} else if (type == "next60days") {
	    start_prevfy = '${timeoptions.start_next60days}';
	    end_newday = '${timeoptions.end_next60days}';
	} else if (type == "next90days") {
	    start_prevfy = '${timeoptions.start_next90days}';
	    end_newday = '${timeoptions.end_next90days}';
	} else if (type == "next180days") {
	    start_prevfy = '${timeoptions.start_next180days}';
	    end_newday = '${timeoptions.end_next180days}';
	} else if (type == "last3days") {
	    start_prevfy = '${timeoptions.start_last3days}';
	    end_newday = '${timeoptions.end_last3days}';
	} else if (type == "last7days") {
	    start_prevfy = '${timeoptions.start_last7days}';
	    end_newday = '${timeoptions.end_last7days}';
	} else if (type == "last15days") {
	    start_prevfy = '${timeoptions.start_last15days}';
	    end_newday = '${timeoptions.end_last15days}';
	} else if (type == "last30days") {
	    start_prevfy = '${timeoptions.start_last30days}';
	    end_newday = '${timeoptions.end_last30days}';
	} else if (type == "last60days") {
	    start_prevfy = '${timeoptions.start_last60days}';
	    end_newday = '${timeoptions.end_last60days}';
	} else if (type == "last90days") {
	    start_prevfy = '${timeoptions.start_last90days}';
	    end_newday = '${timeoptions.end_last90days}';
	} else if (type == "last180days") {
	    start_prevfy = '${timeoptions.start_last180days}';
	    end_newday = '${timeoptions.end_last180days}';
	} else if (type == "thisfy") {
	    start_prevfy = '${timeoptions.start_thisfy}';
	    end_newday = '${timeoptions.end_thisfy}';
	} else if (type == "prevfy") {
	    start_prevfy = '${timeoptions.start_prevfq}';
	    end_newday = '${timeoptions.end_prevfq}';
	} else if (type == "nextfy") {
	    start_prevfy = '${timeoptions.start_nextfy}';
	    end_newday = '${timeoptions.end_nextfy}';
	} else if (type == "nextfq") {
	    start_prevfy = '${timeoptions.start_nextfq}';
	    end_newday = '${timeoptions.end_nextfq}';
	} else if (type == "prevfq") {
	    start_prevfy = '${timeoptions.start_prevfq}';
	    end_newday = '${timeoptions.end_prevfq}';
	} else if (type == "thisfq") {
	    start_prevfy = '${timeoptions.start_thisfq}';
	    end_newday = '${timeoptions.end_thisfq}';
	}

	$("#startdate").datebox('setValue', start_prevfy);
	$("#enddate").datebox('setValue', end_newday);
    }
</script>
</head>
<body id="wrap">
<%@ include file="../nav.jsp"%>

<div id="main">
<div class="path"><a href="/">视图管理</a>&gt;<a href="/sc/">${tab.tablabel}</a></div>


<div class="container">
	<div class="hidden">
		<div id="customview_edit" iconCls="icon-save"
			style="width: 700px; height: 480px;" class="easyui-window"
			<%=win_topbar%> title="属性编辑" >
			<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'center',border:false" style="padding:10px;background:#fff;border:1px solid #ccc;">
					<form name="form_customview" id="form_customview" method="post" >
					<input type="hidden" name="id" />
					<input type="hidden" name="action"  />
					<input type="hidden" name="entitytype" />
					<input type="hidden" name="setpublic" />
					<input type="hidden" name="ispublic" />
					<input type="hidden" name="setdefault" />
					<input type="hidden" name="setmetrics" />
					<input type="hidden" name="startdate" />
					<input type="hidden" name="enddate" />
					
						<fieldset>
							<legend>基本信息</legend>
							<table class="tab_form">
								<tr>
									<td width="33%">视图名称&nbsp;&nbsp;<input name="viewname" class="easyui-validatebox" required="true" type="text"
										class="text" /></td>
									<td width="33%">默认视图&nbsp;&nbsp;<input id="setdefault" type="checkbox" /></td>
									<td width="33%" rowspan="2">角色&nbsp;&nbsp;<select
										multiple="multiple" class="text" 
										id="roles" style="height: 50px;"></select></td>
								</tr>
								<tr>
									<td width="33%">首页关键视图列表中显示&nbsp;&nbsp;<input
										type="checkbox" id="setmetrics" /></td>
									<td width="33%">公共视图&nbsp;&nbsp;<input type="checkbox"
										id="ispublic" /></td>
								</tr>
							</table>
						</fieldset>
						<br>
						<fieldset>
							<legend>选择列表中显示字段 </legend>
							<table class="tab_form">
								<tr>
									<td><select class="text" name="column_1"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_2"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_3"> ${optionstr }
									</select></td>
								</tr>
								<tr>
									<td><select class="text" name="column_4"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_5"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_6"> ${optionstr }
									</select></td>
								</tr>
								<tr>
									<td><select class="text" name="column_7"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_8"> ${optionstr }
									</select></td>
									<td><select class="text" name="column_9"> ${optionstr }
									</select></td>
							</table>
						</fieldset>
						<br>
						<fieldset>
							<legend>选择列表中汇总字段</legend>
							<table class="tab_form">
								<tr>
									<td><select class="text"  name="column_collect"> ${colloptionstr }
									</select></td>
									<td></td>
									<td></td>
								</tr>
							</table>
						</fieldset>
						<br>
						<fieldset>
							<legend>设置过滤条件</legend>
							<table class="tab_form">
								<tr>
									<td>
										<div class="easyui-tabs" style="width: 620px;">
											<div title="基本条件 " class="p10">
												<p>
													设置查询条件以过滤视图列表：<br>
													1)当时间段为自定义时，开始日期和结束日期将为指定的日期，例如2010-10-10。<br>
													2)当时间段为非自定义时，开始日期和结束日期将为动态的日期，例如选择本周时，开始日期和结束日期将分别为本周的周一和周末，而不是固定的日期。<br>
												</p>
												<fieldset>
													<legend>根据时间类型字段设置过滤条件</legend>
													<table class="tab_form">
														<tr>
															<td class="edittd">选择查询字段</td>
															<td><select class="text" name="column_stdfilter" > ${searchfields }
															</select></td>
														</tr>
														<tr>
															<td class="edittd">选择时间段</td>
															<td><select
																onchange="showDateRange(this.options[this.selectedIndex].value )"
																class="select" name="stddatefilter">
																	<option value="custom">自定义</option>
																	<option value="prevfy">上财年</option>
																	<option value="thisfy">本财年</option>
																	<option value="nextfy">下财年</option>
																	<option value="prevfq">上季度</option>
																	<option value="thisfq">本季度</option>
																	<option value="nextfq">下季度</option>
																	<option value="yesterday">昨天</option>
																	<option value="today">今天</option>
																	<option value="tomorrow">明天</option>
																	<option value="lastweek">上星期</option>
																	<option value="thisweek">本星期</option>
																	<option value="nextweek">下星期</option>
																	<option value="lastmonth">上月</option>
																	<option value="thismonth">本月</option>
																	<option value="nextmonth">下月</option>
																	<option value="before3days">3天前</option>
																	<option value="before7days">7天前</option>
																	<option value="before15days">15天前</option>
																	<option value="before30days">30天前</option>
																	<option value="before60days">60天前</option>
																	<option value="before100days">100天前</option>
																	<option value="before180days">180天前</option>
																	<option value="after3days">3天后</option>
																	<option value="after7days">7天后</option>
																	<option value="after15days">15天后</option>
																	<option value="after30days">30天后</option>
																	<option value="after60days">60天后</option>
																	<option value="after100days">100天后</option>
																	<option value="after180days">180天后</option>
																	<option value="last3days">前3天</option>
																	<option value="last7days">前7天</option>
																	<option value="last15days">前15天</option>
																	<option value="last30days">前30天</option>
																	<option value="last60days">前60天</option>
																	<option value="last90days">前90天</option>
																	<option value="last180days">前180天</option>
																	<option value="next3days">后3天</option>
																	<option value="next7days">后7天</option>
																	<option value="next15days">后15天</option>
																	<option value="next30days">后30天</option>
																	<option value="next60days">后60天</option>
																	<option value="next90days">后90天</option>
																	<option value="next180days">后180天</option>
															</select></td>
														</tr>
														<tr>
															<td class="edittd">开始日期</td>
															<td><input type="text"
																id="startdate" editable="false"
																class="text easyui-datebox" /></td>
														</tr>
														<tr>
															<td class="edittd">结束日期</td>
															<td><input type="text" id="enddate"
																editable="false" class="text easyui-datebox" /></td>
														</tr>
													</table>
												</fieldset>
											</div>
											<div title="高级条件 " class="p10">
												<p>
													设置查询条件以过滤视图列表：<br> 1)你可以在第三列中使用or来输入多个条件。<br>
													2)你至多可以输入10个条件，并以逗号分割。例如：CA, NY, TX, FL 查找CA 或 NY 或 TX 或
													FL. <br>
												</p>
												<fieldset>
													<legend>根据字段设置过滤条件</legend>
													<table class="tab_form">
														<tr>
															<td><select class="text"  name="advfiltercol_1" onchange="setComp(this.value,'comparator_1')" >${optionstr }</select></td>
															<td><select class="text" name="comparator_1">${filter }</select></td>
															<td><input type="text" class="text" name="fv_1" /></td>
														</tr>
														<tr>
															<td><select class="text" name="advfiltercol_2" onchange="setComp(this.value,'comparator_2')" >${optionstr }</select></td>
															<td><select class="text" name="comparator_2">${filter }</select></td>
															<td><input type="text" class="text" name="fv_2" /></td>
														</tr>
														<tr>
															<td><select class="text" name="advfiltercol_3" onchange="setComp(this.value,'comparator_3')" >${optionstr }</select></td>
															<td><select class="text" name="comparator_3">${filter }</select></td>
															<td><input type="text" class="text" name="fv_3" /></td>
														</tr>
														<tr>
															<td><select class="text" name="advfiltercol_4" onchange="setComp(this.value,'comparator_4')" >${optionstr }</select></td>
															<td><select class="text" name="comparator_4">${filter }</select></td>
															<td><input type="text" class="text" name="fv_4" /></td>
														</tr>
														<tr>
															<td><select class="text" name="advfiltercol_5" onchange="setComp(this.value,'comparator_5')" >${optionstr }</select></td>
															<td><select class="text" name="comparator_5">${filter }</select></td>
															<td><input type="text" class="text" name="fv_5" /></td>
														</tr>																																																								
													</table>
												</fieldset>
											</div>
										</div>
									</td>
								</tr>
							</table>
						</fieldset>
						<br>
					</form>
					</div>
				<div region="south" class="btnbar" border="false">
					<a class="easyui-linkbutton" iconCls="icon-ok"
						href="javascript:void(0)" onclick="formsubmit('form_customview')">编辑</a> <a
						class="easyui-linkbutton" iconCls="icon-cancel"
						href="javascript:void(0)" onclick="closeWin('customview_edit')">取消</a>
						</div>
				</div>
		</div>
	</div>
	<table id="customview_list" data-options="fitColumns:true"></table>
</div>
</div>
<%@ include file="../foot.jsp"%>
</body>
</html>