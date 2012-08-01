$(function() {
    init_gathersyear();
});
function init_gathersyear() {
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/gathersyear/getXml");
    chart.render("chart_gathersyear");
}