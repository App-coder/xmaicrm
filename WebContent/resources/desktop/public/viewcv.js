$(function() {
    if(tab_viewid != -1){
	init();
    }   
});
function init(){

  //设置视图
	$('#view_list').datagrid({
		url : 'customview/renderView',
		collapsible : false,
		idField : viewid,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		height:362,
		toolbar : [{
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {

		    }
		}, {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    if(data.footer!="undefined"){
			$(".stat_div").empty();
			//div_statdemo
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
    $("#reportframe").attr("src","customview/report?_rd="+rdbytime);
    $("#"+viewtab+"_winreport").window("open");
    
}