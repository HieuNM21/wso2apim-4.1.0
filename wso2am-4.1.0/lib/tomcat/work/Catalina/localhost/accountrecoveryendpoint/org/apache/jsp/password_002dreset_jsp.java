/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2023-12-11 08:43:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import java.io.File;
import org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public final class password_002dreset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1645440730000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityTenantUtil");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";
    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(),
            new EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));
    String callback = (String) request.getAttribute(IdentityManagementEndpointConstants.CALLBACK);
    String username = request.getParameter("username");
    String sessionDataKey = request.getParameter("sessionDataKey");
    String tenantDomain = (String) request.getAttribute(IdentityManagementEndpointConstants.TENANT_DOMAIN);
    if (tenantDomain == null) {
        tenantDomain = (String) session.getAttribute(IdentityManagementEndpointConstants.TENANT_DOMAIN);
    }
    if (username == null) {
        username = (String) request.getAttribute("username");
    }
    if (sessionDataKey == null) {
        sessionDataKey = (String) request.getAttribute("sessionDataKey");
    }


      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
            if (headerFile.exists()) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login-portal layout recovery-layout\">\n");
      out.write("        <main class=\"center-segment\">\n");
      out.write("            <div class=\"ui container medium center aligned middle aligned\">\n");
      out.write("                <!-- product-title -->\n");
      out.write("                ");

                    File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                    if (productTitleFile.exists()) {
                
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
      out.write("\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <div class=\"ui segment\">\n");
      out.write("                    <!-- content -->\n");
      out.write("                    <h2>\n");
      out.write("                        ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Reset.Password"));
      out.write("\n");
      out.write("                    </h2>\n");
      out.write("\n");
      out.write("                    ");
 if (error) { 
      out.write("\n");
      out.write("                    <div class=\"ui visible negative message\">\n");
      out.write("                        ");
      out.print(IdentityManagementEndpointUtil.i18nBase64(recoveryResourceBundle, errorMsg));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    <div id=\"ui visible negative message\" hidden=\"hidden\"></div>\n");
      out.write("\n");
      out.write("                    <div class=\"segment-form\">\n");
      out.write("                        <form class=\"ui large form\" method=\"post\" action=\"completepasswordreset.do\" id=\"passwordResetForm\">\n");
      out.write("                            <div class=\"ui negative message\" hidden=\"hidden\" id=\"error-msg\"></div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <label>\n");
      out.write("                                    ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                    "Enter.new.password"));
      out.write("\n");
      out.write("                                </label>\n");
      out.write("                                <div class=\"ui right icon input\">\n");
      out.write("                                    <input\n");
      out.write("                                        id=\"reset-password\"\n");
      out.write("                                        name=\"reset-password\"\n");
      out.write("                                        type=\"password\"\n");
      out.write("                                        required=\"\"\n");
      out.write("                                        onpaste=\"return false\"\n");
      out.write("                                    />\n");
      out.write("                                    <i id=\"password1ShowHide\" class=\"eye link icon\" onclick=\"password1ShowToggle()\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                if (username != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"username\" value=\"");
      out.print(Encode.forHtmlAttribute(username) );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                if (callback != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"callback\" value=\"");
      out.print(Encode.forHtmlAttribute(callback) );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                if (sessionDataKey != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"sessionDataKey\"\n");
      out.write("                                       value=\"");
      out.print(Encode.forHtmlAttribute(sessionDataKey));
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                if (!IdentityTenantUtil.isTenantQualifiedUrlsEnabled() && tenantDomain != null) {
                            
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"tenantdomain\" value=\"");
      out.print(Encode.forHtmlAttribute(tenantDomain) );
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                           <div class=\"field\">\n");
      out.write("                                <label>\n");
      out.write("                                    ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Confirm.password"));
      out.write("\n");
      out.write("                                </label>\n");
      out.write("                                <div class=\"ui right icon input\">\n");
      out.write("                                    <input\n");
      out.write("                                        id=\"reset-password2\"\n");
      out.write("                                        name=\"reset-password2\"\n");
      out.write("                                        type=\"password\"\n");
      out.write("                                        data-match=\"reset-password\"\n");
      out.write("                                        required=\"\"\n");
      out.write("                                        onpaste=\"return false\"\n");
      out.write("                                    />\n");
      out.write("                                    <i id=\"password2ShowHide\" class=\"eye link icon\" onclick=\"password2ShowToggle()\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ui divider hidden\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"align-right buttons\">\n");
      out.write("                                <button id=\"submit\"\n");
      out.write("                                        class=\"ui primary button\"\n");
      out.write("                                        type=\"submit\">");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                        "Proceed"));
      out.write("\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <!-- /content/body -->\n");
      out.write("        <!-- product-footer -->\n");
      out.write("        ");

            File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
            if (productFooterFile.exists()) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        ");

            File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
            if (footerFile.exists()) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $(\"#passwordResetForm\").submit(function (e) {\n");
      out.write("\n");
      out.write("                    $(\"#server-error-msg\").remove();\n");
      out.write("                    var password = $(\"#reset-password\").val();\n");
      out.write("                    var password2 = $(\"#reset-password2\").val();\n");
      out.write("                    var error_msg = $(\"#error-msg\");\n");
      out.write("\n");
      out.write("                    if (!password || 0 === password.length) {\n");
      out.write("                        error_msg.text(\"");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                        "Password.cannot.be.empty"));
      out.write("\");\n");
      out.write("                        error_msg.show();\n");
      out.write("                        $(\"html, body\").animate({scrollTop: error_msg.offset().top}, 'slow');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (password !== password2) {\n");
      out.write("                        error_msg.text(\"");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                        "Passwords.did.not.match.please.try.again"));
      out.write("\");\n");
      out.write("                        error_msg.show();\n");
      out.write("                        $(\"html, body\").animate({scrollTop: error_msg.offset().top}, 'slow');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return true;\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var password1 = true;\n");
      out.write("            var password2 = true;\n");
      out.write("\n");
      out.write("            function password1ShowToggle(){\n");
      out.write("                if(password1) {\n");
      out.write("                    password1 = false;\n");
      out.write("                    document.getElementById(\"password1ShowHide\").classList.add(\"slash\");\n");
      out.write("                    document.getElementById(\"reset-password\").setAttribute(\"type\",\"text\");\n");
      out.write("                } else{\n");
      out.write("                    password1 = true;\n");
      out.write("                    document.getElementById(\"password1ShowHide\").classList.remove(\"slash\");\n");
      out.write("                    document.getElementById(\"reset-password\").setAttribute(\"type\",\"password\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function password2ShowToggle(){\n");
      out.write("                if(password2) {\n");
      out.write("                    password2 = false;\n");
      out.write("                    document.getElementById(\"password2ShowHide\").classList.add(\"slash\");\n");
      out.write("                    document.getElementById(\"reset-password2\").setAttribute(\"type\",\"text\");\n");
      out.write("                } else{\n");
      out.write("                    password2 = true;\n");
      out.write("                    document.getElementById(\"password2ShowHide\").classList.remove(\"slash\");\n");
      out.write("                    document.getElementById(\"reset-password2\").setAttribute(\"type\",\"password\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
