$(function() {
    if(tab_viewid != -1){
	init();
    }   
    init_calendarComponent();
});

function init_calendarComponent(){
    $("#cbt_calendarscope").combotree({
	onBeforeSelect:function(node){
	    if(node.iconCls == "icon-group"){
		return false;
	    }
	},
	onSelect:function(node){
	    //调用ifrme里面的calendar
	    window.frames["frame_calendar"].viewEvents(node);
	}
    });
}

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

