$(function(){
    initpage();
});
function initpage(){
    $("#selectmodule").val("");
    var cols = [ {
	field : 'sharedstr',
	title : '共享人'
    }, {
	field : 'whosharedstr',
	title : '被共享人'
    },{
	field:'shareactionname',
	title:'共享权限'
    } ];
    cols = setDefWidth(cols, 80);
    $('#customsharingslist').datagrid({
	collapsible : false,
	idField : 'sharingsid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });  
}
function reloadGrid(val){
    $('#customsharingslist').datagrid("options").url = "crm/settings/customsharings/list";
    $('#customsharingslist').datagrid("options").queryParams = {tabid:val};
    $('#customsharingslist').datagrid("reload");
}