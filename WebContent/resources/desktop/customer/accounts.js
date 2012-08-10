/*var accounts={};

accounts.getViews=function(){
	var views='';
	for(var i = 0; i < configs.length; i++){
		var item=configs[i];
		views+="<span style='padding-right:5px;padding-top:5px;padding-bottom:5px;'>";
		views+="<a class='cus_markhui tablink' onclick="javascript:getTabView('Accounts','viewname=12',this,12);" href="javascript:;">所有</a>";
		views+="</span>";
	}
};*/

$(function(){
	$.get("custom");
	
});