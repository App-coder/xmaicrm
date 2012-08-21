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

var tabid="";

function reloadview(){
    var mod = $("#selectmodule").val();
    var trstr = "";
    tabid=mod;
    $.post('crm/settings/deforgfield/list',{tabid:mod},function(res){
		if(res.length>0){
		    for(var i=0;i<res.length;i++){
			if(i==0){
			    trstr+="<tr style='border-bottom: 1px solid #DEDEDE;'>";
			}
			trstr +="<td>";
			if(res[i].visible==0)
				trstr +="<input  type=\'checkbox\' name='fieldid' value='"+res[i].fieldid+"'  / checked>"+res[i].fieldlabel;
			else
			    trstr +="<input type=\'checkbox\' name='fieldid' value='"+res[i].fieldid+"' />"+res[i].fieldlabel;
			trstr +="</td>";
			if((i+1)%4==0&&i!=0){
			    trstr +="</tr><tr>";
			}
			if(i==res.length-1 && (i+1)%4!=0){
			    for(var j=0;j<4-j;j++){
				trstr +="<td></td>";
			    }
			    trstr +="</tr>";
			}
		}
	    $("#dof_tab").html(trstr);
	   }
    },'json');
}

function submitDeforgFid(){ 
	var ck_fieldid=[];
	var unck_fieldid=[];
	var obj=document.getElementsByName("fieldid");
	for(var i=0;i<obj.length;i++){
		if(obj[i].checked)
			ck_fieldid.push(obj[i].value);
		else
			unck_fieldid.push(obj[i].value);
	}
	
	$.post("crm/settings/deforgfield/submit",{tabid:tabid,ck_fieldid:ck_fieldid.join(","),unck_fieldid:unck_fieldid.join(",")},function(result){
	    if(result.type == true){
	    	reloadview();
	    }
	},"json");
	
}