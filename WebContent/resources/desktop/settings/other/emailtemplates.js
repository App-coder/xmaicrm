$(function() {
    initPage();
});
function initPage() {

    var cols = [ {
	field : 'templatename',
	title : 'Email模版'
    }, {
	field : 'description',
	title : '描述'
    } ];
    cols = setDefWidth(cols, 80);

    $('#emailtemplates_list').datagrid({
	url : 'settings/emailtemplates/list',
	collapsible : false,
	idField : 'templateid',
	singleSelect : true,
	rownumbers : true,
	fitColumns : true,
	method:'GET',
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