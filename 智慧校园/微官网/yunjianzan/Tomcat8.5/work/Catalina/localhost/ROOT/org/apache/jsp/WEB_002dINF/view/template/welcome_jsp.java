/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-02-20 20:06:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.xnx3.wangmarket.admin.G;
import com.xnx3.j2ee.shiro.ShiroFunc;
import com.xnx3.j2ee.Global;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/E:/github/我的项目/Project/智慧校园/微官网/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/github/我的项目/Project/智慧校园/微官网/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/xnx3_tld.jar!/META-INF/xnx3.tld", Long.valueOf(1495004768000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1430113524000L));
    _jspx_dependants.put("/WEB-INF/lib/xnx3_tld.jar", Long.valueOf(1512734430000L));
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
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("com.xnx3.wangmarket.admin.G");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("com.xnx3.j2ee.shiro.ShiroFunc");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody;

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
    _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("欢迎使用", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".iw_table tbody tr .iw_table_td_view_name{\n");
      out.write("\twidth:50%;\n");
      out.write("\tpadding-left:25%;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("\tpadding:40px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"width:100%;\" id=\"shipinshuoming\"></div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//网站开通24小时内，登录会出现视频说明\n");
      out.write("function shipinjiaocheng(){\n");
      out.write("\ttry {\n");
      out.write("\t\tvar currentTime = Date.parse( new Date() ).toString();\n");
      out.write("\t\tcurrentTime = currentTime.substr(0,10);\n");
      out.write("\t\tif(currentTime - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.regtime }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" < 86400){\n");
      out.write("\t\t\tvar html = '<div style=\"padding: 10px; font-size: 20px;\">由于是您第一天使用，特送出本系统的使用说明</div><iframe frameborder=\"0\" style=\"width:100%; height:600px;\" src=\"");
      out.print(Global.get("SITEUSER_FIRST_USE_EXPLAIN_URL") );
      out.write("\" allowFullScreen=\"true\"></iframe>';    \n");
      out.write("\t\t\tdocument.getElementById('shipinshuoming').innerHTML = html;\n");
      out.write("\t\t}\n");
      out.write("\t} catch(error) {}\n");
      out.write("}\n");
      out.write("shipinjiaocheng();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"layui-tab\" id=\"gonggao\" style=\"display:none;\">\n");
      out.write("  <ul class=\"layui-tab-title\">\n");
      out.write("    <li class=\"layui-this\">公告信息</li>\n");
      out.write("    <li>联系</li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"layui-tab-content\" style=\"font-size:14px;\">\n");
      out.write("    <div class=\"layui-tab-item layui-show\" id=\"parentAgencyNotice\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAgencyNotice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("    <div class=\"layui-tab-item\">\n");
      out.write("    \t名称：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAgency.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("    \t电话：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAgency.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("    \tQQ：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAgency.qq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("    \t地址：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentAgency.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("    \t\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("//注意：选项卡 依赖 element 模块，否则无法进行功能性操作\n");
      out.write("layui.use('element', function(){\n");
      out.write("  var element = layui.element;\n");
      out.write("});\n");
      out.write("try{\n");
      out.write("\tdocument.getElementById('parentAgencyNotice').innerHTML = document.getElementById('parentAgencyNotice').innerHTML.replace(/\\n/g,\"<br/>\");\n");
      out.write("}catch(e){}\n");
      out.write("try{\n");
      out.write("\tif(document.getElementById('parentAgencyNotice').innerHTML.length > 1){\n");
      out.write("\t\tdocument.getElementById('gonggao').style.display='';\n");
      out.write("\t}\n");
      out.write("}catch(e){}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class=\"layui-table iw_table\" lay-even lay-skin=\"nob\" style=\"width:100%; margin-top: 20px;\">\n");
      out.write("\t<tbody>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td class=\"iw_table_td_view_name\">用户名</td>\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td class=\"iw_table_td_view_name\">到期时间</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_x_005ftime_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<a href=\"javascript:parent.jumpParentAgency();\" id=\"yanchangriqi\" class=\"layui-btn layui-btn-primary\" style=\"height: 30px;line-height: 30px;padding: 0 10px;font-size: 12px;margin-right: 10px;\">延长</a>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td class=\"iw_table_td_view_name\">上次登陆时间</td>\n");
      out.write("\t\t\t<td>");
      if (_jspx_meth_x_005ftime_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td class=\"iw_table_td_view_name\">上次登陆ip</td>\n");
      out.write("\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lastip }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td class=\"iw_table_td_view_name\">自动分配域名</td>\n");
      out.write("\t\t\t<td><script>document.write('<a href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${site.domain }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".'+parent.autoAssignDomain+'\" target=\"_black\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${site.domain }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".'+parent.autoAssignDomain+'</a>');</script></td>\n");
      out.write("\t\t</tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2 style=\"padding-top:50px;\">常用功能，快捷导航</h2>\n");
      out.write("<hr>\n");
      out.write("<div>\n");
      out.write("\t<button onclick=\"parent.helpVideo();\" class=\"layui-btn layui-btn-primary\">入门视频教程</button>\n");
      out.write("\t<button onclick=\"parent.openBindDomain();\" class=\"layui-btn layui-btn-primary\">绑定域名</button>\n");
      out.write("\t<button onclick=\"parent.openTemplatePageList('templatepage_type_index');\" class=\"layui-btn layui-btn-primary\">首页(模版)</button>\n");
      out.write("\t<button onclick=\"parent.openTemplatePageList('');\" class=\"layui-btn layui-btn-primary\">模版页面列表</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 未授权用户，请尊重作者劳动成果，保留我方版权标示及链接！授权参见：http://www.wang.market/price.html -->\n");
 if(G.copyright){ 
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		String nowYear = df.format(d);

      out.write("\n");
      out.write("<div style=\"position: fixed;bottom: 5px;color: gray;font-size: 12px;text-align: center;width: 100%;\">Copyright © 2016-");
      out.print(nowYear );
      out.write(" <a href=\"http://www.wang.market\" style=\"color: gray;\" target=\"_black\">网市场云建站系统</a></div>\n");
 } 
      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/foot.jsp", out, false);
      out.write(' ');
      out.write(' ');
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

  private boolean _jspx_meth_x_005ftime_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:time
    com.xnx3.tld.TimeTag _jspx_th_x_005ftime_005f0 = (com.xnx3.tld.TimeTag) _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody.get(com.xnx3.tld.TimeTag.class);
    boolean _jspx_th_x_005ftime_005f0_reused = false;
    try {
      _jspx_th_x_005ftime_005f0.setPageContext(_jspx_page_context);
      _jspx_th_x_005ftime_005f0.setParent(null);
      // /WEB-INF/view/template/welcome.jsp(89,4) name = linuxTime type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_x_005ftime_005f0.setLinuxTime(((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${site.expiretime }", long.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).longValue());
      // /WEB-INF/view/template/welcome.jsp(89,4) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_x_005ftime_005f0.setFormat("yyyy-MM-dd");
      int _jspx_eval_x_005ftime_005f0 = _jspx_th_x_005ftime_005f0.doStartTag();
      if (_jspx_th_x_005ftime_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody.reuse(_jspx_th_x_005ftime_005f0);
      _jspx_th_x_005ftime_005f0_reused = true;
    } finally {
      if (!_jspx_th_x_005ftime_005f0_reused) {
        _jspx_th_x_005ftime_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_x_005ftime_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_x_005ftime_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  x:time
    com.xnx3.tld.TimeTag _jspx_th_x_005ftime_005f1 = (com.xnx3.tld.TimeTag) _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody.get(com.xnx3.tld.TimeTag.class);
    boolean _jspx_th_x_005ftime_005f1_reused = false;
    try {
      _jspx_th_x_005ftime_005f1.setPageContext(_jspx_page_context);
      _jspx_th_x_005ftime_005f1.setParent(null);
      // /WEB-INF/view/template/welcome.jsp(95,7) name = linuxTime type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_x_005ftime_005f1.setLinuxTime(((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lasttime }", long.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).longValue());
      // /WEB-INF/view/template/welcome.jsp(95,7) name = format type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_x_005ftime_005f1.setFormat("yyyy-MM-dd");
      int _jspx_eval_x_005ftime_005f1 = _jspx_th_x_005ftime_005f1.doStartTag();
      if (_jspx_th_x_005ftime_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fx_005ftime_0026_005flinuxTime_005fformat_005fnobody.reuse(_jspx_th_x_005ftime_005f1);
      _jspx_th_x_005ftime_005f1_reused = true;
    } finally {
      if (!_jspx_th_x_005ftime_005f1_reused) {
        _jspx_th_x_005ftime_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_x_005ftime_005f1);
      }
    }
    return false;
  }
}
