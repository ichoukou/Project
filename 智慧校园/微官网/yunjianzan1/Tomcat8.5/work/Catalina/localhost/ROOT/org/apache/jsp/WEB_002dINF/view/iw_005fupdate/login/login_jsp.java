/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-01-23 09:07:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.iw_005fupdate.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xnx3.j2ee.Global;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/E:/Work/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/Work/yunjianzan/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
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
  }

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
  }

  public void _jspDestroy() {
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("登录", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".myForm{\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("    width: 495px;\n");
      out.write("    height: 360px;\n");
      out.write("    border-width: 1px 1px 1px 1px;\n");
      out.write("    padding: 0px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    -webkit-box-shadow: 0 0 10px #e2e2e2;\n");
      out.write("    -moz-box-shadow: 0 0 10px #e2e2e2;\n");
      out.write("    box-shadow: 0 0 10px #e2e2e2;\n");
      out.write("    position: absolute;\n");
      out.write("    left: 50%;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-left: -248px;\n");
      out.write("    margin-top: -181px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width:600px){\n");
      out.write("\t.myForm{\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t    width: 100%;\n");
      out.write("\t    height: 100%;\n");
      out.write("\t    border-width: 0px;\n");
      out.write("\t    padding: 0px;\n");
      out.write("\t    border-radius: 0px;\n");
      out.write("\t    overflow: auto;\n");
      out.write("\t    -webkit-box-shadow: 0 0 0px #e2e2e2;\n");
      out.write("\t    -moz-box-shadow: 0 0 0px #e2e2e2;\n");
      out.write("\t    box-shadow: 0 0 0px #e2e2e2;\n");
      out.write("\t    position: static;\n");
      out.write("\t    left: 0px;\n");
      out.write("\t    top: 0px;\n");
      out.write("\t    margin-left: 0px;\n");
      out.write("\t    margin-top: 0px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".touming{\n");
      out.write("\tbackground: rgba(0,190,150,0.1) none repeat scroll !important;\n");
      out.write("}\n");
      out.write(".baisetouming{\n");
      out.write("\tbackground: rgba(250,250,250,0.1) none repeat scroll !important;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- 背景 -->\n");
      out.write("<div class=\"layui-canvs\" style=\"position: fixed;top: 0px;left: 0px;z-index: -1;\"></div>\n");
      out.write("\n");
      out.write("<form class=\"layui-form layui-elem-quote layui-quote-nm myForm\">\n");
      out.write("  <div class=\"layui-form-item touming\" style=\"height: 70px;background-color: #eeeeee;line-height: 70px;text-align: center;font-size: 25px;color: #3F4056;\">\n");
      out.write("    ");
      out.print(Global.get("SITE_NAME") );
      out.write(" 云建站平台登陆\n");
      out.write("  </div>\n");
      out.write("  <div style=\"padding: 30px 50px 40px 0px;\">\n");
      out.write("  \t<div class=\"layui-form-item\">\n");
      out.write("\t    <label class=\"layui-form-label\">用户名</label>\n");
      out.write("\t    <div class=\"layui-input-block\">\n");
      out.write("\t      <input type=\"text\" name=\"username\" required  lay-verify=\"required\" placeholder=\"请输入 用户名/邮箱\" autocomplete=\"off\" class=\"layui-input baisetouming\">\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-form-item\">\n");
      out.write("\t    <label class=\"layui-form-label\"> 密 码&nbsp;&nbsp; </label>\n");
      out.write("\t    <div class=\"layui-input-block\">\n");
      out.write("\t      <input type=\"password\" name=\"password\" required lay-verify=\"required\" placeholder=\"请输入密码\" autocomplete=\"off\" class=\"layui-input baisetouming\">\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-form-item\">\n");
      out.write("\t    <label class=\"layui-form-label\"> 验证码 </label>\n");
      out.write("\t    <div class=\"layui-input-inline\">\n");
      out.write("\t      <input type=\"text\" name=\"code\" required lay-verify=\"required\" placeholder=\"请输入右侧验证码\" autocomplete=\"off\" class=\"layui-input baisetouming\">\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"layui-form-mid layui-word-aux\" style=\"padding-top: 3px;padding-bottom: 0px;\"><img id=\"code\" src=\"captcha.do\" onclick=\"reloadCode();\" style=\"height: 29px;width: 110px; cursor: pointer;\" /></div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-form-item\" style=\"display:none\">\n");
      out.write("\t    <label class=\"layui-form-label\">记住密码</label>\n");
      out.write("\t    <div class=\"layui-input-block\">\n");
      out.write("\t      <input type=\"checkbox\" name=\"switch\" lay-skin=\"switch\">\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-form-item\">\n");
      out.write("\t    <div class=\"layui-input-block\">\n");
      out.write("\t      <button class=\"layui-btn\" lay-submit lay-filter=\"formDemo\" style=\"opacity:0.6; margin-right: 50px;\">立即登陆</button>\n");
      out.write("\t      <button type=\"reset\" class=\"layui-btn layui-btn-primary baisetouming\" style=\"width: 90px;\">重置</button>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write(" \n");
      out.write("<!--[if IE]>\n");
      out.write("\t<div style=\"position: absolute;bottom: 0px;padding: 10px;text-align: center;width: 100%;background-color: yellow;\">建议使用<a href=\"https://www.baidu.com/s?wd=Chrome\" target=\"_black\" style=\"text-decoration:underline\">Chrome(谷歌)</a>、<a href=\"https://www.baidu.com/s?wd=Firefox\" target=\"_black\" style=\"text-decoration:underline\">Firefox(火狐)</a>浏览器，IE浏览器会无法操作！！！</div>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<!-- weui -->\n");
      out.write("<script src=\"http://res.weiunity.com/js/jquery-2.1.4.js\"></script>\n");
      out.write("<script src=\"http://res.weiunity.com/js/jquery-weui.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://res.weiunity.com/css/weui.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://res.weiunity.com/css/jquery-weui.css\">\n");
      out.write("<script>\n");
      out.write("//Demo\n");
      out.write("layui.use('form', function(){\n");
      out.write("  var form = layui.form;\n");
      out.write("  \n");
      out.write("  //监听提交\n");
      out.write("  form.on('submit(formDemo)', function(data){\n");
      out.write("  \t$.showLoading('登录中...');\n");
      out.write("    var d=$(\"form\").serialize();\n");
      out.write("\t$.post(\"");
      out.print(basePath );
      out.write("loginSubmit.do\", d, function (result) {\n");
      out.write("\t\t$.hideLoading();\n");
      out.write("       \tvar obj = JSON.parse(result);\n");
      out.write("       \tif(obj.result == '1'){\n");
      out.write("       \t\tlayer.msg('登陆成功', {shade: 0.3});\n");
      out.write("       \t\twindow.location.href=obj.info;\n");
      out.write("       \t}else if(obj.result == '0'){\n");
      out.write("       \t\t//登陆失败\n");
      out.write("       \t\treloadCode();\n");
      out.write("       \t\tlayer.msg(obj.info, {shade: 0.3})\n");
      out.write("       \t}else if(obj.result == '11'){\n");
      out.write("       \t\t//网站已过期。弹出提示\n");
      out.write("       \t\treloadCode();\n");
      out.write("       \t\tlayer.open({\n");
      out.write("\t\t\t  title: '到期提示'\n");
      out.write("\t\t\t  ,content: obj.info\n");
      out.write("\t\t\t});     \n");
      out.write("       \t}else{\n");
      out.write("       \t\treloadCode();\n");
      out.write("       \t\tlayer.msg(result, {shade: 0.3})\n");
      out.write("       \t}\n");
      out.write("\t}, \"text\");\n");
      out.write("    return false;\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("\n");
      out.write("//重新加载验证码\n");
      out.write("function reloadCode(){\n");
      out.write("var code=document.getElementById('code');\n");
      out.write("code.setAttribute('src','captcha.do?'+Math.random());\n");
      out.write("//这里必须加入随机数不然地址相同我发重新加载\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("//检测浏览器，若不是Chrome浏览器，弹出提示\n");
      out.write("if(navigator.userAgent.indexOf('Chrome') == -1){\n");
      out.write("\tlayer.open({\n");
      out.write("\t  type: 1\n");
      out.write("\t  ,title:'提示'\n");
      out.write("\t  ,offset: 'rb' //具体配置参考：offset参数项\n");
      out.write("\t  ,content: '<div style=\"padding: 18px; line-height:30px;\">建议使用<a href=\"https://www.baidu.com/s?wd=Chrome\" target=\"_black\" style=\"text-decoration:underline\">Chrome(谷歌)</a>浏览器<br/>其他浏览器登录可能无法正常操作！</div>'\n");
      out.write("\t  ,btn: ['下载Chrome','忽略']\n");
      out.write("\t  ,btnAlign: 'c' //按钮居中\n");
      out.write("\t  ,shade: 0 //不显示遮罩\n");
      out.write("\t  ,yes: function(){\n");
      out.write("\t    layer.closeAll();\n");
      out.write("\t    window.open(\"https://www.baidu.com/s?wd=Chrome\");\n");
      out.write("\t  }\n");
      out.write("\t  ,btn2: function(){\n");
      out.write("\t    layer.closeAll();\n");
      out.write("\t  }\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 以下为背景特效相关 -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("'use strict';\n");
      out.write("layui.use(['jquery'],function(){\n");
      out.write("\twindow.jQuery = window.$ = layui.jquery;\n");
      out.write("   $(\".layui-canvs\").width($(window).width());\n");
      out.write("   $(\".layui-canvs\").height($(window).height());\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://res.weiunity.com/js/jparticle.jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\t$(\".layui-canvs\").jParticle({\n");
      out.write("\t\tbackground: \"#FFFFFF\",\n");
      out.write("\t\tcolor: \"#FDFDFD\"\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!-- 背景特效相关结束 -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
