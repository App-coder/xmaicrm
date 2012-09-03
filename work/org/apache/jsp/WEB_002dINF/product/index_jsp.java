package org.apache.jsp.WEB_002dINF.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/product/../common/config.jsp");
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
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/product/index.js\"></script>\r\n");
      out.write("<div class=\"container\"  >\r\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("\t\t<div data-options=\"region:'west',split:true,minimizable:false\" title=\"产品分类\" style=\"width:150px;\">\r\n");
      out.write("\t\t\t<ul id=\"tree_catalog\"  ></ul>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',title:'产品列表'\" style=\"overflow:hidden\" >\r\n");
      out.write("\t\t\t<table class=\"easyui-datagrid\" data-options=\"border:false,fit:true,fitColumns:true\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'itemid'\">产品名称</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'productid'\" >产品编码</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'listprice'\" >产品类别</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'unitcost'\" >型号</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'attr1'\">供应商名称</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'status'\" >单价</th>\r\n");
      out.write("\t\t\t\t\t\t<th data-options=\"field:'status'\" >总库存数量</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
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
