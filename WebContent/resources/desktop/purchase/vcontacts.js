//定义页面变量，需要前缀，防止多页面变量重复
var vcontacts_entitytype = 'Vcontacts';
var vcontacts_id = 'vcontactsid';

$(function() {
  //设置视图
	$('#vcontacts_list').datagrid({
		url : 'vcontacts/renderView',
		doSize:true,
		collapsible : false,
		idField : vcontacts_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:vcontacts_entitytype,viewid:vcontacts_viewid},
		columns : [vcontacts_columns],
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
		    $('#vcontacts_list').datagrid('fixColumnSize'); 
		}
	    });
    
});