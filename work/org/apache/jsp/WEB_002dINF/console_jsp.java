package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class console_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/header.jsp");
    _jspx_dependants.add("/WEB-INF/common/commonjs.jsp");
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
      out.write("<!-- loadmask -->\r\n");
      out.write("<link href=\"resources/plugins/loadmask/jquery.loadmask.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/plugins/loadmask/jquery.loadmask.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
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
      out.write("\t\t<!-- com.crm.marketing -->\r\n");
      out.write("\t\t<div id=\"agora_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('营销活动','campaign/index')\">营销活动</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('群发短信','qunfa/index')\">群发短信</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('群发邮件','maillist/index')\">群发邮件</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"customer_item\"  style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户','account/index')\">客户</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('联系人','contact/index')\">联系人</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户关怀','care/index')\">客户关怀</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('联系记录','note/index')\">联系记录</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户任务计划','noteplans/index')\">客户任务计划</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户任务','note/index')\">客户任务</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户池','note/index')\">客户池</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('纪念日','memdays/index')\">纪念日</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"product_item\"  style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('产品列表','product/index')\" >产品列表</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('产品分类','catalog/index')\" >产品分类</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('产品序号','serialnumbers/index')\" >产品序号</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"sale_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('销售导航','potential/nav')\" >销售导航</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('销售机会','potential/index')\" >销售机会</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('销售漏斗','potential/funnel')\" >销售漏斗</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('报价单','quotes/index')\" >报价单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('竞争对手','duishous/index')\" >竞争对手</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('合同订单','salesorder/index')\" >合同订单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('发货单','invoice/index')\" >发货单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('销售退货单','tuihuos/index')\" >销售退货单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('员工绩效','performances/index')\" >员工绩效</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('销售目标','salestarget/index')\" >销售目标</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"buy_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('采购导航','purchase/nav')\">采购导航</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('进货单','purchaseorder/index')\">进货单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('供应商','vendor/index')\">供应商</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('供应商联系人','vcontacts/index')\">供应商联系人</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('供应商联系记录','vnotes/index')\">供应商联系记录</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"afterser_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客服控制台','accountrecordss/index')\" >客服控制台</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户服务','accountrecordss/index')\" >客户服务</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('客户投诉','complaints/index')\" >客户投诉</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('知识库','faq/index')\" >知识库</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('知识库分类','faqcategorys/index')\" >知识库分类</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"stock_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('库存导航','inventory/nav')\" >库存导航</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('入库单','warehouses/index')\" >入库单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('出库单','deliverys/index')\" >出库单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('盘点','checks/index')\" >盘点</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('库存余额','balances/index')\" >库存余额</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('初始化库存','initinventory/index')\" >初始化库存</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('库存调拨','warehousetransfers/index')\" >库存调拨</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('库存流水帐','wareledgers/index')\" >库存流水帐</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('库存台帐','inventoryledgers/index')\" >库存台帐</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"finance_item\" style=\"width: 120px;\" class=\"navmenuitem\"  >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('财务导航','accounting/nav')\" >财务导航</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('应收款','gathers/index')\" >应收款</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('应付款','charges/index')\" >应付款</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('收款单','gathersrecords/index')\" >收款单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('付款单','chargesrecords/index')\" >付款单</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('往来帐','forthamounts/index')\" >往来帐</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('期初余额','openingbalancess/index')\" >期初余额</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('费用报销','expenses/index')\" >费用报销</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('发票管理','billings/index')\" >发票管理</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"report_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('综合报表','integradedreports/index')\" >综合报表</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('常用报表','ureports/index')\" >常用报表</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('年终销售报表','salesreports/index')\" >年终销售报表</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- \r\n");
      out.write("\t\t<div id=\"service_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('服务合同','billings/index')\" >服务合同</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('项目里程碑','billings/index')\" >项目里程碑</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('项目任务','billings/index')\" >项目任务</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('项目','billings/index')\" >项目</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('常见问答','billings/index')\" >常见问答</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t\t<div id=\"setting_item\" style=\"width: 120px;\" class=\"navmenuitem\" >\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('控制面板','setting/index')\" >控制面板</a></div>\r\n");
      out.write("\t\t\t<div><a href=\"javascript:tab('业务规则','workflow/index')\" >业务规则</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"north\" style=\"height: 62px;overflow: hidden; \"\r\n");
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
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
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
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"service\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#service_item'\">服务支持</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"setting\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#setting_item'\">控制面板</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"split\"></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void(0)\" id=\"quick\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-menubutton\" data-options=\"menu:'#quick_item'\"><input id=\"quick\" name=\"dept\" value=\"aa\"></a></li>\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t\r\n");
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
