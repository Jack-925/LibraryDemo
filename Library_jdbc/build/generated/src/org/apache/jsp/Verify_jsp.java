package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Verify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client Verifying</title>\n");
      out.write("    </head>\n");
      out.write("     <style type=\"text/css\">\n");
      out.write("             body{\n");
      out.write("                  background-image:url(bookstore.jpg) ;/* 图片地址 */\n");
      out.write("            }\n");
      out.write("            #container{\n");
      out.write("                margin:100px auto; /* 最外层边框*/\n");
      out.write("                width:500px; /* 调整宽度*/\n");
      out.write("                height:400px;  /* 调整高度*/\n");
      out.write("                text-align: center; \n");
      out.write("                font-size:40px;\n");
      out.write("                font-style: italic;\n");
      out.write("                padding:15px 50px; /* 每个盒子从外到内是margin，border，padding，content */\n");
      out.write("                border-style: solid;\n");
      out.write("            }\n");
      out.write("            .header{\n");
      out.write("                font-size: 30px; \n");
      out.write("                font-family: \"Times New Roman\", Times, serif;\n");
      out.write("               border-style:dashed;\n");
      out.write("               border-color: #cccccc;\n");
      out.write("               margin-top: 10px;\n");
      out.write("                  height:300px;\n");
      out.write("            }\n");
      out.write("            .loginWin{\n");
      out.write("                 margin: 10px auto; \n");
      out.write("                 width: 300px;\n");
      out.write("                height:200px;\n");
      out.write("                 font-family: \"Times New Roman\", Times, serif;\n");
      out.write("            }\n");
      out.write("            .admin{\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        ");
  //当从RegisterServlet注册失败跳转回来此页面时message中有“登陆失败”字符串
    if(request.getAttribute("message")!=null)
     out.print(request.getAttribute("message"));

      out.write("\n");
      out.write("<br/>\n");
      out.write("  <div id=\"container\">Welcome to Jack_Library\n");
      out.write("             <form action=\"verify.do\" method=\"post\">\n");
      out.write("            <div class=\"header\">Please input your name and password\n");
      out.write("                <div class=\"loginWin\">\n");
      out.write("                    <table>\n");
      out.write("                          <tr><td>Username</td><td><input type=\"text\" name=\"id\" ></td></tr>\n");
      out.write("                          <tr><td>Password</td><td><input type=\"text\" name=\"password\" ></td></tr>\n");
      out.write("                          <tr>\n");
      out.write("                             <td><input type=\"submit\" value=\"确定\" ></td>\n");
      out.write("                             <td><input type = \"button\" value = \"注册\" onclick = \"window.location.href = 'register.jsp'\"></td>   \n");
      out.write("               \n");
      out.write("                          </tr>\n");
      out.write("                    </table>\n");
      out.write("            </div>\n");
      out.write("                 </form>\n");
      out.write("                <div class=\"admin\">\n");
      out.write("                      <td><input type = \"button\" value = \"管理员登录\" onclick = \"window.location.href = 'AdministratorVerify.jsp'\"></td>    \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
