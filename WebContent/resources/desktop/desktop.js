$(function() {
    initPage();
});
function initPage() {
    initPortal();
}
// 初始化Portal
function initPortal() {
    $('#desktop').portal({
	border : false
    });
}
function showPlugTempsPanel(){
    $("#win_plugtemps").window({
	onOpen:function(){
	    initTempGrid();
	}
    });
    $("#win_plugtemps").window("open");
}
function initTempGrid(){
    
}