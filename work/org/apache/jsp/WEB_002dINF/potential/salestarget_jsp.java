package org.apache.jsp.WEB_002dINF.potential;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salestarget_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/potential/../common/config.jsp");
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

String win_topbar = "closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"false\" minimizable=\"false\" maximizable=\"false\" inline=\"false\" resizable=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"resources/desktop/potential/salestarget.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"container panel-noscroll\">\r\n");
      out.write("\t\t<div class=\"panel datagrid\">\r\n");
      out.write("\t\t\t<div class=\"panel-header\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-title\">销售目标</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-tool\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"datagrid-wrap panel-body\">\r\n");
      out.write("\t\t\t\t<div style=\"display: block;\" class=\"gtb datagrid-toolbar\"\r\n");
      out.write("\t\t\t\t\tid=\"serialnumbers_tb\">\r\n");
      out.write("\t\t\t\t\t<span>查看范围：</span> <input class=\"tipt\"> <span>年份：</span> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"tipt\"> <span>销售指标：</span> <select class=\"tipt\"></select>\r\n");
      out.write("\t\t\t\t\t <a onclick=\"doSearch()\" plain=\"true\" id=\"btn_search\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-linkbutton \">目标查看</a><a onclick=\"doSearch()\" plain=\"true\" id=\"btn_search\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-linkbutton \">目标设置</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datagrid-view p10\">\r\n");
      out.write("\t<p class=\"p_tip\">\r\n");
      out.write("\t提示:<br>\r\n");
      out.write("    1.目标值由人工设置，完成值由系统自动统计得出。<br>\r\n");
      out.write("    2.点击目标查看按钮可查看销售目标的完成情况，点击目标设置按钮可设置销售目标。<br>\r\n");
      out.write("    3.销售目标查看:（金额单位：元；客户数单位：个）<br>\r\n");
      out.write("    4.回款额表示已收取的应收款，根据收款日期计算。销售额表示审批通过而且没有撤单的合同订单金额，根据签约日期计算。客户数是表示负责的客户数，根据创建日期计算。<br>\r\n");
      out.write("    </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
