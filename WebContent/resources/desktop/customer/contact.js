//定义页面变量，需要前缀，防止多页面变量重复
var contact_entitytype = 'Contacts';
var contact_id = 'contactid';

$(function() {
  //设置视图
	$('#contact_list').datagrid({
		url : 'contact/renderView',
		doSize:true,
		collapsible : false,
		idField : contact_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:contact_entitytype,viewid:contact_viewid},
		columns : [contact_columns],
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
		    $('#contact_list').datagrid('fixColumnSize'); 
		}
	    });
    
});