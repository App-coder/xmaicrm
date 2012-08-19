$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'parenttabLabel',
	title : '主菜单'
    }, {
	field : 'sequence',
	title : '显示顺序'
    }];
    cols = setDefWidth(cols, 80);
    $('#parenttab_list').datagrid({
	url : 'settings/users/list',
	collapsible : false,
	idField : 'crm/settings/parenttab/list',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	height : 362,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {

	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {

	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
    
}