package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.product;
import dao.productDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Project I</title>\n");
      out.write("        <link href=\"lib/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/top-bar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/content.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-bar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!--phần content-->\n");
      out.write("            <div id=\"content\" class=\"site-content\" tabindex=\"-1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"site-content-inner\">\n");
      out.write("                        <div class=\"content-area\">\n");
      out.write("                            <main class=\"site-main\">\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <ul class=\"products row columns_wide--5\">\n");
      out.write("                                ");
for (product p : productDAO.getProduct()) {
      out.write("\n");
      out.write("                                <li class=\"product type-product p1 col-md-4\">\n");
      out.write("                                    <div class=\"product-header\"> \n");
      out.write("                                        <a href=\"detail.jsp?id=");
      out.print(p.getProductID() );
      out.write("\">\n");
      out.write("                                            <h4 class=\"product-title\">");
      out.print(p.getProductName());
      out.write("</h4>\n");
      out.write("                                            <div class=\"product-thumbnail\">\n");
      out.write("                                                <img src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"product-footer\">\n");
      out.write("                                        <div class=\"price-add-to-cart\"></div>\n");
      out.write("                                        <span class=\"price\" style=\" font-size: 25px; color: red \">");
      out.print(p.getProductPrice());
      out.write(" VNĐ</span>\n");
      out.write("                                        <button><a href=\"edit.jsp?id=");
      out.print(p.getProductID() );
      out.write("\">Sửa</a></button>\n");
      out.write("                                        <button><a href=\"DeleteServlet?id=");
      out.print(p.getProductID() );
      out.write("\">Xóa</a></button>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <br>\n");
      out.write("                                    <br>\n");
      out.write("                                </li>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </main>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
