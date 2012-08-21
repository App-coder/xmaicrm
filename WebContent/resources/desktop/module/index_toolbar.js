$(function(){
    init_toolbar();
});

function init_toolbar(){
    init_component();
    init_cbtScope();
}

function init_component(){
    $("#cbt_smowners").combotree({
	onBeforeSelect:function(node){
	    if(node.iconCls == "icon-group"){
		return false;
	    }
	}
    });
}

function init_cbtScope(){
    $('#cbt_scope').combotree({
	onClick:function(node){
	    $('#view_list').datagrid("options").queryParams.scope = node.id;
	    $('#view_list').datagrid("reload");
	}
    });
}

function insert(){
    window.location.href="crm/module/"+entitytype.toLowerCase()+"/showedit?recordid=0&ptb="+ptb+"&module="+entitytype;
}

function edit(){
    var selected = $('#view_list').datagrid("getSelected");
    if (selected) {
	window.location.href = "crm/module/"+entitytype.toLowerCase()+"/showedit?recordid="
		+ selected[$('#view_list').datagrid("options").idField] + "&ptb=" + ptb + "&module=" + entitytype;
    } else {
	message("请选择记录！");
    }
}

//修改负责人
function smowerUpdate(){
    
    var selections = $('#view_list').datagrid("getSelections");
    
    if(selections.length>0){
	$("#win_editSmowners").window("open");
    }else{
	message("请选择记录！");
    }
}
//修改负责人具体操作
function smowerUpdateDo(){
    
    var select = $("#cbt_smowners").combotree("tree").tree('getSelected');
    
    if(select != null){
	
	var records = $('#view_list').datagrid("getSelections");
	var ids = "";
	for(var i=0;i<records.length;i++){
	    if(i==0){
		ids +=records[i][$('#view_list').datagrid("options").idField];
	    }else{
		ids +=",";
		ids +=records[i][$('#view_list').datagrid("options").idField];
	    }
	}
	
	$.post('crm/customview/updateSmowner',{ids:ids,entitytype:entitytype,ownerid:select.id},function(res){
	    
	    if(res.type == true){
		closeWin('win_editSmowners');
		$('#view_list').datagrid("reload");
	    }else{
		message(res.message);
	    }
	    
	},'json');
	
    }else{
	message("请选择负责人！");
    }
    
    
    
}

