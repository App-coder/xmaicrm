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
    
    $('#form_customview').form({ 
        url:'customview/editView',  
        onSubmit: function(){
            $.messager.progress();	
            //设置ckbox值
            if($('#form_customview').find("input[id=setdefault]").attr("checked") == "checked"){
        	$('#form_customview').find("input[name=setdefault]").val(1);
            }else{
        	$('#form_customview').find("input[name=setdefault]").val(0);
            }
            
            if($('#form_customview').find("input[id=ispublic]").attr("checked") == "checked"){
        	$('#form_customview').find("input[name=ispublic]").val(1);
            }else{
        	$('#form_customview').find("input[name=ispublic]").val(0);
        	
        	//设置public setpublic
        	var setpublic = $("#roles").val();
        	$('#form_customview').find("input[name=setpublic]").val(setpublic);
        	
            }
            
            if($('#form_customview').find("input[id=setmetrics]").attr("checked") == "checked"){
        	$('#form_customview').find("input[name=setmetrics]").val(1);
            }else{
        	$('#form_customview').find("input[name=setmetrics]").val(0);
            }
            
            //验证
            if(!$('#form_customview').form("validate")){
        	$.messager.progress('close');
        	return false;
            }
            return true;
        },  
        success:function(data){
            $.messager.progress('close');
            var msg = $.parseJSON(data);
            if(msg.type==true){
        	//关闭wind,datagrid刷新
        	closeWin("customview_edit");
        	$('#customview_list').datagrid("reload");
            }
        }  
    });  
    
    $("#form_customview").find("input[id=ispublic]").click(
	    function() {
		var cked = $("#form_customview").find("input[id=ispublic]")
			.attr("checked");
		if (cked == "checked") {
		    $("#form_customview").find("select[id=roles]").attr(
			    "disabled", "disabled");
		    $("#form_customview").find("select[id=roles]").find("option").removeAttr("selected");
		} else {
		    $("#form_customview").find("select[id=roles]")
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
	$("#form_customview").find("select[id=roles]").html(ostr);
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
	fitColumns:true,
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
		$("#form_customview").find("input[name=action]").val("add");
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#customview_list').datagrid('getSelected');
		$("#form_customview").find("input[name=action]").val("update");
		if (selected) {
		    $("#form_customview").find("input[name=id]").val(selected.cvid);
		    $("#customview_edit").window("open");
		    
		    //初始化页面数据
		    initview(selected.cvid);
		    
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
function initview(vid){
    //视图基本信息
    $.post('customview/getView',{viewid:vid},function(data){
	
    },'json');
    
    //九个列的信息
    $.post('customview/getColumns',{viewid:vid},function(data){
	
    },'json');
    
    //标准查询信息
    $.post('customview/getStdfilter',{viewid:vid},function(data){
	
    },'json');
    
    //高级查询信息
    $.post('customview/getAdvfilter',{viewid:vid},function(data){
	
    },'json');
    
}
