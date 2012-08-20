$(function() {
    if(tab_viewid != -1){
	init();
    }   
});
function init(){

  //设置视图
	$('#view_list').datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		pageSize:20,
		toolbar : [{
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
			
		    }
		}, {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {
			var selected = $('#view_list').datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}
		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
			var selected = $('#view_list').datagrid("getSelected");
			if(selected){
			    
			}else{
			    message("请选择记录！");
			}			
		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    if(data.footer!=undefined){
			$(".stat_div").empty();
			for(var i=0;i<data.footer.length;i++){
			    var stat = $(".div_statdemo").clone();
			    $(stat).find(".stat_name").html(data.footer[i].statname);
			    $(stat).find(".stat_num").html(data.footer[i].statnum);
			    $(".stat_div").append($(stat));
			}
			$(".stat_div").show();
		    }
		}
	    });
}
function viewSearchReport(){
    var reporttext = $("#reportselect").find("option:selected").text();
    $("#winreport").window({title:tablabel+"-"+reporttext+"-分布统计"});
    $("#winreport").window("open");
    viewReport();
}
function viewReport(){
    //统计方式
    var grouptype = $("select[name=grouptype]").find("option:selected").attr("value");
    var reporttext = $("#reportselect").find("option:selected").text();
    
    var grouptitle;
    if(grouptype == "count"){
	grouptitle = "记录数";
    }else{
	var grouptypeobj = $.parseJSON(grouptype);
	grouptitle = grouptypeobj.fieldlabel;
    }
    var title = grouptitle+"-分布统计";
    //根据选项显示不同的报表视图
    //报表显示方式
    var graphtype =  $("select[name=graphtype]").find("option:selected").attr("value");
    
    var reportselect = $("#reportselect").val();
    reportselect = $.parseJSON(reportselect);
    
    //使用IFRAME进行报表展现
    $("#reportframe").attr("src","crm/customview/createChart?graphtype="+graphtype+"&grouptype="+grouptype+"&cvid="+tab_viewid+"&pickfieldtable="+reportselect.fieldtable+"&pickfieldname="+reportselect.fieldname+"&pickfieldcolname="+reportselect.fieldcolname+"&title="+title+"&grouptitle="+grouptitle+"&reporttext="+reporttext+"&_rd="+rdnum());
}