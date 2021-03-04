package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      com.beans.BookBean book = null;
      synchronized (session) {
        book = (com.beans.BookBean) _jspx_page_context.getAttribute("book", PageContext.SESSION_SCOPE);
        if (book == null){
          book = new com.beans.BookBean();
          _jspx_page_context.setAttribute("book", book, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html><body>\n");
      out.write("        ");

          out.print("您好你要查询的书籍信息如下：<br />");
        
      out.write("\n");
      out.write("   书号：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.beans.BookBean)_jspx_page_context.findAttribute("book")).getBookid())));
      out.write("\n");
      out.write("   书名：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.beans.BookBean)_jspx_page_context.findAttribute("book")).getTitle())));
      out.write("\n");
      out.write("   作者：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.beans.BookBean)_jspx_page_context.findAttribute("book")).getAuthor())));
      out.write("\n");
      out.write("   出版社：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.beans.BookBean)_jspx_page_context.findAttribute("book")).getPublisher())));
      out.write("\n");
      out.write("   价格：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.beans.BookBean)_jspx_page_context.findAttribute("book")).getPrice())));
      out.write("\n");
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
