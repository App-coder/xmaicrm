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