$(function(){
    init_announcements();
});
function init_announcements(){
    $.post('crm/portlets/announcements/getJson',null,function(res){
	for(var i=0;i<res.length;i++){
	    $("#tab_announcements").append("<tr><td class=\"pl5\">"+res[i].announcement975+"："+res[i].announcementname+"&nbsp;&nbsp;"+res[i].announcement977+"</td></tr>");
	}
    },'json');
}