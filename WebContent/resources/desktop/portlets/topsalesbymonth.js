$(function(){
    initPage();
});
function initPage(){
    
    $.post('crm/portlets/top_salesbymonth/getJson',null,function(res){
	
	var chart = new AmCharts.AmSerialChart();
        chart.dataProvider = res;
        chart.categoryField = "m";
        chart.depth3D = 20;
        chart.angle = 30;
        
        var categoryAxis = chart.categoryAxis;
        categoryAxis.labelRotation = 90;
        categoryAxis.dashLength = 1;
        categoryAxis.gridPosition = "middle";

        var valueAxis1 = new AmCharts.ValueAxis();
        valueAxis1.axisThickness = 1;
        valueAxis1.gridAlpha = 0;
        chart.addValueAxis(valueAxis1);
        
        var graph1 = new AmCharts.AmGraph();
        graph1.type = "column";
        graph1.title = "合同订单金额";
        graph1.valueField = "total";
        graph1.valueAxis = valueAxis1; 
        graph1.colorField = "colorOfTotal";
        graph1.balloonText = "合同订单金额: [[value]]";
        graph1.lineAlpha = 0;
        graph1.fillAlphas = 1;
        chart.addGraph(graph1);
				
        var valueAxis2 = new AmCharts.ValueAxis();
        valueAxis2.position = "right"; // this line makes the axis to appear on the right
        valueAxis2.gridAlpha = 0;
        valueAxis2.axisThickness = 1;
        chart.addValueAxis(valueAxis2);
        
	var graph2 = new AmCharts.AmGraph();
        graph2.type = "line";
        graph2.title = "合同订单数量";
        graph2.valueField = "so_count"; 
        graph2.valueAxis = valueAxis2; 
        graph2.balloonText = "合同订单数量: [[value]]";
        graph2.lineThickness = 2;
        //graph2.bulletSize = 10;
        graph2.bullet = "round";
        graph2.showBalloon = true;
        graph2.lineColor = "#8BBA00";
        graph2.bulletBorderColor = "#8BBA00";
        graph2.bulletColor = "#ffffff";
        chart.addGraph(graph2);

        chart.write("chart");
	
    },'json');
    
}