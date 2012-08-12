$(function(){
    
    initPage();
    
});
function initPage(){
    
    var cols = [ {
	field : 'filename',
	title : '文件名称'
    },{
	field : 'filesize',
	title : '文件大小'
    },{
	field : 'createtime',
	title : '创建时间'
    }];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid(
	    {
		url : 'crm/settings/dbbackup/list',
		collapsible : false,
		idField : 'templateid',
		singleSelect : true,
		rownumbers : true,
		fitColumns : true,
		method : 'GET',
		toolbar : [
			{
			    text : '备份',
			    iconCls : 'icon-add',
			    handler : function() {
				
			    }
			},{
			    text : '下载',
			    iconCls : 'icon-download',
			    handler : function() {
				
			    }
			}  ],
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ cols ]
	    });
}