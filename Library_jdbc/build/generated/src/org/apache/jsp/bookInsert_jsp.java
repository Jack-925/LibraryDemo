package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gb2312");
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
      out.write("<html><head> \n");
      out.write("        <title>Book Insert</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h3>请输入图书信息：</h3>\n");
 
    if(request.getAttribute("result")!=null)
     out.print(request.getAttribute("result"));

      out.write("\n");
      out.write("<div id=\"container\">\n");
      out.write("    <div class=\"header\">\n");
      out.write("<form action = \"bookinsert.do\" method = \"post\">     <!-- 会被引导到com.control中的BookInsertServlet.java -->\n");
      out.write(" <table>\n");
      out.write("  <tr><td>书号</td> <td><input type=\"text\" name=\"bookid\" ></td></tr>\n");
      out.write("  <tr><td>书名</td><td><input type=\"text\" name=\"title\"></td></tr>      \n");
      out.write("  <tr><td>作者</td><td><input type=\"text\" name=\"author\" ></td></tr>\n");
      out.write("  <tr><td>出版社</td><td><input type=\"text\" name=\"publisher\" ></td></tr>\n");
      out.write("  <tr><td>单价</td><td><input type=\"text\" name=\"price\" ></td></tr>\n");
      out.write("  <tr><td><input type=\"submit\" value=\"确定\" ></td>\n");
      out.write("      <td><input type=\"reset\" value=\"重置\" ></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body></html>");
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
