$(function() {
    initPage();
});
function initPage() {
    $('#rolelist')
	    .treegrid(
		    {
			url : 'settings/role/getRolesByParent',
			title : '角色和继承关系',
			fit : 'true',
			nowrap : false,
			striped : true,
			rownumbers : true,
			idField : 'roleid',
			treeField : 'rolename',
			singleSelect : true,
			method:'POST',
			queryParams : {
			    id:0
			},
			fitColumns : true,
			frozenColumns : [ [ {
			    field : 'ck',
			    checkbox : true
			} ] ],
			columns:[[
					{
			    title : '角色名称',
			    field : 'rolename',
			    width : 200
			}
			]],
			toolbar : [ {
			    id : 'add',
			    text : '添加角色',
			    iconCls : 'icon-add',
			    handler : function() {

			    }
			} ,{
			    text : '编辑信息',
			    iconCls : 'icon-edit',
			    handler : function() {

			    }
			} ,{
			    text : '编辑权限',
			    iconCls : 'icon-edit',
			    handler : function() {

			    }
			} ,{
			    text : '查看用户',
			    iconCls : 'icon-add',
			    handler : function() {

			    }
			} ,{
			    text : '删除角色',
			    iconCls : 'icon-remove',
			    handler : function() {

			    }
			} ],
			onBeforeLoad : function(row, param) {
    				if(row==null){
    				    $('#rolelist').treegrid("options").queryParams.id = 0;
        			}else if(row.roleid!=undefined){
        			    $('#rolelist').treegrid("options").queryParams.id = row.roleid;
        			}
			}
		    });

}