/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-18 03:34:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userstatistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>注意力训练分析图</title>\r\n");
      out.write("    <!-- 导入jquery核心类库 -->\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("    <!-- 导入easyui类库 -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts/echarts.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            panels = [{\r\n");
      out.write("                id: 'p1',\r\n");
      out.write("                title: '本组注意力变化趋势',\r\n");
      out.write("                height: 400,\r\n");
      out.write("                collapsible: true,\r\n");
      out.write("                href: 'page_user_recordall.action'\r\n");
      out.write("            }, {\r\n");
      out.write("                id: 'p2',\r\n");
      out.write("                title: '本组舒尔特方格练习用时趋势',\r\n");
      out.write("                height: 400,\r\n");
      out.write("                collapsible: true,\r\n");
      out.write("                href: 'page_user_time.action'\r\n");
      out.write("            }, {\r\n");
      out.write("                id: 'p3',\r\n");
      out.write("                title: '本组舒尔特方格练习错误点击次数',\r\n");
      out.write("                height: 400,\r\n");
      out.write("                collapsible: true,\r\n");
      out.write("                href: 'page_user_errorcount.action'\r\n");
      out.write("            }, {\r\n");
      out.write("                id: 'p4',\r\n");
      out.write("                title: '学习能力成绩',\r\n");
      out.write("                height: 400,\r\n");
      out.write("                collapsible: true,\r\n");
      out.write("                href: 'page_user_score.action'\r\n");
      out.write("            }];\r\n");
      out.write("            $('#layout_portal_portal').portal({\r\n");
      out.write("                border: false,\r\n");
      out.write("                fit: true\r\n");
      out.write("            });\r\n");
      out.write("            var state = state = 'p1,p2:p3,p4';\r\n");
      out.write("            /*冒号代表列，逗号代表行*/\r\n");
      out.write("\r\n");
      out.write("            addPortalPanels(state);\r\n");
      out.write("            $('#layout_portal_portal').portal('resize');\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function getPanelOptions(id) {\r\n");
      out.write("            for (var i = 0; i < panels.length; i++) {\r\n");
      out.write("                if (panels[i].id == id) {\r\n");
      out.write("                    return panels[i];\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            return undefined;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function getPortalState() {\r\n");
      out.write("            var aa = [];\r\n");
      out.write("            for (var columnIndex = 0; columnIndex < 2; columnIndex++) {\r\n");
      out.write("                var cc = [];\r\n");
      out.write("                var panels = $('#layout_portal_portal').portal('getPanels', columnIndex);\r\n");
      out.write("                for (var i = 0; i < panels.length; i++) {\r\n");
      out.write("                    cc.push(panels[i].attr('id'));\r\n");
      out.write("                }\r\n");
      out.write("                aa.push(cc.join(','));\r\n");
      out.write("            }\r\n");
      out.write("            return aa.join(':');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function addPortalPanels(portalState) {\r\n");
      out.write("            var columns = portalState.split(':');\r\n");
      out.write("            for (var columnIndex = 0; columnIndex < columns.length; columnIndex++) {\r\n");
      out.write("                var cc = columns[columnIndex].split(',');\r\n");
      out.write("                for (var j = 0; j < cc.length; j++) {\r\n");
      out.write("                    var options = getPanelOptions(cc[j]);\r\n");
      out.write("                    if (options) {\r\n");
      out.write("                        var p = $('<div/>').attr('id', options.id).appendTo('body');\r\n");
      out.write("                        p.panel(options);\r\n");
      out.write("                        $('#layout_portal_portal').portal('add', {\r\n");
      out.write("                            panel: p,\r\n");
      out.write("                            columnIndex: columnIndex\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"layout_portal_portal\" style=\"position:relative;height:600px;\">\r\n");
      out.write("        <div></div>\r\n");
      out.write("        <div></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
