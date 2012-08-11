$(function() {
    initPage();
});
function initPage() {
    $('#rolelist')
	    .treegrid(
		    {
			url : 'crm/settings/role/getRoleTree',
			title : '角色和继承关系',
			fit : 'true',
			nowrap : false,
			striped : true,
			rownumbers : true,
			idField : 'id',
			treeField : 'text',
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
			    field : 'text',
			    width : 200
			}
			]],
			toolbar : [ {
			    id : 'add',
			    text : '添加角色',
			    iconCls : 'icon-add',
			    handler : function() {
				var selected = $('#rolelist').datagrid("getSelected");
				if (selected) {
				    //上级权限
				    window.location.href="crm/settings/role/showAdd?parentroleid="+selected.id;
				} else {
				    message("请选择一行记录！");
				}	
			    }
			} ,{
			    text : '编辑信息',
			    iconCls : 'icon-edit',
			    handler : function() {
				$("#roleinfo").window("open");
			    }
			} ,{
			    text : '编辑权限',
			    iconCls : 'icon-edit',
			    handler : function() {
				var selected = $('#rolelist').datagrid("getSelected");
				if (selected) {
				    if(selected.id!='H1'){
					window.location.href="crm/settings/role/showEdit?roleid="+selected.id;
				    }else {
					message("请选择总公司下的的角色！");
				    }
				} else {
				    message("请选择一行记录！");
				}				
			    }
			} ,{
			    text : '查看关联用户',
			    iconCls : 'icon-view',
			    handler : function() {
				var selected = $('#rolelist').datagrid("getSelected");
				if (selected) {
				    if(selected.id!='H1'){
					$("#reluser").window({
					    onOpen:function(){
						viewRelUser(selected.id);
					    }
					});
					$("#reluser").window("open");
				    }else {
					message("请选择总公司下的的角色！");
				    }
				} else {
				    message("请选择一行记录！");
				}				
			    }
			} ,{
			    text : '删除角色',
			    iconCls : 'icon-remove',
			    handler : function() {
				var selected = $('#rolelist').datagrid("getSelected");
				if (selected) {
				    if(selected.id!='H1'){
					//角色删除
					confirm('确认删除角色：'+selected.text,function(r){
					    //删除
					    if(r){
						
					    }
					});
					
				    }else {
					message("请选择总公司下的的角色！");
				    }
				} else {
				    message("请选择一行记录！");
				}
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
function viewRelUser(roleid){
    var cols = [ {
	field : 'last_name',
	title : '姓名'
    }, {
	field : 'user_name',
	title : '用户名'
    }, {
	field : 'rolename',
	title : '角色'
    }, {
	field : 'groupname',
	title : '部门'
    }, {
	field : 'status',
	title : '状态'
    }, {
	field : 'is_admin',
	title : '管理员'
    }, {
	field : 'phone_work',
	title : '电话',
	formatter:showTip
    }, {
	field : 'email1',
	title : 'Email',
	formatter:showTip
    } ];
    cols = setDefWidth(cols, 80);

    $('#tb_reluser').datagrid({
	url : 'crm/settings/role/getRelUser',
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	queryParams : {
	    roleid:roleid
	},
	pageSize:20,
	fit:true,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
