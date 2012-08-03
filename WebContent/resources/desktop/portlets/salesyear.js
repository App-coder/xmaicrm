$(function(){
    init_salesyear();
});
function init_salesyear(){
    var chart = new FusionCharts("resources/fusionchart/MSColumn3D.swf",
	    "ChartId", "100%", "252");
    chart.setDataURL("crm/portlets/salesyear/getXml");
    chart.render("chart_salesyear");
}
function init_salesyear1(){
    
    $.post('crm/portlets/salesyear/getJson',null,function(res){
	
	var chart = new AmCharts.AmSerialChart();
        chart.dataProvider = res;
        chart.categoryField = "duedate";
        chart.depth3D = 20;
        chart.angle = 30;
        chart.autoMargins = true;
        
        var categoryAxis = chart.categoryAxis;
        categoryAxis.labelRotation = 90;
        categoryAxis.dashLength = 1;
        categoryAxis.gridPosition = "middle";

        var graph1 = new AmCharts.AmGraph();
        graph1.type = "column";
        graph1.title = "去年";
        graph1.valueField = "lastyearsalessumtotal";
        graph1.balloonText = "去年[[duedate]]月份: [[value]]";
        graph1.fillColors = "#728DA2";
        graph1.lineAlpha = 0;
        graph1.fillAlphas = 1;
        chart.addGraph(graph1);
				
	var graph2 = new AmCharts.AmGraph();
        graph2.type = "column";
        graph2.title = "今年";
        graph2.valueField = "yearsalessumtotal"; 
        graph2.balloonText = "今年[[duedate]]月份: [[value]]";
        graph2.fillColors = "#A17C0C";
        graph2.lineAlpha = 0;
        graph2.fillAlphas = 1;
        chart.addGraph(graph2);

        chart.write("chart");
	
    },'json');
    
}