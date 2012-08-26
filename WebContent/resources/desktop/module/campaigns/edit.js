$(function() {
    initPage();
});
function initPage() {

    $("#form_campaign").form({
	url : "crm/module/campaigns/edit",
	onSubmit : function() {
            if(!$('#form_campaign').form("validate")){
        	return false;
            }
	    return true;
	},
	success : function(data) {
	    var data = $.parseJSON(data);
	    if(data.type == true){
		//转向到详细页面
		
	    }
	}
    });

}