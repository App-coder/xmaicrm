/*
 *
 * 视图管理
 * 
 */
$(function() {
    initBind();
    initContainer();
    initGrid();

});
function initBind() {
    $("#form_customview").find("input[name=ck_public]").click(
	    function() {
		var cked = $("#form_customview").find("input[name=ck_public]")
			.attr("checked");
		if (cked == "checked") {
		    $("#form_customview").find("select[name=setpublic]").attr(
			    "disabled", "disabled");
		    $("#form_customview").find("select[name=setpublic]").find("option").removeAttr("selected");
		} else {
		    $("#form_customview").find("select[name=setpublic]")
			    .removeAttr("disabled");
		}

	    });

}
function initContainer() {
    $.get('role/getroles', null, function(data) {
	var ostr = "";
	if (data.length >= 1) {
	    for ( var i = 0; i < data.length; i++) {
		ostr += "<option value='" + data[i].id + "'>" + data[i].text
			+ "</option>";
	    }
	}
	$("#form_customview").find("select[name=setpublic]").html(ostr);
    }, 'json');
}
function initGrid() {
    $('#customview_list').datagrid({
	url : 'customview/load',
	doSize : true,
	collapsible : false,
	idField : 'cvid',
	singleSelect : true,
	rownumbers : true,
	pagination : true,
	queryParams : {
	    'entitytype' : entitytype
	},
	pageNumber : 20,
	fitColumns : true,
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#customview_edit").window("open");
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#customview_list').datagrid('getSelected');
		if (selected) {

		} else {
		    message('请选择一行！');
		}
	    }
	}, {
	    text : '删除',
	    iconCls : 'icon-remove',
	    handler : function() {
		var selected = $('#customview_list').datagrid('getSelected');
		if (selected) {
		    $.post('customview/deleteCv', {
			cvid : selected.cvid
		    }, function(msg) {
			if (msg.type == true) {
			    message(msg.message);
			    $('#customview_list').datagrid("reload");
			} else {
			    error(msg.message);
			}
		    }, 'json');
		} else {
		    message('请选择一行！');
		}
	    }
	}, {
	    text : '设为默认',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#customview_list').datagrid('getSelected');
		if (selected.setdefault == 1) {
		    message('选择的视图已经是默认视图！');
		    return;
		}
		if (selected) {
		    $.post('customview/setDef', {
			cvid : selected.cvid,
			entitytype : entitytype
		    }, function(msg) {
			if (msg.type == true) {
			    message(msg.message);
			    $('#customview_list').datagrid("reload");
			} else {
			    error(msg.message);
			}
		    }, 'json');
		} else {
		    message('请选择一行！');
		}
	    }
	} ],
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ [ {
	    field : 'viewname',
	    title : '视图名称'
	}, {
	    field : 'setdefault',
	    title : '默认',
	    formatter : function(value, row, index) {
		if (value == 0) {
		    return "<span class='green'>否</span>";
		} else {
		    return "<span class='red'>是</span>";
		}
	    }
	}, ] ]
    });
}

