/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2019-02-21 09:24:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.xnx3.wangmarket.admin.entity.TemplatePage;
import com.xnx3.wangmarket.admin.entity.Site;
import com.xnx3.j2ee.Global;

public final class templatePageList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1430113524000L));
    _jspx_dependants.put("/WEB-INF/lib/xnx3_tld.jar", Long.valueOf(1512734430000L));
    _jspx_dependants.put("jar:file:/E:/github/Project/智慧校园/微官网/yunjianzan1/Tomcat8.5/webapps/ROOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/github/Project/智慧校园/微官网/yunjianzan1/Tomcat8.5/webapps/ROOT/WEB-INF/lib/xnx3_tld.jar!/META-INF/xnx3.tld", Long.valueOf(1495004768000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.xnx3.wangmarket.admin.entity.TemplatePage");
    _jspx_imports_classes.add("com.xnx3.j2ee.Global");
    _jspx_imports_classes.add("com.xnx3.wangmarket.admin.entity.Site");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../iw/common/head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("模版页面列表", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("<script src=\"");
      out.print(basePath+Global.CACHE_FILE );
      out.write("TemplatePage_type.js\"></script>\n");
      out.write("\n");
      out.write("<table class=\"layui-table\" id=\"xnx3_body\" style=\"margin:0px;\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>页面名字</th>\n");
      out.write("      <th>类型</th>\n");
      out.write("      <th>备注</th>\n");
      out.write("      <th>操作</th>\n");
      out.write("    </tr> \n");
      out.write("  </thead>\n");
      out.write("  <tbody class=\"tile__listedit\" id=\"columnList\">\n");
      out.write("  \t<!-- display 显示或者隐藏，是否在导航中显示。若为0，则不加入排序 -->\n");
      out.write("  \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div style=\"padding:15px;\">\n");
      out.write("\t<button onclick=\"addTemplatePage();\" class=\"layui-btn\" style=\"margin-left: 10px;margin-bottom: 20px;\">添加模版页面</button>\n");
      out.write("\t<div style=\"float:right; margin-top:3px; color:#d2d2d2;\"></div>\n");
      out.write("</div>\n");
      out.write("<div style=\"padding-right:15px; text-align: right;margin-top: -66px;\">\n");
      out.write("\t提示：&nbsp;&nbsp;&nbsp;\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe614;</i></botton><span style=\"padding-left:12px;padding-right: 30px;\">设置属性</span>\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe642;</i></botton><span style=\"padding-left:12px;padding-right: 30px;\">编辑内容</span>\n");
      out.write("\t<botton class=\"\"><i class=\"layui-icon\">&#xe640;</i></botton><span style=\"padding-left:12px;padding-right: 30px;\">删除</span>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var index = parent.layer.getFrameIndex(window.name); //获取窗口索引\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 编辑页面的内容代码\n");
      out.write(" * @param name TemplatePage.name要编辑的模版页面名字\n");
      out.write(" * @param templateType 当前模版页的类型\n");
      out.write(" * @param templateEditMode 编辑方式，1:智能模式； 2:代码模式\n");
      out.write(" */\n");
      out.write("function editText(name, templateType, templateEditMode){\n");
      out.write("\tparent.document.getElementById(\"currentTemplatePageName\").value = name;\n");
      out.write("\tif(templateEditMode == '2'){\n");
      out.write("\t\t//要编辑的模版页面是代码模式\n");
      out.write("\t\tparent.codeEditMode();\n");
      out.write("\t}else{\n");
      out.write("\t\t//要编辑的模版页面是智能模式\n");
      out.write("\t\tparent.loadIframe();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\ttry{\n");
      out.write("\t\tif(templateType == ");
      out.print(TemplatePage.TYPE_INDEX );
      out.write("){\n");
      out.write("\t\t\t//首页\n");
      out.write("\t\t\tparent.document.getElementById(\"currentTemplateType\").innerHTML = '首页模版';\n");
      out.write("\t\t\tparent.document.getElementById(\"tongyong\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"lanmu\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"fenye\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"wenzhang\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"dongtailanmu\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"xiangqingduyou\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"liebiaoduyou\").style.display = 'none';\n");
      out.write("\t\t}else if(templateType == ");
      out.print(TemplatePage.TYPE_NEWS_LIST );
      out.write("){\n");
      out.write("\t\t\t//列表页\n");
      out.write("\t\t\tparent.document.getElementById(\"currentTemplateType\").innerHTML = '列表页模版';\n");
      out.write("\t\t\tparent.document.getElementById(\"tongyong\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"lanmu\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"fenye\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"wenzhang\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"dongtailanmu\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"xiangqingduyou\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"liebiaoduyou\").style.display = '';\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t//内容页\n");
      out.write("\t\t\tparent.document.getElementById(\"currentTemplateType\").innerHTML = '详情页模版';\n");
      out.write("\t\t\tparent.document.getElementById(\"tongyong\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"lanmu\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"fenye\").style.display = 'none';\n");
      out.write("\t\t\tparent.document.getElementById(\"wenzhang\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"dongtailanmu\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"xiangqingduyou\").style.display = '';\n");
      out.write("\t\t\tparent.document.getElementById(\"liebiaoduyou\").style.display = 'none';\n");
      out.write("\t\t}\n");
      out.write("\t}catch(err){}\n");
      out.write("\t\n");
      out.write("\t//parent.document.getElementById('iframe').src='");
      out.print(basePath );
      out.write("template/getTemplatePageText.do?pageName='+name;\n");
      out.write("\tparent.layer.close(index);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 添加模版页面\n");
      out.write(" */\n");
      out.write("function addTemplatePage(){\n");
      out.write("\tlayer.open({\n");
      out.write("\t\ttype: 2, \n");
      out.write("\t\ttitle:'添加模版页', \n");
      out.write("\t\tarea: ['400px', '350px'],\n");
      out.write("\t\tshadeClose: true, //开启遮罩关闭\n");
      out.write("\t\tcontent: '");
      out.print(basePath );
      out.write("template/templatePage.do'\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 编辑模版页属性\n");
      out.write(" */\n");
      out.write("function editTemplatePageAttribute(pageName){\n");
      out.write("\tlayer.open({\n");
      out.write("\t\ttype: 2, \n");
      out.write("\t\ttitle:'编辑模版页属性', \n");
      out.write("\t\tarea: ['400px', '350px'],\n");
      out.write("\t\tshadeClose: true, //开启遮罩关闭\n");
      out.write("\t\tcontent: '");
      out.print(basePath );
      out.write("template/templatePage.do?pageName='+pageName\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * 删除模版页\n");
      out.write(" * id 要编辑的模版页的id\n");
      out.write(" * name 要删除的项的名字\n");
      out.write(" */\n");
      out.write("function deleteTemplatePage(id, name){\n");
      out.write("\tvar dtp_confirm = layer.confirm('确定要删除“'+name+'”？删除后不可恢复！', {\n");
      out.write("\t  btn: ['删除','取消'] //按钮\n");
      out.write("\t}, function(){\n");
      out.write("\t\tlayer.close(dtp_confirm);\n");
      out.write("\t\tparent.iw.loading('删除中');\n");
      out.write("\t\t$.post('");
      out.print(basePath );
      out.write("template/deleteTemplatePage.do?id='+id, function(data){\n");
      out.write("\t\t\tparent.iw.loadClose();\n");
      out.write("\t\t\tif(data.result == '1'){\n");
      out.write("\t\t\t\tparent.iw.msgSuccess(\"删除成功\");\n");
      out.write("\t\t\t\tlocation.reload();\n");
      out.write("\t\t \t}else if(data.result == '0'){\n");
      out.write("\t\t \t\tparent.iw.msgFailure(data.info);\n");
      out.write("\t\t \t}else{\n");
      out.write("\t\t \t\tparent.iw.msgFailure();\n");
      out.write("\t\t \t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t}, function(){\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 自动跳转到指定页面进行编辑 -->\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autoEditText }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/template/templatePageList.jsp(27,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/template/templatePageList.jsp(27,3) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/template/templatePageList.jsp(27,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("templatePage");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        <tr>\n");
            out.write("        \t<!--display");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column['used']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("-->\n");
            out.write("            <td >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['name'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("            <td style=\"width:90px;\"><script type=\"text/javascript\">document.write(type[");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['type'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("]);</script></td>\n");
            out.write("            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['remark'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("            <td style=\"width:160px;\">\n");
            out.write("            \t <button onclick=\"editTemplatePageAttribute('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['name'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("');\" class=\"layui-btn layui-btn-sm\"><i class=\"layui-icon\">&#xe614;</i></button>\n");
            out.write("            \t <button onclick=\"editText('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['name'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['type'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(',');
            out.write(' ');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['editMode'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("');\" class=\"layui-btn layui-btn-sm\"><i class=\"layui-icon\">&#xe642;</i></button>\n");
            out.write("            \t <button onclick=\"deleteTemplatePage('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['id'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templatePage['name'] }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("');\" class=\"layui-btn layui-btn-sm\"><i class=\"layui-icon\">&#xe640;</i></button>\n");
            out.write("\t\t\t</td>\n");
            out.write("        </tr>\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
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
    return false;
  }
}
