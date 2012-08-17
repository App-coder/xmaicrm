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
		onDblClickRow:function(rowIndex, rowData){
		    setParentVal(rowData);
		}
	  });
	 initCatalog();
}
function initCatalog(){
    $('#catalog').tree({
	onClick: function(node){
	    var catalogid = node.attributes.catalogid;
	    $('#view_list').datagrid("options").queryParams.catalogid = catalogid;
	    $('#view_list').datagrid("reload");
	    
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
		queryParams:{entitytype:entitytype,viewid:val},
		columns : [res],
		pageSize:10,
		onDblClickRow:function(rowIndex, rowData){
		    setParentVal(rowData);
		}
	});
    },'json');
}
function setParentVal(rowdata){

    parent.$("input[name='product_id_text']").val(rowdata.productname);
    parent.$("input[name='product_id']").val(rowdata.productid);
    parent.$("#optionwindow").window("close");
}