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
		    }else{
			$(".stat_div").hide();
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

/*切换视图*/
function reloadView(val){
    
    $('#view_list').datagrid("loadData",[]);
    
    $.get('crm/customview/getDView',{cvid:val},function(res){
	setDefWidth(res,80);
	$('#view_list').datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:val},
		columns : [res],
		pageSize:20
	});
    },'json');
}

function add(){
    window.location.href="crm/module/accounts/showedit?recordid=0&ptb="+ptb+"&module="+entitytype;
}
function edit(){
    var selected = $('#view_list').datagrid("getSelected");
    if(selected){
	window.location.href="crm/module/accounts/showedit?recordid="+selected.accountid+"&ptb="+ptb+"&module="+entitytype;
    }else{
	message("请选择记录！");
    }
}
function batchEdit(){
    var selections = $('#view_list').datagrid("getSelections");
    //空的记录
    if(selections.length==0){
	message("请选择记录！");
    }else{
	$("#win_batchEdit").window("open");
    }
}
function view(){
    var selected = $('#view_list').datagrid("getSelected");
    if(selected){
	window.location.href="crm/module/accounts/view?recordid="+selected.accountid+"&ptb="+ptb+"&module="+entitytype;
    }else{
	message("请选择记录！");
    }    
}
function editLeading(){
    var selections = $('#view_list').datagrid("getSelections");
    //空的记录
    if(selections.length==0){
	message("请选择记录！");
    }else{
	$("#win_editLeading").window("open");
    }
}
function del(){
    var selections = $('#view_list').datagrid("getSelections");
    //空的记录
    if(selections.length==0){
	message("请选择记录！");
    }else{
	confirm('确定删除所选的客户？',function(r){
	    if(r){
		
	    }
	});
    }
}
function share(){
    var selections = $('#view_list').datagrid("getSelections");
    //空的记录
    if(selections.length==0){
	message("请选择记录！");
    }else{
	$("#win_share").window("open");
    }
}
