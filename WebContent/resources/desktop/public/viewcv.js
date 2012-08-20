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
    $("#reportframe").attr("src","customview/report?_rd="+rdbytime);
    $("#"+viewtab+"_winreport").window("open");
    
}