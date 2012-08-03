$(function(){
    init_keycustomview();
});
function init_keycustomview(){
    var cols = [ {
	field : 'viewname',
	title : '视图'
    },{
	field : 'tablabel',
	title : '模块'
    },{
	field : 'countoflist',
	title : '数量'
    }];
    cols = setDefWidth(cols, 80);
    $('#keycustomview').datagrid({
	url:'crm/portlets/key_customview/getJson',
	collapsible : false,
	idField : 'cvid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	fit:true,
	border:false,
	columns : [ cols ]
    });
}