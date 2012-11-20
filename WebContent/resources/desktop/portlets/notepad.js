$(function(){
    initPage();
});
function initPage(){
    $.post('crm/portlets/note_pad/getNote',{},function(res){
	$("#content").text(res);
    });
}
function setNotepad(){
    var content = $("#content").val();
    $.post('crm/portlets/note_pad/saveNote',{note:content},function(res){});
}