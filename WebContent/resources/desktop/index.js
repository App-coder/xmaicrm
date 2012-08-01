$(function(){
    $('#tabs').tabs({
	onClose : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	},
	onOpen : function() {
	    // 消除多余的window
	    $("#fancybox-wrap").nextAll("div").remove();
	}
    });
    tab('首页', 'welcome/homepage');
});