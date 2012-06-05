$(function(){
    initpage();
});
function initpage(){
    var cols = [ {
	field : 'shared',
	title : '模块'
    }, {
	field : 'whoshared',
	title : '共享规则'
    } ];
    cols = setDefWidth(cols, 80);
    $('#customsharingslist').datagrid({
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