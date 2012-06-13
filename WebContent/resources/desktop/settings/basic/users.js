$(function() {
    initForm();
    initPage();
});
// 初始化
function initForm() {

    $('#form_add').form({
	url : 'crm/settings/users/userEdit',
	onSubmit : function() {
	    if ($('#form_add').form("validate")) {
		
		//判断两次密码是否相同
		if($('#form_add').find("input[name=userPassword]").val() == $('#form_add').find("input[name=confirmPassword]").val()){
		    return true;
		}else{
		    message('两次输入的密码必须相同！');
		    return false;
		}
		
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
	url : 'crm/settings/users/userEdit',
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
	url : 'crm/settings/users/list',
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	fitColumns : true,
	pageSize:20,
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
			    $.post("crm/settings/users/delete",{id:selected.id},function(res){
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
	},{
	    text : '预览',
	    iconCls : 'icon-view',
	    handler : function() {
		var selected = $('#user_list').datagrid("getSelected");
		if (selected) {
		    loadView(selected.id);
		}else {
		    message("请选择一行记录！");
		}
	    }
	}],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
// 编辑窗口的初始化
function loadForm(uid) {
    $.post('crm/settings/users/getUserById', {
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
function loadView(uid){
    $.post('crm/settings/users/getUserById', {
	id : uid
    }, function(res) {

	$("#formview").find("#id").val(uid);
	$("#formview").find("#userName").html(res.user_name);
	$("#formview").find("#isAdmin").html(res.is_admin);
	$("#formview").find("#status").html(res.status);
	$("#formview").find("#roleid").html(res.rolename);
	$("#formview").find("#lastName").html(res.last_name);
	$("#formview").find("#phoneWork").html(res.phone_work);
	$("#formview").find("#email1").html(res.email1);
	$("#formview").find("#phoneMobile").html(res.phone_mobile);
	$("#formview").find("#groupid").html(res.groupname);
	
	
	$("#userview").window("open");
    }, 'json');
}
function submitUser(){
    var todo = $("input[name=todo]").val();
    if(todo == "add"){
	
	//验证用户名是否重复
	$.post('crm/settings/users/existUserName',{username:$("#form_add").find("input[name=userName]").val()},function(res){
	    if(!res.type){
		formsubmit("form_add");
		return;
	    }else{
		message('用户名不能重复！');
	    }
	},'json');

    }else{
	formsubmit("form_edit");
    }
}
function updatePwd(){
    $("#formpass").find("#id").val($("#formview").find("#id").val());
    $("#editpassword").window("open");
}
function updatePwdDo(){
    
    if(!$('#formpass').find("input[name=userPassword]").val() == $('#formpass').find("input[name=confirmPassword]").val()){
	message('两次输入的密码必须相同！');
    }
    
    $('#formpass').form({
	url : 'crm/settings/users/editPassword',
	onSubmit : function() {
	    if ($('#formpass').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('editpassword');
	       $('#formpass').form("clear");
	       $(".validatebox-tip").hide();
	       message("密码修改成功！");
	   }
	}
    });
    formsubmit("formpass");
    
}