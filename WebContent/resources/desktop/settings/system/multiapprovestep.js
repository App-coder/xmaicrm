$(function(){
	 initApproveRole();
	 reloadGrid(approveid);
	 isApproveUsed(approveid);
});

var data;
var isUsed={};


function initApproveRole(){
	$("#advopt").hide();
	$("body").mask('页面正在加载……');
	$.post("crm/settings/role/getRoleTree",null,function(result){
    	data=result;
    	$("#roletree").tree("loadData",data);
    	$.get("crm/settings/multiapprove/getApproveRole",{approveid:approveid},function(result){
        	var node;
        	$.each(result,function(i,rs){
        		node=$('#roletree').tree('find',rs.userid);
        		if(node!=null)
        		   $('#roletree').tree('check',node.target);
        	});
//        	$("body").unmask();
        },"json");
    },"json");
}

function isApproveUsed(approveid){
	$.get("crm/settings/multiapprove/isApproveUsed",{approveid:approveid},function(result){
		$("body").unmask();
		if(result.type){
			isUsed.id="USED";
			isUsed.message="该流程正在被使用,无法修改！";
		}else{
			isUsed.id="SUCCESS";
			isUsed.message="该流程不在被使用,可以修改！";
		}
	},"json");
}

function reloadGrid(approveid){
    var cols = [ {
		field : 'name',
		title : '步骤名称'
    }, {
    	field : 'sequnce',
		title : '序列'
    },{
    	field : 'user_name',
		title : '经办人员'
    },{
    	field : 'ended',
		title : '是否可以结束整个流程',
		formatter: function(value,row,index){
		    if(value == 0){
			return "否";
		    }
		    return "是";
		}
    },{
    	field : 'next_step',
		title : '下一步'
    },{
	    field : 'id',
	    title : '工具',
	    width : 250,
	    formatter:function(value,rowdata,rowindex){
		return "<img width='16' height='16' border='0' alt='Sort' src='"+contextpath+"/resources/images/settings/system/themes/uparrow_big.gif' style='cursor:pointer;' onclick='gotoupdown("+value+","+rowdata.approveid+","+rowdata.sequnce+",\"up\");'>" +
				" | <img width='16' height='16' border='0' alt='Sort' src='"+contextpath+"/resources/images/settings/system/themes/downarrow_big.gif' style='cursor:pointer;' onclick='gotoupdown("+value+","+rowdata.approveid+","+rowdata.sequnce+",\"down\");'>";
	    }
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#multiapprovesteplist').datagrid({
		url:"crm/settings/multiapprove/getApproveStepList",
		collapsible : false,
		idField : 'id',
		singleSelect : true,
		rownumbers :true,
		pagination : false,
		fitColumns : true,
		queryParams:{approveid:approveid},
		height : 362,
		frozenColumns : [ [ {
		    field : 'ck',
		    checkbox : true
		} ] ],
		columns : [ cols ]
    });
}

function gotoupdown(stepid,approveid,sequnce,operation){
	$("body").mask('页面正在加载……');
	var params={
			stepid:stepid,
			approveid:approveid,
			sequnce:sequnce,
			operation:operation
	};
	if(isUsed.id!="USED"){
		if(operation=='up'){
			if(sequnce==1){
				$("body").unmask();
				$.messager.alert('警告',"该步骤已经是第一步了"); 
				return;
			}
			changeStepSeq(params);
		}else{
			$.post("crm/settings/multiapprove/islaststep",params,function(result){
				if(result.type){
					$("body").unmask();
					$.messager.alert('警告',"该步骤已经是最后一步了"); 
					return;
				}else
					changeStepSeq(params);
			},'json');
			
		}
	}else{
		$("body").unmask();
		$.messager.alert('警告',isUsed.message); 
		return;
	}
}

function changeStepSeq(params){
	$.post("crm/settings/multiapprove/gotoUpDownStep",params,function(result){
		if(result.type){
			$("body").unmask();
			$('#multiapprovesteplist').datagrid("reload");
		}
	},'json');
}

function forceApproveFinish()
{
	var params={
			approveid:approveid,
			modulename:modulename
	};
	$.messager.confirm('警告','执行该操作后，所有使用本流程审批的单子将自动审批通过，是否继续？',function(r){   
	    if (r){   
	        $.post("crm/settings/multiapprove/forceApproveFinish",params,function(result){
	        	if(result.type)
	        		$.messager.alert('操作成功!');
	        	else
	        		$.messager.alert('操作失败!');
	        },'json');
	    }   
	}); 
} 

function forceApproveRetStart(){
	var params={
			approveid:approveid,
			modulename:modulename
	};
	$.messager.confirm('警告','执行该操作后，所有使用本流程审批的单子将自动返回负责人，是否继续？',function(r){   
	    if (r){   
	        $.post("crm/settings/multiapprove/forceApproveRetStart",params,function(result){
	        	if(result.type)
	        		$.messager.alert('操作成功!');
	        	else
	        		$.messager.alert('操作失败!');
	        },'json');
	    }   
	}); 
}

function toggleAdvOpt(){
	$("#advopt").slideToggle("slow");
}

function doMultiApproveStep(action){
	if(action=='add'){
		window.location.href="crm/settings/multiapprove/editApproveStep?id="+approveid+"&type=c";
	}else if(action=='edit'){
		var selected = $('#multiapprovesteplist').datagrid("getSelected");
		if (selected) {
		     window.location.href="crm/settings/multiapprove/editApproveStep?id="+selected.id+"&type=u";
		}else{
			message("请选择一行记录！");
		}
	}else{
		var selected = $('#multiapprovesteplist').datagrid("getSelected");
		if (selected) {
		    confirm('确定删除?',function(r){
			if (r){  
				$("body").mask('页面正在加载……');
				$.post("crm/settings/multiapprove/submit",{stepid:selected.id,type:'d'},function(res){
					if(res.type == true){
						$('#multiapprovesteplist').datagrid("reload");
						$("body").unmask();
					}
				},"json");		        
			}  
		    });
		}else {
		    message("请选择一行记录！");
		}
	}
}
