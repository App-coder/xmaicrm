$(function() {
    initPage();
});
function initPage() {
    var cols = [ {
	field : 'tablabel',
	title : '模块'
    }, {
	field : 'share_action_name',
	title : '共享规则'
    } ];
    cols = setDefWidth(cols, 80);
    $('#deforgsharelist').datagrid({
	url:'crm/settings/deforgshare/loadData',
	collapsible : false,
	idField : 'ruleid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	toolbar : [{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}