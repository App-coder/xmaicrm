$(function(){
   initPage(); 
});
function initPage(){
    var selectrelated = $("#selectrelated").val();
    reloadGrid(selectrelated);
}
function reloadGrid(relateid){
    var cols = [ {
	field : 'label',
	title : '相关信息'
    }, {
	field : 'sequence',
	title : '显示顺序'
    },{
	field : 'presence',
	title : '是否显示',
	formatter: function(value,row,index){
	    if(value == 0){
		return "是";
	    }
	    return "否";
	}
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#relatedlist').datagrid({
	url:"crm/settings/relatedlists/list",
	collapsible : false,
	idField : 'relationId',
	singleSelect : true,
	rownumbers :true,
	pagination : false,
	fitColumns : true,
	queryParams:{tabid:relateid},
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ]
    });    
    
}