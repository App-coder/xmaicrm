$(function(){
    initPage();
});
function initPage(){
    initInbox();
}
function initInbox(){
    var cols = [ {
	field : 'serialname',
	title : '状态'
    }, {
	field : 'productname',
	title : '发件人'
    },{
	field : 'cangku',
	title : '主题'
    },{
	field : 'setype',
	title : '日期'
    },{
	field : 'ismakeup',
	title : '大小'
    }];
    cols = setDefWidth(cols, 80);
    $('#view_list').datagrid({
	url:'',
	collapsible : false,
	idField : 'serialid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
    
    
}