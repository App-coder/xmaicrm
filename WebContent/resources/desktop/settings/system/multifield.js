$(function(){
    loadFields();
});
function loadFields(){
    var tabid = $("#selectmodule").val();
    reloadGrid(tabid);
}
function reloadGrid(tabid){
    
    var cols = [ {
	field : 'multifieldname',
	title : '字段标签'
    }, {
	field : 'totallevel',
	title : '级联字段'
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#multifieldlist').datagrid({
	url:"crm/settings/multifield/getCustomMultiField",
	collapsible : false,
	idField : 'multifieldid',
	singleSelect : true,
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	height : 362,
	queryParams:{tabid:tabid},
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
    
}