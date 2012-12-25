var swf;
var filename;

$(function() {
    initGrid();
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

function initGrid() {
    for ( var i = 0; i < relateds.length; i++) {
	// 附件模块
	if (relateds[i] == 'get_attachments') {
	    rel_attachments();
	} else if (relateds[i] == 'get_accounts') {
	    // 客户
	    rel_accounts();
	} else if (relateds[i] == 'get_contacts') {
	    // 联系人
	    rel_contacts();
	} else if (relateds[i] == 'get_opportunities') {
	    // 销售机会
	    rel_opportunities();
	} else if (relateds[i] == 'get_activities') {
	    rel_activities();
	}
    }
}
function rel_attachments() {
    var cols = [ {
	field : 'name',
	title : '附件'
    }, {
	field : 'description',
	title : '描述'
    }, {
	field : 'username',
	title : '负责人'
    }, {
	field : 'createdtime',
	title : '创建时间'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tab_get_attachments')
	    .datagrid(
		    {
			title : '附件',
			url : 'crm/attachments/getRelAttachments',
			collapsible : false,
			idField : 'attachmentsid',
			singleSelect : true,
			rownumbers : true,
			fitColumns : true,
			pageSize:20,
			pagination:true,
			queryParams : {
			    module : module,
			    crmid : crmid
			},
			toolbar : [
				{
				    text : '新增',
				    iconCls : 'icon-add',
				    handler : function() {
					$("#wind_attachments").window("open");
				    }
				},
				{
				    text : '删除',
				    iconCls : 'icon-remove',
				    handler : function() {
					var selected = $('#tab_get_attachments')
						.datagrid("getSelected");
					if (selected) {
					    confirm(
						    '确定删除附件？',
						    function(r) {
							if (r) {
							    var param = {
								attachmentid : selected.attachmentsid
							    };
							    $.post('crm/attachments/delete',param,
									    function(
										    res) {
										if (res.type == true) {
										    $(
											    '#tab_get_attachments')
											    .datagrid(
												    "reload");
										}
									    },
									    'json');
							}
						    });
					} else {
					    message("请选择记录！");
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
function rel_accounts() {
    var cols = [ {
	field : 'accountname',
	title : '客户名称'
    }, {
	field : 'customernum',
	title : '客户编号'
    }, {
	field : 'keycontact',
	title : '首要联系人'
    }, {
	field : 'keymobile',
	title : '手机'
    }, {
	field : 'phone',
	title : '电话'
    }, {
	field : 'email1',
	title : 'Email'
    }, {
	field : 'assignstatus',
	title : '客户状态'
    }, {
	field : 'latestnote',
	title : '最新进展'
    }, {
	field : 'username',
	title : '负责人'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tab_get_accounts').datagrid(
	    {
		title : '客户',
		url : 'crm/module/accounts/getCampaignAccount',
		collapsible : false,
		idField : 'crmid',
		singleSelect : true,
		rownumbers : true,
		fitColumns : true,
		pageSize:20,
		pagination:true,
		queryParams : {
		    campaignid : crmid
		},
		toolbar : [
			{
			    text : '选择',
			    iconCls : 'icon-ok',
			    handler : function() {
				// 获取已经选择的文件，加入后继续操作
				$("#wind_accounts").window(
					{
					    onOpen : function() {
						$("#frame_get_accounts").attr(
							"src",
							"crm/module/accounts/related/campaign?campaignid="
								+ crmid);
					    }
					});
				$("#wind_accounts").window("open");
			    }
			},
			{
			    text : '新增',
			    iconCls : 'icon-add',
			    handler : function() {
				var selected = $('#tab_get_accounts').datagrid(
					"getSelected");
				if (selected) {

				} else {
				    message("请选择记录！");
				}
			    }
			},
			{
			    text : '编辑',
			    iconCls : 'icon-edit',
			    handler : function() {

			    }
			},
			{
			    text : '删除',
			    iconCls : 'icon-remove',
			    handler : function() {
				var selects = $('#tab_get_accounts').datagrid(
					"getSelections");
				if (selects.length > 0) {

				    confirm('确定删除选择的客户？',function(r){
					if(r){
					    var accounts = "";
					    for ( var i = 0; i < selects.length; i++) {
						if (i == 0) {
						    accounts += selects[i].crmid;
						} else {
						    accounts += "," + selects[i].crmid;
						}
					    }

					    var param = {
						    campaignid:crmid,
						    selects:accounts
					    };
					    
					    $.get('crm/module/accounts/related/campaignAccountdelete', param, function(res) {
						if(res.type == true){
						    $('#tab_get_accounts').datagrid("reload");
						}
					    }, 'json');
					}
				    });
				    
				} else {
				    message("请选择记录！");
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
function rel_contacts() {
    var cols = [ {
	field : '1',
	title : '姓名'
    }, {
	field : '2',
	title : '首要联系人'
    }, {
	field : '3',
	title : '职位'
    }, {
	field : '4',
	title : '电话'
    }, {
	field : '5',
	title : '手机'
    }, {
	field : '6',
	title : '传真'
    }, {
	field : '7',
	title : 'Email'
    }, {
	field : '9',
	title : '负责人'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tab_get_contacts').datagrid({
	title : '联系人',
	url : 'crm/contactdetails/getContacts',
	collapsible : false,
	idField : 'crmid',
	singleSelect : true,
	rownumbers : true,
	fitColumns : true,
	pageSize:20,
	pagination:true,
	queryParams : {
	    campaignid : crmid
	},
	toolbar : [ {
	    text : '选择',
	    iconCls : 'icon-ok',
	    handler : function() {
		$("#wind_contacts").window(
			{
			    onOpen : function() {
				$("#frame_get_accounts").attr(
					"src",
					"crm/module/contacts/related/campaign?crmid="
						+ crmid);
			    }
			});
		$("#wind_contacts").window("open");
	    }
	}, {
	    text : '新增',
	    iconCls : 'icon-add',
	    handler : function() {
		
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
		
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
function rel_opportunities() {
    var cols = [ {
	field : '1',
	title : '销售机会名称'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tab_get_opportunities').datagrid({
	title : '销售机会',
	url : 'crm/module/potentials/getOpportunities',
	collapsible : false,
	idField : 'crmid',
	singleSelect : true,
	rownumbers : true,
	fitColumns : true,
	pageSize:20,
	pagination:true,
	queryParams : {
	    crmid : crmid
	},
	toolbar : [ {
	    text : '选择',
	    iconCls : 'icon-ok',
	    handler : function() {
		$("#wind_opportunities").window(
			{
			    onOpen : function() {
				$("#frame_get_opportunities").attr(
					"src",
					"crm/module/potentials/related/campaign?crmid="
						+ crmid);
			    }
			});
		$("#wind_opportunities").window("open");
	    }
	}, {
	    text : '新增',
	    iconCls : 'icon-add',
	    handler : function() {
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
function rel_activities() {
    var cols = [ {
	field : '1',
	title : '事件类型'
    }, {
	field : '2',
	title : '主题'
    }, {
	field : '3',
	title : '开始日期'
    }, {
	field : '4',
	title : '结束日期'
    }, {
	field : '5',
	title : '状态'
    }, {
	field : '6',
	title : '优先级'
    }, {
	field : '7',
	title : '负责人'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tab_get_activities').datagrid({
	title : '日程安排',
	url : 'crm/activity/getActivities',
	collapsible : false,
	idField : 'crmid',
	singleSelect : true,
	rownumbers : true,
	fitColumns : true,
	pageSize:20,
	pagination:true,
	queryParams : {
	    crmid : crmid
	},
	toolbar : [ {
	    text : '新增',
	    iconCls : 'icon-add',
	    handler : function() {
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ],
    });
}
function submitAttach() {
    //进行上传，根据对应的事件进行处理 
    swf.startUpload();
}