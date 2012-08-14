$(function(){
    initPage();
});
function initPage(){
    
    $.get('crm/portlets/gathersyear/getJson',null,function(res){
	
	var chart = new AmCharts.AmSerialChart();
        chart.dataProvider = res;
        chart.categoryField = "month";
        chart.depth3D = 20;
        chart.angle = 30;
        
        var categoryAxis = chart.categoryAxis;
        categoryAxis.labelRotation = 90;
        categoryAxis.dashLength = 1;
        categoryAxis.gridPosition = "middle";

        var graph1 = new AmCharts.AmGraph();
        graph1.type = "column";
        graph1.title = "去年";
        graph1.valueField = "lastYearGather";
        graph1.colorField = "colorOfLastYear";
        graph1.balloonText = "去年[[month]]月份:[[value]]";
        graph1.lineAlpha = 0;
        graph1.fillAlphas = 1;
        chart.addGraph(graph1);
				
	var graph2 = new AmCharts.AmGraph();
        graph2.type = "column";
        graph2.title = "今年";
        graph2.valueField = "yearGather"; 
        graph2.colorField = "colorOfYear";
        graph2.balloonText = "今年[[month]]月份:[[value]]";
        graph2.lineAlpha = 0;
        graph2.fillAlphas = 1;
        chart.addGraph(graph2);

        chart.write("chart");
	
    },'json');
    
}