/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-01-24 01:06:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.column;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xnx3.wangmarket.admin.G;
import com.xnx3.wangmarket.admin.entity.Site;
import com.xnx3.j2ee.Global;

public final class popupListForTemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/E:/Work/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/Work/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1430113524000L));
    _jspx_dependants.put("/WEB-INF/lib/xnx3_tld.jar", Long.valueOf(1512734430000L));
    _jspx_dependants.put("jar:file:/E:/Work/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/xnx3_tld.jar!/META-INF/xnx3.tld", Long.valueOf(1495004768000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.xnx3.j2ee.Global");
    _jspx_imports_classes.add("com.xnx3.wangmarket.admin.G");
    _jspx_imports_classes.add("com.xnx3.wangmarket.admin.entity.Site");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("栏目导航", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("<script src=\"");
      out.print(basePath+Global.CACHE_FILE );
      out.write("SiteColumn_used.js\"></script>\n");
      out.write("<script src=\"");
      out.print(basePath+Global.CACHE_FILE );
      out.write("SiteColumn_type.js\"></script>\n");
      out.write("\n");
      out.write("<table class=\"layui-table\" style=\"margin:0px;\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>栏目名称</th>\n");
      out.write("      <th>栏目代码</th>\n");
      out.write("      <th>类型</th>\n");
      out.write("      <th>是否显示</th>\n");
      out.write("\t\t<th>排序</th>\n");
      out.write("      <th>操作</th>\n");
      out.write("    </tr> \n");
      out.write("  </thead>\n");
      out.write("  <tbody class=\"tile__listedit\" id=\"columnList\">\n");
      out.write("  \t<!-- display 显示或者隐藏，是否在导航中显示。若为0，则不加入排序 -->\n");
      out.write("  \t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /WEB-INF/view/column/popupListForTemplate.jsp(31,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/column/popupListForTemplate.jsp(31,3) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /WEB-INF/view/column/popupListForTemplate.jsp(31,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("siteColumnTreeVO");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("        <tr id=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">\n");
              out.write("        \t<td width=\"140\" onclick=\"javascript:window.open('");
              out.print(basePath );
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.codeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(".html?domain=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${site.domain }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write('.');
              out.print(G.getFirstAutoAssignDomain() );
              out.write("');\" style=\"cursor: pointer;\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("        \t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.codeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("            <td width=\"100\"><script type=\"text/javascript\">document.write(type['");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("']);</script></td>\n");
              out.write("            <td width=\"60\"><script type=\"text/javascript\">document.write(used['");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.used}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("']);</script></td>\n");
              out.write("            <td width=\"50\" onclick=\"updateRank('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("', '");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.rank }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("', '");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("');\" style=\"cursor:pointer;\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.rank }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("            <td width=\"160\">\n");
              out.write("            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"editColumn('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("',true);\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe630;</i></botton>\n");
              out.write("            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"editColumn('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("',false);\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe642;</i></botton>\n");
              out.write("            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"deleteColumn('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("', '");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${siteColumnTreeVO.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("');\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe640;</i></botton>\n");
              out.write("\t\t\t</td>\n");
              out.write("        </tr>\n");
              out.write("        \n");
              out.write("        <!-- 其下级栏目 -->\n");
              out.write("        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              boolean _jspx_th_c_005fif_005f0_reused = false;
              try {
                _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                // /WEB-INF/view/column/popupListForTemplate.jsp(46,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty siteColumnTreeVO.list }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
                if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("\t\t\t");
                    //  c:forEach
                    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                    boolean _jspx_th_c_005fforEach_005f1_reused = false;
                    try {
                      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                      // /WEB-INF/view/column/popupListForTemplate.jsp(47,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
                      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/column/popupListForTemplate.jsp(47,3) '${siteColumnTreeVO.list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${siteColumnTreeVO.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
                      // /WEB-INF/view/column/popupListForTemplate.jsp(47,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_c_005fforEach_005f1.setVar("subSCT");
                      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
                      try {
                        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
                        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\n");
                            out.write("\t\t        <tr id=\"");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("\">\n");
                            out.write("\t\t        \t<td width=\"140\" onclick=\"javascript:window.open('");
                            out.print(basePath );
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.codeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write(".html?domain=");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${site.domain }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write('.');
                            out.print(G.getFirstAutoAssignDomain() );
                            out.write("');\" style=\"cursor: pointer;\"><span style=\"padding-left:20px;\">");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("</span></td>\n");
                            out.write("\t\t        \t<td><span style=\"padding-left:20px;\">");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.codeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("</span></td>\n");
                            out.write("\t\t            <td width=\"100\"><script type=\"text/javascript\">document.write(type['");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("']);</script></td>\n");
                            out.write("\t\t            <td width=\"60\"><script type=\"text/javascript\">document.write(used['");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.used}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("']);</script></td>\n");
                            out.write("\t\t            <td width=\"50\" onclick=\"updateRank('");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("', '");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.rank }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("', '");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("');\" style=\"cursor:pointer;\">&nbsp;&nbsp;&nbsp;&nbsp;");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.rank }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("</td>\n");
                            out.write("\t\t            <td width=\"160\">\n");
                            out.write("\t\t            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"editColumn('");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("',true);\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe630;</i></botton>\n");
                            out.write("\t\t            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"editColumn('");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("',false);\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe642;</i></botton>\n");
                            out.write("\t\t            \t<botton class=\"layui-btn layui-btn-sm\" onclick=\"deleteColumn('");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("', '");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subSCT.siteColumn.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                            out.write("');\" style=\"margin-left: 3px;\"><i class=\"layui-icon\">&#xe640;</i></botton>\n");
                            out.write("\t\t\t\t\t</td>\n");
                            out.write("\t\t        </tr>\n");
                            out.write("\t\t    ");
                            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          return;
                        }
                      } catch (java.lang.Throwable _jspx_exception) {
                        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                          out = _jspx_page_context.popBody();
                        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
                      } finally {
                        _jspx_th_c_005fforEach_005f1.doFinally();
                      }
                      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
                      _jspx_th_c_005fforEach_005f1_reused = true;
                    } finally {
                      if (!_jspx_th_c_005fforEach_005f1_reused) {
                        _jspx_th_c_005fforEach_005f1.release();
                        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fforEach_005f1);
                      }
                    }
                    out.write('\n');
                    out.write('	');
                    out.write('	');
                    int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
                _jspx_th_c_005fif_005f0_reused = true;
              } finally {
                if (!_jspx_th_c_005fif_005f0_reused) {
                  _jspx_th_c_005fif_005f0.release();
                  _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f0);
                }
              }
              out.write(" \n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        if (!_jspx_th_c_005fforEach_005f0_reused) {
          _jspx_th_c_005fforEach_005f0.release();
          _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fforEach_005f0);
        }
      }
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div style=\"padding:15px;\">\n");
      out.write("\t<button class=\"layui-btn\" onclick=\"addColumn();\" style=\"margin-left: 10px;margin-bottom: 20px;\"><i class=\"layui-icon\" style=\"padding-right:8px; font-size: 22px;\">&#xe608;</i>添加栏目</button>\n");
      out.write("</div>\n");
      out.write("<div style=\"padding-right:35px; text-align: right;margin-top: -66px;\">\n");
      out.write("\t\n");
      out.write("\t提示：&nbsp;&nbsp;&nbsp;\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe642;</i></botton><span style=\"padding-left:12px;padding-right: 30px;\">编辑</span>\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe640;</i></botton><span style=\"padding-left:12px;padding-right: 30px;\">删除</span>\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe630;</i></botton><span style=\"padding-left:12px;padding-right: 20px;\">复制一个现有的栏目快速创建新栏目</span>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/**\n");
      out.write(" * 编辑栏目\n");
      out.write(" * siteColumnId 要编辑的栏目的id\n");
      out.write(" * isCopy 是否是复制一个新的栏目出来进入编辑状态，1是复制的，    0不是复制的，属于正常的添加或者修改\n");
      out.write(" */\n");
      out.write("function editColumn(siteColumnId, isCopy){\n");
      out.write("\tvar url = '");
      out.print(basePath );
      out.write("column/popupColumnForTemplate.do';\n");
      out.write("\tlayer.open({\n");
      out.write("\t\ttype: 2, \n");
      out.write("\t\t//title: false,\n");
      out.write("\t\tcloseBtn: 1,\n");
      out.write("\t\t//title:(isCopy? '复制一个栏目快速创建':'修改栏目'),\n");
      out.write("\t\tarea: ['460px', '570px'],\n");
      out.write("\t\tshadeClose: true, //开启遮罩关闭\n");
      out.write("\t\tcontent: url+'?id='+siteColumnId+(isCopy? '&isCopy=1':''),\n");
      out.write("\t\ttitle:false, \n");
      out.write("\t\tcloseBtn: 1\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 删除栏目\n");
      out.write(" * siteColumnId 要编辑的栏目的id\n");
      out.write(" * name 要删除的栏目的栏目名字\n");
      out.write(" */\n");
      out.write("function deleteColumn(siteColumnId, name){\n");
      out.write("\tvar dtv_confirm = layer.confirm('确定要删除“'+name+'”吗? ', {\n");
      out.write("\t  btn: ['删除','取消'] //按钮\n");
      out.write("\t}, function(){\n");
      out.write("\t\tlayer.close(dtv_confirm);\n");
      out.write("\t\tparent.iw.loading('删除中');\n");
      out.write("\t\t$.getJSON('");
      out.print(basePath );
      out.write("column/delete.do?id='+siteColumnId,function(obj){\n");
      out.write("\t\t\tparent.iw.loadClose();\n");
      out.write("\t\t\tif(obj.result == '1'){\n");
      out.write("\t\t\t\tparent.iw.msgSuccess(\"删除成功\");\n");
      out.write("\t\t\t\twindow.location.reload();\t//刷新当前页\n");
      out.write("\t     \t}else if(obj.result == '0'){\n");
      out.write("\t     \t\t $.toast(obj.info, \"cancel\", function(toast) {});\n");
      out.write("\t     \t}else{\n");
      out.write("\t     \t\talert(obj.result);\n");
      out.write("\t     \t}\n");
      out.write("\t\t});\n");
      out.write("\t}, function(){\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 添加栏目\n");
      out.write(" * siteColumnId 要编辑的栏目的id\n");
      out.write(" */\n");
      out.write("function addColumn(siteColumnId){\n");
      out.write("\tvar url = '");
      out.print(basePath );
      out.write("column/popupColumnForTemplate.do';\n");
      out.write("\tlayer.open({\n");
      out.write("\t\ttype: 2, \n");
      out.write("\t\t//title:'添加栏目', \n");
      out.write("\t\tarea: ['460px', '600px'],\n");
      out.write("\t\tshadeClose: true, //开启遮罩关闭\n");
      out.write("\t\tcontent: url,\n");
      out.write("\t\ttitle:false, \n");
      out.write("\t\tcloseBtn: 1\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 更改某项的排序\n");
      out.write(" * @param id 要修改的 某项的id编号，要改那一项\n");
      out.write(" * @param rank 当前的排序序号，默认值\n");
      out.write(" * @param name 栏目名字，仅仅只是提示作用\n");
      out.write(" */\n");
      out.write("function updateRank(id,rank,name){\n");
      out.write("\tlayer.prompt({title: '请输入排序数字，数字越小越靠前', formType: 3, value: ''+rank}, function(text, index){\n");
      out.write("\t\tparent.iw.loading(\"保存中\");    //显示“操作中”的等待提示\n");
      out.write("\t\t$.post('updateRank.do?id='+id+'&rank='+text, function(data){\n");
      out.write("\t\t    parent.iw.loadClose();    //关闭“操作中”的等待提示\n");
      out.write("\t\t    if(data.result == '1'){\n");
      out.write("\t\t        //由最外层发起提示框\n");
      out.write("\t\t\t\tparent.iw.msgSuccess('操作成功');\n");
      out.write("\t\t\t\t//刷新当前页\n");
      out.write("\t\t\t\twindow.location.reload();\t\n");
      out.write("\t\t     }else if(data.result == '0'){\n");
      out.write("\t\t         parent.iw.msgFailure(data.info);\n");
      out.write("\t\t     }else{\n");
      out.write("\t\t         parent.iw.msgFailure();\n");
      out.write("\t\t     }\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/foot.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
