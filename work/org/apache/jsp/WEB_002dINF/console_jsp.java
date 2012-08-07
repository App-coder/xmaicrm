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
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/index.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bodycontainer\" class=\"easyui-layout consolebd\">\r\n");
      out.write("\t<div class=\"hidden\">\r\n");
      out.write("\t\t<div id=\"workspace_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('首页','welcome/homepage')\">首页</a></div>\r\n");
      out.write("\t\t\t<div>日程安排</div>\r\n");
      out.write("\t\t\t<div>文档中心</div>\r\n");
      out.write("\t\t\t<div>公告</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"agora_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>营销活动</div>\r\n");
      out.write("\t\t\t<div>群发短信</div>\r\n");
      out.write("\t\t\t<div>群发邮件</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"customer_item\"  style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户','Customer/Accounts')\">客户</a></div>\r\n");
      out.write("\t\t\t<div>联系人</div>\r\n");
      out.write("\t\t\t<div>客户关怀</div>\r\n");
      out.write("\t\t\t<div>联系记录</div>\r\n");
      out.write("\t\t\t<div>纪念日</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"product_item\"  style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('产品列表','product/index')\" >产品列表</a></div>\r\n");
      out.write("\t\t\t<div>产品分类</div>\r\n");
      out.write("\t\t\t<div>产品序号</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"sale_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>销售导航</div>\r\n");
      out.write("\t\t\t<div>销售机会</div>\r\n");
      out.write("\t\t\t<div>销售漏斗</div>\r\n");
      out.write("\t\t\t<div>报价单</div>\r\n");
      out.write("\t\t\t<div>竞争对手</div>\r\n");
      out.write("\t\t\t<div>合同订单</div>\r\n");
      out.write("\t\t\t<div>发货单</div>\r\n");
      out.write("\t\t\t<div>销售退货单</div>\r\n");
      out.write("\t\t\t<div>员工绩效</div>\r\n");
      out.write("\t\t\t<div>销售目标</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"buy_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>采购导航</div>\r\n");
      out.write("\t\t\t<div>进货单</div>\r\n");
      out.write("\t\t\t<div>供应商</div>\r\n");
      out.write("\t\t\t<div>供应商联系人</div>\r\n");
      out.write("\t\t\t<div>供应商联系记录</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"afterser_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>客服控制台</div>\r\n");
      out.write("\t\t\t<div>客户服务</div>\r\n");
      out.write("\t\t\t<div>客户投诉</div>\r\n");
      out.write("\t\t\t<div>知识库</div>\r\n");
      out.write("\t\t\t<div>知识库分类</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"stock_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>库存导航</div>\r\n");
      out.write("\t\t\t<div>入库单</div>\r\n");
      out.write("\t\t\t<div>出库单</div>\r\n");
      out.write("\t\t\t<div>盘点</div>\r\n");
      out.write("\t\t\t<div>库存余额</div>\r\n");
      out.write("\t\t\t<div>初始化库存</div>\r\n");
      out.write("\t\t\t<div>库存调拨</div>\r\n");
      out.write("\t\t\t<div>库存流水帐</div>\r\n");
      out.write("\t\t\t<div>库存台帐</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"finance_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div>财务导航</div>\r\n");
      out.write("\t\t\t<div>应收款</div>\r\n");
      out.write("\t\t\t<div>应付款</div>\r\n");
      out.write("\t\t\t<div>收款单</div>\r\n");
      out.write("\t\t\t<div>付款单</div>\r\n");
      out.write("\t\t\t<div>往来帐</div>\r\n");
      out.write("\t\t\t<div>期初余额</div>\r\n");
      out.write("\t\t\t<div>费用报销</div>\r\n");
      out.write("\t\t\t<div>发票管理</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"report_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div>综合报表</div>\r\n");
      out.write("\t\t\t<div>常用报表</div>\r\n");
      out.write("\t\t\t<div>年终销售报表</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"service_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div>服务合同</div>\r\n");
      out.write("\t\t\t<div>项目里程碑</div>\r\n");
      out.write("\t\t\t<div>项目任务</div>\r\n");
      out.write("\t\t\t<div>项目</div>\r\n");
      out.write("\t\t\t<div>常见问答</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"north\" style=\"height: 62px; overflow: hidden;\"\r\n");
      out.write("\t\tclass=\"headerNav\" border=\"false\">\r\n");
      out.write("\t\t<a class=\"logo\"></a>\r\n");
      out.write("\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t<li><a>手机短信</a></li>\r\n");
      out.write("\t\t\t<li><a>我的审批中心</a></li>\r\n");
      out.write("\t\t\t<li><a>自定义提醒</a></li>\r\n");
      out.write("\t\t\t<li><a>我要提问</a></li>\r\n");
      out.write("\t\t\t<li><a>帐号&设置</a></li>\r\n");
      out.write("\t\t\t<li><a>退出（BOSS）</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"navMenu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"workspace\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#workspace_item'\">工作台</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"agora\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#agora_item'\">市场管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"customer\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#customer_item'\">客户</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"product\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#product_item'\">产品</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"sale\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#sale_item'\">销售</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"buy\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#buy_item'\">采购</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"afterser\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#afterser_item'\">售后</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"stock\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#stock_item'\">库存</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"finance\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#finance_item'\">财务</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"report\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#report_item'\">报表</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"service\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#service_item'\">服务支持</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"quick\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#quick_item'\"><input id=\"quick\" name=\"dept\" value=\"aa\"></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"south\" class=\"footercss\" style=\"height: 40px;\"\r\n");
      out.write("\t\tborder=\"false\">\r\n");
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
      out.write("\t<div region=\"center\" style=\"overflow: hidden;\" border=\"false\">\r\n");
      out.write("\t\t<div id=\"tabs\" tools=\"#tab-tools\" fit=\"true\" border=\"false\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"tab-tools\">\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" plain=\"true\" title=\"页面重载\"\r\n");
      out.write("\t\t\ticonCls=\"icon-reload\" onclick=\"javascript:reloadTab()\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"mm\" class=\"easyui-menu\" style=\"width: 150px;\">\r\n");
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
