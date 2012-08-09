package org.apache.jsp.WEB_002dINF.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class integradedreports_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/report/../head.jsp");
    _jspx_dependants.add("/WEB-INF/report/../common/config.jsp");
    _jspx_dependants.add("/WEB-INF/report/../nav.jsp");
    _jspx_dependants.add("/WEB-INF/report/../foot.jsp");
    _jspx_dependants.add("/WEB-INF/tld/jstl/fn.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<!-- 综合报表界面 -->\t\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"resources/global.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("<!-- 菜单 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/prodrop/pro_drop.css\" />\r\n");
      out.write("<script src=\"resources/prodrop/stuHover.js\" type=\"text/javascript\"></script>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String win_topbar = "closed=\"true\" modal=\"true\" collapsible=\"false\"  draggable=\"false\" minimizable=\"false\" maximizable=\"false\" inline=\"false\"";

      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/report/reports.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/report/integradedreports.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".report_panel{\r\n");
      out.write("    border-top: 1px dotted #999999;\r\n");
      out.write("    width:100%;\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("}\r\n");
      out.write(".report_panel .report_details{\r\n");
      out.write("    width:20%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schart{\r\n");
      out.write("  background: url(\"resources/images/report/schart.gif\") no-repeat;\r\n");
      out.write("  padding-left: 12px;\r\n");
      out.write("}\r\n");
      out.write("a {\r\n");
      out.write("    color: #33338C;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"headerNav\"  >\r\n");
      out.write("\t\t<a class=\"logo\"></a>\r\n");
      out.write("\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t<li><a>手机短信</a></li>\r\n");
      out.write("\t\t\t<li><a>我的审批中心</a></li>\r\n");
      out.write("\t\t\t<li><a>自定义提醒</a></li>\r\n");
      out.write("\t\t\t<li><a>我要提问</a></li>\r\n");
      out.write("\t\t\t<li><a>帐号&设置</a></li>\r\n");
      out.write("\t\t\t<li><a>退出（BOSS）</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("</div>\t\r\n");
      out.write("<div id=\"nav_div\">\r\n");
      out.write("\t<ul id=\"nav\">\r\n");
      out.write("\t\t<li class=\"top\" style=\"float: left;\"><a href=\"#nogo1\"\r\n");
      out.write("\t\t\tclass=\"top_link\"><span class=\"down\">工作台</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#nogo19\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#nogo20\">日程安排</a></li>\r\n");
      out.write("\t\t\t\t<li><a>文档中心</a></li>\r\n");
      out.write("\t\t\t\t<li><a>公告</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo2\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">市场管理</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"customview/viewIndex?entitytype=Campaigns\">营销活动</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#nogo20\">群发短信</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#nogo21\">群发邮件</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo2\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">客户</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"customview/viewIndex?entitytype=Accounts\">客户</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('联系人','contact/index')\">联系人</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户关怀','care/index')\">客户关怀</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('联系记录','note/index')\">联系记录</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户任务计划','noteplans/index')\">客户任务计划</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户任务','note/index')\">客户任务</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户池','note/index')\">客户池</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('纪念日','memdays/index')\">纪念日</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo22\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">产品</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"customview/viewIndex?entitytype=Products\">产品列表</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('产品分类','catalog/index')\">产品分类</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('产品序号','serialnumbers/index')\">产品序号</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo27\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">销售</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('销售导航','potential/nav')\">销售导航</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"customview/viewIndex?entitytype=Potentials\">销售机会</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('销售漏斗','potential/funnel')\">销售漏斗</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"customview/viewIndex?entitytype=Quotes\">报价单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('竞争对手','duishous/index')\">竞争对手</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('合同订单','salesorder/index')\">合同订单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('发货单','invoice/index')\">发货单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('销售退货单','tuihuos/index')\">销售退货单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('员工绩效','performances/index')\">员工绩效</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('销售目标','salestarget/index')\">销售目标</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo53\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">采购</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('采购导航','purchase/nav')\">采购导航</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('进货单','purchaseorder/index')\">进货单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('供应商','vendor/index')\">供应商</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('供应商联系人','vcontacts/index')\">供应商联系人</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('供应商联系记录','vnotes/index')\">供应商联系记录</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">售后</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客服控制台','accountrecordss/index')\">客服控制台</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户服务','accountrecordss/index')\">客户服务</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('客户投诉','complaints/index')\">客户投诉</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('知识库','faq/index')\">知识库</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('知识库分类','faqcategorys/index')\">知识库分类</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">库存</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('库存导航','inventory/nav')\">库存导航</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('入库单','warehouses/index')\">入库单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('出库单','deliverys/index')\">出库单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('盘点','checks/index')\">盘点</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('库存余额','balances/index')\">库存余额</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('初始化库存','initinventory/index')\">初始化库存</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('库存调拨','warehousetransfers/index')\">库存调拨</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('库存流水帐','wareledgers/index')\">库存流水帐</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('库存台帐','inventoryledgers/index')\">库存台帐</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">财务</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('财务导航','accounting/nav')\">财务导航</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('应收款','gathers/index')\">应收款</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('应付款','charges/index')\">应付款</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('收款单','gathersrecords/index')\">收款单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('付款单','chargesrecords/index')\">付款单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('往来帐','forthamounts/index')\">往来帐</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('期初余额','openingbalancess/index')\">期初余额</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('费用报销','expenses/index')\">费用报销</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('发票管理','billings/index')\">发票管理</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">报表</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"integradedreports/index/2012\">综合报表</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('常用报表','ureports/index')\">常用报表</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('年终销售报表','salesreports/index')\">年终销售报表</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">服务支持</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('服务合同','billings/index')\">服务合同</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('项目里程碑','billings/index')\">项目里程碑</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('项目任务','billings/index')\">项目任务</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('项目','billings/index')\">项目</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:tab('常见问答','billings/index')\">常见问答</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"top\"><a href=\"#nogo57\" class=\"top_link\"><span\r\n");
      out.write("\t\t\t\tclass=\"down\">控制面板</span></a>\r\n");
      out.write("\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"setting/index\" >控制面板</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"workflow/index\" >业务规则</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<div class=\"path\"><a href=\"/\">报表</a>&gt;<a href=\"/sc/\">综合报表</a></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"easyui-layout\">\r\n");
      out.write("\t\t<div data-options=\"region:'north',border:false\">\r\n");
      out.write("\t\t\t<div class=\"d_view \">\r\n");
      out.write("\t\t\t\t<span class=\"icon-filter view_span\" >年度选择：</span>\r\n");
      out.write("\t\t\t\t<select class=\"selyear\">\r\n");
      out.write("\t\t\t\t    <option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2010\">2010</option>\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"2011\">2011</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2012\">2012</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',border:false\" style=\"overflow: hidden;\">\r\n");
      out.write("\t\t\t<div class=\"easyui-panel\"  \r\n");
      out.write("\t\t\t     collapsible=\"true\"  style=\"padding:5px;\">\r\n");
      out.write("\t\t\t\t<table class=\"report_panel\">\r\n");
      out.write("\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t   <td class=\"report_details\">\r\n");
      out.write("\t\t\t\t\t   <fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend class=\"schart\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("年 销售汇总表:</legend>\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"1\" cellpadding=\"3\" border=\"0\" style=\"background-color:#CCCCCC;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F0\" align=\"center\" colspan=\"2\" style=\"line-height: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <font color=\"#999999\">表名</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\" style=\"line-height:30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <font color=\"#3366FF\">1.</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <a target=\"_blank\" href=\"index?action=IntegradedreportsAjax&file=basicyear&parenttab=Analytics&year=2011\">年度基本情况表</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"line-height: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <font color=\"#3366FF\">2.</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <a target=\"_blank\" href=\"integradedreports/salestotal/index\">销售综合汇总表</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t   </fieldset>\r\n");
      out.write("\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t   <td style=\"padding-left:60px\">\r\n");
      out.write("\t\t\t\t\t   <fieldset style=\"width:150px\">\r\n");
      out.write("\t\t\t\t\t   <legend class=\"schart\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("年 库存资产表</legend>\r\n");
      out.write("\t\t\t\t\t   <table cellspacing=\"1\" cellpadding=\"3\" border=\"0\" style=\"background-color:#CCCCCC;margin-left:30px\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F0\" align=\"center\" colspan=\"2\" style=\"line-height: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <font color=\"#999999\">表名</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\" style=\"line-height:30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <font color=\"#3366FF\">3.</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <a target=\"_blank\" href=\"integradedreports/cangkuinfo/index\">当前库存资产</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t   </fieldset>\r\n");
      out.write("\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 销售明细表 -->\r\n");
      out.write("\t\t\t\t<table class=\"report_panel\">\r\n");
      out.write("\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t   <td class=\"report_details\">\r\n");
      out.write("\t\t\t\t\t\t   <fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend class=\"schart\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("年 销售明细表:</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"sales_details\" cellspacing=\"1\" cellpadding=\"3\" border=\"0\" style=\"line-height: 200%; background-color:#CCCCCC;\">\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t   </fieldset>\r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 采购和仓库管理统计表 -->\r\n");
      out.write("\t\t\t\t<table class=\"report_panel\">\r\n");
      out.write("\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t   <td class=\"report_details\">\r\n");
      out.write("\t\t\t\t\t\t   <fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend class=\"schart\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("年 采购和仓库管理统计表:</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"purchase_details\" cellspacing=\"1\" cellpadding=\"3\" border=\"0\" style=\"line-height: 200%; background-color:#CCCCCC;\">\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t   </fieldset>\r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"div_foot\" class=\"footercss\" >\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\" style=\"padding: 8px 20px;display:table;height:40px;\">\r\n");
      out.write("<tbody>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"left\" class=\"small\"><span style=\"color: rgb(153, 153, 153);\">Powered by 新麦 CRM <span id=\"_vtiger_product_version_\">2.0</span></span></td>\r\n");
      out.write("\t\t\t<td align=\"right\" class=\"small\"><span>&copy; 2012-2014\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.x-mai.com\" target=\"_blank\">x-mai.com</a>\r\n");
      out.write("\t\t\t</span></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>    \r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
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
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write(' ');
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
    // /WEB-INF/report/integradedreports.jsp(8,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("       <script>\r\n");
        out.write("       var year=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(";\r\n");
        out.write("       </script>\r\n");
        out.write("    ");
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
        out.write("       ");
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/report/integradedreports.jsp(14,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("year");
    // /WEB-INF/report/integradedreports.jsp(14,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new String("2012"));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
