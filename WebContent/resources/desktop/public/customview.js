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
    $('#form_customview').form({ 
        url:'crm/customview/editView',  
        onSubmit: function(){
            
            //验证显示字段不能重复
            var cols = [];
            for(var i=1;i<=9;i++){
        	var selval = $('#form_customview').find("select[name=column_"+i+"]").find("option[selected=selected]").attr("fid");
        	if(selval!=""&&selval!="undefined"&&selval!=undefined){
        	    cols.push(selval);
        	}
            }

	    if(mm(cols)){
		message("显示字段不能重复！");
		return false;
	    }
            
            $.messager.progress();	
            
            //设置ckbox值
            if($('#form_customview').find("input[id=setdefault]").attr("checked") == "checked"){
        	$('#form_customview').find("input[name=setdefault]").val(1);
            }else{
        	$('#form_customview').find("input[name=setdefault]").val(0);
            }
            
            if($('#form_customview').find("input[id=ispublic]").attr("checked") == "checked"){
        	$('#form_customview').find("input[name=setpublic]").val(0);
            }else{
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
    
    $('#form_customview').find("input[id=ispublic]").click(
	    function() {
		var cked = $('#form_customview').find("input[id=ispublic]")
			.attr("checked");
		if (cked == "checked") {
		    $('#form_customview').find("select[id=roles]").attr(
			    "disabled", "disabled");
		    $('#form_customview').find("select[id=roles]").find("option").removeAttr("selected");
		} else {
		    $('#form_customview').find("select[id=roles]")
			    .removeAttr("disabled");
		}
    });
    
    //初始化设置window的close方法
    $("#customview_edit").window({
	onClose:function(){
	    $('#form_customview').form("clear");
	    $(".validatebox-tip").hide();
	    $('#form_customview').find("select[id=roles]")
	    .removeAttr("disabled");
	},
	onOpen:function(){
	    $('#form_customview').find("input[name=entitytype]").val(entitytype);
	}
    });
}
function initContainer() {
    $.get('crm/role/getroles', null, function(data) {
	var ostr = "";
	if (data.length >= 1) {
	    for ( var i = 0; i < data.length; i++) {
		ostr += "<option value='" + data[i].id + "'>" + data[i].text
			+ "</option>";
	    }
	}
	$('#form_customview').find("select[id=roles]").html(ostr);
    }, 'json');
}
function initGrid() {
    $('#customview_list').datagrid({
	url : 'crm/customview/load',
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
	toolbar : [ {
	    text : '添加',
	    iconCls : 'icon-add',
	    handler : function() {
		$("#customview_edit").window("open");
		$('#form_customview').find("input[name=action]").val("add");
	    }
	}, {
	    text : '编辑',
	    iconCls : 'icon-edit',
	    handler : function() {
		var selected = $('#customview_list').datagrid('getSelected');
		$('#form_customview').find("input[name=action]").val("update");
		if (selected) {
		    $('#form_customview').find("input[name=id]").val(selected.cvid);
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
		    //删除确认
		    confirm('确认删除视图？',function(r){
			if(r){
			    $.post('crm/customview/deleteCv', {
				cvid : selected.cvid
			    }, function(msg) {
				if (msg.type == true) {
				    $('#customview_list').datagrid("reload");
				} else {
				    error(msg.message);
				}
			    }, 'json');
			}
		    });
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
		    $.post('crm/customview/setDef', {
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
	    title : '视图名称',
	    width:80
	}, {
	    field : 'setdefault',
	    title : '默认',
	    width:80,
	    formatter : function(value, row, index) {
		if (value == 0) {
		    return "<span class='green'>否</span>";
		} else {
		    return "<span class='red'>是</span>";
		}
	    }
	}, ] ]
    });
    $('#customview_list').datagrid('fixColumnSize');
}
function initview(vid){
    //视图基本信息
    $.post('crm/customview/getView',{viewid:vid},function(data){
	
	$("#form_customview").find("input[name=viewname]").val(data.viewname);
	$("#form_customview").find("input[name=id]").val(data.cvid);
    	$("#id").val(data.cvid);
    	if(data.setdefault == 1){
    	    $("#setdefault").attr("checked","checked");
    	}
    	if(data.setmetrics == 1){
    	    $("#setmetrics").attr("checked","checked");
    	}
    	if(data.setpublic == 0){
    	    $("#ispublic").attr("checked","checked");
    	}else{
    	    var rs = data.setpublic.split(",");
    	    for(var i=0;i<rs.length;i++){
    		$("#roles").find("option[value="+rs[i]+"]").attr("selected","selected");
    	    }
    	}
    	
    	if(data.collectcolumn!=""){
    	    $("#form_customview").find("select[name=column_collect]").find("option[value=\""+data.collectcolumn+"\"]").attr("selected","selected");
    	}
    	
    },'json');

    //九个列的信息
    $.post('crm/customview/getColumns',{viewid:vid},function(data){
	for(var i=0;i<data.length;i++){
	    $("#form_customview").find("select[name=column_"+(i+1)+"]").find("option[value=\""+data[i].columnname+"\"]").attr("selected","selected");
	}
    },'json');
    
    //标准查询信息
    $.post('crm/customview/getStdfilter',{viewid:vid},function(data){
	$("#form_customview").find("select[name=column_stdfilter]").find("option[value=\""+data.columnname+"\"]").attr("selected","selected");
	$("#form_customview").find("select[name=stddatefilter]").find("option[value=\""+data.stdfilter+"\"]").attr("selected","selected");
	$('#startdate').datebox('setValue', data.startdate);
	$("#form_customview").find("input[name=startdate]").val(data.startdate);
	$('#enddate').datebox('setValue', data.enddate);
	$("#form_customview").find("input[name=enddate]").val(data.enddate);

	$("#startdate").datebox({
	    onSelect:function(date){
		$("#form_customview").find("input[name=startdate]").val(date.pattern("yyyy-MM-dd"));
	    }
	});
	$("#enddate").datebox({
	    onSelect:function(date){
		$("#form_customview").find("input[name=startdate]").val(date.pattern("yyyy-MM-dd"));
	    }
	});

    },'json');
    
    //高级查询信息
    $.post('crm/customview/getAdvfilter',{viewid:vid},function(data){
	//column_1 name
	for(var i=0;i<data.length;i++){
	    if(data[i].columnname!=""&&typeof(data[i].columnname)!="undefined"){
		$("#form_customview").find("select[name=advfiltercol_"+(i+1)+"]").find("option[value=\""+data[i].columnname+"\"]").attr("selected","selected");
		setComp(data[i].columnname,"comparator_"+(i+1));
		$("#form_customview").find("select[name=comparator_"+(i+1)+"]").find("option[value=\""+data[i].comparator+"\"]").attr("selected","selected");
		$("#form_customview").find("input[name=fv_"+(i+1)+"]").val(data[i].value);
	    }
	}
	$("#form_customview").form('load',data);
    },'json');
    
}
function setComp(val,cmpid){
    if(fcol==null){
	return;
    }
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
    $('#form_customview').find("select[name="+cmpid+"]").html(opstr);
}
function updateCol(obj){
    $('#form_customview').find("select[name="+$(obj).attr("name")+"]").find("option[selected=selected]").removeAttr("selected");
    $('#form_customview').find("select[name="+$(obj).attr("name")+"]").find("option[value=\""+obj.value+"\"]").attr("selected","selected");
}
