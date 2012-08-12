package org.apache.jsp.WEB_002dINF.potential;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("    var potential_columns = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dview}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"resources/desktop/potential/index.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"hidden\">\r\n");
      out.write("\t\t<div id=\"potential_m1\" style=\"width:100px;\">\r\n");
      out.write("\t\t\t<div data-options=\"iconCls:'icon-add'\" >创建视图</div>\r\n");
      out.write("\t\t\t<div data-options=\"iconCls:'icon-edit'\" >编辑</div>\r\n");
      out.write("\t\t\t<div data-options=\"iconCls:'icon-remove'\" >删除</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("\t\t<div data-options=\"region:'north',border:false\">\r\n");
      out.write("\t\t\t<div class=\"d_view \">\r\n");
      out.write("\t\t\t\t<span class=\"icon-filter view_span\" >视图：</span>\r\n");
      out.write("\t\t\t\t<select class=\"sel_120\"><option>所有</option><option>初期沟通</option></select>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-menubutton\" data-options=\"menu:'#potential_m1',iconCls:'icon-edit'\">管理</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',border:false\"\r\n");
      out.write("\t\t\tstyle=\"overflow: hidden\">\r\n");
      out.write("\t\t\t<table id=\"potential_list\" data-options=\"fit:true,fitColumns:true\"></table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'south',border:false\">\r\n");
      out.write("\t\t\t<div class=\"d_report \">\r\n");
      out.write("\t\t\t\t<span class=\"icon-report view_span\" >报表：</span>\r\n");
      out.write("\t\t\t\t<select class=\"sel_120\"><option>所有</option><option>初期沟通</option></select>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'icon-view'\">预览</a>\r\n");
      out.write("\t\t\t</div>\r\n");
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
