$(function(){
    initPage();
});
function initPage(){
    $.post('crm/portlets/accountmoney/getJson',null,function(res){
	
	for(var i=0;i<res.length;i++){
	    if(i==0){
		$(".tablist").append("<tr><td class=\"pl5\">应收款客户汇总：共有"+res[i].countofuser+" 家客户，应收总计"+res[i].countOfMoney+"元 </td></tr>");
	    }else if(i==1){
		$(".tablist").append("<tr><td class=\"pl5\">应付款客户汇总：共有"+res[i].countofuser+"家客户，应收总计"+res[i].countOfMoney+"元 </td></tr>");
	    }else if(i==2){
		$(".tablist").append("<tr><td class=\"pl5\">应付款供应商汇总：共有"+res[i].countofuser+"家供应商，应收总计"+res[i].countOfMoney+"元 </td></tr>");
	    }
	}
	
    },'json');
}