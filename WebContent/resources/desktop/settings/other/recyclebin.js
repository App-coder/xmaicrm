$(function(){
    initPage();
});
function initPage(){
    
    cols = setDefWidth(cols, 80);
    
    $('#tablist').datagrid({
	collapsible : false,
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
    
}