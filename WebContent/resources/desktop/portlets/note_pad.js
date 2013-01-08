$(function(){
    init_notepad();
});
function init_notepad(){
    $.post('crm/portlets/note_pad/getNote',{},function(res){
	$("#content").text(res);
    });
}
function setNotepad(){
    var content = $("#content").val();
    $.post('crm/portlets/note_pad/saveNote',{note:content},function(res){});
}