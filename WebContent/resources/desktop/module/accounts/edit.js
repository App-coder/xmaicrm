$(function() {
    initPage();
});
function initPage() {

    $("#form_accounts").form({
	url : "crm/module/campaigns/edit",
	onSubmit : function() {
            if(!$('#form_campaign').form("validate")){
        	return false;
            }
            if(kinds.length>0){
        	for(var i=0;i<kinds.length;i++){
        	    kinds[i].sync();
        	}
            }
	    return true;
	},
	success : function(data) {
	    var data = $.parseJSON(data);
	    if(data.type == true){
		//转向到详细页面
		window.location.href = "crm/module/campaigns/view?recordid="+data.message+"&ptb="+ptb+"&module=Campaigns";
	    }
	}
    });
}
function rendRel(columnname,obj){
    debugger;
}