$(function() {
    initPage();
});
function initPage() {

    var cols = [ {
	field : 'currencyName',
	title : '货币名称'
    }, {
	field : 'currencyCode',
	title : '货币编码'
    },{
	field : 'currencySymbol',
	title : '货币标识'
    },{
	field : 'conversionRate',
	title : '汇率'
    },{
	field : 'currencyStatus',
	title : '状态'
    } ];
    cols = setDefWidth(cols, 80);

    $('#currencyinfo_list').datagrid({
	url : 'settings/currencyInfo/list',
	collapsible : false,
	idField : 'id',
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