var description;
$(function(){
    initPage();
    initSwf();
});
function initSwf() {
    swf = new SWFUpload({
	upload_url : "../../../crm/file/uploadAttach",
	file_post_name : "attach",
	post_params : {
	    module : module
	},
	file_size_limit : "10MB",
	file_types : "*.*",
	file_types_description : "All Files",
	file_queue_limit : 1,
	debug : false,

	// 文件选择之后
	file_queued_handler : function(file) {
	    try {
		$("#filename").val(file.name);
		filename = file.name;
		$('#btn_attach_edit').linkbutton('enable');
	    } catch (e) {
	    }
	},
	upload_success_handler : function(file, serverData) {
	    var json = $.parseJSON(serverData);
	    if (json.type == true) {

		var param = {
		    description : $("#form_attach").find(
			    "textarea[name=description]").val(),
		    path : json.path,
		    type : json.filetype,
		    name : filename,
		    module : module,
		    crmid : crmid
		};

		$.post('crm/attachments/add', param, function(res) {
		    if (res.type == true) {
			closeWin('wind_attachments');
			$('#tab_get_attachments').datagrid("reload");
		    } else {
			message('文件上传有误！');
		    }
		}, 'json');

	    } else {
		message('文件上传有误！');
	    }
	},
	file_queue_error_handler : fileQueueError,
	button_image_url : "../../../resources/plugins/swfupload/upload.png",
	button_placeholder_id : "btnuploader",
	button_width : 61,
	button_height : 22,

	flash_url : "resources/plugins/swfupload/swfupload.swf"
    });
}
function initPage(){
    var cols = [ {
	field : 'maillistname',
	title : '方案名称'
    }, {
	field : 'description',
	title : '备注'
    },{
	field : 'maillisttitle',
	title : '邮件主题'
    },{
	field : 'sentcount',
	title : '已发数量'
    },{
	field : 'unsentcount',
	title : '未发数量'
    },{
	field : 'allcount',
	title : '总数量',
	formatter:function(value,row,index){
	    return Number(row.sentcount)+Number(row.unsentcount);
	}
    } ];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid({
	url:'crm/module/maillists/list',
	collapsible : false,
	idField : 'maillistid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	toolbar : [{
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		
		$("#wind_mail").window({
		    onOpen:function(){
			if(description==null){
			    description = initEdit('description','maillists',0);
			}
		    }
		});
		$("#wind_mail").window("open");
		
	    }
	},{
	    text : '修改',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}