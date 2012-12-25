package org.apache.jsp.WEB_002dINF.module.calendar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("</meta>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/default/easyui.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/icon.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui_update.css\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css.css\" />\r\n");
      out.write("<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/cupertino/theme.css' />\r\n");
      out.write("<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/fullcalendar.css' />\r\n");
      out.write("<link rel='stylesheet' type='text/css' href='resources/plugins/fullcalendar/fullcalendar.print.css' media='print' />\r\n");
      out.write("<script type='text/javascript' src='resources/plugins/fullcalendar/jquery-1.8.1.min.js'></script>\r\n");
      out.write("<script type='text/javascript' src='resources/plugins/fullcalendar/jquery-ui-1.8.23.custom.min.js'></script>\r\n");
      out.write("<script type='text/javascript' src='resources/plugins/fullcalendar/fullcalendar.min.js' charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/module/calendar/view.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrap\" class=\"p10\"  >\r\n");
      out.write("\t<div class=\"def_div\">\r\n");
      out.write("\t<span class=\"fl\">\r\n");
      out.write("\t查看范围：<select><option>所有日程安排</option></select>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t<span class=\"fr\" >\r\n");
      out.write("\t<a onclick=\"formsubmit('form_customview')\" href=\"javascript:void(0)\" iconcls=\"icon-share\" class=\"easyui-linkbutton l-btn\" id=\"\"><span class=\"l-btn-left\"><span class=\"l-btn-text icon-share\" style=\"padding-left: 20px;\">共享日程</span></span></a>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id='calendar' class=\"mgb_10\" ></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>    ");
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
