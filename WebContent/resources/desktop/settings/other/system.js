$(function(){
    initForm();
});
function initForm(){
    $('#form_email').form({
	url : 'settings/system/edit',
	onSubmit : function() {
	    if ($('#form_email').form("validate")) {
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       message(res.message);
	   }
	}
    });
}