package org.apache.jsp.WEB_002dINF.module.maillist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/module/maillist/../../head.jsp");
    _jspx_dependants.add("/WEB-INF/module/maillist/../../common/config.jsp");
    _jspx_dependants.add("/WEB-INF/module/maillist/../../foot.jsp");
    _jspx_dependants.add("/WEB-INF/tld/jstl/fn.tld");
    _jspx_dependants.add("/WEB-INF/tld/oscache/oscache.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcache_005fcache;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcache_005fcache = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fcache_005fcache.release();
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
      out.write(" ");
      if (_jspx_meth_cache_005fcache_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String win_topbar = "resizable=\"false\"  closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"true\" minimizable=\"false\" maximizable=\"false\" inline=\"false\"";
String win_bar_1 = "resizable=\"false\"  closed=\"true\" modal=\"false\" collapsible=\"false\"  draggable=\"true\" minimizable=\"false\" maximizable=\"false\" inline=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".swfupload{float:left;}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var module = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entitytype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- 文件上传 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/swfupload/swfupload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/swfupload/handler.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/swfupload/swfupload.css\"></script>\r\n");
      out.write("\r\n");
      out.write("<script charset=\"utf-8\" src=\"resources/plugins/kindeditor/kindeditor.js\"></script>\r\n");
      out.write("<script charset=\"utf-8\" src=\"resources/plugins/kindeditor/lang/zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/module/maillist/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrap\">\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${navbar }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"navpath\" class=\"path\">\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptb.parenttabLabel }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&gt;<a href=\"crm/module/qunfas/index?ptb=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ptb.parenttabid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tab.tablabel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table id=\"tablist\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"hidden\" >\r\n");
      out.write("\t\t<div id=\"wind_mail\"  iconCls=\"icon-sendemail\"\r\n");
      out.write("\t\t\tstyle=\"width:800px; height:494px;\" class=\"easyui-window \"\r\n");
      out.write("\t\t\t");
      out.print(win_topbar);
      out.write(" title=\"群发邮件\" >\r\n");
      out.write("\t\t\t<div class=\"easyui-layout\" data-options=\"fit:true,border:false\"\">\r\n");
      out.write("\t\t\t\t<div data-options=\"region:'center',border:false\"  class=\"p10\"  >\r\n");
      out.write("\t\t\t\t\t    <div  class=\"easyui-tabs\" data-options=\"fit:true\">  \r\n");
      out.write("\t\t\t\t\t        <div title=\"1.基本信息\" class=\"p10\" >  \r\n");
      out.write("\t\t\t\t\t            <table class=\"tab_editlist\">\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td class=\"edittd\">方案名称</td>\r\n");
      out.write("\t\t\t\t\t            \t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td class=\"edittd\" valign=\"top\">备注</td>\r\n");
      out.write("\t\t\t\t\t            \t\t<td valign=\"top\" ><textarea></textarea></td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td class=\"edittd\" valign=\"top\">邮件主题</td>\r\n");
      out.write("\t\t\t\t\t            \t\t<td valign=\"top\" ><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t            \t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >选择Email模版</a>\r\n");
      out.write("\t\t\t\t\t            \t\t</td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t            \t\t\t<textarea class=\"fullarea\" name=\"description\" style=\"width:100%;visibility:hidden;height:300px;\" >客户汇报表</textarea>\r\n");
      out.write("\t\t\t\t\t            \t\t</td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            \t<tr>\r\n");
      out.write("\t\t\t\t\t            \t\t<td class=\"edittd\" valign=\"top\">附件</td>\r\n");
      out.write("\t\t\t\t\t            \t\t<td valign=\"top\" >\r\n");
      out.write("\t\t\t\t\t            \t\t\t<input type=\"text\" class=\"text fl\" name=\"filename\" id=\"filename\" disabled=\"true\"  />&nbsp;<span id=\"btnuploader\"></span>\r\n");
      out.write("\t\t\t\t\t            \t\t</td>\r\n");
      out.write("\t\t\t\t\t            \t</tr>\r\n");
      out.write("\t\t\t\t\t            </table>  \r\n");
      out.write("\t\t\t\t\t            <fieldset class=\"mg10\" >\r\n");
      out.write("\t\t\t\t\t            \t<legend>提示</legend>\r\n");
      out.write("\t\t\t\t\t            \t1)群发邮件主要是针对系统中的联系人。<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t2)只有管理员才能在控制面板定义Email摸版。<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t3)群发前请确认SMTP是否配置成功。<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t4)发件人是SMTP服务器信息中的邮件地址。\r\n");
      out.write("\t\t\t\t\t            </fieldset>\r\n");
      out.write("\t\t\t\t\t        </div> \r\n");
      out.write("\t\t\t\t\t        <div title=\"2.群发邮件规则\" class=\"p10\"  >  \r\n");
      out.write("\t\t\t\t\t          <fieldset>\r\n");
      out.write("\t\t\t\t\t         \t <legend>基本选项</legend>\r\n");
      out.write("\t\t\t\t\t         \t <table class=\"tabauth\" >\r\n");
      out.write("\t\t\t\t\t         \t \t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"datagrid-header\" >\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"50%\" >字段</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"25%\" >开始日期</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"25%\" >结束日期</td>\r\n");
      out.write("\t\t\t\t\t         \t \t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t         \t \t<tbody>\r\n");
      out.write("\t\t\t\t\t         \t \t<tr>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t<select>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t\t<option>客户-公司成立时间</option>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t</select>&nbsp;\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t<select>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t\t<option>自定义</option>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t</select>\r\n");
      out.write("\t\t\t\t\t         \t \t\t</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t<input type=\"text\" class=\"text easyui-datebox\" />\r\n");
      out.write("\t\t\t\t\t         \t \t\t</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t\t<input type=\"text\" class=\"text easyui-datebox\" />\r\n");
      out.write("\t\t\t\t\t         \t \t\t</td>\r\n");
      out.write("\t\t\t\t\t         \t \t</tr>\r\n");
      out.write("\t\t\t\t\t         \t \t</tbody>\r\n");
      out.write("\t\t\t\t\t         \t </table>\r\n");
      out.write("\t\t\t\t\t          </fieldset>\r\n");
      out.write("\t\t\t\t\t          <fieldset class=\"mgt_10 mgb_10\" >\r\n");
      out.write("\t\t\t\t\t         \t <legend>高级选项</legend>\r\n");
      out.write("\t\t\t\t\t         \t <table class=\"tabauth\" >\r\n");
      out.write("\t\t\t\t\t         \t \t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"datagrid-header\" >\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"35%\" >字段</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"10%\" >运算符</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"50%\" >值</td>\r\n");
      out.write("\t\t\t\t\t         \t \t\t<td width=\"5%\"></td>\r\n");
      out.write("\t\t\t\t\t         \t \t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>和</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>和</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>和</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>和</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><select><option>无</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<fieldset class=\"mgt_10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<legend>提示</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t1.通过在第三列输入多个用逗号分开的关键字以使用“or”运算符。<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t2.最多可输入 10 项，各项之间用逗号隔开。例如：输入 CA, NY, TX, FL 将搜索 CA 或 NY 或 TX 或 FL。<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t3.请用引号引起包含逗号的数据。例如，输入 \"200,000\",\"1,000,000\" 将搜索 200,000 或 1,000,000。\r\n");
      out.write("\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t          </fieldset>\r\n");
      out.write("\t\t\t\t\t        </div> \r\n");
      out.write("\t\t\t\t\t        <div title=\"3.确认接受人\" class=\"p10\"  >  \r\n");
      out.write("\t\t\t\t\t            <table id=\"tablist\" ></table>\r\n");
      out.write("\t\t\t\t\t        </div> \r\n");
      out.write("\t\t\t\t\t        <div title=\"4.开始发送\" class=\"p10\"  >  \r\n");
      out.write("\t\t\t\t\t                               发送状态显示\r\n");
      out.write("\t\t\t\t\t        </div> \t\t\t\t\t        \t\t\t\t\t        \t\t\t\t\t         \r\n");
      out.write("\t\t\t\t\t    </div>  \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div region=\"south\" class=\"btnbar\" border=\"false\">\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-prev\" >上一步</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-next\" >下一步</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-sendemail\" >测试发送给自己</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-sendemail\" >开始发送</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-ok\" >完成</a>\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" >取消</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
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
    // /WEB-INF/module/maillist/../../head.jsp(17,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_cache_005fcache_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cache:cache
    com.opensymphony.oscache.web.tag.CacheTag _jspx_th_cache_005fcache_005f0 = (com.opensymphony.oscache.web.tag.CacheTag) _005fjspx_005ftagPool_005fcache_005fcache.get(com.opensymphony.oscache.web.tag.CacheTag.class);
    _jspx_th_cache_005fcache_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cache_005fcache_005f0.setParent(null);
    int[] _jspx_push_body_count_cache_005fcache_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_cache_005fcache_005f0 = _jspx_th_cache_005fcache_005f0.doStartTag();
      if (_jspx_eval_cache_005fcache_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_cache_005fcache_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_cache_005fcache_005f0[0]++;
          _jspx_th_cache_005fcache_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cache_005fcache_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/default/easyui.css\">\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui/themes/icon.css\">\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css.css\">\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/easyui_update.css\">\r\n");
          out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery-1.7.2.min.js\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"resources/easyui/jquery.easyui.min.js\"></script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"resources/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
          out.write("\r\n");
          out.write("<!-- JSON插件 -->\r\n");
          out.write("<script type=\"text/javascript\" src=\"resources/lib/json2.js\"></script>\r\n");
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
          int evalDoAfterBody = _jspx_th_cache_005fcache_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cache_005fcache_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_cache_005fcache_005f0[0]--;
        }
      }
      if (_jspx_th_cache_005fcache_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_cache_005fcache_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_cache_005fcache_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_cache_005fcache_005f0.doFinally();
      _005fjspx_005ftagPool_005fcache_005fcache.reuse(_jspx_th_cache_005fcache_005f0);
    }
    return false;
  }
}
