package org.apache.jsp.WEB_002dINF.potential;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class performances_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/potential/performances.js\"></script>\r\n");
      out.write("<div class=\"container\"  >\r\n");
      out.write("\t<table id=\"performances_list\" title=\"员工绩效\" toolbar=\"#performances_tb\" ></table>\r\n");
      out.write("\t<div id=\"performances_tb\" class=\"gtb\" style=\"display: block;\" >  \r\n");
      out.write("\t    <span>查看范围：</span>  \r\n");
      out.write("\t    <select class=\"tipt\" ></select>&nbsp;&nbsp;<select class=\"tipt\" ></select>  \r\n");
      out.write("\t    <span>开始日期：</span>  \r\n");
      out.write("\t   \t<select class=\"tipt\" ></select>  \r\n");
      out.write("\t    <span>结束日期：</span>  \r\n");
      out.write("\t   \t<select class=\"tipt\" ></select>  \r\n");
      out.write("\t    <a class=\"easyui-linkbutton\" title=\"查询\" id=\"btn_search\" iconCls=\"icon-search\" plain=\"true\" onclick=\"doSearch()\" ></a>\r\n");
      out.write("\t</div>  \r\n");
      out.write("\t<div class=\"easyui-tabs\" style=\"margin-top:10px;\" >  \r\n");
      out.write("        <div title=\"客户\" class=\"p10\" >  \r\n");
      out.write("           \t<table id=\"performances_customer\" ></table>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div title=\"日程安排\" class=\"p10\">  \r\n");
      out.write("             <table id=\"performances_schedule\" ></table>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div title=\"联系记录\" class=\"p10\">  \r\n");
      out.write("            <table id=\"performances_contact\" ></table>\r\n");
      out.write("        </div> \r\n");
      out.write("        <div title=\"销售机会\" class=\"p10\">  \r\n");
      out.write("           <table id=\"performances_sale\" ></table>  \r\n");
      out.write("        </div> \r\n");
      out.write("        <div title=\"报价单\" class=\"p10\">  \r\n");
      out.write("           <table id=\"performances_quote\" ></table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div title=\"合同订单\" class=\"p10\" >  \r\n");
      out.write("           <table id=\"performances_order\" ></table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div title=\"应收款\" class=\"p10\" >  \r\n");
      out.write("            <table id=\"performances_account\" ></table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>  \r\n");
      out.write("    <p style=\"margin-top:10px;\" class=\"p_tip\">\r\n");
      out.write("    <span class=\"red\">*</span>排序：点击标题即可根据标题排序<br>\r\n");
      out.write("    <span class=\"red\">*</span>期初客户：开始日期之前创建的客户<br>\r\n");
      out.write("    <span class=\"red\">*</span>新客户：开始日期和结束日期之间创建的客户<br>\r\n");
      out.write("    <span class=\"red\">*</span>完成活动：开始日期和结束日期之间创建并完成的日程安排<br>\r\n");
      out.write("    <span class=\"red\">*</span>销售机会：开始日期和结束日期之间预计完成的销售机会<br>\r\n");
      out.write("    <span class=\"red\">*</span>合同金额：开始日期和结束日期之间签约并审批通过的合同订单的总金额<br>\r\n");
      out.write("    <span class=\"red\">*</span>已收款：开始日期和结束日期之间已经收取的应收款<br>\r\n");
      out.write("    </p>\t\r\n");
      out.write("</div>\r\n");
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
