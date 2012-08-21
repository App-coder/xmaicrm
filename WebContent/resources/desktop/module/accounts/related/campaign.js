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
		queryParams:{entitytype:entitytype,viewid:tab_viewid,related:related,exists:exists},
		columns : [tab_columns],
		pageSize:20,
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]]
	    });
}
function selectUser(){
    var selects = $('#view_list').datagrid("getSelections");
    if(selects.length>0){
	
	var accounts = "";
	for(var i=0;i<selects.length;i++){
	    if(i==0){
		accounts +=selects[i][viewid];
	    }else{
		accounts +=","+selects[i][viewid];
	    }
	}
	
	$.post('crm/module/accounts/related/campaignAccountAdd',{campaignid:campaignid,selects:accounts},function(res){
	    if(res.type == true){
		parent.$("#wind_accounts").window("close");
		parent.$("#tab_get_accounts").datagrid("reload");
	    }
	},'json');
	
    }else{
	message("请选择客户！");
    }
}
