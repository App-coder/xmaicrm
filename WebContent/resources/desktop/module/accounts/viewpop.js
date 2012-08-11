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
		singleSelect:true,
		queryParams:{entitytype:entitytype,viewid:tab_viewid},
		columns : [tab_columns],
		pageSize:10,
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onDblClickRow:function(rowIndex, rowData){
		    setParentVal(rowData);
		}
	  });
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
		singleSelect:true,
		fit:true,
		queryParams:{entitytype:entitytype,viewid:val},
		columns : [res],
		pageSize:20,
		onDblClickRow:function(rowIndex, rowData){
		    setParentVal(rowData);
		}
	});
    },'json');
}
function setParentVal(rowdata){
    //UI_TYPE 51,57
    
    parent.$("input[name='"+columnname+"_text']").val(rowdata.accountname);
    parent.$("input[name='"+columnname+"']").val(rowdata.accountid);
    parent.$("#optionwindow").window("close");
    
    parent.rendRel(columnname,rowdata);
    
    
}