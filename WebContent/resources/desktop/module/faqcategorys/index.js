var selected;
$(function() {
    initPage();
});
function initPage() {
    initForm();
    initCatalogs();
}
function initForm(){
    $('#form_faqcatalogs').form({
	url : '',
	onSubmit : function() {
	    if ($('#form_faqcatalogs').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	}
    });
}
function initCatalogs() {
    $('#tab_list').treegrid({
	url : 'crm/module/faqcategorys/getCatalogAll',
	title : '知识库分类',
	fit : 'true',
	nowrap : false,
	striped : true,
	rownumbers : true,
	idField : 'id',
	method : 'get',
	treeField : 'text',
	singleSelect : true,
	queryParams : {
	    id : 'H1'
	},
	fitColumns : true,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	}, ] ],
	columns : [ [ {
	    title : '分类名称',
	    field : 'text',
	    width : 200
	} ] ],
	toolbar : [ {
	    id : 'add',
	    text : '添加分类',
	    iconCls : 'icon-add',
	    handler : function() {
		selected = $('#catalogs_list').datagrid("getSelected");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		selected = $('#catalogs_list').datagrid("getSelected");
		if (selected) {
		   
		    
		} else {
		    message("请选择记录！");
		}
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#catalogs_list').datagrid("getSelected");
		if(selected.children.length>0){
		    message("请先删除该分类下的子分类！");
		    return false;
		}
		if (selected) {
		   confirm('确定删除产品分类？',function(r){
		   });
		} else {
		    message("请选择记录！");
		}
	    }
	} ]
    });
}