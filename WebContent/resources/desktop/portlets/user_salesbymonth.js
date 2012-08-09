$(function(){
    init_usersalesbymonth();
});
function init_usersalesbymonth(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3DLineDY.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/user_salesbymonth/getXml");
    chart.render("chart_user_salesbymonth");
}