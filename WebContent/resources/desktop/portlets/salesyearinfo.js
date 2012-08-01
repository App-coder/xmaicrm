$(function(){
    init_salesyearinfo();
});
function init_salesyearinfo(){
    $.get('crm/portlets/salesyearinfo/getJson',null,function(res){
	
	$("#year").html(res.year);
	$("#sumgathersactual").html(res.sumgathersactual);
	$("#sumexpensestotal").html(res.sumexpensestotal);
	$("#salessumtotle").html(res.salessumtotle);
	$("#salescount").html(res.salescount);
	$("#newcustomer").html(res.newcustomer);
	
    },'json');
}