$(function(){
init();    
});
function init(){
    $('#serialnumbers_list').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '序列号',
	    sortable : true
	}, {
	    field : '',
	    title : '产品名称',
	    sortable : true
	},{
	    field : '',
	    title : '仓库',
	    sortable : true
	},{
	    field : '',
	    title : '状态',
	    sortable : true
	},{
	    field : '',
	    title : '是否补录',
	    sortable : true
	} ,{
	    field : '',
	    title : '操作',
	    sortable : true
	} ] ]
    });
}