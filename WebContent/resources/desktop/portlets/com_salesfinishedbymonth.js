$(function(){
    init_comsalesfinishedbymonth();
});
function init_comsalesfinishedbymonth(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/com_salesfinishedbymonth/getXml");
    chart.render("chart_salesfinishedbymonth");
}
