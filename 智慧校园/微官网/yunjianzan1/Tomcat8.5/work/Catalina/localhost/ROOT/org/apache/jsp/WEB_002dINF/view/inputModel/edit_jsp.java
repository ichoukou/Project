/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-01-24 00:47:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.inputModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xnx3.j2ee.Global;
import com.xnx3.wangmarket.admin.G;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write('\n');
      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("编辑输入模型", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("<!-- 代码编辑模式所需资源 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"http://res.weiunity.com/editor/css/editormd.css\" />\n");
      out.write("<script src=\"http://res.weiunity.com/editor/editormd.js\"></script>\n");
      out.write("\n");
      out.write("<form id=\"form\" class=\"layui-form layui-form-pane\" action=\"save.do\" method=\"post\" style=\"padding:5px;\">\n");
      out.write("  <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inputModel.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("  \n");
      out.write("      <div class=\"layui-form-item\" style=\"\">\n");
      out.write("    <label class=\"layui-form-label\">模型代码</label>\n");
      out.write("    <div class=\"layui-input-inline\">\n");
      out.write("      <input type=\"text\" name=\"codeName\" lay-verify=\"codeName\" placeholder=\"请输入模型代码\" autocomplete=\"off\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inputModel.codeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"layui-form-mid\" style=\"color: gray; font-size: 14px; padding-top:0px;\">同一个网站中的模型代码必须是唯一的,限30字以内。<b>强烈建议添加后就不要改动了！</b><br/>备份还原、栏目绑定模型都是使用此模型代码</div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"layui-form-item\" style=\"\">\n");
      out.write("    <label class=\"layui-form-label\">备注说明</label>\n");
      out.write("    <div class=\"layui-input-inline\">\n");
      out.write("      <input type=\"text\" name=\"remark\" lay-verify=\"remark\" placeholder=\"请输入备注\" autocomplete=\"off\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inputModel.remark }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"layui-form-mid\" style=\"color: gray; font-size: 14px;\">仅为提示备注,无其他任何作用,限制30字以内</div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div class=\"layui-form-item layui-form-text\" style=\"height: 80%;\">\n");
      out.write("    <label class=\"layui-form-label\">模型内容(2万字以内)</label>\n");
      out.write("    <div class=\"layui-input-block\">\n");
      out.write("    \t<div id=\"htmlMode\" style=\"width:100%;height:auto; \">\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"editormd\" style=\"width:100%; height:auto; min-height:400px;\">\n");
      out.write("\t\t\t\t<textarea name=\"text\" id=\"html_textarea\" style=\"height:600px;\" lay-verify=\"text\" placeholder=\"请输入输入模型的提交表单的html代码\" class=\"layui-textarea\" style=\"height: 95%;\"></textarea>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\t<!-- 说明区域 -->\n");
      out.write("\t<div class=\"layui-collapse\" style=\"margin-top:-17px;\">\n");
      out.write("\t  <div class=\"layui-colla-item\">\n");
      out.write("\t    <h2 class=\"layui-colla-title\">动态调取参数说明(若是修改数据，可用此参数调取原本数据的信息)</h2>\n");
      out.write("\t    <div class=\"layui-colla-content\" style=\"font-size:12px;\">\n");
      out.write("\t    \t{news.title} 标题<br/>\n");
      out.write("\t    \t{news.intro} 简介<br/>\n");
      out.write("\t    \t{news.extend.???} 【推荐】预留字段，可根据你的意愿来自由使用，自由扩展任意多的字段。 <a href=\"http://tag.wscso.com/8318.html\" target=\"_black\">查看详细说明</a><br/>\n");
      out.write("\t    \t{news.reserve1} 【已不推荐！推荐使用 {news.extend.???}】预留字段，系统中未使用，可根据你的意愿来自由使用<br/>\n");
      out.write("\t    \t{news.reserve2} 【已不推荐! 推荐使用 {news.extend.???}】预留字段，系统中未使用，可根据你的意愿来自由使用<br/>\n");
      out.write("\t    \t{titlepicImage} 或 {news.titlepic} 标题图/列表图，用于列表展示的图片，若有，会以<img ...>标签显示出来<br/>\n");
      out.write("\t    \t{siteColumn.type} 当前操作的内容所属栏目的类型编码<br/>\n");
      out.write("\t    \t{text} 内容，正文<br/>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-colla-item\">\n");
      out.write("\t    <h2 class=\"layui-colla-title\">表单提交保存数据的input标签的name说明</h2>\n");
      out.write("\t    <div class=\"layui-colla-content\" style=\"font-size:12px;\">\n");
      out.write("\t    \tname=\"title\" 标题(最大可输入30字，必填项，不可省去，必须存在此项)<br/>\n");
      out.write("\t    \tname=\"intro\" 简介(最大可输入160字，选填，若不需要可不再表单中体现).<br/>\n");
      out.write("\t    \t&nbsp;&nbsp;&nbsp;&nbsp;当提交的简介为空，或者没有简介这个字段时，会自动从正文text中截取前160个字作为简介<br/>\n");
      out.write("\t    \t&nbsp;&nbsp;&nbsp;&nbsp;当提交的简介有内容时，保存简介的内容<br/>\n");
      out.write("\t    \tname=\"titlePicFile\" 标题图，用于存储信息列表展示的图片，如产品展示栏目所需要的产品列表图，注意，此处input标签的type类型需要为file！(选填，若不需要可不再表单中体现)\n");
      out.write("\t    \tname=\"text\" 内容，正文，最大可保存五十万字。几乎可忽略字数限制。<br/>\n");
      out.write("\t    \tname=\"news.extend.???\" 推荐】预留字段，可根据你的意愿来自由使用,自由扩展任意多的字段。 <a href=\"http://tag.wscso.com/8318.html\" target=\"_black\">查看详细说明</a><br/>\n");
      out.write("\t    \tname=\"reserve1\" 【已不推荐！推荐使用 news.extend.???】预留字段，系统中未使用，可根据你的意愿来自由使用。长度限制10个文字字符以内！<br/>\n");
      out.write("\t    \tname=\"reserve2\" 【已不推荐！推荐使用 news.extend.???】预留字段，系统中未使用，可根据你的意愿来自由使用。长度限制10个文字字符以内！<br/>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"layui-colla-item\" style=\"font-size:12px;\">\n");
      out.write("\t    <h2 class=\"layui-colla-title\">其他说明</h2>\n");
      out.write("\t    <div class=\"layui-colla-content\">\n");
      out.write("\t    \t1. 模型内容最大可存储两万字。\n");
      out.write("    \t\t<br/>2. 已引入JQuery、Layer等js框架，可直接再其中使用\n");
      out.write("    \t\t<br/>3. 您可自己在其中添加js方法 function save(){} 在点击保存时，会先执行save()，再执行提交。 另外，如果save() 方法 return false，那么会终止保存功能的执行，即不会进行保存\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <br/>\n");
      out.write("  <div class=\"layui-form-item\" style=\"text-align:center;\">\n");
      out.write("  \t<button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"demo1\">保存</button>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("layui.use(['element', 'form', 'layedit', 'laydate'], function(){\n");
      out.write("  var form = layui.form;\n");
      out.write("  var element = layui.element;\n");
      out.write("  \n");
      out.write("  //自定义验证规则\n");
      out.write("  form.verify({\n");
      out.write("    remark: function(value){\n");
      out.write("      if(value.length > 30){\n");
      out.write("      \treturn '请输入30个字以内的输入模型的名称';\n");
      out.write("      }\n");
      out.write("    },\n");
      out.write("    codeName: function(value){\n");
      out.write("        if(value.length == 0){\n");
      out.write("          return '请输入输入模型代码';\n");
      out.write("        }\n");
      out.write("        if(value.length > 30){\n");
      out.write("        \treturn '请输入30个字以内的输入模型代码';\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  //监听提交\n");
      out.write("  form.on('submit(demo1)', function(data){\n");
      out.write("\t\tparent.iw.loading('保存中');\n");
      out.write("\t\tvar d=$(\"form\").serialize();\n");
      out.write("        $.post(\"");
      out.print(basePath );
      out.write("inputModel/save.do\", d, function (result) { \n");
      out.write("        \tparent.iw.loadClose();\n");
      out.write("        \tvar obj = JSON.parse(result);\n");
      out.write("        \tif(obj.result == '1'){\n");
      out.write("        \t\tparent.iw.msgSuccess(\"保存成功\");\n");
      out.write("        \t\twindow.location.href=\"list.do\";\n");
      out.write("        \t}else if(obj.result == '0'){\n");
      out.write("        \t\tlayer.msg(obj.info, {shade: 0.3})\n");
      out.write("        \t}else{\n");
      out.write("        \t\tlayer.msg(result, {shade: 0.3})\n");
      out.write("        \t}\n");
      out.write("         }, \"text\");\n");
      out.write("\t\t\n");
      out.write("    return false;\n");
      out.write("  });\n");
      out.write("  \n");
      out.write("});\n");
      out.write("\n");
      out.write("//在加载完输入模型内容后，进行加载编辑器\n");
      out.write("function loadEditor(){\n");
      out.write("\t//代码编辑器\n");
      out.write("\ttestEditor = editormd(\"editormd\", {\n");
      out.write("\t    width            : \"100%\",\n");
      out.write("\t    height            : \"650px\",\n");
      out.write("\t    watch            : false,\n");
      out.write("\t    toolbar          : false,\n");
      out.write("\t    codeFold         : true,\n");
      out.write("\t    searchReplace    : true,\n");
      out.write("\t    placeholder      : \"请输入模版变量的代码\",\n");
      out.write("\t    value            : document.getElementById(\"html_textarea\").value,\n");
      out.write("\t    theme            : \"default\",\n");
      out.write("\t    mode             : \"text/html\",\n");
      out.write("\t    path             : 'http://res.weiunity.com/editor/lib/'\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//加载输入模型的主要数据\n");
      out.write("function load(){\n");
      out.write("\tparent.iw.loading(\"加载中\");\n");
      out.write("\t$.post(\"");
      out.print(basePath );
      out.write("inputModel/getInputModelTextById.do?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inputModel.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\", function(data){\n");
      out.write("\t\tparent.iw.loadClose();\n");
      out.write("\t\tif(data.result == '1'){\n");
      out.write("\t\t\t//编辑模式，获取模型主要内容成功，加载到textarea\n");
      out.write("\t\t\tdocument.getElementById(\"html_textarea\").innerHTML = data.info;\n");
      out.write("\t\t\tloadEditor();\n");
      out.write("\t \t}else if(data.result == '3'){\n");
      out.write("\t \t\t//新增模式，获取默认的输入模型内容，赋予textarea\n");
      out.write("\t\t\tdocument.getElementById(\"html_textarea\").innerHTML = data.info;\n");
      out.write("\t\t\tlayer.msg(\"自动赋予系统默认输入模型，可以在此基础上进行修改，以创建自己的输入模型！\", {shade: 0.3})\n");
      out.write("\t\t\tloadEditor();\n");
      out.write("\t \t}else{\n");
      out.write("\t \t\tparent.iw.msgFailure(data.info);\n");
      out.write("\t \t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("}\n");
      out.write("load();\n");
      out.write("\n");
      out.write("\n");
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
