$(function(){
    init_topperformance();
});
function init_topperformance(){
    
    $.post('crm/portlets/top_performance/getJson',{},function(res){
	
	$("#tab_topperformance").append($('<tr><td class="pl5" >新增客户数</td><td width="40%"  class="pl5" >'+res.newaccount+'</td></tr>'));
	$("#tab_topperformance").append($('<tr><td class="pl5" >新增联系记录数</td><td width="40%"  class="pl5" >'+res.newnote+'</td></tr>'));
	$("#tab_topperformance").append($('<tr><td class="pl5" >新增销售机会数</td><td width="40%"  class="pl5" >'+res.newpotential+'</td></tr>'));
	$("#tab_topperformance").append($('<tr><td class="pl5" >新增合同订单数</td><td width="40%"  class="pl5" >'+res.newsalesorder+'</td></tr>'));
	$("#tab_topperformance").append($('<tr><td class="pl5" >合同金额</td><td width="40%"  class="pl5" >'+res.sumofgather+'</td></tr>'));
	$("#tab_topperformance").append($('<tr><td class="pl5" >已收款</td><td width="40%"  class="pl5" >'+res.sumoforder+'</td></tr>'));
	
    },'json');
    
}