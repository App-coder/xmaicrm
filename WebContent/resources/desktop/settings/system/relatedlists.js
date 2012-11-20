$(function(){
   initPage(); 
   initForm();
});
function initPage(){
    var selectrelated = $("#selectrelated").val();
    reloadGrid(selectrelated);
}

function initForm() {
    $('#form_relatedlists').form({
		url : 'crm/settings/relatedlists/submit',
		onSubmit : function() {
		    if ($('#form_relatedlists').form("validate")) {
			     return true;
		    } else {
			     return false;
		    }
	    },
		success : function(res) {
		    res = $.parseJSON(res);
		    if(res.type == true){
		       closeWin('relatedlists_window');
		       $('#form_relatedlists').form("clear"); 
		       $(".validatebox-tip").hide();
		       $('#relatedlist').datagrid("reload",{  
		            tabid: $("#selectrelated").val() 
		       });
		    }
		}
    });
}

function reloadGrid(relateid){
    var cols = [ {
	field : 'label',
	title : '相关信息'
    }, {
	field : 'sequence',
	title : '显示顺序'
    },{
	field : 'presence',
	title : '是否显示',
	formatter: function(value,row,index){
	    if(value == 0){
		return "是";
	    }
	    return "否";
	}
    }];
    cols = setDefWidth(cols, 80);    
    
    $('#relatedlist').datagrid({
	url:"crm/settings/relatedlists/list",
	collapsible : false,
	idField : 'relationId',
	singleSelect : true,
	rownumbers :true,
	pagination : false,
	fitColumns : true,
	queryParams:{tabid:relateid},
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ]
    });    
}

function editRelated(){
	var selected = $('#relatedlist').datagrid("getSelected");
	if (selected) {
	    loadForm(selected);
	} else {
	    message("请选择一行记录！");
	}
}

function loadForm(row){
	$('#form_relatedlists').form('load',{
		label:row.label,
		sequence:row.sequence,
		relationId:row.relationId
	});
	$("#relatedlists_window").window({
	    title:'编辑相关信息',
	    onOpen:function(){
		    $(".validatebox-tip").hide();
		    if(row.presence==0)
		    	$("input[name='_presence']").attr("checked",true);
		    else
		    	$("input[name='_presence']").attr("checked",false);
	    },
	    onClose:function(){
	    	$('#form_relatedlists').form("clear");
	    	$(".validatebox-tip").hide();
	    }
	});
	$("#relatedlists_window").window("open");
}

function submitRelatedlists(){
	if($("input[name='_presence']").attr('checked')==undefined)
		$("input[name=presence]").val(1);
	else
		$("input[name=presence]").val(0);
	formsubmit("form_relatedlists");
}