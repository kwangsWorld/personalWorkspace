/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-12-13 06:40:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import com.kh.app.page.vo.PageVo;
import com.kh.app.board.vo.BoardVo;
import java.util.List;
import com.kh.app.member.vo.MemberVo;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1701050848556L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.app.page.vo.PageVo");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.kh.app.board.vo.BoardVo");
    _jspx_imports_classes.add("com.kh.app.member.vo.MemberVo");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    	List<BoardVo> boardVoList = (List<BoardVo>) request.getAttribute("boardVoList");
    	PageVo pvo = (PageVo)request.getAttribute("pvo");
    	Map<String, String> searchMap = (Map<String, String>)request.getAttribute("searchMap");
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/app99/resources/css/board/list.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        ");
 String x=(String) session.getAttribute("alertMsg"); session.removeAttribute("alertMsg"); MemberVo
            loginMember=(MemberVo)session.getAttribute("loginMember"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("	");
 if (x != null) { 
      out.write("\r\n");
      out.write("                    alert(\"");
      out.print( x );
      out.write("\");\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"/app99/resources/css/header.css\">\r\n");
      out.write("\r\n");
      out.write("            <header>\r\n");
      out.write("                <div></div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"/app99/home\">\r\n");
      out.write("                        <img width=\"300px\" height=\"120px\" src=\"/app99/resources/img/logo.png\" alt=\"로고이미지\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form action=\"/app99/member/login\" method=\"post\">\r\n");
      out.write("                        <div class=\"login-area\">\r\n");
      out.write("                            ");
 if( loginMember==null ){ 
      out.write("\r\n");
      out.write("                                <input type=\"text\" name=\"memberId\" placeholder=\"아이디\">\r\n");
      out.write("                                <input type=\"password\" name=\"memberPwd\" placeholder=\"패스워드\">\r\n");
      out.write("                                <button type=\"button\" onclick=\"location.href='/app99/member/join';\">회원가입</button>\r\n");
      out.write("                                <input type=\"submit\" value=\"로그인\">\r\n");
      out.write("                                ");
 }else{ 
      out.write("\r\n");
      out.write("                                    <h3>\r\n");
      out.write("                                        ");
      out.print( loginMember.getMemberNick() );
      out.write("\r\n");
      out.write("                                    </h3>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    님 환영합니다 :)\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <button type=\"button\"\r\n");
      out.write("                                        onclick=\"location.href='/app99/member/logout'\">로그아웃</button>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <a href=\"/app99/board/list?pno=1\">게시판</a>\r\n");
      out.write("                        <a href=\"/app99/notice/list\">공지사항</a>\r\n");
      out.write("                        <a href=\"/app99/gallery/list\">갤러리</a>\r\n");
      out.write("                        <a href=\"/app99/member/list\">마이페이지</a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>");
      out.write("\r\n");
      out.write("		<main>\r\n");
      out.write("			<h1>게시글 목록</h1>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"search-area\">\r\n");
      out.write("				<form action=\"/app99/board/search\" method=\"get\">\r\n");
      out.write("					<select name=\"searchType\">\r\n");
      out.write("						<option value=\"title\">제목</option>\r\n");
      out.write("						<option value=\"content\">내용</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					<input type=\"text\" name=\"searchValue\" placeholder=\"검색할 내용을 입력하세요\">\r\n");
      out.write("					<input type=\"submit\" value=\"검색하기\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("				<table border=\"1\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>번호</th>\r\n");
      out.write("							<th>제목</th>\r\n");
      out.write("							<th>작성자</th>\r\n");
      out.write("							<th>조회수</th>\r\n");
      out.write("							<th>작성일시</th>\r\n");
      out.write("							<th>카테고리</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody>\r\n");
      out.write("			");
 for(BoardVo vo : boardVoList){ 
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>");
      out.print( vo.getNo() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( vo.getTitle() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( vo.getWriterNick() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( vo.getHit() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( vo.getEnrollDate() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( vo.getCategoryName() );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("\r\n");
      out.write("			");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("				<button onclick=\"location.href='/app99/board/write'\">작성하기</button>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"page-area\">\r\n");
      out.write("			\r\n");
      out.write("				");
 if(pvo.getStartPage() != 1){ 
      out.write("\r\n");
      out.write("					<a href=\"/app99/board/list?pno=");
      out.print( pvo.getStartPage()-1 );
      out.write("\">이전</a>\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				");
 for(int i = pvo.getStartPage() ; i <= pvo.getEndPage(); i++){ 
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					");
 if( i == pvo.getCurrentPage() ){ 
      out.write("\r\n");
      out.write("						<span>");
      out.print( i );
      out.write("</span>\r\n");
      out.write("					");
 }else{ 
      out.write("\r\n");
      out.write("						<a href=\"/app99/board/list?pno=");
      out.print( i );
      out.write('"');
      out.write('>');
      out.print( i );
      out.write("</a>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("					\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				");
 if( pvo.getEndPage() != pvo.getMaxPage() ){ 
      out.write("\r\n");
      out.write("					<a href=\"/app99/board/list?pno=");
      out.print( pvo.getEndPage()+1 );
      out.write("\">다음</a>	\r\n");
      out.write("				");
 } 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("		</main>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	const trArr = document.querySelectorAll(\"main > table > tbody > tr\");\r\n");
      out.write("	for(let i = 0 ; i < trArr.length; ++i){\r\n");
      out.write("		trArr[i].addEventListener('click' , handleClick);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function handleClick(event){\r\n");
      out.write("		const tr = event.currentTarget;\r\n");
      out.write("		const no = tr.children[0].innerText;\r\n");
      out.write("		location.href = '/app99/board/detail?no=' + no + '&currPage=");
      out.print( pvo.getCurrentPage() );
      out.write("';	\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	");
 if(searchMap != null){ 
      out.write("\r\n");
      out.write("		function setSearchArea(){\r\n");
      out.write("			\r\n");
      out.write("			// 옵션태그 셋팅\r\n");
      out.write("			const optionTagArr = document.querySelectorAll(\".search-area form option\");\r\n");
      out.write("			const searchType = \"");
      out.print( searchMap.get("searchType") );
      out.write("\";\r\n");
      out.write("			for(let i = 0; i < optionTagArr.length; ++i){\r\n");
      out.write("				if( optionTagArr[i].value === searchType ){\r\n");
      out.write("					optionTagArr[i].selected = true;\r\n");
      out.write("					break;\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 인풋태그 셋팅\r\n");
      out.write("			const searchValueTag = document.querySelector(\".search-area form input[name=searchValue]\");\r\n");
      out.write("			searchValueTag.value = \"");
      out.print( searchMap.get("searchValue") );
      out.write("\";\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		setSearchArea();\r\n");
      out.write("		\r\n");
      out.write("		function setPageArea(){\r\n");
      out.write("			const aTagArr = document.querySelectorAll(\".page-area a\");\r\n");
      out.write("			for(let i = 0 ; i < aTagArr.length; ++i){\r\n");
      out.write("				aTagArr[i].href = aTagArr[i].href.replace(\"list\" , \"search\"); \r\n");
      out.write("				aTagArr[i].href += \"&searchType=");
      out.print( searchMap.get("searchType") );
      out.write("\";\r\n");
      out.write("				aTagArr[i].href += \"&searchValue=");
      out.print( searchMap.get("searchValue") );
      out.write("\";\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		setPageArea();\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>");
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
