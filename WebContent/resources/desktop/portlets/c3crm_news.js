$(function(){
    init_c3crm_news();
});
function init_c3crm_news(){
    $.post('crm/portlets/c3crm_news/getJson',null,function(res){
	//$("#tab_c3crm_news").append("<tr><td class=\"pl5\"></td></tr>");
    },'json');
}