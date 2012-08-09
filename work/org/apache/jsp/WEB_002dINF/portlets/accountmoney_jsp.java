package org.apache.jsp.WEB_002dINF.portlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountmoney_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/portlets/../head.jsp");
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
String servletpath = request.getServletPath();

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"wrap\">\r\n");
      out.write("<div class=\"datagrid-view2\" style=\"width: 1264px; left: 54px;\"><div class=\"datagrid-header\" style=\"width: 1264px; height: 27px;\"><div class=\"datagrid-header-inner\" style=\"display: block;\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"datagrid-htable\" style=\"height: 28px;\"><tbody><tr class=\"datagrid-header-row\"><td field=\"campaignname\" class=\"\"><div class=\"datagrid-cell\" style=\"width: 614px; text-align: left;\"><span>营销活动</span><span class=\"datagrid-sort-icon\">&nbsp;</span></div></td><td field=\"campaigntype\"><div class=\"datagrid-cell\" style=\"width: 614px; text-align: left;\"><span>营销活动类型</span><span class=\"datagrid-sort-icon\">&nbsp;</span></div></td></tr></tbody></table></div></div><div class=\"datagrid-body\" style=\"width: 1264px; height: 270px;\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"datagrid-btable\"><tbody><tr class=\"datagrid-row\" datagrid-row-index=\"0\" id=\"datagrid-row-r1-2-0\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">营销展会的举办</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">展览会</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"1\" id=\"datagrid-row-r1-2-1\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">邀请客户参加年会</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">展览会</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"2\" id=\"datagrid-row-r1-2-2\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">电话潜在客户</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">电话营销</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"3\" id=\"datagrid-row-r1-2-3\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">购买三星530U4B-S01送服务</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">Email</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"4\" id=\"datagrid-row-r1-2-4\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">入驻新浪网页滚动广告</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">网络广告</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"5\" id=\"datagrid-row-r1-2-5\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">国美电器代理商</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">合作伙伴</div></td></tr><tr class=\"datagrid-row\" datagrid-row-index=\"6\" id=\"datagrid-row-r1-2-6\" style=\"height: 27px;\"><td field=\"campaignname\"><div class=\"datagrid-cell datagrid-cell-c1-campaignname\" style=\"text-align:left;height:auto;\">体育竞赛项目广告赞助商</div></td><td field=\"campaigntype\"><div class=\"datagrid-cell datagrid-cell-c1-campaigntype\" style=\"text-align:left;height:auto;\">广告</div></td></tr></tbody></table></div><div class=\"datagrid-footer\" style=\"width: 1264px;\"><div class=\"datagrid-footer-inner\" style=\"display: none;\"></div></div></div>\r\n");
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
    // /WEB-INF/portlets/../head.jsp(17,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
