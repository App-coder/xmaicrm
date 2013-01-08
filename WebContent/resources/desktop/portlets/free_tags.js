$(function(){
    init_free_tags();
});
function init_free_tags(){
    $.get('crm/portlets/free_tags/getJson',{},function(res){
	if(res.length>0){
	    for(var i=0;i<res.length;i++){
		$("#div_free_tags").find("ul").append($("<li>"+res[i].tag+"</li>"));
	    }
	}
    },'json');
}