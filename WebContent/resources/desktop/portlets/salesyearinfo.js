$(function(){
    init_salesyearinfo();
});
function init_salesyearinfo(){
    $.get('crm/portlets/salesyearinfo/getJson',null,function(res){
	
	$("#salesyearinfo_year").html(res.year);
	$("#salesyearinfo_sumgathersactual").html(res.sumgathersactual);
	$("#salesyearinfo_sumexpensestotal").html(res.sumexpensestotal);
	$("#salesyearinfo_salessumtotle").html(res.salessumtotle);
	$("#salesyearinfo_salescount").html(res.salescount);
	$("#salesyearinfo_newcustomer").html(res.newcustomer);
	
    },'json');
}