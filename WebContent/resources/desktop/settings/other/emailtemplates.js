$(function() {
    initPage();
});
function initPage() {

    var cols = [ {
	field : 'templatename',
	title : 'Email模版'
    }, {
	field : 'description',
	title : '描述'
    } ];
    cols = setDefWidth(cols, 80);

    $('#emailtemplates_list').datagrid(
	    {
		url : 'crm/settings/emailtemplates/list',
		collapsible : false,
		idField : 'templateid',
		singleSelect : true,
		rownumbers : true,
		fitColumns : true,
		method : 'GET',
		height : 362,
		toolbar : [
			{
			    text : '添加',
			    iconCls : 'icon-add',
			    handler : function() {
				window.location.href="crm/settings/emailtemplates/showEdit?templateid=-1";
			    }
			},
			{
			    text : '修改',
			    iconCls : 'icon-edit',
			    handler : function() {
				var selected = $('#emailtemplates_list')
					.datagrid("getSelected");
				if (selected) {
				    window.location.href="crm/settings/emailtemplates/showEdit?templateid="+selected.templateid;
				} else {
				    message('请选择一行记录！');
				}
			    }
			},
			{
			    text : '预览',
			    iconCls : 'icon-view',
			    handler : function() {
				var selected = $('#emailtemplates_list').datagrid("getSelected");
        			if (selected) {
        			    window.location.href="crm/settings/emailtemplates/show?templateid="+selected.templateid;
        			} else {
        			    message('请选择一行记录！');
        			}
			    }
			}
			,
			{
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {
				var selected = $('#emailtemplates_list')
					.datagrid("getSelected");
				if (selected) {
				    $.post('crm/settings/emailtemplates/delete', {
					etid : selected.templateid
				    }, function(res) {
					if (res.type == true) {
					    $('#emailtemplates_list').datagrid(
						    "reload");
					}
				    }, 'json');
				} else {
				    message('请选择一行记录！');
				}
			    }
			} ],
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ cols ]
	    });
}
