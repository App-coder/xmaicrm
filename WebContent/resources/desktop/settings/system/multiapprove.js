$(function(){
    loadFields();
});
function loadFields(){
    var tabid = $("#selectmultiapprove").val();
    reloadGrid(tabid);
}
function reloadGrid(tabid){
    var cols = [ {
	field : 'name',
	title : '流程名称'
    }, {
	field : 'used',
	title : '是否激活'
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#multiapprovelist').datagrid({
	url:"crm/settings/multiapprove/getApproveList",
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers :
	    true,
	pagination : false,
	fitColumns : true,
	queryParams:{tabid:tabid},
	height : 362,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ]
    });
    
}