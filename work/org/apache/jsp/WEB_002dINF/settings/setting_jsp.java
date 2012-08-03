package org.apache.jsp.WEB_002dINF.settings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/settings/../common/config.jsp");
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
      out.write("<script type=\"text/javascript\" src=\"resources/desktop/product/catalog.js\"></script>\r\n");
      out.write("<div class=\"container\"  >\r\n");
      out.write("<div data-options=\"region:'center',title:'产品列表'\" style=\"overflow:hidden\" >\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container panel-noscroll\">\r\n");
      out.write("\t\t\t<div class=\"panel datagrid\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">基本设置</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-tool\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datagrid-wrap panel-body p10 \">\r\n");
      out.write("\t\t\t\t<div style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"10\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 1-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('系统用户','settings/users/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"系统用户\" alt=\"系统用户\" src=\"resources/images/settings/panel/ico-users.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('系统用户','settings/users/index')\">系统用户</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 2-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\"  cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('角色权限','settings/role/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"角色权限\" alt=\"角色权限\" src=\"resources/images/settings/panel/ico-roles.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('角色权限','settings/role/index')\">角色权限</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 4-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\"  cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('部门机构','settings/group/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"部门机构\" alt=\"部门机构\" src=\"resources/images/settings/panel/ico-groups.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('部门机构','settings/group/index')\">部门机构</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 5-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\"  cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('全局共享规则','settings/orgsharingdetailview/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"全局共享规则\" alt=\"全局共享规则\" src=\"resources/images/settings/panel/shareaccess.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('全局共享规则','settings/orgsharingdetailview/index')\">全局共享规则</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 5-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\"  cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('自定义共享规则','settings/customsharingdetailview/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"自定义共享规则\" alt=\"全局共享规则\" src=\"resources/images/settings/panel/shareaccess.gif\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('自定义共享规则','settings/customsharingdetailview/index')\">自定义共享规则</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 8-->\t\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\"  cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('登录历史','settings/loginhistory/index')\"><img width=\"48\" height=\"48\" border=\"0\" title=\"登录历史\" alt=\"登录历史\" src=\"resources/images/settings/panel/set-IcoLoginHistory.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('登录历史','settings/loginhistory/index')\">登录历史</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<!-- Row 3 -->\r\n");
      out.write("\t\t\t\t\t</tr><tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody></table></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"panel datagrid mgt_10\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">系统定制 </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-tool\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datagrid-wrap panel-body p10 \">\r\n");
      out.write("\t\t\t\t<div style=\"display: block;\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"10\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 10-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('下拉框选项','settings/picklist/index')\"><img border=\"0\" title=\"下拉框选项\" alt=\"下拉框选项\" src=\"resources/images/settings/panel/picklist.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('下拉框选项','settings/picklist/index')\">下拉框选项</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<!-- empty-->\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('主菜单','settings/customtab/index')\"><img border=\"0\" title=\"主菜单\" alt=\"主菜单\" src=\"resources/images/settings/panel/mainmenu.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('主菜单','settings/customtab/index')\">主菜单</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- empty-->\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('审批流程','settings/multiapprove/index')\"><img width=\"48\" height=\"48\" border=\"0\" src=\"resources/images/settings/panel/approvelist.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('审批流程','settings/multiapprove/index')\">审批流程</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"panel datagrid mgt_10\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">其它设置 </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-tool\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"datagrid-wrap panel-body p10 \">\r\n");
      out.write("\t\t\t\t<div style=\"display:block;\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"10\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t        <td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 11-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('Email模版','settings/emailtemplates/index')\"><img border=\"0\" title=\"Email模版\" alt=\"Email模版\" src=\"resources/images/settings/panel/ViewTemplate.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('Email模版','settings/emailtemplates/index')\">Email模版</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 11-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('数据库备份','settings/dbbackup/index')\"><img border=\"0\" title=\"数据库备份\" alt=\"数据库备份\" src=\"resources/images/settings/panel/dbbackup.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('数据库备份','settings/dbbackup/index')\">数据库备份</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 16-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('公司信息','settings/organizationconfig/index')\"><img border=\"0\" title=\"公司信息\" alt=\"公司信息\" src=\"resources/images/settings/panel/company.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('公司信息','settings/organizationconfig/index')\">公司信息</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 17-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('SMTP服务器','settings/emailconfig/index')\"><img border=\"0\" title=\"SMTP服务器\" alt=\"SMTP服务器\" src=\"resources/images/settings/panel/ogmailserver.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('SMTP服务器','settings/emailconfig/index')\">SMTP服务器</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 17-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('短信通道','settings/messageconfig/index')\"><img border=\"0\" title=\"短信通道\" alt=\"短信通道\" src=\"resources/images/settings/panel/ico_mobile.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('短信通道','settings/messageconfig/index')\">短信通道</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 17-->\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('授权许可','settings/licenseconfig/index')\"><img border=\"0\" title=\"短信通道\" alt=\"授权许可\" src=\"resources/images/settings/panel/license.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('授权许可','settings/licenseconfig/index')\">授权许可</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t      <td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- icon 11-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('回收站','settings/recyclebin/index')\"><img border=\"0\" title=\"回收站\" alt=\"回收站\" src=\"resources/images/settings/panel/settingsTrash.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('回收站','settings/recyclebin/index')\">回收站</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t        <td width=\"12.5%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t<!-- icon 11-->\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"tab_center\" cellspacing=\"0\" cellpadding=\"5\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tbody><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\"><a href=\"javascript:tab('多仓库管理','settings/multiwarehouse/index')\"><img border=\"0\" title=\"多仓库管理\" alt=\"多仓库管理\" src=\"resources/images/settings/panel/cangku.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" class=\"big\"><a href=\"javascript:tab('多仓库管理','settings/multiwarehouse/index')\">多仓库管理</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</tbody></table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
