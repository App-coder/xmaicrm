package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(request.getContextPath() );
      out.write("/\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>新麦CRM&nbsp;-&nbsp;客户管理系统</title>\r\n");
      out.write("<link href=\"resources/login/css/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("function fleshVerify(){ \r\n");
      out.write("\t$('#verifyImg').attr('src', '/kaptcha.jpg?' + Math.floor(Math.random()*100) ); \r\n");
      out.write("}\r\n");
      out.write("function submit(){\r\n");
      out.write("    var userName = $(\"#userName\").val();\r\n");
      out.write("    var userPassword = $(\"#userPassword\").val();\r\n");
      out.write("    $.post('crm/welcome/login',{userName:userName,userPassword:userPassword},function(res){\r\n");
      out.write("\t\tif(res.type == true){\r\n");
      out.write("\t\t    window.location.href = \"crm/module/home/index\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#redtip\").html(res.message);\r\n");
      out.write("    },'json');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"logobanner\" style=\"height:150px;\">\r\n");
      out.write("\t<image src=\"resources/login/images/hbg.png\" height=\"150px;\" width=\"100%;\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"login\">\r\n");
      out.write("    <div id=\"login_content\">\r\n");
      out.write("    <div class=\"loginForm\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"userName\" id=\"userName\" value=\"admin\" autocomplete=\"false\" size=\"20\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"userPassword\" id=\"userPassword\" value=\"admin\" autocomplete=\"false\" size=\"20\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"verify\" width=\"75px;\" autocomplete=\"false\" size=\"20\" class=\"login_input\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t<input class=\"login_btn sub\" type=\"button\" onclick=\"submit()\" name=\"form_submit\"   value=\" \" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span class=\"red\" id=\"redtip\"></span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"text-align: center;margin-bottom: 20px;color:#C2C2C2;\">\r\n");
      out.write("\t\tCopyright©2012. www.x-mai.com.        新麦软件工作室 All rights reserved.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
