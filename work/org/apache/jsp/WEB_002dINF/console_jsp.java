package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class console_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/header.jsp");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/js/index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bodycontainer\" class=\"easyui-layout\">\r\n");
      out.write("\t<div region=\"north\" style=\"height:66px; overflow: hidden;\"\r\n");
      out.write("\t\tclass=\"headerNav\" border=\"false\" >\r\n");
      out.write("\t\t<a class=\"logo\"></a>\r\n");
      out.write("\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t<li><a>修改密码</a></li>\r\n");
      out.write("\t\t\t<li><a>修改资料</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"admin/webmaster/loginout\">退出</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"navMenu\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" id=\"mb1\" class=\"easyui-menubutton\" data-options=\"menu:'#mm1',iconCls:'icon-edit'\">Edit</a>\r\n");
      out.write("\t\t<a href=\"javascript:void(0)\" id=\"mb2\" class=\"easyui-menubutton\" data-options=\"menu:'#mm2',iconCls:'icon-help'\">Help</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"south\" class=\"footercss\" \r\n");
      out.write("\t\tstyle=\"height:40px;\" border=\"false\" >\r\n");
      out.write("\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\"\r\n");
      out.write("\t\t\tstyle=\"padding: 8px 20px;\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\" class=\"small\"><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: rgb(153, 153, 153);\">Powered by 新麦 CRM <span\r\n");
      out.write("\t\t\t\t\t\t\tid=\"_vtiger_product_version_\">2.0</span></span></td>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" class=\"small\"><span>&copy; 2012-2014\r\n");
      out.write("\t\t\t\t\t\t\t<a target=\"_blank\" href=\"http://www.x-mai.com\">x-mai.com</a>\r\n");
      out.write("\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"center\" style=\"overflow: hidden;\" border=\"false\" >\r\n");
      out.write("\t\t<div id=\"tabs\" tools=\"#tab-tools\" fit=\"true\" border=\"false\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"tab-tools\">\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" plain=\"true\" title=\"页面重载\"\r\n");
      out.write("\t\t\ticonCls=\"icon-reload\" onclick=\"javascript:reloadTab()\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"mm\" class=\"easyui-menu\" style=\"width:150px;\">\r\n");
      out.write("\t\t<div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("\t\t<div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t<div id=\"mm-exit\">退出</div>\r\n");
      out.write("\t</div>\r\n");
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
