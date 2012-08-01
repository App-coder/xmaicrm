$(function(){
    init_salesfunnels();
});
function init_salesfunnels(){
    /*
    $.get('crm/portlets/salesfunnels/getJson',null,function(res){
    },'json');
    */
    return;
    var xmlstr = '<chart decimals="1" baseFontSize="12" isSliced="1" streamlinedData="0" isHollow="0" bgColor="EAEAEA" showBorder="0" formatNumberScale="0" >';
	for(var i=0;i<res.length;i++){
	    xmlstr +='<set label="'+res[i].name+'" value="'+res[i].value+'" />';
	}
	xmlstr +='</chart>';
	var charts = new FusionCharts("resources/fusionchart/Funnel.swf", "ChartId", "100%", "252");
	charts.setDataXML(xmlstr);
	charts.render("chart");	
}