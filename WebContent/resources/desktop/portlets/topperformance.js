$(function(){
    init_topperformance();
});
function init_topperformance(){
    $.get('crm/portlets/top_performance/getJson',null,function(res){
	$("#newaccount").html(res.newaccount);
	$("#newnote").html(res.newnote);
	$("#newpotential").html(res.newpotential);
	$("#neworder").html(res.newsalesorder);
	$("#sumoforder").html(res.sumoforder);
	$("#sumofgather").html(res.sumofgather);
    },'json');
}