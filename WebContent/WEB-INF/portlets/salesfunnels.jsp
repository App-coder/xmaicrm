<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../head_portlets.jsp"%>
</head>
<script type="text/javascript">
$(function(){
	var xmlstr = '<chart isSliced="0" slicingDistance="0" decimalPrecision="0">';
	xmlstr +='<set name="Selected" value="41" color="99CC00" alpha="85" />';
	xmlstr +='<set name="Tested" value="84" color="333333" alpha="85" /> ';
	xmlstr +='<set name="Interviewed" value="126" color="99CC00" alpha="85" />';
	xmlstr +='<set name="Candidates Applied" value="180" color="333333" alpha="85" />';
	xmlstr +='</chart>';
	 var charts = new FusionCharts("resources/fusionchart/Funnel.swf", "ChartId", "100%", "252");
	charts.setDataXML(xmlstr);
	charts.render("chart");
});
</script>
<body>
<div id="chart"></div>
</body>
</html>