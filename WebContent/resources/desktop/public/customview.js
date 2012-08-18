var typeofdata = new Array();
typeofdata['V'] = ['e','n','s','c','k'];
typeofdata['N'] = ['e','n','l','g','m','h'];
typeofdata['T'] = ['e','n','l','g','m','h'];
typeofdata['I'] = ['e','n','l','g','m','h'];
typeofdata['C'] = ['e','n'];
typeofdata['D'] = ['e','n','l','g','m','h'];

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
    $('#form_'+entitytype+'_customview').form({ 
        url:'customview/editView',  
        onSubmit: function(){
            $.messager.progress();	
            //设置ckbox值
            if($('#form_'+entitytype+'_customview').find("input[id=setdefault_"+entitytype+"]").attr("checked") == "checked"){
        	$('#form_'+entitytype+'_customview').find("input[name=setdefault]").val(1);
            }else{
        	$('#form_'+entitytype+'_customview').find("input[name=setdefault]").val(0);
            }
            
            if($('#form_'+entitytype+'_customview').find("input[id=ispublic_"+entitytype+"]").attr("checked") == "checked"){
        	$('#form_'+entitytype+'_customview').find("input[name=ispublic]").val(1);
            }else{
        	$('#form_'+entitytype+'_customview').find("input[name=ispublic]").val(0);
        	
        	//设置public setpublic
        	var setpublic = $("#roles").val();
        	$('#form_'+entitytype+'_customview').find("input[name=setpublic]").val(setpublic);
        	
            }
            
            if($('#form_'+entitytype+'_customview').find("input[id=setmetrics_"+entitytype+"]").attr("checked") == "checked"){
        	$('#form_'+entitytype+'_customview').find("input[name=setmetrics]").val(1);
            }else{
        	$('#form_'+entitytype+'_customview').find("input[name=setmetrics]").val(0);
            }
            
            //验证
            if(!$('#form_'+entitytype+'_customview').form("validate")){
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
        	closeWin("customview_"+entitytype+"_edit");
        	$('#customview_'+entitytype+'_list').datagrid("reload");
            }
        }  
    });  
    
    $('#form_'+entitytype+'_customview').find("input[id=ispublic_"+entitytype+"]").click(
	    function() {
		var cked = $('#form_'+entitytype+'_customview').find("input[id=ispublic_"+entitytype+"]")
			.attr("checked");
		if (cked == "checked") {
		    $('#form_'+entitytype+'_customview').find("select[id=roles_"+entitytype+"]").attr(
			    "disabled", "disabled");
		    $('#form_'+entitytype+'_customview').find("select[id=roles_"+entitytype+"]").find("option").removeAttr("selected");
		} else {
		    $('#form_'+entitytype+'_customview').find("select[id=roles_"+entitytype+"]")
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
	$('#form_'+entitytype+'_customview').find("select[id=roles_"+entitytype+"]").html(ostr);
    }, 'json');
}
function initGrid() {
    $('#customview_'+entitytype+'_list').datagrid({
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
		$("#customview_"+entitytype+"_edit").window("open");
		$('#form_'+entitytype+'_customview').find("input[name=action]").val("add");
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#customview_'+entitytype+'_list').datagrid('getSelected');
		$('#form_'+entitytype+'_customview').find("input[name=action]").val("update");
		if (selected) {
		    $('#form_'+entitytype+'_customview').find("input[name=id]").val(selected.cvid);
		    $("#customview_"+entitytype+"_edit").window("open");
		    
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
		var selected = $('#customview_'+entitytype+'_list').datagrid('getSelected');
		if (selected) {
		    $.post('customview/deleteCv', {
			cvid : selected.cvid
		    }, function(msg) {
			if (msg.type == true) {
			    $('#customview_'+entitytype+'_list').datagrid("reload");
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
		var selected = $('#customview_'+entitytype+'_list').datagrid('getSelected');
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
			    $('#customview_'+entitytype+'_list').datagrid("reload");
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
function setComp(val,cmpid){
    var fcol = $.parseJSON(val);
    var tp = fcol.fieldtypeofdata.substring(0,1);

    var soptions = typeofdata[tp];
    var opstr = "<option value=\"\">无</option>";
    for(var i=0;i<soptions.length;i++){
	var v = "";
	if(soptions[i]=="e"){
	    v = "等于";
	}else if(soptions[i]=="n"){
	    v = "不等于";
	}else if(soptions[i]=="s"){
	    v = "开始为";
	}else if(soptions[i]=="c"){
	    v = "包含";
	}else if(soptions[i]=="k"){
	    v = "不包含";
	}else if(soptions[i]=="l"){
	    v = "小于";
	}else if(soptions[i]=="g"){
	    v = "大于";
	}else if(soptions[i]=="m"){
	    v = "小于等于";
	}else if(soptions[i]=="h"){
	    v = "大于等于";
	}
	opstr +="<option value=\""+soptions[i]+"\">"+v+"</option>";
    }
    $('#form_'+entitytype+'_customview').find("select[name="+cmpid+"]").html(opstr);
}
