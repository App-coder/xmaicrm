$(function(){
    initpage();
});
function initpage(){
	$("body").ajaxStart(function() {
		mask();
	});

    $("body").ajaxStop(function() {
	    unmask();
    });
    reloadview();
}

var module="";
var tabid="";
var relmodTable;

function reloadview(){
    var mod = $("#selectRelmodfield").val();
    tabid=mod.split(";")[1];
    module=mod.split(";")[0];
    var trstr = "<tr><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:130px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><tr>";
    var width="";
    relmodTable="";
    $.post('crm/settings/relmodfield/list',{module:module,tabid:tabid},function(res){
		if(res.length>0){
			$.each(res,function(i,rs){
				if(i%4==0){
					trstr+="<tr style='border-bottom: 1px solid #DEDEDE;'>";
				}
				trstr+="<td>";
				
				if(typeof(rs.fieldname)=="undefined")
					trstr +="<input  type=\'checkbox\' name='fieldid' value='"+rs.fieldid+"'  />";
				else{
					trstr +="<input type=\'checkbox\' name='fieldid' value='"+rs.fieldid+"' checked />";
					relmodTable+="<td class='lvtCol' width='"+rs.width+"'> <b>"+rs.fieldlabel+"</b></td>";
				}
				trstr+="</td><td><span id='fieldlabel_"+rs.fieldid+"' class='"+rs.columnname+"'>"+rs.fieldlabel+"</span>";   
				width=typeof(rs.width)=="undefined"?"0":rs.width.substr(0,rs.width.length-1);
				trstr+="</td><td><input style='width:30px' type=\'text\' id='width_"+rs.fieldid+"' value='"+width+"' />%</td>";
				if(i%4==3)
					trstr+="</tr>";
					
			});
		   $("#relmodfield_grid").empty();
	       $("#relmodfield_grid").append(trstr);
	   }
    },'json');
}

function previewRelmodTable(){
	$("#relmodfield_window").window({
	    title:'预览相关信息中模块字段',
	    onOpen:function(){
	    	$("#preTable").empty();
	    	$("#preTable").append(relmodTable);
	    }
	});
	$("#relmodfield_window").window("open",false);
}

function editRelmodField(){ 
	var relmodField=[];
	var obj=document.getElementsByName("fieldid");
	for(var i=0;i<obj.length;i++){
		var fieldid=obj[i].value;
		if(obj[i].checked)
			relmodField.push({
				fieldname:$("#fieldlabel_"+fieldid).attr("class"),
				width:$("#width_"+fieldid).val()+"%"
			});
	}
	
	var xmrelmod=new JSONUtil().stringify(relmodField);
	$.post("crm/settings/relmodfield/submit",{module:module,xmrelmod:xmrelmod},function(result){
	    if(result.type == true){
	    	reloadview();
	    }
	},"json");
}
