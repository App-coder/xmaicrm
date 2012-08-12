$(function(){
    initPage();
});
//初始化
function initPage(){
 
    var cols = [ {
    	    field : 'filename',
    	    title : '日志记录'
    },{
    	    field : 'filemodified',
    	    title : '最后修改时间'
    }];
    cols = setDefWidth(cols,80);    
 
    $('#loglist').datagrid({
	url : 'settings/systemlog/list',
	collapsible : false,
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	method:'GET',
	toolbar : [ {
	    text : '下载',
	    iconCls:'icon-download',
	    handler : function() {

	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {

	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });    
    
}