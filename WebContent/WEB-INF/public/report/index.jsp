<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../head.jsp"%>
<!-- amchart -->
<script type="text/javascript" src="resources/amcharts/amcharts.js"></script>    
<%@ include file="../../common/config.jsp"%>
<script>
var graphtype = "${graphtype}";
var assemble = $.parseJSON('${assemble}') ;

var chartData = assemble.data.data;
//3d的柱状图 id="s_chart"
if(graphtype == 'vertical3D'){
	AmCharts.ready(function(){
	    	var chart = new AmCharts.AmSerialChart();
	        chart.dataProvider = chartData;
	        chart.categoryField = "categoryField";
	        chart.depth3D = 20;
	        chart.angle = 30;

	        var categoryAxis = chart.categoryAxis;
	        categoryAxis.labelRotation = 90;
	        categoryAxis.dashLength = 5;
	        categoryAxis.gridPosition = "start";

	        chart.addTitle("${title}");

	        var graph = new AmCharts.AmGraph();
	        graph.valueField = "valueField";
	        graph.colorField = "colorField";
	        graph.balloonText = "[[category]]: [[value]]";
	        graph.type = "column";
	        graph.lineAlpha = 0;
	        graph.fillAlphas = 1;
	        chart.addGraph(graph);
	        
	        chart.write("reportchart"); 
	});
}else if(graphtype == 'vertical2D'){
    //2d柱状图
    AmCharts.ready(function () {
        chart = new AmCharts.AmSerialChart();
        chart.dataProvider = chartData;
        chart.categoryField = "categoryField";
        chart.startDuration = 1;
        
        var categoryAxis = chart.categoryAxis;
        categoryAxis.labelRotation = 90;
        categoryAxis.gridPosition = "start";
        
        chart.addTitle("${title}");

        var graph = new AmCharts.AmGraph();
        graph.valueField = "valueField";
        graph.balloonText = "[[category]]: [[value]]";
        graph.type = "column";
        graph.lineAlpha = 0;
        graph.fillAlphas = 0.8;
        chart.addGraph(graph);

        chart.write("reportchart"); 
    });
}else if(graphtype == "Line2D"){
    
    AmCharts.ready(function () {
        chart = new AmCharts.AmSerialChart();
        chart.dataProvider = chartData;
        chart.categoryField = "categoryField";
        
        chart.addTitle("${title}");
        
        var categoryAxis = chart.categoryAxis;
        categoryAxis.minPeriod = "DD";
        
        var valueAxis = new AmCharts.ValueAxis();
        valueAxis.inside = true;
        valueAxis.tickLength = 0;
        valueAxis.axisAlpha = 0;
        chart.addValueAxis(valueAxis);

        var graph = new AmCharts.AmGraph();
        graph.dashLength = 3;
        graph.lineColor = "#7717D7";
        graph.valueField = "valueField";
        graph.dashLength = 3;
        graph.bullet = "round";
        chart.addGraph(graph);

        var chartCursor = new AmCharts.ChartCursor();
        chartCursor.cursorAlpha = 0;
        chart.addChartCursor(chartCursor);

        chart.write("reportchart"); 
    });
}else if(graphtype=='Pie3D'){
    //3D饼图
    AmCharts.ready(function () {
        // PIE CHART
        chart = new AmCharts.AmPieChart();
        chart.dataProvider = chartData;
        chart.titleField = "categoryField";
        chart.valueField = "valueField";
        chart.outlineColor = "#FFFFFF";
        chart.outlineAlpha = 0.8;
        chart.outlineThickness = 2;
        
        chart.addTitle("${title}");
        
        chart.depth3D = 15;
        chart.angle = 30;

        chart.write("reportchart");
    });
    
}else if(graphtype == 'Pie2D'){
    //2d饼图
    AmCharts.ready(function () {
        chart = new AmCharts.AmPieChart();
        chart.dataProvider = chartData;
        chart.titleField = "categoryField";
        chart.valueField = "valueField";
        chart.outlineColor = "#FFFFFF";
        chart.outlineAlpha = 0.8;
        chart.outlineThickness = 2;
        
        chart.addTitle("${title}");

        chart.write("reportchart");
    });
}
</script>
</head>
<body id="wrap">
<div class="easyui-tabs">
	<div title="报表图形" class="p10">
		<div id="reportchart" style="width:100%;height:379px;"></div>
	</div>
	<div title="报表数据" class="p10">
		<table class="reporttab">
			<thead>
				<th colspan="2">
					${title}
				</th>
			</thead>
			<tbody>
				<tr>
					<td>${reporttext}</td>
					<td>${grouptitle}</td>
				</tr>
				<c:forEach items="${assembleobj.picklist }" var="p" >
					<tr>
						<td width="50%">${p.colvalue }</td>
						<c:set var="exist" value="false"></c:set>
						<c:forEach items="${assembleobj.data.data }" var="d">
							<c:if test="${d.categoryField == p.colvalue }">
								<td>${d.valueField }</td>
								<c:set var="exist" value="true"></c:set>
							</c:if>
						</c:forEach>
						<c:if test="${exist == false }">
							<td width="50%">0</td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>
