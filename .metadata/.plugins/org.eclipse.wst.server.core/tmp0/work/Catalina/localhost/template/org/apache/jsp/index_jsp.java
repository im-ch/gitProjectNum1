/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-03-20 03:16:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1489978280000L));
    _jspx_dependants.put("jar:file:/E:/semiproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/template/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/header.jspf", Long.valueOf(1489979530000L));
    _jspx_dependants.put("jar:file:/E:/semiproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/template/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name = \"format-detection\" content = \"telephone=no\" />\r\n");
      out.write("\t<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/grid.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/touchTouch.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/camera.css\">\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-migrate-1.2.1.js\"></script>\r\n");
      out.write("\t<script src='js/camera.js'></script>\r\n");
      out.write("\t<script src=\"js/touchTouch.jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.stellar.js\"></script>\r\n");
      out.write("\t<script src=\"js/script.js\"></script>\r\n");
      out.write("\t<script src='//maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false'></script>\r\n");
      out.write("\t<!--[if (gt IE 9)|!(IE)]><!-->\r\n");
      out.write("\t<script src=\"js/jquery.mobile.customized.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/wow.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\tif ($('html').hasClass('desktop')) {\r\n");
      out.write("\t\t\t\tnew WOW().init();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--<![endif]-->\r\n");
      out.write("\t<!--[if lt IE 8]>\r\n");
      out.write("\t<div style=' clear: both; text-align:center; position: relative;'>\r\n");
      out.write("\t <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\r\n");
      out.write("\t\t <img src=\"images/ie8-panel/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\r\n");
      out.write("\t </a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/ie.css\">\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<!--[if IE]>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/ie-8.css\">\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("<body class=\"index\">\r\n");
      out.write("<!--==============================header=================================-->\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("\t");
      out.write("<div id=\"stuck_container\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("\t\t\t\t\t<!--<div class=\"social\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"bd-ra fa fa-facebook\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"bd-ra fa fa-tumblr\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"bd-ra fa fa-google-plus\"></span></a>\r\n");
      out.write("\t\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t\t<h1><a href=\"index.jsp\">Super Star Kosta<span>who is best?</span></a></h1>\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sf-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--<li class=\"current\"><a href=\"index.html\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>-->\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index-1.jsp\">Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index-2.jsp\">Portfolio</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index-3.jsp\">Blog</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index-4.jsp\">Contacts</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!--=======content================================-->\r\n");
      out.write("<!--여기에 사진 넣고-->\r\n");
      out.write("<section id=\"content\">\r\n");
      out.write("\t<div class=\"full-width-container block-1\">\r\n");
      out.write("\t\t<div class=\"camera_container\">\r\n");
      out.write("\t\t\t<div id=\"camera_wrap\">\r\n");
      out.write("\t\t\t\t<div class=\"item\" data-src=\"images/index_img_slider-1.jpg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"camera_caption fadeIn\">\r\n");
      out.write("                        <input type=\"image\" src=\"images/hyoshin.jpg\">\r\n");
      out.write("\t\t\t\t\t\t<!--<h3>We’ll make you noticeable</h3>-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\" data-src=\"images/index_img_slider-1.jpg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"camera_caption fadeIn\">\r\n");
      out.write("                        <input type=\"image\" src=\"images/po.jpg\">\r\n");
      out.write("\t\t\t\t\t\t<!--<h3>We work for Your Relax</h3>-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\" data-src=\"images/index_img_slider-1.jpg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"camera_caption fadeIn\">\r\n");
      out.write("                        <input type=\"image\" src=\"images/iu.jpg\">\r\n");
      out.write("\t\t\t\t\t\t<!--<h3>Best Design</h3>-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"full-width-container block-2\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Top 10</span></h2>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<div class=\"isotope clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-1-big.jpg\" class=\"item-1 w-1\"><div class=\"img_block\"><img src=\"images/index_img-1.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-2-big.jpg\" class=\"item-2 w-2\"><div class=\"img_block\"><img src=\"images/index_img-2.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-3-big.jpg\" class=\"item-3 w-1\"><div class=\"img_block\"><img src=\"images/index_img-3.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-4-big.jpg\" class=\"item-4 w-2\"><div class=\"img_block\"><img src=\"images/index_img-4.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-5-big.jpg\" class=\"item-5 w-1\"><div class=\"img_block\"><img src=\"images/index_img-5.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/index_img-6-big.jpg\" class=\"item-6 w-1\"><div class=\"img_block\"><img src=\"images/index_img-6.jpg\" alt=\"img\"></div><i>+</i></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\">more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"full-width-container block-3\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Hi!</span></h2>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<p class=\"first\">Gamus at magna non nunc tristique rhoncuseri tym. Aliquam nibh ante, egestas id dictum aterert commodo re luctus libero. Praesent faucibus malesuada cibuste.</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"secont\">Donec laoreet metus id laoreet malesuada. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consectetur orci sed <br> Curabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros, laoreet sit amet est vel, commodo venenatis eros.</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\">more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_7 offset_1\">\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<h2>From the Blog</h2>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<h4><a href=\"#\">10 Nov</a></h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"img_block\"><img src=\"images/index_img-7.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t<p>Gamus at magna non nunc tristique rhoncuseri tym. Aliquam nibh ante, egestas id dictum aterert commodo re luctus libero. Praesent faucibus malesuada cibuste. Donec laoreet metus id laoreet malesuada. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consectetur orci sed <br><br>Gamus at magna non nunc tristique rhoncuseri tym. Aliquam nibh ante, egestas id dictum aterert commodo re luctus libero. Praesent faucibus malesuada cibuste. Donec laoreet metus id laoreet malesuada. Lorem ipsum dolor sit amet, consectetur</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn\">more</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"full-width-container block-4  parallax-block\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("\t\t<span class=\"el-1\">Your best</span>\r\n");
      out.write("\t\t<span class=\"el-2\">projects</span>\r\n");
      out.write("\t\t<a href=\"#\" class=\"btn\">more</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"full-width-container block-5\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"item-1 clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img_block\"><img src=\"images/index_img-8.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_10\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text\">Gamus at magna non nunc tristique rhoncuseri tym. Aliquam nibh ante, egestas id dictum aterert commodo re luctus libero. Praesent faucibus malesuada cibuste. <br><br>Donec laoreet metus id laoreet malesuada. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consectetur rci sed r vel lorem sit amet nulla ullamcorper fermentum.</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item-2 clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_10\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text\">Tamus at magna non nunc tristique rhoncuseri tym. Aliquam nibh ante, egestas id dictum aterert commodo re luctus libero. Praesent faucibus malesuada cibuste. <br><br>Donec laoreet metus id laoreet malesuada. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consectetur rci sed r vel lorem sit amet nulla ullamcorper fermentu.</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img_block\"><img src=\"images/index_img-9.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"full-width-container block-6\">\r\n");
      out.write("\t\t<div class=\"google-map-api\"> \r\n");
      out.write("\t\t\t<div id=\"map-canvas\" class=\"gmap\"></div> \r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!--=======footer=================================-->\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t<pre>© <span id=\"copyright-year\"></span> |  Privacy Policy</pre>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\tMore Design Studio Website Templates at <a rel=\"nofollow\" href=\"http://www.templatemonster.com/category/design-studio-website-templates/\" target=\"_blank\">TemplateMonster.com</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer_bottom\"><a href=\"http://www.templatemonster.com/\" rel=\"nofollow\"><img src=\"images/footer-logo.png\" alt=\"logo\"></a></div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script>\r\n");
      out.write("\tjQuery(function(){\r\n");
      out.write("\t\tjQuery('#camera_wrap').camera({\r\n");
      out.write("\t\t\theight: '68.125%',\r\n");
      out.write("\t\t\tthumbnails: false,\r\n");
      out.write("\t\t\tpagination: true,\r\n");
      out.write("\t\t\tfx: 'simpleFade',\r\n");
      out.write("\t\t\tloader: 'none',\r\n");
      out.write("\t\t\thover: false,\r\n");
      out.write("\t\t\tnavigation: false,\r\n");
      out.write("\t\t\tplayPause: false,\r\n");
      out.write("\t\t\tminHeight: \"975px\",\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!--script>\r\n");
      out.write("\tvar $container = $('.isotope');\r\n");
      out.write("\t// init\r\n");
      out.write("\t$container.on( 'click', '.iso-item', function( event ) {\r\n");
      out.write("\t  // change size of item via class\r\n");
      out.write("\t  $( event.target ).toggleClass('gigante');\r\n");
      out.write("\t  // trigger layout\r\n");
      out.write("\t  $container.packery();\r\n");
      out.write("\t  /*$container.packery({\r\n");
      out.write("\t\t  itemSelector: 'iso-.item',\r\n");
      out.write("\t\t  gutter: 10*/\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script-->\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() { \r\n");
      out.write("\t\t\tif ($('html').hasClass('desktop')) {\r\n");
      out.write("\t\t\t\t$.stellar({\r\n");
      out.write("\t\t\t\t\thorizontalScrolling: false,\r\n");
      out.write("\t\t\t\t\tverticalOffset: 20,\r\n");
      out.write("\t\t\t\t\tresposive: true,\r\n");
      out.write("\t\t\t\t\thideDistantElements: true,\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\tgoogle_api_map_init();\r\n");
      out.write("\t\tfunction google_api_map_init(){\r\n");
      out.write("\t\t\tvar map;\r\n");
      out.write("\t\t\tvar coordData = new google.maps.LatLng(parseFloat(40.6894388), parseFloat(-73.9036233,10)); \r\n");
      out.write("\r\n");
      out.write("\t\t\tvar styleArray = [\r\n");
      out.write("\t\t\t\t{\"featureType\":\"water\",\"stylers\":[{\"color\":\"#021019\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"landscape\",\"stylers\":[{\"color\":\"#08304b\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"poi\",\"elementType\":\"geometry\",\"stylers\":[{\"color\":\"#0c4152\"},{\"lightness\":5}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"road.highway\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"road.highway\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#0b434f\"},{\"lightness\":25}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"road.arterial\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"road.arterial\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#0b3d51\"},{\"lightness\":16}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"road.local\",\"elementType\":\"geometry\",\"stylers\":[{\"color\":\"#000000\"}]},\r\n");
      out.write("\t\t\t\t{\"elementType\":\"labels.text.fill\",\"stylers\":[{\"color\":\"#ffffff\"}]},\r\n");
      out.write("\t\t\t\t{\"elementType\":\"labels.text.stroke\",\"stylers\":[{\"color\":\"#000000\"},{\"lightness\":13}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"transit\",\"stylers\":[{\"color\":\"#146474\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"administrative\",\"elementType\":\"geometry.fill\",\"stylers\":[{\"color\":\"#000000\"}]},\r\n");
      out.write("\t\t\t\t{\"featureType\":\"administrative\",\"elementType\":\"geometry.stroke\",\"stylers\":[{\"color\":\"#144b53\"},{\"lightness\":14},{\"weight\":1.4}]}\r\n");
      out.write("\t\t\t\t]\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tfunction initialize() { \r\n");
      out.write("\t\t\t  var mapOptions = { \r\n");
      out.write("\t\t\t\tzoom: 12, \r\n");
      out.write("\t\t\t\tcenter: coordData, \r\n");
      out.write("\t\t\t\tscrollwheel: false, \r\n");
      out.write("\t\t\t\tstyles: styleArray \r\n");
      out.write("\t\t\t  } \r\n");
      out.write(" \r\n");
      out.write("\t\t\t  var contentString = \"<div></div>\"; \r\n");
      out.write("\t\t\t  var infowindow = new google.maps.InfoWindow({ \r\n");
      out.write("\t\t\t\tcontent: contentString, \r\n");
      out.write("\t\t\t\tmaxWidth: 200 \r\n");
      out.write("\t\t\t  }); \r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t  var map = new google.maps.Map(document.getElementById(\"map-canvas\"), mapOptions); \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\tgoogle.maps.event.addDomListener(window, 'resize', function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t  map.setCenter(coordData);\r\n");
      out.write("\r\n");
      out.write("\t\t\t  var center = map.getCenter();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tgoogle.maps.event.addDomListener(window, \"load\", initialize); \r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('.isotope a').touchTouch();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
