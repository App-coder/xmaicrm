$(function(){
    initPage();
});
function initPage(){
    
    
    
}
function changeFieldBlock(tabfield,obj){
    var display = $("#"+tabfield).css("display");
    if(display == "none"){
	$("#"+tabfield).show();
	$(obj).find(".l-btn-text").text("收起");
    }else{
	$("#"+tabfield).hide();
	$(obj).find(".l-btn-text").text("展开");
    }
}