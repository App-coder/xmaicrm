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
var productTable;
var commonTable="<td class='lvtCol' width='5%'><b>折扣</b></td>"+
				"<td class='lvtCol' width='10%'><b>折扣价格</b></td>"+
				"<td class='lvtCol' width='8%' align='left'><b>数量</b></td>"+
				"<td class='lvtCol' width='12%' align='left'><b>价格</b></td>"+
				"<td class='lvtCol' width='15%' align='left'><b>备注</b></td>"+
				"<td class='lvtCol' width='10%' nowrap='' align='right'><b>小计</b></td>";

function reloadview(){
    var mod = $("#selectproduct").val();
    var trstr = "<tr><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:130px;'>字段名</td><td>字段宽度</td><td width='1%'></td><td style='width:80px;'>字段名</td><td>字段宽度</td><tr>";
    module=mod;
    var width="";
    productTable="";
    $.post('crm/settings/productfield/list',{module:module},function(res){
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
					productTable+="<td class='lvtCol' width='"+rs.width+"'> <b>"+rs.fieldlabel+"</b></td>";
				}
				trstr+="</td><td><span id='fieldlabel_"+rs.fieldid+"' class='"+rs.columnname+"'>"+rs.fieldlabel+"</span>";   
				width=typeof(rs.width)=="undefined"?"0":rs.width.substr(0,rs.width.length-1);
				trstr+="</td><td><input style='width:30px' type=\'text\' id='width_"+rs.fieldid+"' value='"+width+"' />%</td>";
				if(i%4==3)
					trstr+="</tr>";
					
			});
		   $("#productfield_grid").empty();
	       $("#productfield_grid").append(trstr);
	       productTable+=commonTable;
	   }
    },'json');
}

function previewProductTable(){
	$("#productfield_window").window({
	    title:'预览产品详细信息',
	    onOpen:function(){
	    	$("#preTable").empty();
	    	$("#preTable").append(productTable);
	    }
	});
	$("#productfield_window").window("open",false);
}

function editProductField(){ 
	var productField=[];
	var obj=document.getElementsByName("fieldid");
	for(var i=0;i<obj.length;i++){
		var fieldid=obj[i].value;
		if(obj[i].checked)
			productField.push({
				fieldname:$("#fieldlabel_"+fieldid).attr("class"),
				width:$("#width_"+fieldid).val()+"%"
			});
	}
	
	var xmproduct=new JSONUtil().stringify(productField);
	$.post("crm/settings/productfield/submit",{module:module,xmproduct:xmproduct},function(result){
	    if(result.type == true){
	    	reloadview();
	    }
	},"json");
}
