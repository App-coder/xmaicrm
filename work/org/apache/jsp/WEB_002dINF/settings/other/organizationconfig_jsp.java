package org.apache.jsp.WEB_002dINF.settings.other;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class organizationconfig_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/settings/other/../../head.jsp");
    _jspx_dependants.add("/WEB-INF/settings/other/../../common/config.jsp");
    _jspx_dependants.add("/WEB-INF/settings/other/../../path.jsp");
    _jspx_dependants.add("/WEB-INF/settings/other/../../foot.jsp");
    _jspx_dependants.add("/WEB-INF/tld/jstl/fn.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>\r\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"resources/easyui/extension/validatebox.js\"></script>\r\n");
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
      out.write("var pathname = \"公司信息管理 \";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    var _spath = '");
      out.print(request.getContextPath());
      out.write("';\r\n");
      out.write("    var _loc = window.location.href;\r\n");
      out.write("    var _url = _loc.substring(_loc.indexOf(_spath)+_spath.length+1);\r\n");
      out.write("    $.post('crm/welcome/navbar',{pathname:pathname,url:_url,pArgs:typeof(pArgs)==\"undefined\"?\"\":pArgs},function(html){\r\n");
      out.write("\t\t$(\"#navpath\").html(html);\t\r\n");
      out.write("    },'html');\r\n");
      out.write("    \r\n");
      out.write("    $(\"#path_\"+pathActive).addClass(\"active\"); \r\n");
      out.write("   \r\n");
      out.write("});\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/settings/other/organizationconfig.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrap\">\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${navbar }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<div class=\"path\" id=\"navpath\"></div>\r\n");
      out.write("<form id=\"form_organization\" name=\"form_organization\" method=\"post\" >\r\n");
      out.write("<input type=\"hidden\" name=\"logo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.logo }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<table class=\"tab_editlist\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >公司名称</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"organizationname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.organizationname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >LOGO名称</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"logoname\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.logoname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >LOGO</td>\r\n");
      out.write("\t\t<td><input type=\"file\" id=\"imgFile\" name=\"imgFile\" class=\"text\"  size=\"30\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<img class=\"grayborder\" id=\"imgLogo\" width=\"150\" height=\"29\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.logo }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >地址</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.address }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >城市</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"city\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.city }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >省份</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"state\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.state }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >邮编</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.code }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >国家</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"country\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.country }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >电话</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.phone }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >传真</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"fax\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.fax }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >网站</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"website\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.website }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >法定代表人</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"person\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.person }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >开户银行</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"bankname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.bankname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >银行帐号</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"bankaccount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.bankaccount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" >税号</td>\r\n");
      out.write("\t\t<td><input type=\"text\" class=\"text easyui-validatebox\" data-options=\"required:true\" name=\"taxno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${details.taxno }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"edittd\" ><a class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\" onclick=\"organizationSubmit()\" >编辑</a></td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
      out.print(win_topbar);
      out.write(" title=\"手机短信\">\r\n");
      out.write("\t\t<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t\t\t<div title=\"发短信\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"edittd\" valign=\"top\">短信账号</td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\"><textarea style=\"height: 78px;\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\" style=\"width: 100px;\" rowspan=\"2\"><a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton mgb_5\" width=\"90px\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"formsubmit('form_customview')\">选择联系人</a><br> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton mgb_5\" width=\"90px\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"formsubmit('form_customview')\">选择用户</a><br> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton mgb_5\" width=\"90px\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"formsubmit('form_customview')\">选择供应商</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"edittd\" valign=\"top\">短信内容</td>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\"><textarea style=\"height: 78px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td>你还能输入:<span class=\"red\">65</span>个字...\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><a class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\t\t\ticonCls=\"icon-ok\" href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"formsubmit('form_customview')\">发送</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton fr\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_customview')\">测试发送给自己</a>\r\n");
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
      out.write("\t\t\t\t\t\t<td class=\"edittd\">余额</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wind_approve\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 700px; height: 432px;\" class=\"easyui-window p10\"\r\n");
      out.write("\t\t");
      out.print(win_topbar);
      out.write(" title=\"我的审批中心\">\r\n");
      out.write("\t\t<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t\t\t<div title=\"未审批\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table id=\"willapprove\"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"已审批\" class=\"p10\">\r\n");
      out.write("\t\t\t\t<table id=\"hasapprove\"></table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wind_remind\" iconCls=\"icon-save\"\r\n");
      out.write("\t\tstyle=\"width: 700px; height: 432px;\" class=\"easyui-window p10\"\r\n");
      out.write("\t\t");
      out.print(win_topbar);
      out.write(" title=\"自定义提醒\">\r\n");
      out.write("\t\t\t\t<table class=\"tab_form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-search\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_customview')\">立即查找</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"formsubmit('form_customview')\">创建提醒</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"easyui-tabs\" style=\"height:345px;\" >\r\n");
      out.write("\t\t\t\t\t<div title=\"运行中\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"runremind\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div title=\"已结束\" class=\"p10\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"overremind\"></table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/settings/other/../../head.jsp(16,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptb!=null&&tab!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERPERMISSION.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;-&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptb.parenttabLabel }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;-&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tab.tablabel }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;-&nbsp;新麦CRM&nbsp;-&nbsp;企业客户管理系统领跑者\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERPERMISSION.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;-&nbsp;新麦CRM&nbsp;-&nbsp;企业客户管理系统领跑者\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
