var editor;
$(function() {
    initForm();
    initEdit();
    initPage();
});
function initForm(){
    $('#form_emailemplates').form({
	url : 'settings/users/userEdit',
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
    		uploadJson:'file/upload',
    		fileManagerJson:'file/filemanager',
    		fileloc:"attach/settings/other/emailtemplates/"
    	});
    });
}
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
		url : 'settings/emailtemplates/list',
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
				$("#emailtemplatesedit").window({
				    title : 'Email模版添加'
				});
				$("#emailtemplatesedit").window("open");
			    }
			},
			{
			    text : '修改',
			    iconCls : 'icon-edit',
			    handler : function() {
				var selected = $('#emailtemplates_list')
					.datagrid("getSelected");
				if (selected) {
				    $("#emailtemplatesedit").window({
					title : 'Email模版编辑'
				    });
				    loadForm(selected.id);
				    $("#emailtemplatesedit").window("open");
				} else {
				    message('请选择一行记录！');
				}
			    }
			},
			{
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {
				var selected = $('#emailtemplates_list')
					.datagrid("getSelected");
				if (selected) {
				    $.post('settings/emailtemplates/delete', {
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
function loadForm(emailtemplateid){
    
    
}