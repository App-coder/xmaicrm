$(function(){
    loadFields();
});

var approveid;
var data;

function loadFields(){
    var tabid = $("#selectmultiapprove").val();
    reloadGrid(tabid);
    $.post("crm/settings/role/getRoleTree",null,function(result){
    	data=result;
    },"json");
}

function reloadGrid(tabid){
    var cols = [ {
		field : 'name',
		title : '流程名称'
    }, {
		field : 'used',
		title : '是否激活',
		formatter: function(value,row,index){
		    if(value == 0){
			return "禁止";
		    }
		    return "激活";
		}
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#multiapprovelist').datagrid({
	url:"crm/settings/multiapprove/getApproveList",
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers :
	    true,
	pagination : false,
	fitColumns : true,
	queryParams:{tabid:tabid},
	height : 362,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ]
    });
}

function toggleAdvOpt(){
	$("#advopt").slideToggle("slow");
}


function editMultiApprove(){
	var selected = $('#multiapprovelist').datagrid("getSelected");
	if (selected) {
		$("body").mask('页面正在加载……');
		$.get("crm/settings/multiapprove/isApproveUsed",{approveid:selected.id},function(result){
			$("body").unmask();
			if(result.type){
				message("该流程正在被使用,无法修改！");
				return;
			}else{
				approveid=selected.id;
			    setFormValue(selected);
			}
		},"json");
	} else {
	    message("请选择一行记录！");
	}
}

function setFormValue(row){
	$('#form_multiapprove').form('load',{
		name:row.name,
		memo:row.memo,
	});
	$("#multiapprove-window").window({
	    title:'编辑审批流程',
	    onOpen:function(){
		    $(".validatebox-tip").hide();
		    $("#advopt").hide();
		    $("#role_tree").tree("loadData",data);
		    $("input[name=action]").val("update");
		    if(row.used="激活")
		    	$(".used").get(0).selectedIndex=0;
		    else
		    	$(".used").get(0).selectedIndex=1;
		    if(row.userselected==1)
		    	$(".userselected").get(0).selectedIndex=0;
		    else
		    	$(".userselected").get(0).selectedIndex=1;
		    loadMask("#multiapprove-window");
		    $.get("crm/settings/multiapprove/getApproveRole",{approveid:row.id},function(result){
		    	var node;
		    	$.each(result,function(i,rs){
		    		node=$('#role_tree').tree('find',rs.userid);
		    		if(node!=null)
		    		   $('#role_tree').tree('check',node.target);
		    	});
		    	unLoadMask("#multiapprove-window");
		    },"json");
	    },
	    onClose:function(){
	    	$('#form_multiapprove').form("clear");
	    	$(".validatebox-tip").hide();
	    }
	});
	$("#multiapprove-window").window("open");
}

function submitMultiApprove(){
	loadMask("#multiapprove-window");
	var nodes=$("#role_tree").tree('getChecked');
	var userArr=[];
	$.each(nodes,function(i,node){
		userArr.push(node.id);
	});
	var approve={
	    name:$("input[name=name]").val(),
		used:$(".used").val(),
		userselected:$(".userselected").val(),
		updated_at:showLocale(new Date()),
		memo:$("textarea[name=memo]").val(),
		id:approveid
	};
	
	var params={
			xmApprove:new JSONUtil().stringify(approve),
			userArr:userArr.join(","),
			approveid:approveid,
			action:$("input[name=action]").val()
	};
	$.post("crm/settings/multiapprove/doMultiApprove",params,function(result){
		if(result.type == true){
			   unLoadMask("#multiapprove-window");
		       closeWin('multiapprove-window');
		       $('#form_multiapprove').form("clear");
		       $(".validatebox-tip").hide();
		       $('#multiapprovelist').datagrid("reload",{  
		            tabid: $("#selectmultiapprove").val()
		       });
		    }
	},"json");
}

function doMultiApproveStep(){
	var selected = $('#multiapprovelist').datagrid("getSelected");
	if (selected) {
	     window.location.href="crm/settings/multiapprove/showApproveStep?approveid="+selected.id+"";
	}else{
		message("请选择一行记录！");
	}
}