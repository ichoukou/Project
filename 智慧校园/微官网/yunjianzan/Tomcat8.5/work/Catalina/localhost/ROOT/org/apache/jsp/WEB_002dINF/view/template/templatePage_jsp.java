/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-02-21 00:42:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xnx3.j2ee.Global;
import com.xnx3.wangmarket.admin.G;

public final class templatePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("编辑模版页面", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(basePath+Global.CACHE_FILE );
      out.write("TemplatePage_type.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath+Global.CACHE_FILE );
      out.write("TemplatePage_editMode.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<form id=\"form\" method=\"post\" class=\"layui-form\" style=\"padding:20px; padding-top:35px; margin-bottom: 0px; padding-bottom:0px;\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t<label class=\"layui-form-label\" id=\"label_type\">所属类型</label>\r\n");
      out.write("\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">writeSelectAllOptionFortype_('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', '请选择', true);</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t<label class=\"layui-form-label\" id=\"label_name\">模版页名称</label>\r\n");
      out.write("\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"name\" lay-verify=\"name\" autocomplete=\"off\" placeholder=\"限20个字符以内\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t<label class=\"layui-form-label\" id=\"label_editMode\">编辑方式</label>\r\n");
      out.write("\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">writeSelectAllOptionForeditMode_('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage.editMode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', '请选择', true);</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t<label class=\"layui-form-label\" id=\"label_remark\">模版页备注</label>\r\n");
      out.write("\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"remark\" lay-verify=\"remark\" autocomplete=\"off\" placeholder=\"限30个字符以内\" class=\"layui-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage.remark }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"layui-form-item\" style=\"padding-top:15px;\">\r\n");
      out.write("\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t<button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"demo1\">保存</button>\r\n");
      out.write("\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"padding:10px; color:#e2e2e2; padding-bottom: 15px;\">\r\n");
      out.write("\t\t提示：鼠标放到左侧描述,可显示当前说明\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var index = parent.layer.getFrameIndex(window.name); //获取窗口索引\r\n");
      out.write("parent.layer.iframeAuto(index);\r\n");
      out.write("\r\n");
      out.write("layui.use(['form', 'layedit', 'laydate'], function(){\r\n");
      out.write("  var form = layui.form;\r\n");
      out.write(" \r\n");
      out.write("  //自定义验证规则\r\n");
      out.write("  form.verify({\r\n");
      out.write("    name: function(value){\r\n");
      out.write("      if(value.length == 0){\r\n");
      out.write("        return '请输入页面的名字';\r\n");
      out.write("      }\r\n");
      out.write("      if(value.length > 20){\r\n");
      out.write("      \treturn '请输入20个字以内的变量名字';\r\n");
      out.write("      }\r\n");
      out.write("    },\r\n");
      out.write("    type: function(value){\r\n");
      out.write("      if(value.length == 0){\r\n");
      out.write("        return '请选择当前模版页类型';\r\n");
      out.write("      }\r\n");
      out.write("    },\r\n");
      out.write("    editMode: function(value){\r\n");
      out.write("      if(value.length == 0){\r\n");
      out.write("        return '请选择模版页面的编辑方式';\r\n");
      out.write("      }\r\n");
      out.write("    },\r\n");
      out.write("    remark: function(value){\r\n");
      out.write("      if(value.length > 30){\r\n");
      out.write("      \treturn '请输入30个字以内的对当前模版页的备注';\r\n");
      out.write("      }\r\n");
      out.write("    },\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //监听提交\r\n");
      out.write("  form.on('submit(demo1)', function(data){\r\n");
      out.write("\t\tparent.iw.loading('保存中');\r\n");
      out.write("\t\tvar d=$(\"form\").serialize();\r\n");
      out.write("        $.post(\"");
      out.print(basePath );
      out.write("template/saveTemplatePage.do\", d, function (result) { \r\n");
      out.write("        \tparent.iw.loadClose();\r\n");
      out.write("        \tvar obj = JSON.parse(result);\r\n");
      out.write("        \tif(obj.result == '1'){\r\n");
      out.write("        \t\tparent.parent.iw.msgSuccess(\"保存成功\");\r\n");
      out.write("       \t\t\tparent.location.reload();\t//刷新父窗口\r\n");
      out.write("       \t\t\tparent.layer.close(index);\r\n");
      out.write("        \t}else if(obj.result == '0'){\r\n");
      out.write("        \t\tlayer.msg(obj.info, {shade: 0.3})\r\n");
      out.write("        \t}else{\r\n");
      out.write("        \t\tlayer.msg(result, {shade: 0.3})\r\n");
      out.write("        \t}\r\n");
      out.write("         }, \"text\");\r\n");
      out.write("\t\t\r\n");
      out.write("    return false;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//鼠标跟随提示\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//类型\r\n");
      out.write("\tvar label_type_index = 0;\r\n");
      out.write("\t$(\"#label_type\").hover(function(){\r\n");
      out.write("\t\tlabel_type_index = layer.tips('首页模版只能存在一个！<br/>多个就不起作用了！', '#label_type', {\r\n");
      out.write("\t\t\ttips: [2, '#0FA6A8'], //还可配置颜色\r\n");
      out.write("\t\t\ttime:0,\r\n");
      out.write("\t\t\ttipsMore: true,\r\n");
      out.write("\t\t\tarea : ['230px' , 'auto']\r\n");
      out.write("\t\t});\r\n");
      out.write("\t},function(){\r\n");
      out.write("\t\tlayer.close(label_type_index);\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t//名字\r\n");
      out.write("\tvar label_name_index = 0;\r\n");
      out.write("\t$(\"#label_name\").hover(function(){\r\n");
      out.write("\t\tlabel_name_index = layer.tips('<ol style=\"list-style-type:demical\"><li style=\"list-style-position:outside;\">模版页面的名字，建议用英文、数字、\"_\" 来命名，强烈不建议用汉字。</li><li style=\"list-style-position:outside;\"><b>添加后最好不要对其进行修改了！</b>栏目绑定的模版、备份还原模版页时，都是依据此处进行操作。</li></ol>', '#label_name', {\r\n");
      out.write("\t\t\ttips: [2, '#0FA6A8'], //还可配置颜色\r\n");
      out.write("\t\t\ttime:0,\r\n");
      out.write("\t\t\ttipsMore: true,\r\n");
      out.write("\t\t\tarea : ['230px' , 'auto']\r\n");
      out.write("\t\t});\r\n");
      out.write("\t},function(){\r\n");
      out.write("\t\tlayer.close(label_name_index);\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t//备注\r\n");
      out.write("\tvar label_remark_index = 0;\r\n");
      out.write("\t$(\"#label_remark\").hover(function(){\r\n");
      out.write("\t\tlabel_remark_index = layer.tips('给网站后台操作人员备注提示说明，便于区分模版页面，仅此而已，无实际作用', '#label_remark', {\r\n");
      out.write("\t\t\ttips: [2, '#0FA6A8'], //还可配置颜色\r\n");
      out.write("\t\t\ttime:0,\r\n");
      out.write("\t\t\ttipsMore: true,\r\n");
      out.write("\t\t\tarea : ['230px' , 'auto']\r\n");
      out.write("\t\t});\r\n");
      out.write("\t},function(){\r\n");
      out.write("\t\tlayer.close(label_remark_index);\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t//编辑方式\r\n");
      out.write("\tvar label_editMode_index = 0;\r\n");
      out.write("\t$(\"#label_editMode\").hover(function(){\r\n");
      out.write("\t\tlabel_editMode_index = layer.tips('模版页面的内容编辑方式：<br/><b>可视化编辑</b>：也就是智能模式，想改图片，右键修改-上传；想改文字，鼠标点击直接输入。<br/><b>纯代码编辑</b>：纯代码编辑，同传统的帝国CMS、织梦CMS的textarea文本框编辑。如果您之前使用过帝国、织梦，您可先用此种方式。另外，如果网站js效果很多，建议使用代码模式。', '#label_editMode', {\r\n");
      out.write("\t\t\ttips: [2, '#0FA6A8'], //还可配置颜色\r\n");
      out.write("\t\t\ttime:0,\r\n");
      out.write("\t\t\ttipsMore: true,\r\n");
      out.write("\t\t\tarea : ['230px' , 'auto']\r\n");
      out.write("\t\t});\r\n");
      out.write("\t},function(){\r\n");
      out.write("\t\tlayer.close(label_editMode_index);\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("});\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
