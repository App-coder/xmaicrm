$(function(){
    init_usersalesfinishedbymonth();
});
function init_usersalesfinishedbymonth(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/user_salesfinishedbymonth/getXml");
    chart.render("chart_user_salesfinishedbymonth");
}