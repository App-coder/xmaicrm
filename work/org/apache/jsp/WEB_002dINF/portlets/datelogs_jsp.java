package org.apache.jsp.WEB_002dINF.portlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class datelogs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/portlets/../head_portlets.jsp");
    _jspx_dependants.add("/WEB-INF/tld/jstl/fn.tld");
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
      out.write("\r\n");

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>\r\n");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/portlets.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui_update.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/amcharts/amcharts.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/fusionchart/FusionCharts.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("<!-- loadmask -->\r\n");
      out.write("<link href=\"resources/plugins/loadmask/jquery.loadmask.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/loadmask/jquery.loadmask.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>    \r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/portlets.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table class=\"tabcalendar\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"background-color: #003300;text-align: left;\" class=\"ml_5\" width=\"25%\" >日/周/月报</td>\r\n");
      out.write("\t\t\t<td width=\"25%\" >日</td>\r\n");
      out.write("\t\t\t<td width=\"25%\" >周</td>\r\n");
      out.write("\t\t\t<td width=\"25%\" >月</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tdesc\">写<img width=\"16\" height=\"16\" border=\"0\" align=\"AbsBottom\" src=\"resources/images/portlets/rep01.png\" >：</td>\r\n");
      out.write("\t\t\t\t<td><img width=\"16\" height=\"16\" border=\"0\" src=\"resources/images/portlets/editlog.png\" alt=\"点击写日报\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"16\" height=\"16\" border=\"0\" src=\"resources/images/portlets/editlog.png\" alt=\"点击写日报\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"16\" height=\"16\" border=\"0\" src=\"resources/images/portlets/editlog.png\" alt=\"点击写日报\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tdesc\">看下级<img border=\"0\" align=\"AbsBottom\" src=\"resources/images/portlets/rep02.png\" >：</td>\r\n");
      out.write("\t\t\t\t<td>查看</td>\r\n");
      out.write("\t\t\t\t<td>查看</td>\r\n");
      out.write("\t\t\t\t<td>查看</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tdesc\">提交情况<img border=\"0\" align=\"AbsBottom\" src=\"resources/images/portlets/rep05.png\" style=\"margin: 1px;\">：</td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tdesc\">汇总<img border=\"0\" align=\"AbsBottom\" src=\"resources/images/portlets/rep04.png\" style=\"margin: 1px;\">：</td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t\t<td><img width=\"14\" height=\"14\" border=\"0\" src=\"resources/images/portlets/pe2.png\" alt=\"点击查看日报情况\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
