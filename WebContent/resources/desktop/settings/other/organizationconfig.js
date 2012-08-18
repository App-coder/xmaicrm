$(function() {
    initForm();
});
function initForm() {
    $('#form_organization').form({
	url : 'settings/users/userEdit',
	onSubmit : function() {

	    //检查LOGO是否存在
	    var logo = $('#form_organization').find("input[name=logo]").val();
	    if (isempty(logo)) {
		message('请设置LOGO！');
		return false;
	    }

	    if ($('#form_organization').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	    res = $.parseJSON(res);
	    if (res.type == true) {
		message(res.message);
	    }
	}
    });
}
function organizationSubmit() {
    var logo = $("#logo").val();
    if(!isempty(logo)){
	if(isImg(logo)){
	  //确定LOGO是否需要上传，进行处理！
	    $.ajaxFileUpload({
		url : "file/upload",
		secureuri : false,
		fileElementId : 'logo',
		dataType : 'json',
		data:{savepath:'attach/settings/other/organizationconfig'},
		success : function(data, status) {
		    if(data.type == true){
			var fileloc = data.message;
			$('#form_organization').find("input[name=logo]").val(fileloc)
			formsubmit('form_organization');
		    }
		},
		error : function(data, status, e) {
		    message(e);
		}
	    });
	}else{
	    message('LOGO的类型不正确，后缀需要是JPG,GIF,PNG！');
	}
    }else{
	formsubmit('form_organization');
    }
}