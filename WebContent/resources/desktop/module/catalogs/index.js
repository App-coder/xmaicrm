var selected;
$(function() {
    initPage();
});
function initPage() {
    initForm();
    initCatalogs();
}
function initForm(){
    $('#form_catalogs').form({
	url : 'crm/module/catalogs/edit',
	onSubmit : function() {
	    if ($('#form_catalogs').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('catalogs_edit');
	       $('#form_catalogs').form("clear");
	       $(".validatebox-tip").hide();
	       $('#catalogs_list').treegrid('reload');
	   }
	}
    });
}
function initCatalogs() {
    $('#catalogs_list').treegrid({
	url : 'crm/module/catalogs/getCatalogAll',
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
		selected = $('#catalogs_list').datagrid("getSelected");
		$("#catalogs_edit").window({
		    title:'添加分类'
		});
		if (selected) {
		    //添加子分类
		    $("#form_catalogs").find("input[name=parentcatalog]").val(selected.attributes.parentcatalog);
		    $("#parentcatalogid").combotree('setValue',selected.id);
		    $("#form_catalogs").find("input[name=depth]").val(selected.attributes.depth+1);
		    $("#catalogs_edit").window("open");
		} else {
		    //添加根分类
		    $("#form_catalogs").find("input[name=parentcatalog]").val("H1");
		    $("#parentcatalogid").combotree('setValue','H1');
		    $("#form_catalogs").find("input[name=depth]").val(1);
		    
		    $("#catalogs_edit").window("open");
		}
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		selected = $('#catalogs_list').datagrid("getSelected");
		if (selected) {
		   
		    $("#form_catalogs").find("input[name=catalogid]").val(selected.id);
		    $("#form_catalogs").find("input[name=parentcatalog]").val(selected.attributes.parentcatalog);
		    $("#parentcatalogid").combotree('setValue',selected.id);
		    $("#form_catalogs").find("input[name=depth]").val(selected.attributes.depth);
		    $("#form_catalogs").find("input[name=catalogname]").val(selected.attributes.catalogname);
		    $('#sortorder').numberbox('setValue', selected.attributes.sortorder);
		    
		    $("#catalogs_edit").window({
			    title:'编辑产品分类'
		    });
		    $("#catalogs_edit").window("open");
		    
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
		       if(r){
			   $.get('crm/module/catalogs/delete',{catalogid:selected.id},function(res){
			       if(res.type==true){
				   $('#catalogs_list').treegrid('reload',selected.parentcatalogid);
			       }
			   },'json');
		       }
		   });
		} else {
		    message("请选择记录！");
		}
	    }
	} ]
    });
}