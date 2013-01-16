$(function() {
    init_topsalesbymonth();
});
function init_topsalesbymonth() {
    var chart = new FusionCharts("resources/fusionchart/MSColumn3DLineDY.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/top_salesbymonth/getXml");
    chart.render("chart_top_salesbymonth");
}
