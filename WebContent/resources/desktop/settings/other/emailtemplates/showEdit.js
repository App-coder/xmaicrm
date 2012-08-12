var editor;
$(function() {
    initForm();
    initEdit(); 
});
function initForm(){
    $('#form_emailemplates').form({
	url : 'crm/settings/users/userEdit',
	onSubmit : function() {
	    if ($('#form_emailemplates').form("validate")) {
		$("#form_emailemplates").find("input[name=body]").val(editor.html());
		return true;
	    } else {
		return false;
	    }
	},
	success : function(res) {
	   res = $.parseJSON(res);
	   if(res.type == true){
	       closeWin('emailtemplatesedit');
	       $('#form_emailemplates').form("clear");
	       $(".validatebox-tip").hide();
	       $('#emailtemplates_list').datagrid("reload");
	   }
	}
    });    
}
function initEdit(){
    KindEditor.ready(function(K) {
    	editor = K.create('textarea[name="bodyHtml"]', {
    		resizeType : 1,
    		allowPreviewEmoticons : true,
    		allowImageUpload : true,
    		allowFileManager : true,
    		items:editoritem_more,
    		uploadJson:'crm/file/upload',
    		fileManagerJson:'crm/file/filemanager',
    		fileloc:"attach/settings/other/emailtemplates/"
    	});
    });
}