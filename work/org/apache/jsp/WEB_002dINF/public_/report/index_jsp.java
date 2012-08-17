package org.apache.jsp.WEB_002dINF.public_.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/public/report/../../header.jsp");
    _jspx_dependants.add("/WEB-INF/public/report/../../common/commonjs.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"http://localhost:8080/xmaicrm/\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webtitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui_update.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- loadmask -->\r\n");
      out.write("<link href=\"resources/plugins/loadmask/jquery.loadmask.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/loadmask/jquery.loadmask.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script src=\"resources/amcharts/amcharts.js\" type=\"text/javascript\"></script>        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var chart;\r\n");
      out.write("            var chartData = [];\r\n");
      out.write("\r\n");
      out.write("            AmCharts.ready(function () {\r\n");
      out.write("                // generate some random data first   \r\n");
      out.write("                generateChartData();\r\n");
      out.write("\r\n");
      out.write("                // SERIAL CHART\r\n");
      out.write("                chart = new AmCharts.AmSerialChart();\r\n");
      out.write("                chart.pathToImages = \"../amcharts/images/\";\r\n");
      out.write("                chart.marginLeft = 0;\r\n");
      out.write("                chart.marginRight = 0;\r\n");
      out.write("                chart.marginTop = 0;\r\n");
      out.write("                chart.dataProvider = chartData;\r\n");
      out.write("                chart.categoryField = \"date\";\r\n");
      out.write("\r\n");
      out.write("                // AXES\r\n");
      out.write("                // category\r\n");
      out.write("                var categoryAxis = chart.categoryAxis;\r\n");
      out.write("                categoryAxis.parseDates = true; // as our data is date-based, we set parseDates to true\r\n");
      out.write("                categoryAxis.minPeriod = \"DD\"; // our data is daily, so we set minPeriod to DD\r\n");
      out.write("                // value axis\r\n");
      out.write("                var valueAxis = new AmCharts.ValueAxis();\r\n");
      out.write("                valueAxis.inside = true;\r\n");
      out.write("                valueAxis.tickLength = 0;\r\n");
      out.write("                valueAxis.axisAlpha = 0;\r\n");
      out.write("                valueAxis.minimum = 100;\r\n");
      out.write("                valueAxis.maximum = 140;\r\n");
      out.write("                chart.addValueAxis(valueAxis);\r\n");
      out.write("\r\n");
      out.write("                // GRAPH\r\n");
      out.write("                var graph = new AmCharts.AmGraph();\r\n");
      out.write("                graph.dashLength = 3;\r\n");
      out.write("                graph.lineColor = \"#7717D7\";\r\n");
      out.write("                graph.valueField = \"visits\";\r\n");
      out.write("                graph.dashLength = 3;\r\n");
      out.write("                graph.bullet = \"round\";\r\n");
      out.write("                chart.addGraph(graph);\r\n");
      out.write("\r\n");
      out.write("                // CURSOR\r\n");
      out.write("                var chartCursor = new AmCharts.ChartCursor();\r\n");
      out.write("                chartCursor.cursorAlpha = 0;\r\n");
      out.write("                chart.addChartCursor(chartCursor);\r\n");
      out.write("\r\n");
      out.write("                // GUIDES are used to create horizontal range fills\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 0;\r\n");
      out.write("                guide.toValue = 105;\r\n");
      out.write("                guide.fillColor = \"#CC0000\";\r\n");
      out.write("                guide.fillAlpha = 0.2;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 105;\r\n");
      out.write("                guide.toValue = 110;\r\n");
      out.write("                guide.fillColor = \"#CC0000\";\r\n");
      out.write("                guide.fillAlpha = 0.15;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 110;\r\n");
      out.write("                guide.toValue = 115;\r\n");
      out.write("                guide.fillColor = \"#CC0000\";\r\n");
      out.write("                guide.fillAlpha = 0.1;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 115;\r\n");
      out.write("                guide.toValue = 120;\r\n");
      out.write("                guide.fillColor = \"#CC0000\";\r\n");
      out.write("                guide.fillAlpha = 0.05;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 120;\r\n");
      out.write("                guide.toValue = 125;\r\n");
      out.write("                guide.fillColor = \"#0000cc\";\r\n");
      out.write("                guide.fillAlpha = 0.05;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 125;\r\n");
      out.write("                guide.toValue = 130;\r\n");
      out.write("                guide.fillColor = \"#0000cc\";\r\n");
      out.write("                guide.fillAlpha = 0.1;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 130;\r\n");
      out.write("                guide.toValue = 135;\r\n");
      out.write("                guide.fillColor = \"#0000cc\";\r\n");
      out.write("                guide.fillAlpha = 0.15;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                var guide = new AmCharts.Guide();\r\n");
      out.write("                guide.value = 135;\r\n");
      out.write("                guide.toValue = 140;\r\n");
      out.write("                guide.fillColor = \"#0000cc\";\r\n");
      out.write("                guide.fillAlpha = 0.2;\r\n");
      out.write("                guide.lineAlpha = 0;\r\n");
      out.write("                valueAxis.addGuide(guide);\r\n");
      out.write("\r\n");
      out.write("                // WRITE\r\n");
      out.write("                chart.write(\"s_chart\");\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // generate some random data\r\n");
      out.write("            function generateChartData() {\r\n");
      out.write("                var firstDate = new Date();\r\n");
      out.write("                firstDate.setDate(firstDate.getDate() - 10);\r\n");
      out.write("\r\n");
      out.write("                for (var i = 0; i < 10; i++) {\r\n");
      out.write("                    var newDate = new Date(firstDate);\r\n");
      out.write("                    newDate.setDate(newDate.getDate() + i);\r\n");
      out.write("\r\n");
      out.write("                    var visits = Math.round(Math.random() * 40) + 100;\r\n");
      out.write("\r\n");
      out.write("                    chartData.push({\r\n");
      out.write("                        date: newDate,\r\n");
      out.write("                        visits: visits\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wtop\">\r\n");
      out.write("\t\t显示类型：<select name=\"graphtype\" class=\"text\">\r\n");
      out.write("\t\t\t<option value=\"vertical3D\">3D柱图</option>\r\n");
      out.write("\t\t\t<option selected=\"\" value=\"vertical2D\">2D柱图</option>\r\n");
      out.write("\t\t\t<option value=\"Line2D\">折线图</option>\r\n");
      out.write("\t\t\t<option value=\"Pie3D\">3D饼图</option>\r\n");
      out.write("\t\t\t<option value=\"Pie2D\">2D饼图</option>\r\n");
      out.write("\t\t</select>&nbsp;&nbsp;统计项目：<select name=\"grouptype\" class=\"text\">\r\n");
      out.write("\t\t\t<option selected=\"\" value=\"count\">记录数</option>\r\n");
      out.write("\t\t\t<option value=\"订单数量;ordernum;ec_account;ordernum\">订单数量</option>\r\n");
      out.write("\t\t\t<option value=\"订单金额;ordertotal;ec_account;ordertotal\">订单金额</option>\r\n");
      out.write("\t\t</select>&nbsp;&nbsp;<a href=\"#\" iconCls=\"icon-view\" class=\"easyui-linkbutton\">预览</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"easyui-tabs\">\r\n");
      out.write("\t\t<div title=\"报表图形\" class=\"p10\">\r\n");
      out.write("\t\t\t<div id=\"s_chart\" style=\"width: 100%; height: 362px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"报表数据\" class=\"p10\">tab2</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
