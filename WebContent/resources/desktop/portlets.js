$(function() {
    $("body").ajaxStart(function() {
	mask();
    });

    $("body").ajaxStop(function() {
	unmask();
    });

});