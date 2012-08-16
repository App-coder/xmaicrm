$(function() {
    initForm();
    initPage();
});
// 初始化
function initForm() {

    $('#form_add').form({
	url : 'settings/users/userEdit',
	onSubmit : function() {
	    if ($('#form_add').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('useredit');
	       $('#form_add').form("clear");
	       $(".validatebox-tip").hide();
	       $('#user_list').datagrid("reload");
	   }
	}
    });
    
    $('#form_edit').form({
	url : 'settings/users/userEdit',
	onSubmit : function() {
	    if ($('#form_edit').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('useredit');
	       $('#form_edit').form("clear");
	       $(".validatebox-tip").hide();
	       $('#user_list').datagrid("reload");
	   }
	}
    });

}
function initPage() {
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
	title : '电话'
    }, {
	field : 'email1',
	title : 'Email'
    } ];
    cols = setDefWidth(cols, 80);

    $('#user_list').datagrid({
	url : 'settings/users/list',
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	height : 362,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("input[name=todo]").val("add");
		$("#useredit").window({
		    title : "用户添加"
		});
		$("#form_add").show();
		$("#form_edit").hide();
		$("#useredit").window("open");
	    }
	}, {
	    text : '修改',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#user_list').datagrid("getSelected");
		if (selected) {
		    $("input[name=todo]").val("update");
		    $("#form_edit").find("input[name=id]").val(selected.id);
		    
		    // 赋值操作
		    loadForm(selected.id);
		    $("#form_edit").show();
		    $("#form_add").hide();
		} else {
		    message("请选择一行记录！");
		}

	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#user_list').datagrid("getSelected");
		if (selected) {
		    confirm('确定删除用户?',function(r){
			if (r){  
			    $.post("settings/users/delete",{id:selected.id},function(res){
				if(res.type == true){
				    $('#user_list').datagrid("reload");
				}
			    },'json');			        
			}  
		    });
		    
		}else {
		    message("请选择一行记录！");
		}
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
// 编辑窗口的初始化
function loadForm(uid) {
    $.post('settings/users/getUserById', {
	id : uid
    }, function(res) {
	$('#form_edit').form('load',{
	    userName:res.user_name,
	    isAdmin:res.is_admin,
	    status:res.status,
	    roleid:res.roleid,
	    lastName:res.last_name,
	    phoneWork:res.phone_work,
	    email1:res.email1,
	    phoneMobile:res.phone_mobile,
	    groupid:res.groupid
	});
	$("#useredit").window({
	    title:'编辑用户',
	    onOpen:function(){
		$(".validatebox-tip").hide();
	    }
	});
	
	$("#useredit").window("open");
    }, 'json');
}
function submitUser(){
    var todo = $("input[name=todo]").val();
    if(todo == "add"){
	formsubmit("form_add");
	return;
    }
    formsubmit("form_edit");
}