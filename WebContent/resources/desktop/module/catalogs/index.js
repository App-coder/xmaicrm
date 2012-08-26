$(function() {
    initPage();
});
function initPage() {
    initCatalogs();
}
function initCatalogs() {
    $('#catalogs_list').treegrid({
	url : 'crm/module/catalogs/getCatalogById',
	title : '产品分类',
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
		var selected = $('#catalogs_list').datagrid("getSelected");
		$("#catalogs_edit").window({
		    title:'添加分类'
		});
		if (selected) {
		    //添加子分类
		    $("#catalogs_edit").window("open");
		} else {
		    //添加根分类
		    $("#catalogs_edit").window("open");
		}
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#catalogs_list').datagrid("getSelected");
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
		if (selected) {
		   confirm('确定删除产品分类？',function(r){
		       if(r){
			   alert(r);
		       }
		   });
		} else {
		    message("请选择记录！");
		}
	    }
	} ]
    });
}