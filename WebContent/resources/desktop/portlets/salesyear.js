$(function(){
    init_salesyear();
});
function init_salesyear(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/salesyear/getXml");
    chart.render("chart_salesyear");
}
