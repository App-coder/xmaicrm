$(function() {
    if(tab_viewid != -1 && tab_viewid!=undefined){
	init();
    }   
});
function init(){
  //设置视图
	$('#view_list').datagrid({
		url : 'crm/customview/renderView',
		collapsible : false,
		idField : viewid,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]]
	    });
}
function selectValue(){
    var selected = $('#view_list').datagrid('getSelected');
    if (selected) {
	debugger;
    } else {
	message('请选择一行！');
    }
    
}
function closeOptionWin(){
    parent.$("#optionwindow").window("close");
}