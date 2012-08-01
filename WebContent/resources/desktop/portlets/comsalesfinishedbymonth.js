$(function(){
    init_comsalesfinishedbymonth();
});
function init_comsalesfinishedbymonth(){
    
    $.post('crm/portlets/com_salesfinishedbymonth/getInfo',null,function(res){
	
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
        graph1.title = "目标";
        graph1.valueField = "sum";
        graph1.colorField = "colorOfSum";
        graph1.balloonText = "目标: [[value]]";
        graph1.lineAlpha = 0;
        graph1.fillAlphas = 1;
        chart.addGraph(graph1);
				
	var graph2 = new AmCharts.AmGraph();
        graph2.type = "column";
        graph2.title = "已完成";
        graph2.valueField = "finished"; 
        graph2.colorField = "colorOfFinished";
        graph2.balloonText = "已完成: [[value]]";
        graph2.lineAlpha = 0;
        graph2.fillAlphas = 1;
        chart.addGraph(graph2);

        chart.write("chart");
	
    },'json');
    
}