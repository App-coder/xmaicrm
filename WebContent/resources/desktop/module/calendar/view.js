$(function() {
    initPage();
});
function initPage() {
    bindTag();
}
function bindTag(){
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
function pasteTag(){
    
    //验证成功
    if($("#tag").validatebox("isValid")){
	var param = {
		tag:$("#tag").val(),
		module:module,
		objectid:crmid
	};
	$.post('crm/freetags/add',param,function(res){
	    if(res.type == true){
		reloadTags();
	    }
	},'json');
    }
}
function reloadTags(){
    var param = {
	    recordid:crmid,
	    module:module
    };
    $.get('crm/freetags/loadlist',param,function(res){
	
	$("#tagdiv").find("ul").empty();
	
	for(var i=0;i<res.length;i++){
	    var str = '<li>'+res[i].tag+'<span class="icon-mini-delete mini_delete" style="height:5px;" title="删除" onclick="deleteTag('+res[i].id+')" ></span></li>';
	    $("#tagdiv").find("ul").append($(str));
	}
	
	bindTag();
	
    },'json');
}
function deleteTag(tid){
    confirm('确定删除该标签？',function(r){
	if(r){
	    $.get('crm/freetags/delete',{id:tid},function(res){
		if(res.type == true){
		    reloadTags();
		}
	    },'json');
	}
    });
}