$(function() {
    initPage();
});
function initPage() {
    $(".tag").find("ul li").hover(function() {
	$(this).find(".mini_delete").show();
    }, function() {
	$(this).find(".mini_delete").hide();
    });
}
function deleteRecord(url) {
    confirm('确定删除营销活动？', function(r) {
	if (r) {
	    window.location.href = url;
	}
    });
}