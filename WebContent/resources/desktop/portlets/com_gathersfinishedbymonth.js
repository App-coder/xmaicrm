$(function(){
    init_comgathersfinishedbymonth();
});
function init_comgathersfinishedbymonth(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/com_gathersfinishedbymonth/getXml");
    chart.render("chart_comgathersfinishedbymonth");
}
