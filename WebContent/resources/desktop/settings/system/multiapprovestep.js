$(function(){
	 initApproveRole();
	 reloadGrid(approveid);
});

var data;


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
        	$("body").unmask();
        },"json");
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
			return "不是";
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
		return "<img width='16' height='16' border='0' alt='Sort' src='"+contextpath+"/resources/images/settings/system/themes/uparrow_big.gif' style='cursor:pointer;' onclick='gotoup(9,3);'>" +
				" | <img width='16' height='16' border='0' alt='Sort' src='"+contextpath+"/resources/images/settings/system/themes/downarrow_big.gif' style='cursor:pointer;' onclick='gotodown(9,3);'>";
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

function toggleAdvOpt(){
	$("#advopt").slideToggle("slow");
}

function doMultiApproveStep(action){
	if(action=='add'){
		
	}else if(action='edit'){
		var selected = $('#multiapprovesteplist').datagrid("getSelected");
		if (selected) {
		     window.location.href="crm/settings/multiapprove/editApproveStep?id="+selected.id+"";
		}else{
			message("请选择一行记录！");
		}
	}
}