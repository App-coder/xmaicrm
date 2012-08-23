$(function() {
    initPage();
});
function initPage() {
    $('#rolelist')
	    .treegrid(
		    {
			url : 'crm/settings/role/getRolesByParent',
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
				var selected = $('#rolelist').datagrid("getSelected");
				if (selected) {
				    if(selected.roleid!='H1'){
					$("#roleedit").window({title:'编辑权限'});
					$("#roleedit").window("open");
					loadEditForm(selected.roleid);
				    }else {
					message("请选择总公司下的的角色！");
				    }
				} else {
				    message("请选择一行记录！");
				}				
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
function loadEditForm(roleid){
    
    $.post('crm/settings/role/getRoleAuthority',{roleid:roleid},function(res){
	var modPers = res.modulePermission.rows;
	var trs = "";
	for(var i=0;i<modPers.length;i++){
	    trs += "<tr class=\"datagrid-row\"><td>"+modPers[i].tablabel+"</td><td>"+getCked(modPers[i].tabid,'create',modPers[i].create)+"</td><td>"+getCked(modPers[i].tabid,'edit',modPers[i].edit)+"</td><td>"+getCked(modPers[i].tabid,'view',modPers[i].view)+"</td><td>"+getCked(modPers[i].tabid,'del',modPers[i].del)+"</td><td><a>编辑</a></td></tr>";
//	    trs += getViewField(modPers[i].tabid,res.);
	}
	$("#tabRoleAuth").find("tbody").append($(trs));
    },'json');
    
}
function getCked(tabid,type,value){
    if(value == 1){
	return "<input type=\"checkbox\" checked=\"checked\" value=\"1\" name=\""+tabid+"_"+type+"\" />";
    }else{
	return "<input type=\"checkbox\"  value=\"1\" name=\""+tabid+"_"+type+"\" />";
    }
}