$(function() {
    initPage();
    initForm();
});

var tabid=null;
var cols = [{
	field:'blocklabel',
	title:'显示区域'
},{
	field:'sequence',
    title:'显示顺序'
}];
cols = setDefWidth(cols,80);

//初始化
function initForm() {
	$(".importBox").change(function(){
    	tabid=$(".importBox").val();
    	$('#blocklist').datagrid('load',{  
            tabid: tabid  
        });  
    });

    $('#form_block').form({
		url : 'settings/customblock/submit',
		onSubmit : function() {
		    if ($('#form_block').form("validate")) {
			     return true;
		    } else {
			     return false;
		    }
	    },
		success : function(res) {
		    res = $.parseJSON(res);
		    if(res.type == true){
		       closeWin('block');
		       $('#form_block').form("clear");
		       $(".validatebox-tip").hide();
		       $('#blocklist').datagrid("reload",{  
		            tabid: $(".importBox").val() 
		       });
		    }
		}
    });
}

function initPage(){
	$.get("settings/customblock/getBlockList",null,function(result){
		var options="";
		$.each(result,function(i,block){
			options+="<option value='"+block.tabid+"'>"+block.tablabel+"</option>";
		});
		$(".importBox").append(options);
		$(".importBox").get(0).selectedIndex=0;
		tabid=$(".importBox").get(0).options[0].value;
		initGrid();
	},"json");
}

function initGrid(){
	$('#blocklist').datagrid({
		url : 'settings/customblock/getFieldBlocksByTabId',
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
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {
		    	$("input[name=action]").val("add");
		    	$("input[name=tabid]").val(tabid);
		    	$("input[name=blockid]").val(0);
				$("#block").window({
				    title : "新增显示区域"
				});
				
				$("#block").window("open");
		    }
		},{
		    text : '修改',
		    iconCls:'icon-edit',
		    handler : function() {
		    	var selected = $('#blocklist').datagrid("getSelected");
				if (selected) {
				    $("input[name=action]").val("update");
				    $("#form_block").find("input[name=blockid]").val(selected.blockid);
				    
				    // 赋值操作
				    loadForm(selected);
				} else {
				    message("请选择一行记录！");
				}
		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {
		    	var selected = $('#blocklist').datagrid("getSelected");
				if (selected) {
				    confirm('确定删除用户?',function(r){
					if (r){  
					    $.post("settings/customblock/submit",{blockid:selected.blockid,action:"delete"},function(res){
							if(res.type == true){
							    $('#blocklist').datagrid("reload");
							}
					    },'json');			        
					}  
				    });
				}else {
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
function loadForm(row) {
	$('#form_block').form('load',{
		blocklabel:row.blocklabel,
		sequence:row.sequence
	});
	$("#block").window({
	    title:'编辑显示区域',
	    onOpen:function(){
		    $(".validatebox-tip").hide();
	    },
	    onClose:function(){
	    	$('#form_block').form("clear");
	    	$(".validatebox-tip").hide();
	    }
	});
	$("#block").window("open");
}

function submitBlock(){
    formsubmit("form_block");
}

