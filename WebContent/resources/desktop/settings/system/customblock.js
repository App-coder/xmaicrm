$(function() {
    initPage();
    $(".importBox").change(function(){
    	tabid=$(".importBox").val();
    	$('#blocklist').datagrid('load',{  
            tabid: tabid  
        });  
    });
});

var tabid=null;
var cols = [ {
	field:'blocklabel',
	title:'显示区域'
},{
	field:'sequence',
    title:'显示顺序'
}];
cols = setDefWidth(cols,80);

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
		height:480,
		collapsible : false,
		singleSelect : true,
		rownumbers : true,
		fitColumns:true,
		toolbar : [ {
		    text : '添加',
		    iconCls:'icon-add',
		    handler : function() {

		    }
		},{
		    text : '修改',
		    iconCls:'icon-edit',
		    handler : function() {

		    }
		},{
		    text : '删除',
		    iconCls:'icon-remove',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		columns : [ cols ]
	});
}


/*function submit(param){
	$.post("settings/customblock/submit",param,function(result){
		$.messager.alert("显示区域",result.message);
		$('#blocklist').datagrid('reload',{  
            tabid: $(".importBox").val()  
        });  
	},"json");
}*/
/*
 * datagrid edit event
 */
/*function updateActions(i){
	$('#blocklist').datagrid('updateRow',{
		index:i,
		row:{tabid:''}
	});
}
function editrow(index){
	$('#blocklist').datagrid('beginEdit', index);
}
function deleterow(index){
	$.messager.confirm('Confirm','确定删除此条记录吗?',function(r){
		if (r){
			$('#blocklist').datagrid('deleteRow', index);
			$('#blocklist').datagrid('selectRow',index);
			var row = $('#blocklist').datagrid('getSelected');
			var deleted=JSON.stringify(row);
			var param={cmd:"delete",json:deleted};
			submit(param);
		}
	});
	
	
	
}
function saverow(index){
	$('#blocklist').datagrid('endEdit', index);
}
function cancelrow(index){
	$('#blocklist').datagrid('cancelEdit', index);
}*/
