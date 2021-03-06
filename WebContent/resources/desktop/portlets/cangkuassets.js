$(function(){
    init_cangkuassets();
});
function init_cangkuassets(){
    var cols = [ {
	field : 'cangkuname',
	title : '仓库'
    },{
	field : 'prodcount',
	title : '种类'
    },{
	field : 'cangkucount',
	title : '库存数'
    },{
	field : 'assets',
	title : '资产'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_cangkuassets').datagrid({
	url:'crm/portlets/cangkuassets/getJson',
	collapsible : false,
	idField : 'cangkusid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	fit:true,
	columns : [ cols ]
    });
}