package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class desktop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/head.jsp");
    _jspx_dependants.add("/WEB-INF/common/config.jsp");
    _jspx_dependants.add("/WEB-INF/path.jsp");
    _jspx_dependants.add("/WEB-INF/foot.jsp");
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
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui_update.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JSON插件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/lib/JSONUtil.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- easyuipack.js 补充拓展 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/easyuipack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- loadmask -->\r\n");
      out.write("<link href=\"resources/plugins/loadmask/jquery.loadmask.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/loadmask/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("<!-- 菜单 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/prodrop/pro_drop.css\" />\r\n");
      out.write("<script src=\"resources/prodrop/stuHover.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 表单验证 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/lib/checkvalidate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 文件上传 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/ajaxfileupload.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String win_topbar = "resizable=\"false\"  closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"true\" minimizable=\"false\" maximizable=\"false\" inline=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var pathname = \"工作台\";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    var _spath = '");
      out.print(request.getContextPath());
      out.write("';\r\n");
      out.write("    var _loc = window.location.href;\r\n");
      out.write("    var _url = _loc.substring(_loc.indexOf(_spath)+_spath.length+1);\r\n");
      out.write("    $.post('crm/welcome/navbar',{pathname:pathname,url:_url},function(html){\r\n");
      out.write("\t\t$(\"#navpath\").html(html);\t\r\n");
      out.write("    },'html');\r\n");
      out.write("});\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!-- portal页面的引用 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/plugins/portal/portal.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/portal/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/desktop.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrap\">\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${navbar }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("<div id=\"main\" >\r\n");
      out.write("<div class=\"path\" >&gt;<a  href=\"crm/welcome/desktop\">工作台</a></div>\r\n");
      out.write("<div id=\"desktop\" >\r\n");
      out.write("\t<div style=\"width:33%;\">\r\n");
      out.write("\t\t<div title=\"Clock\" style=\"text-align:center;background:#f3eeaf;height:150px;padding:5px;\">\r\n");
      out.write("\t\t\t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0\" width=\"100\" height=\"100\">\r\n");
      out.write("\t\t      <param name=\"movie\" value=\"http://www.respectsoft.com/onlineclock/analog.swf\">\r\n");
      out.write("\t\t      <param name=quality value=high>\r\n");
      out.write("\t\t      <param name=\"wmode\" value=\"transparent\">\r\n");
      out.write("\t\t      <embed src=\"http://www.respectsoft.com/onlineclock/analog.swf\" width=\"100\" height=\"100\" quality=high pluginspage=\"http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" wmode=\"transparent\"></embed>\r\n");
      out.write("\t\t    </object>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div title=\"Tutorials\" collapsible=\"true\" closable=\"true\" style=\"height:200px;padding:5px;\">\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/datagrid/datagrid1.php\">Build border layout for Web Pages</a></div>\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/layout/panel.php\">Complex layout on Panel</a></div>\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/layout/accordion.php\">Create Accordion</a></div>\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/layout/tabs.php\">Create Tabs</a></div>\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/layout/tabs2.php\">Dynamically add tabs</a></div>\r\n");
      out.write("\t    \t<div class=\"t-list\"><a href=\"http://www.jeasyui.com/tutorial/layout/panel2.php\">Create XP style left panel</a></div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width:34%;\">\r\n");
      out.write("\t\t<div id=\"pgrid\" title=\"DataGrid\" closable=\"true\" style=\"height:200px;\">\r\n");
      out.write("\t\t\t<table class=\"easyui-datagrid\" style=\"width:650px;height:auto\"\r\n");
      out.write("\t\t\t\t\tfit=\"true\" border=\"false\"\r\n");
      out.write("\t\t\t\t\tsingleSelect=\"true\"\r\n");
      out.write("\t\t\t\t\tidField=\"itemid\" url=\"datagrid_data.json\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"itemid\" width=\"60\">Item ID</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"productid\" width=\"60\">Product ID</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"listprice\" width=\"80\" align=\"right\">List Price</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"unitcost\" width=\"80\" align=\"right\">Unit Cost</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"attr1\" width=\"120\">Attribute</th>\r\n");
      out.write("\t\t\t\t\t\t<th field=\"status\" width=\"50\" align=\"center\">Status</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width:33%;\">\r\n");
      out.write("\t\t<div title=\"Searching\" iconCls=\"icon-search\" closable=\"true\" style=\"height:80px;padding:10px;\">\r\n");
      out.write("\t\t\t<input class=\"easyui-searchbox\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Searching\" iconCls=\"icon-search\" closable=\"true\" style=\"height:80px;padding:10px;\">\r\n");
      out.write("\t\t\t<input class=\"easyui-searchbox\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Searching\" iconCls=\"icon-search\" closable=\"true\" style=\"height:80px;padding:10px;\">\r\n");
      out.write("\t\t\t<input class=\"easyui-searchbox\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Searching\" iconCls=\"icon-search\" closable=\"true\" style=\"height:80px;padding:10px;\">\r\n");
      out.write("\t\t\t<input class=\"easyui-searchbox\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Searching\" iconCls=\"icon-search\" closable=\"true\" style=\"height:80px;padding:10px;\">\r\n");
      out.write("\t\t\t<input class=\"easyui-searchbox\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Graph\" closable=\"true\" style=\"height:200px;text-align:center;\">\r\n");
      out.write("\t\t\t<img height=\"160\" src=\"http://knol.google.com/k/-/-/3mudqpof935ww/ip4n5y/web-graph.png\"></img>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"div_foot\" class=\"footercss\">\r\n");
      out.write("\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\"\r\n");
      out.write("\t\tstyle=\"padding: 8px 20px; display: table; height: 40px;\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" class=\"small\"><span\r\n");
      out.write("\t\t\t\t\tstyle=\"color: rgb(153, 153, 153);\">Powered by 新麦 CRM <span\r\n");
      out.write("\t\t\t\t\t\tid=\"_vtiger_product_version_\">2.0</span></span></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\" class=\"small\"><span>&copy; 2012-2014 <a\r\n");
      out.write("\t\t\t\t\t\thref=\"http://www.x-mai.com\" target=\"_blank\">x-mai.com</a>\r\n");
      out.write("\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"hidden\">\r\n");
      out.write("\t<div id=\"wind_msg\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 700px; height: 432px;\" class=\"easyui-window p10\"\r\n");
      out.write("\t\t");
      out.print(win_topbar );
      out.write(" title=\"手机短信\">\r\n");
      out.write("\t\t<div  class=\"easyui-tabs\" fit=\"true\" >\r\n");
      out.write("\t\t\t<div title=\"发短信\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"edittd\" valign=\"top\">短信账号</td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\"><textarea style=\"height:78px;\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\" style=\"width:100px;\" rowspan=\"2\" >\r\n");
      out.write("\t\t\t\t\t\t<a class=\"easyui-linkbutton mgb_5\" width=\"90px\" onclick=\"formsubmit('form_customview')\">选择联系人</a><br>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"easyui-linkbutton mgb_5\" width=\"90px\" onclick=\"formsubmit('form_customview')\">选择用户</a><br>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"easyui-linkbutton mgb_5\" width=\"90px\" onclick=\"formsubmit('form_customview')\">选择供应商</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"edittd\" valign=\"top\">短信内容</td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\" >\r\n");
      out.write("\t\t\t\t\t\t\t<textarea style=\"height:78px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td>你还能输入:<span class=\"red\">65</span>个字...</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_customview')\">发送</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"easyui-linkbutton fr\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_customview')\">测试发送给自己</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"收件箱\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table id=\"messagelist\"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"查看余额\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"edittd\" >余额</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wind_approve\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 700px; height: 432px;\" class=\"easyui-window p10\"\r\n");
      out.write("\t\t");
      out.print(win_topbar );
      out.write(" title=\"我的审批中心\"></div>\r\n");
      out.write("\t<div id=\"wind_remind\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 700px; height: 432px;\" class=\"easyui-window p10\"\r\n");
      out.write("\t\t");
      out.print(win_topbar );
      out.write(" title=\"自定义提醒\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/foot.js\"></script>\r\n");
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
