package org.apache.jsp.WEB_002dINF.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/public/../common/config.jsp");
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
      out.write("var entitytype = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entitytype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"resources/desktop/public/customview.js\"></script>\r\n");
      out.write("<div class=\"container\"  >\r\n");
      out.write("\t<div class=\"hidden\">\r\n");
      out.write("\t\t<div id=\"customview_edit\" iconCls=\"icon-save\" style=\"width: 800px; height: 480px;\" class=\"easyui-window\" ");
      out.print(win_topbar );
      out.write(" title=\"属性编辑\">\r\n");
      out.write("\t\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" class=\"bdcenter\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>基本信息</legend>\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>视图名称&nbsp;&nbsp;<input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>默认视图&nbsp;&nbsp;<input type=\"checkbox\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>首页关键视图列表中显示&nbsp;&nbsp;<input type=\"checkbox\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>公共视图&nbsp;&nbsp;<input type=\"checkbox\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>角色&nbsp;&nbsp;<select><option>财务总监</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>选择列表中显示字段 </legend>\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>选择列表中汇总字段</legend>\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>设置过滤条件</legend>\r\n");
      out.write("\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"easyui-tabs\" style=\"width:720px;\"  >\r\n");
      out.write("\t\t\t\t\t\t<div title=\"基本条件 \" class=\"p10\" >\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t设置查询条件以过滤视图列表：<br>\r\n");
      out.write("\t\t\t\t\t\t1)当时间段为自定义时，开始日期和结束日期将为指定的日期，例如2010-10-10。<br>\r\n");
      out.write("\t\t\t\t\t\t2)当时间段为非自定义时，开始日期和结束日期将为动态的日期，例如选择本周时，开始日期和结束日期将分别为本周的周一和周末，而不是固定的日期。<br>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>根据时间类型字段设置过滤条件</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">\r\n");
      out.write("\t\t\t\t\t\t\t选择查询字段\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"text\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">\r\n");
      out.write("\t\t\t\t\t\t\t选择时间段\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">\r\n");
      out.write("\t\t\t\t\t\t\t开始日期\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edittd\">\r\n");
      out.write("\t\t\t\t\t\t\t结束日期\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div title=\"高级条件 \" class=\"p10\" >\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t设置查询条件以过滤视图列表：<br>\r\n");
      out.write("\t\t\t\t\t\t1)你可以在第三列中使用or来输入多个条件。<br>\r\n");
      out.write("\t\t\t\t\t\t2)你至多可以输入10个条件，并以逗号分割。例如：CA, NY, TX, FL 查找CA 或 NY 或 TX 或 FL. <br>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>根据字段设置过滤条件</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><select class=\"text\"></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><select class=\"text\"></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"editpos()\">编辑</a> \r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"editpos()\">取消</a> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"customview_list\" data-options=\"fit:true,fitColumns:true\"></table>\r\n");
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
