$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'cangkuname',
	title : '仓库名'
    }, {
	field : 'isused',
	title : '是否使用',
	formatter:function(value,row,index){
	    if(value == 1){
		return "使用中";
	    }else{
		return "已禁用";
	    }
	}
    },{
	field : 'authority',
	title : '库管权限'	
    }];
    
    cols = setDefWidth(cols, 80);

    $('#cangkus_list').datagrid({
	url : 'settings/cangkus/list',
	collapsible : false,
	idField : 'cangkusid',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	height : 362,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#cangkus").window({
		   title:"添加仓库" ,
		   onOpen:function(){
		       $("#form_cangkus").form("clear");
		   }
		});
		$("#cangkus").window("open");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#cangkus_list').datagrid("getSelected");
		if (selected) {
		    loadForm(selected.cangkusid);
		}else {
		    message("请选择一行记录！");
		}
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#cangkus_list').datagrid("getSelected");
		if (selected) {
		    $.post('settings/cangkus/delete',{cangkusid:selected.cangkusid},function(res){
			if(res.type == true){
			    $('#cangkus_list').datagrid("reload");
			}
		    },'json');
		}else {
		    message("请选择一行记录！");
		}		
	    }
	}],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
function loadForm(cangkusid){
    
    
}