$(function() {
    initPage();
    initForm();
});

var tabid=null;
var cols = [{
	field:'fieldlabel',
	title:'下拉框字段名称'
}];
cols = setDefWidth(cols,80);

var colname="";

//初始化
function initForm() {
	$(".importBox").change(function(){
    	tabid=$(".importBox").val();
    	$('#blocklist').datagrid('load',{  
            tabid: tabid  
        });  
    });

    /*$('#form_picklist').form({
		url : 'crm/settings/picklist/submit',
		onSubmit : function() {
		    if ($('#form_picklist').form("validate")) {
			     return true;
		    } else {
			     return false;
		    }
	    },
		success : function(res) {
		    res = $.parseJSON(res);
		    if(res.type == true){
		       closeWin('picklist');
//		       $('#form_block').form("clear");
		       $('#blocklist').datagrid("reload",{  
		            tabid: $(".importBox").val() 
		       });
		    }
		}
    });*/
}

function initPage(){
	$.get("crm/settings/customblock/getBlockList",null,function(result){
		var options="";
		$.each(result,function(i,block){
			options+="<option value='"+block.tabid+"'>"+block.tablabel+"</option>";
		});
		$(".importBox").append(options);
		$(".importBox").get(0).selectedIndex=0;
		tabid=$(".importBox").get(0).options[0].value;
		//initGrid();
	},"json");
}

function initGrid(){
	$('#picklist_datagrid').datagrid({
		url : 'crm/settings/picklist/getPickListName',
		queryParams:{
			tabid:tabid,
		},
		doSize:true,
		height : 362,
		collapsible : false,
		singleSelect : true,
		rownumbers : true,
		fitColumns:true,
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-edit',
		    handler : function() {
		    	var selected = $('#picklist_datagrid').datagrid("getSelected");
				if (selected) {
//				    $("#form_block").find("input[name=blockid]").val(selected.blockid);
				    // 赋值操作
				    loadForm(selected);
				} else {
				    message("请选择一行记录！");
				}
		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		columns : [ cols ]
	});
}

//编辑窗口的初始化
/*function loadForm(row) {
	$("#picklist").window({
	    title:'编辑下拉框选项'+"--"+row.fieldlabel,
	    onOpen:function(){
	    	colname=row.fieldname;
	    	$.get("crm/settings/picklist/getPickListValue",{colname:colname},function(picks){
	    		 var picksValue="";
	    		 $.each(picks,function(i,pick){
	    			 picksValue+=pick.colvalue+'\n';
	    		 });
	    		 picksValue=picksValue.substring(0, picksValue.length-1);
	    		 $("textarea[name=fldPickList]").html(picksValue);
	    	},"json");
	    },
	    onClose:function(){
	    	$(".validatebox-tip").hide();
	    }
	});
	$("#picklist").window("open",false);
}

function submitPicklist(){
	var fieldpicklist=$("textarea[name=fldPickList]").val();
	var arrpick = fieldpicklist.split('\n').join(",");
	$.post("crm/settings/picklist/submit",{colname:colname,arrpick:arrpick},function(result){
		if(result.type)
			closeWin('picklist');
	},"json");
}*/

