$(function(){
    initpage();
});
function initpage(){
    reloadview();
}
function reloadview(){
    var mod = $("#selectmodule").val();
    var trstr = "";
    
    $.post('crm/settings/deforgfield/list',{tabid:mod},function(res){
	if(res.length>0){
	    for(var i=0;i<res.length;i++){
		if(i==0){
		    trstr+="<tr style='border-bottom: 1px solid #DEDEDE;'>";
		}
		trstr +="<td>";
		if(res[i].visible==0)
			trstr +="<input type=\'checkbox\'/ checked>"+res[i].fieldlabel;
		else
		    trstr +="<input type=\'checkbox\'/>"+res[i].fieldlabel;
		trstr +="</td>";
		if((i+1)%4==0&&i!=0){
		    trstr +="</tr><tr>";
		}
		if(i==res.length-1 && (i+1)%4!=0){
		    var n = res.length%4;
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