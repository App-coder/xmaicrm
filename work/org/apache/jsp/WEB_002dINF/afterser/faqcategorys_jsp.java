package org.apache.jsp.WEB_002dINF.afterser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faqcategorys_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/afterser/../common/config.jsp");
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
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" \tsrc=\"resources/desktop/afterser/faqcategorys.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("\t\t<div data-options=\"region:'north',border:false\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',border:false\" style=\"overflow: hidden\">\r\n");
      out.write("\t\t\t<table id=\"faqcategory_list\" data-options=\"fit:true,fitColumns:true\"></table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("   <div id=\"addCategory\" class=\"easyui-window\" ");
      out.print(win_topbar);
      out.write(" title=\"添加分类\">  \r\n");
      out.write("\t\t<div region=\"center\"  border=\"false\" class=\"bdcenter\">\r\n");
      out.write("\t\t\t\t<form method=\"post\" id=\"form_faqcategory\" >\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"action\" /> <input type=\"hidden\" name=\"id\"/>\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">上级分类:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input id=\"parentfaqcategoryid\" name=\"parentfaqcategoryid\" lines=\"true\" required=\"true\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">分类名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" \tname=\"faqcategoryname\" required=\"true\" validType=\"length[1,100]\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">排序：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"sortorder\" required=\"true\" max=\"9999\" validType=\"numbervalid\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0)\" onclick=\"addCategory();\">确定</a>\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0)\" onclick=\"closeWin('addCategory')\">取消</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("   </div>  \r\n");
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
