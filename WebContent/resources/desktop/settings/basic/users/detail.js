$(function() {
    initForm();
    loadView(detail);
});
function initForm(){
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
	      
	       $('#form_edit').hide();
	       $('#formview').show();
	       $('#form_edit').form("clear");
	       
	       $(".validatebox-tip").hide();
	       
	       loadViewTab(detail.id);
	   }
	}
    });
}
function loadViewTab(uid) {
    $.post('crm/settings/users/getUserById', {
	id : uid
    }, function(res) {
	loadView(res);
    }, 'json');
}
function loadView(res) {
    $("#formview").find("#id").val(res.id);
    $("#formview").find("#userName").html(res.user_name);
    $("#formview").find("#isAdmin").html(res.is_admin);
    $("#formview").find("#status").html(res.status);
    $("#formview").find("#roleid").html(res.rolename);
    $("#formview").find("#lastName").html(res.last_name);
    $("#formview").find("#phoneWork").html(res.phone_work);
    $("#formview").find("#email1").html(res.email1);
    $("#formview").find("#phoneMobile").html(res.phone_mobile);
    $("#formview").find("#groupid").html(res.groupname);
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
function showupdate(){
    
    $.post('crm/settings/users/getUserById', {
	id : detail.id
    }, function(res) {
	$('#form_edit').form('load',{
	    id: detail.id,
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
	
	$('#form_edit').show();
	$('#formview').hide();
	
    }, 'json');
    
}
