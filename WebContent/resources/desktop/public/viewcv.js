$(function() {
    if(tab_viewid != -1){
	init();
    }   
});
function init(){

  //设置视图
	$('#'+viewtab+'_list').datagrid({
		url : 'customview/renderView',
		collapsible : false,
		idField : viewid,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]]
	    });
}
function viewSearchReport(){
    //customview/report
    $("#reportframe").attr("src","customview/report?_rd="+rdbytime);
    
    $("#"+viewtab+"_winreport").window("open");
    
}