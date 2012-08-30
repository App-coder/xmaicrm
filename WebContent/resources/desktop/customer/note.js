//定义页面变量，需要前缀，防止多页面变量重复
var note_entitytype = 'Notes';
var note_id = 'noteid';

$(function() {
  //设置视图
	$('#note_list').datagrid({
		url : 'note/renderView',
		doSize:true,
		collapsible : false,
		idField : note_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:note_entitytype,viewid:note_viewid},
		columns : [note_columns],
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    $('#note_list').datagrid('fixColumnSize'); 
		}
	    });
    
});