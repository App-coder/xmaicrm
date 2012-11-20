var tabid=null;
var block_options="";
var tod="";
var cols = [{
	field:'fieldlabel',
	title:'字段名称'
}];
cols = setDefWidth(cols,80);
var colname="";

$(function() {
    initForm();
});


//初始化
function initForm() {
	$(".importBox").change(function(){
    	tabid=$(".importBox").val();
    	initTable(tabid);
    });
	//初始化下拉框
	$.get("crm/settings/customblock/getBlockList",null,function(result){
		var options="";
		$.each(result,function(i,block){
			options+="<option value='"+block.tabid+"'>"+block.tablabel+"</option>";
		});
		$(".importBox").append(options);
		$(".importBox").get(0).selectedIndex=0;
		tabid=$(".importBox").get(0).options[0].value;
		initTable(tabid);
	},"json");
	
    $('#form_layout').form({
		url : 'crm/settings/layoutlist/submit',
		onSubmit : function() {
		    if ($('#form_layout').form("validate")) {
			     return true;
		    } else {
			     return false;
		    }
	    },
		success : function(res) {
		    res = $.parseJSON(res);
		    if(res.type == true){
		       closeWin('layoutlist');
		       initTable(tabid);
		       $('#form_layout').form("clear");
		    }
		}
    });
}

function initTable(tabid){
	$.post("crm/settings/customblock/getFieldBlocksByTabId",{tabid:tabid,page:1,rows:50},function(result){
		var results=result;
		var arr=new Array();
		
		$.each(result,function(i,rs){
			arr.push(rs.blockid);
			block_options+="<option value='"+rs.blockid+"'>"+rs.blocklabel+"</option>";
		});
		var blockids=arr.join(",");
		general(blockids,results);
	},"json");
}

function general(blockids,results){
	$.get("crm/settings/layoutlist/getLayoutField",{tabid:tabid,blockids:blockids},function(result){
		var table="";
		$("#cfList").empty();
		$.each(results,function(i,rs){
			var blockid=rs.blockid;
			var childresult=result[blockid];
			table+="<table class='small' width='100%' cellspacing='0' cellpadding='0' border='0'>" +
					     "<tr><td width='50%'></td><td width='50%'> </td></tr>" +
					     "<tr><td class='dvInnerHeader' colspan='2'><b>"+rs.blocklabel+"</b></td></tr>";
			$.each(childresult,function(i,r){
				if(i%2==0){
					table+="<tr style='height:25px'>";
				}
				table+="<td class='dvtCellLabel' align='left'>#"+r.sequence+r.fieldlabel+
							   "<img border='0' title='编辑' alt='编辑' onclick=\"loadForm("+r.fieldid+",'"+r.fieldlabel+"',"+r.block+","+r.sequence+",'"+r.typeofdata+"')\" style='cursor:pointer;' src='resources/images/settings/editfield.gif'>"+
					    "</td>";
				if(i%2==1)
					table+="</tr>";
			});
			table+="</table><br>";
		});
		$("#cfList").append(table);
	},"json");
}

//编辑窗口的初始化
function loadForm(fieldid,fieldlabel,block,sequence,typeofdata) {
	tod=typeofdata;
	$('#form_layout').form('load',{
		fieldlabel:fieldlabel,
		sequence:sequence,
		fieldid:fieldid
	});
	$("#layoutlist").window({
	    title:'编辑页面布局',
	    onOpen:function(){
	    	$("#block").empty();
	    	$("#block").append(block_options);
	    	$("#block").get(0).value = block;
	    	var ischeck=typeofdata.substr(2,1);
	    	if(ischeck=='O')
	    		$("input[name='_typeofdata']").attr("checked",false);
	    	else
	    		$("input[name='_typeofdata']").attr("checked",true);
	    },
	    onClose:function(){
	    	$('#form_layout').form("clear");
	    }
	});
	$("#layoutlist").window("open",false);
}

function submitLayoutlist(){
	var temp= tod.charAt(2);
	if($("input[name='_typeofdata']").attr('checked'))
		$("input[name='typeofdata']").val(tod.replace(temp,"M"));
	else
		$("input[name='typeofdata']").val(tod.replace(temp,"O"));
	formsubmit("form_layout");
}

